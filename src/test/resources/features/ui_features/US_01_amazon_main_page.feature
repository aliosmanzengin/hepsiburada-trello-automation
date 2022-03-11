#Kullanıcı Amazon.com sayfasına ulaşabilmeli
Feature: US001 User should be able to reach the main page

  Given User Types the url on a browser
  Then Verify the page title "Amazon.com. Spend less. Smile more."
  Then Verify the "AMAZON" logo is displayed
