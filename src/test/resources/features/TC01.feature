Feature: Login to app

@smoke @wip
  Scenario Outline: Login as different roles and assert the title
    Given the user login as a "<role>"
    Then the user on  "<page>"

    Examples:
      | role      | page      |
      | student   | books     |
      | librarian | dashboard |

