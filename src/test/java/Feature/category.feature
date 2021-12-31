Feature: Navigate to category pages

  @smoke
  Scenario Outline: As a user , when I click on menu category button Then I should be able to navigate to correct menu

    Given I am on homepage
    When I click on "<category>" button
    Then I should able to verify the "<page_URL>" accordingly
    And I should be able to verify the page title as "<page_title>" accordingly
    Examples:
      | category          | page_URL                                       | page_title        |
      | Computers         | https://demo.nopcommerce.com/computers         | Computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       | Electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           | Apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads | Digital downloads |
      | Books             | https://demo.nopcommerce.com/books             | Books             |
      | Jewelry           | https://demo.nopcommerce.com/jewelry           | Jewelry           |
      | Gift Cards        | https://demo.nopcommerce.com/gift-cards        | Gift Cards        |

