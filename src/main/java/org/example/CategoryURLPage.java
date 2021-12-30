package org.example;

import org.openqa.selenium.By;

public class CategoryURLPage extends Utils{
    By _categoryPageTitle = By.xpath("//h1");

    public void verifyCategoryTitle(String text){
        getTextFromElement(_categoryPageTitle).equals(text);
    }
}
