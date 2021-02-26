
Feature: User able to see several modules
  As a user ,I should able to see several modules

    Scenario: Student should have access to modules
      Given user is on the login page
      Given the "student" on the home page
      Then the user should see following modules
      |Books|
      |Borrowing Books|

  Scenario: Student should have access to modules
    Given user is on the login page
    Given the "librarian" on the home page
    Then the user should see following modules
      |Dashboard|
      |Users   |
      |Books|