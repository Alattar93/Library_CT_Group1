@TC05
Feature: Show records functionality

  Scenario: Verify default values in users page
    Given I am on the login page
    And User login as a "librarian"
    When User is on "Users" module
    Then show records default value should be 10
    And  show records should have following options
      |5|
      |10|
      |15|
      |50|
      |100|
      |200|
      |500|
