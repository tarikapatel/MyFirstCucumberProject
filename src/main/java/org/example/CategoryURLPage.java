package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CategoryURLPage extends Utils{
    By _categoryPageTitle = By.xpath("//h1");

    public void verifyCategoryTitle(String text){
        getTextFromElement(_categoryPageTitle).equals(text);
    }

}
