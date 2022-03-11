@SearchCategory
Feature: US03 Categories


  Background: Navigating_to_the_page
#    Given user logged in main page
    Given user is on the main page
    When user clicks the sign in button
    And enter the valid email
    And enter the valid password
    Then should be signed in successfully

    @computerCategory
    Scenario: Computer_category
      When select "Computers" category
      Then verify the item is selected