package org.example;

import io.cucumber.java.en.And;
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
    CategoryURLPage categoryURLPage = new CategoryURLPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    Checkout checkout =new Checkout();
    CheckoutSuccessfully checkoutSuccessfully = new CheckoutSuccessfully();
    FacebookTabNewPage facebookTabNewPage = new FacebookTabNewPage();
    AlertPopUpBox alertPopUpBox = new AlertPopUpBox();
    NewsOnlineStore newsOnlineStore = new NewsOnlineStore();

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
//Navigate to Category page
    @Given("I am on homepage")
    public void i_am_on_homepage() {

    }
    @When("I click on {string} button")
    public void i_click_on_button(String category) {
        System.out.println("clicking on :" + category);
        homePage.clickOnCategoryButton(category);
    }
    @Then("I should able to verify the {string} accordingly")
    public void i_should_able_to_verify_the_accordingly(String page_URL) {
    Utils.verifyCurrentURL(page_URL);
    }
    @Then("I should be able to verify the page title as {string} accordingly")
    public void i_should_be_able_to_verify_the_page_title_as_accordingly(String text) {
        categoryURLPage.verifyCategoryTitle(text);
    }
    @And("I click on the {string} button")
    public void iClickOnTheButton(String sub_category) {
        homePage.clickOnSubCategory(sub_category);
    }



  //Checkout Scenario
    @When("select Build it features")
    public void select_build_it_features() {
        buildYourOwnComputer.userSelectBuildItFeatures();
    }
    @When("click on the Add To Cart button")
    public void click_on_the_add_to_cart_button() {
        buildYourOwnComputer.clickOnAddToCartButton();
    }
    @When("user click on shopping cart")
    public void user_click_on_shopping_cart() {
        buildYourOwnComputer.clickOnShoppingCart();
    }
    @When("user click on the terms and conditions checkbox")
    public void user_click_on_the_terms_and_conditions_checkbox() {
        shoppingCartPage.clickOnTermsAndConditionCheckBox();
    }
    @When("user click on checkout button")
    public void user_click_on_checkout_button() {
        shoppingCartPage.clickOnCheckOutButton();
    }
    @When("user enters all the mandatory fields in Billing address")
    public void user_enters_all_the_mandatory_fields_in_billing_address() {
        checkout.entersMandatoryFieldForBillingAddress();
    }
    @When("click on the continue button")
    public void click_on_the_continue_button() {
        checkout.clickOnTheContinueButton();
    }
    @When("user choose the mandatory shipping method option")
    public void user_choose_the_mandatory_shipping_method_option() {
        checkout.shippingMethodOption();
    }
    @When("click on continue button")
    public void click_on_continue_button() {
        checkout.clickOnContinueButton();
    }
    @When("user select the credit card payment method option")
    public void user_select_the_credit_card_payment_method_option() {
        checkout.paymentMethod();
        checkout.clickOnPaymentMethodContinueButton();
    }
    @When("enter payment card information")
    public void enter_payment_card_information() {
        checkout.cardDetails();
    }
    @When("click on payment continue button")
    public void click_on_payment_continue_button() {
        checkout.clickOnPaymentContinueButton();
    }
    @When("user click on confirm button")
    public void user_click_on_confirm_button() {
        checkout.clickOnConfirmButton();
    }
    @Then("user should be able to checkout successfully")
    public void user_should_be_able_to_checkout_successfully() {
        checkoutSuccessfully.verifyUserHasCheckoutSuccessfully();
    }

    // On clicking facebook - facebook url opens in new tab
    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
    homePage.userIsOnHomePage();
    }
    @When("user click on the facebook button")
    public void user_click_on_the_facebook_button() {
        homePage.userClickOnFacebookButton();
    }
    @Then("user should able to verify it has open into another tab with the URL")
    public void user_should_able_to_verify_it_has_open_into_another_tab_with_the_url() {
        facebookTabNewPage.userShouldBeAbleToVerifyTheURLInNewTab();
    }

    //Alert pop-up box

    @When("user clicks on vote")
    public void user_clicks_on_vote() {
        homePage.userClickOnVoteButton();
    }
    @When("alert pop up message box appears")
    public void alert_pop_up_message_box_appears() {
        alertPopUpBox.verifyAlertMessageFromPopUpWindow();
    }
    @Then("user should able to click OK button")
    public void user_should_able_to_click_ok_button() {
        alertPopUpBox.handleOkButton();
    }


    // New online store is open title and comment

    @When("click on the details button under news for new online store is open")
    public void click_on_the_details_button_under_news_for_new_online_store_is_open() {
        homePage.clickOnTheDetailsButton();
        newsOnlineStore.verifyUserIsOnNewsOnlineStoreCommentPage();
    }


    @Then("user should be able to see the comment in the last of the comment list.")
    public void user_should_be_able_to_see_the_comment_in_the_last_of_the_comment_list() {
        newsOnlineStore.verifyNewlyAddedCommentAppearsLastInTheCommentList();
    }
}
