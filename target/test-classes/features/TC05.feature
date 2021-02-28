@TC05
Feature: 5. As a librarian, I should be able to see book records on user page

  Background: User is already on Library login page
    Given user is on the login page

  Scenario: verify that the default record is 10
    Given User login as a "librarian"
    When User is on "Users" module
    Then Default records dropdown value is "10"

  Scenario: Show records for count options
    Given User login as a "librarian"
    When User is on "Users" module
    And User clicks "Show" dropdown
    Then User should see the following dropdown options on "Show" dropDown:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |