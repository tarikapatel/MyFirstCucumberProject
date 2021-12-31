Feature: Alert pop-up box
  As an unregistered user, I want to click on vote button,
  So that, I can validate the Alert Pop-up box appears

  @test
  Scenario: As an unregistered user I want to click on vote button,and validate that alert pop-up box should appear

    Given User is on the home page
    When  user clicks on vote
    And alert pop up message box appears
    Then user should able to click OK button