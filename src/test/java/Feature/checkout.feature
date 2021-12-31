Feature: Checkout
  As a registered user, I want to add a product in to the shopping cart
  and checkout successfully
  so that, I can confirm my purchase

  @test
  Scenario: As a registered user i should be able to checkout successfully
    Given user is registered successfully
    When user selects a product
    And select Build it features
    And click on the Add To Cart button
    And user click on shopping cart
    And user click on the terms and conditions checkbox
    And user click on checkout button
    And user enters all the mandatory fields in Billing address
    And click on the continue button
    And user choose the mandatory shipping method option
    And click on continue button
    And user select the credit card payment method option
    And enter payment card information
    And click on payment continue button
    And user click on confirm button
    Then user should be able to checkout successfully