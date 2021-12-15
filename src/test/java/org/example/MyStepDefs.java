package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    NewReleasePage newReleasePage = new NewReleasePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    ProductEmailAFriend productEmailAFriend = new ProductEmailAFriend();
    Utils utils = new Utils();

    //Steps for user register successfully
    @Given("user is on registration page")
    public void user_is_on_registration_page() {
    //click on register button
        homePage.clickOnRegisterButton();
    // verify user is on registration page
        registrationPage.verifyUserIsOnRegisterPage();
    }
    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
    // Type User Details
        registrationPage.userEntersRegistrationDetails();
    }
    @When("click on register submit button")
    public void click_on_register_submit_button() {
    // click on register button
        registrationPage.clickOnRegisterButton();
    }
    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
    //verify user is on register Successful page
        registrationResultPage.verifyUserIsOnRegisterSuccessPage();
    //Verify user has successfully registered
        registrationResultPage.verifyUserHasSuccessfullyRegistered();
    }




    //User is able to comment successfully
    @Given("user is on new release page")
    public void user_is_on_new_release_page() {
        //click on News Details
        homePage.clickOnNewsDetailsButton();
        //verify user is on new release page.
        newReleasePage.verifyUserIsOnNewReleasePage();
    }
    @When("user enters title and comments details")
    public void user_enters_title_and_comments_details() {
        //Type title and comment
        newReleasePage.userEnterCommentDetails();
    }
    @When("click on new comment button")
    public void click_on_new_comment_button() {
        //click on New Comment Button
        newReleasePage.clickOnNewCommentButton();
    }
    @Then("user should able to add comment successfully")
    public void user_should_able_to_add_comment_successfully() {
        //verify user has successfully added the comment.
        newReleasePage.userHasAddedNewCommentSuccessfully();
    }


    //user is able to navigate to desktop
    @Given("user is on computers page")
    public void user_is_on_computers_page() {
        //click on Computer Menu
        homePage.clickOnComputersMenu();
        //verify user is on Computers Menu page
        computersPage.verifyUserIsOnComputerPage();
    }
    @When("user clicks on desktops menu")
    public void user_clicks_on_desktops_menu() {
        //click on desktop menu
        computersPage.clickOnDesktopsMenu();
    }
    @Then("user should able to navigate to desktops page successfully")
    public void user_should_able_to_navigate_to_desktops_page_successfully() {
        //verify user is on desktop page
        desktopPage.verifyUserIsOnDesktopPage();
        //Verify user is shown desktops menu
        desktopPage.verifyUserIsShownDesktopMenu();
    }


    // User refer a product to a friend
    @Given("user is registered successfully")
    public void user_is_registered_successfully() {
    //verify user is successfully registered
        //click on register button
        homePage.clickOnRegisterButton();
        // verify user is on registration page
        registrationPage.verifyUserIsOnRegisterPage();
        // Type User Details
        registrationPage.userEntersRegistrationDetails();
        // click on register button
        registrationPage.clickOnRegisterButton();
        //verify user is on register Successful page
        registrationResultPage.verifyUserIsOnRegisterSuccessPage();
        //Verify user has successfully registered
        registrationResultPage.verifyUserHasSuccessfullyRegistered();
    }

    @Given("user selects a product")
    public void user_selects_a_product() {
    //verify user has successfully navigated to Desktop page
        //click on Computer Menu
        homePage.clickOnComputersMenu();
        //verify user is on Computers Menu page
        computersPage.verifyUserIsOnComputerPage();
        //click on desktop menu
        computersPage.clickOnDesktopsMenu();
        //verify user is on desktop page
        desktopPage.verifyUserIsOnDesktopPage();
        //Verify user is shown desktops menu
        desktopPage.verifyUserIsShownDesktopMenu();
        //Click on Build Your Own Computer
        desktopPage.clickOnBuildYourOwnComputer();
    }
    @When("user clicks on email a friend button")
    public void user_clicks_on_email_a_friend_button() {
        //click on Email a Friend button
        buildYourOwnComputer.clickOnEmailAFriend();
        // verify user is on email a friend page
        productEmailAFriend.verifyUserIsOnProductEmailAFriendPage();
    }
    @When("user enters friends email and a message")
    public void user_enters_friends_email_and_a_message() {
        //Type user friends email and personal message
        productEmailAFriend.userEntersFriendsEmailAndMessage();
    }
    @When("click on send email button")
    public void click_on_send_email_button() {
        //click Send email button
        productEmailAFriend.clickOnSendEmailButton();
    }
    @Then("user should be able to refer a product to a friend successfully")
    public void user_should_be_able_to_refer_a_product_to_a_friend_successfully() {
        //verify user has successfully sent the email
        productEmailAFriend.verifyUserHasSuccessfullySentEmailToAFriend();
    }
}
