package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputersPage extends Utils {
    LoadProp loadProp = new LoadProp();
    public void verifyUserIsOnComputerPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains(loadProp.getProperty("UserIsOnComputerPageContains")));
    }
    public void clickOnDesktopsMenu(){
        clickOnElement(By.xpath("//ul[@class='sublist']/li[1]/a"));
    }


}
