Feature: Anagram
  As a user,
  I would like to evaluate single words so that I can reproduce the letters in another order to form a new word

  @RegressionTest
  Scenario Outline: single word Anagram
    Given that user is on the app Home Page
    And selects "anagram"
    When user enters a "<anagramWord>"
    And submits word entry
    Then generated word forms another "<newWord>" as defined by anagram
    And user closes app Home Page

    Examples:
      | anagramWord | newWord  |
      | tar         | rat      |
      | cider       | cried    |
      | test        | test     |
      | stressed    | desserts |
