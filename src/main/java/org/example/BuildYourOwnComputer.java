package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utils{
LoadProp loadProp=new LoadProp();
    By _processorDropDown = By.cssSelector("select#product_attribute_1");
    By _RAM = By.cssSelector("select#product_attribute_2");
    By _hddRadioButton = By.cssSelector("input#product_attribute_3_6");
    By _osRadioButton = By.cssSelector("input#product_attribute_4_8");
    By _secondSoftwareCheckBox = By.cssSelector("input#product_attribute_5_11");
    By _thirdSoftwareCheckBox = By.cssSelector("input#product_attribute_5_12");
    By _addToCartButton = By.cssSelector("button#add-to-cart-button-1");
    By _shoppingCart = By.cssSelector("span.cart-label");
    public void clickOnEmailAFriend(){
        //click on EmailAFriend button
        clickOnElement(By.xpath("//button[@class='button-2 email-a-friend-button']"));
    }
    public void userSelectBuildItFeatures(){
        selectByValue(_processorDropDown,loadProp.getProperty("processor"));
        selectByValue(_RAM,loadProp.getProperty("RAM"));
        clickOnElement(_hddRadioButton);
        clickOnElement(_osRadioButton);
        clickOnElement(_secondSoftwareCheckBox);
        clickOnElement(_thirdSoftwareCheckBox);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(_addToCartButton);
    }
    public void clickOnShoppingCart(){
        clickOnElement(_shoppingCart);
    }
}
