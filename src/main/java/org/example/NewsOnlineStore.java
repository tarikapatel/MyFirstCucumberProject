package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NewsOnlineStore extends Utils{
    By _pageTitle = By.xpath("//div[@class='page-title']/h1");
    By _commentTitle = By.xpath("//div[@id='comments']/div/strong");
    //By _commentList = By.cssSelector("div.comment-list");
    By _commentList = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[4]");
    By _commentBox = By.xpath("//div[@class=\"comment news-comment\"]");


    public void verifyUserIsOnNewsOnlineStoreCommentPage(){
        Assert.assertEquals(driver.findElement(_pageTitle).getText(),loadProp.getProperty("newOnlineStoreIsOpenPageTitle"));
        Assert.assertEquals(driver.findElement(_commentTitle).getText(),loadProp.getProperty("newOnlineStoreIsOpenCommentTitle"));
    }

    public void verifyNewlyAddedCommentAppearsLastInTheCommentList(){
        WebElement select=driver.findElement(_commentList);
        List<WebElement> CommentBox = select.findElements(_commentBox);

        WebElement lastComment =CommentBox.get(CommentBox.size()-1);
        //Assert.assertTrue(lastComment.getText().contains("Good Experience"));
        Assert.assertTrue(lastComment.getText().contains(loadProp.getProperty("AddNewCommentCommentText")));
        System.out.println("Last Comment From List is : ");
        System.out.print(lastComment.getText());


    }
}


