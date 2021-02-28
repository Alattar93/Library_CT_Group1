Feature: searching books with different categories

  @TC07
  Scenario:  As a students, I should be able to search books with different categories.
    When  I login as "student"
    Then I should be able to go to "Book Categories" dropdown button
    And I should see all types of the book categories below:

      | ALL                         |
      | Action and Adventure        |
      | Anthology                   |
      | Classic                     |
      | Comic and Graphic Novel     |
      | Crime and Detective         |
      | Drama                       |
      | Fable                       |
      | Fairy Tale                  |
      | Fan-Fiction                 |
      | Fantasy                     |
      | Historical Fiction          |
      | Horror                      |
      | Science Fiction             |
      | Biography/Autobiography |
      | Humor                       |
      | Romance                     |
      | Short Story                 |
      | Essay                       |
      | Memoir                      |
      | Poetry                      |


