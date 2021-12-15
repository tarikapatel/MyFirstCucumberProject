Feature: Comment on new release page

  As a user, I want to add a new comment on DemoNopeCommerce website
  So that, I can post my comment successfully
  @test
  Scenario: User should able to add comment successfully

    Given user is on new release page
    When user enters title and comments details
    And click on new comment button
    Then user should able to add comment successfully