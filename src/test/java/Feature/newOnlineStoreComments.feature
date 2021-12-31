Feature: Adding New Online Store Title and Comments
  As a registered user, I want to add title and comment successfully,
  so that i can validate that the latest comment added appears last in the comments List.
  @test
  Scenario: User should be verified of the confirmation text of the newly added title and comment
    Given user is registered successfully
    When  User is on the home page
    And click on the details button under news for new online store is open
    And user enters title and comments details
    And click on new comment button
    Then user should able to add comment successfully
    And user should be able to see the comment in the last of the comment list.
