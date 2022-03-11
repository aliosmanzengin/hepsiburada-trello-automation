#Kullanıcı valid bilgilerle giriş yapabilmeli, invalid bilgilerle giriş yapamamalı
@Login
Feature: US02 Login

  Background: Navigating_to_the_page
    Given user is on the main page

    @login_happy_path
    Scenario: user_valid_login
      When user clicks the sign in button
      And enter the valid email
      And enter the valid password
      Then should be signed in successfully
      Then user logs out

    @login_invalid_email
    Scenario: user_invalid_email
      When user clicks the sign in button
      And enter the invalid email
      Then user should see wrong email message

    @login_invalid_password
    Scenario: user_invalid_password
      When user clicks the sign in button
      And enter the valid email
      And enter the invalid password
      Then user should see wrong password message