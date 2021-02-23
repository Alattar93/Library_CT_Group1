@wip
Feature: User able to see several modules
  As a user ,I should able to see several modules


  Background: User is already in login page
    Given user is on the login page

    Scenario: Student should have access to modules
      Given the "student" on the home page
      Then the user should see following modules
      |Books|
      |Borrowing Books|

  Scenario: Student should have access to modules
    Given the "librarian" on the home page
    Then the user should see following modules
      |Dashboard|
      |Users   |
      |Books|