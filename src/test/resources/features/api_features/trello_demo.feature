Feature: Trello_board_creation
  Scenario: Create_board
    Given Send POST request for create "api" board
    Then Assert status code
    And Assert board name is "api"