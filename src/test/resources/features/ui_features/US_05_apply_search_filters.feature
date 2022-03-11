@SearchFilters
  Feature: US05 Search Filters

    Background: user searched a keyword
      Given user is on the main page
      When user clicks the sign in button
      And enter the valid email
      And enter the valid password
      Then should be signed in successfully
      And select "Computers" category
      And search keyword "msi"

      Scenario: apply_4_star_filter
        And select rates above four stars
        Then verify items listed correctly


