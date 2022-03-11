@get_request
  Feature: Get given data
    Scenario: get board
      Given user makes a get request with id
      Then correct board should return