Feature: Show records functionality

  @wip
  Scenario: Verify default values in users page
    Given I am on the login page
    And I login as librarian
    When I click "users" link
    Then show records default value should be 10
    And  show records should have following options
      |5|
      |10|
      |15|
      |50|
      |100|
      |200|
      |500|
