package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class NewReleasePage extends Utils{
    By _AddNewComment_CommentTitle = By.id("AddNewComment_CommentTitle");
    By _AddNewComment_CommentText = By.id("AddNewComment_CommentText");
    LoadProp loadProp = new LoadProp();
    public void verifyUserIsOnNewReleasePage(){
        Assert.assertTrue(driver.getCurrentUrl().contains(loadProp.getProperty("UserIsOnNewReleasePageContains")));
    }
    public void userEnterCommentDetails(){
        //type title
        typeText(_AddNewComment_CommentTitle,loadProp.getProperty("Commenttitle"));
        //type Comment
        typeText(_AddNewComment_CommentText, loadProp.getProperty("AddNewCommentCommentText"));
        //wait for new comment button is recognised
        waitForClickable(By.xpath("//button[@class='button-1 news-item-add-comment-button']"), 20);
    }
    public void clickOnNewCommentButton(){
        //wait for new comment button is recognised
        waitForClickable(By.xpath("//button[@class='button-1 news-item-add-comment-button']"), 20);
        //click on New Comment button
        clickOnElement(By.xpath("//button[@class='button-1 news-item-add-comment-button']"));
    }
    public void userHasAddedNewCommentSuccessfully(){
        String actualSuccessCommentMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedSuccessCommentMessage = loadProp.getProperty("expectedSuccessCommentMessage");
        assertEquals(actualSuccessCommentMessage,expectedSuccessCommentMessage);
    }
}
