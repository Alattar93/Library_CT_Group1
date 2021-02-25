@123
Feature: Library app logout feature
  As a user , i should be able to log out from account
  Accounts are: librarian, student

  Background: User is already in login page
    Given user is on the home page

  Scenario: Successful logout from application
    When user logs out from application
    Then Message displayed Logout successfully
    And Browser quit by driver
