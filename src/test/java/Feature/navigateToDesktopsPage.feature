Feature: Desktop page

  As a user,
  I want to navigate to Desktops page
  So that, I can view the products displayed on Desktops page.
  @smoke
  Scenario: User should able to navigate to desktops page successfully

    Given user is on computers page
    When user clicks on desktops menu
    Then user should able to navigate to desktops page successfully