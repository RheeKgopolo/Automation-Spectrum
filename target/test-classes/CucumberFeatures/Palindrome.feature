Feature: Palindrome
  As a user,
  I would like to evaluate single words so that I can list words that reads the same backward as forward defined as Palindromes

  @ignore
  Scenario Outline: single word palindromes
    Given that user is on the app Home Page
    And selects "palindrome"
    When user enters a "<palindromeWord>"
    And submits word entry
    Then generated word reads the same backward as it does forward as defined by Palindrome
    And user closes app Home Page

    Examples:
      | palindromeWord |
      | madam          |
      | Kingkong       |
      | Rotator        |
      | KayaK          |
      | civic          |
      | boy            |


