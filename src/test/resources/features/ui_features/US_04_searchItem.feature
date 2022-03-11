@SearchItem
  Feature: US04 Search Item

    Background: User_logged_in
#      Given user logged in main page
      Given user is on the main page
      When user clicks the sign in button
      And enter the valid email
      And enter the valid password
      Then should be signed in successfully

      @search
      Scenario: Search_msi
      And select "Computers" category
      And search keyword "msi"
      Then verify all items contain the keyword "msi"