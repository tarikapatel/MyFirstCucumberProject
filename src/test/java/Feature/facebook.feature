Feature: facebook
  As a user, I want to click on Facebook icon on homepage
  so that, I can validate the Facebook URL opens on another tab

  @test
  Scenario: On clicking Facebook icon on homepage, Facebook URL should open on another tab
    Given User is on the home page
    When user click on the facebook button
    Then  user should able to verify it has open into another tab with the URL