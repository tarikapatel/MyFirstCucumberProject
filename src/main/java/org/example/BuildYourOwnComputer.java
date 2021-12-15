package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utils{
LoadProp loadProp=new LoadProp();
    public void clickOnEmailAFriend(){
        //click on EmailAFriend button
        clickOnElement(By.xpath("//button[@class='button-2 email-a-friend-button']"));
    }
}
