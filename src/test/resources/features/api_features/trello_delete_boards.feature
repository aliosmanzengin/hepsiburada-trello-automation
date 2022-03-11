@delete_boards_feature
  Feature: Delete boards

    Scenario: delete all boards with given name
      Given tester deletes all booards named "ali"
      And Assert status code 200
