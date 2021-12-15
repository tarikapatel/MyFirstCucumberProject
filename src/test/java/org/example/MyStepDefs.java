package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();


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
}
