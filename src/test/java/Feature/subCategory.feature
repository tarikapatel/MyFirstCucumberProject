Feature: Navigate to category list

  @test
  Scenario Outline: As a user i want to navigate to the category list accordingly.
    Given I am on homepage
    When  I click on "<category>" button
    And  I click on the "<sub_category>" button
    Then I should able to verify the "<page_URL>" accordingly
    And I should be able to verify the page title as "<page_title>" accordingly
#   Then  I should be able to verify with the "<page_URL>" and the "<page_title>" accordingly
    Examples:
      | category    | sub_category   | page_URL                                       | page_title     |
      | Computers   | Desktops       | https://demo.nopcommerce.com/desktops     | Desktops       |
      | Computers   | Notebooks      | https://demo.nopcommerce.com/notebooks    | Notebooks      |
      | Computers   | Software       | https://demo.nopcommerce.com/software     | Software       |
      | Electronics | Camera & photo | https://demo.nopcommerce.com/camera-photo | Camera & photo |
      | Electronics | Cell phones    | https://demo.nopcommerce.com/cell-phones  | Cell phones    |
      | Electronics | Others         | https://demo.nopcommerce.com/others       | Others         |
      | Apparel     | Shoes          | https://demo.nopcommerce.com/shoes        | Shoes          |
      | Apparel     | Clothing       | https://demo.nopcommerce.com/clothing     | Clothing       |
      | Apparel     | Accessories    | https://demo.nopcommerce.com/accessories  | Accessories    |