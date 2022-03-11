
@trello_end2end
Feature: Trello_end_to_end_api
  @creating_board
  Scenario: creating board
    Given tester creates a board named "ali"
    And  Assert status code 200
    Then Assert board name is "ali"
#
#  @creating_cards
#  Scenario: creating cards
#    Given tester tester creates 2 card inside the "board01"
#    Then  Assert status code 200
#    And Assert cards on the board
#
#  @updating_cards
#  Scenario: updating cards
#    Given tester randomly updates one of the cards on the "board01"
#    Then Assert that card is updated
#
#  @deleting_cards
#    Scenario: deleting cards
#    Given tester removes all cards created
#    Then Assert that all cards removed successfully
#
#  @deleting_boards
#  Scenario: deleting boards
#    Given tester removes the board "board01"
#    Then Assert that "board01" removed successfully
#

