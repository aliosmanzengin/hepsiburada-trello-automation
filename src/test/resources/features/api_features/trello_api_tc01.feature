@trello_api
Feature: trello case

  @trello_api_case_01
  Scenario: trello case 01
    Given tester creates a board named "trello board 01"
    When tester makes a get request and confirms board is created
    Then tester deletes the board and confirms