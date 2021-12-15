Feature: Refer Product

  As a user,
  I want to refer a product to a friend
  So that, I can recommend the product to a friend
  @test
  Scenario: User should be able to refer a product to a friend

    Given user is registered successfully
    And user selects a product
    When user clicks on email a friend button
    And user enters friends email and a message
    And click on send email button
    Then user should be able to refer a product to a friend successfully