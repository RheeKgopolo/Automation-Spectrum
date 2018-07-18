$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Anagram.feature");
formatter.feature({
  "line": 1,
  "name": "Anagram",
  "description": "As a user,\r\nI would like to evaluate single words so that I can reproduce the letters in another order to form a new word",
  "id": "anagram",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "single word Anagram",
  "description": "",
  "id": "anagram;single-word-anagram",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "that user is on the app Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "selects \"anagram\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters a \"\u003canagramWord\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "submits word entry",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "generated word forms another \"\u003cnewWord\u003e\" as defined by anagram",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user closes app Home Page",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "anagram;single-word-anagram;",
  "rows": [
    {
      "cells": [
        "anagramWord",
        "newWord"
      ],
      "line": 15,
      "id": "anagram;single-word-anagram;;1"
    },
    {
      "cells": [
        "tar",
        "rat"
      ],
      "line": 16,
      "id": "anagram;single-word-anagram;;2"
    },
    {
      "comments": [
        {
          "line": 17,
          "value": "#      | cider       | cried     |"
        }
      ],
      "cells": [
        "stressed",
        "desserts"
      ],
      "line": 18,
      "id": "anagram;single-word-anagram;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9821075,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "single word Anagram",
  "description": "",
  "id": "anagram;single-word-anagram;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "that user is on the app Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "selects \"anagram\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters a \"tar\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "submits word entry",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "generated word forms another \"rat\" as defined by anagram",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user closes app Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.that_user_is_on_the_app_Home_Page()"
});
formatter.result({
  "duration": 931870923,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anagram",
      "offset": 9
    }
  ],
  "location": "StepDefinitions.selects(String)"
});
formatter.result({
  "duration": 1666811,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tar",
      "offset": 15
    }
  ],
  "location": "StepDefinitions.user_enters_a(String)"
});
formatter.result({
  "duration": 128528481,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.submits_word_entry()"
});
formatter.result({
  "duration": 122597520,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rat",
      "offset": 30
    }
  ],
  "location": "StepDefinitions.generated_word_forms_another_as_defined_by_anagram(String)"
});
formatter.result({
  "duration": 64141272,
  "error_message": "java.lang.AssertionError: [ Anagram_word Comparison Check] \r\nExpecting:\r\n \u003c\"5 potential anagrams:\ntar\nart\natr\ntra\nrta\"\u003e\r\nto contain:\r\n \u003c\"rat\"\u003e\r\n (ignoring case)\r\n\tat Modules.AnagramAction.checkAnagram(AnagramAction.java:53)\r\n\tat cucumberStepDefinition.StepDefinitions.generated_word_forms_another_as_defined_by_anagram(StepDefinitions.java:102)\r\n\tat ✽.Then generated word forms another \"rat\" as defined by anagram(Anagram.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.user_closes_app_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 152807,
  "status": "passed"
});
formatter.before({
  "duration": 139883,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 17,
      "value": "#      | cider       | cried     |"
    }
  ],
  "line": 18,
  "name": "single word Anagram",
  "description": "",
  "id": "anagram;single-word-anagram;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "that user is on the app Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "selects \"anagram\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters a \"stressed\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "submits word entry",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "generated word forms another \"desserts\" as defined by anagram",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user closes app Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.that_user_is_on_the_app_Home_Page()"
});
formatter.result({
  "duration": 151457121,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anagram",
      "offset": 9
    }
  ],
  "location": "StepDefinitions.selects(String)"
});
formatter.result({
  "duration": 61959,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "stressed",
      "offset": 15
    }
  ],
  "location": "StepDefinitions.user_enters_a(String)"
});
formatter.result({
  "duration": 134054237,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.submits_word_entry()"
});
formatter.result({
  "duration": 98968705,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "desserts",
      "offset": 30
    }
  ],
  "location": "StepDefinitions.generated_word_forms_another_as_defined_by_anagram(String)"
});
formatter.result({
  "duration": 50162861,
  "error_message": "java.lang.AssertionError: [ Anagram_word Comparison Check] \r\nExpecting:\r\n \u003c\"5 potential anagrams:\nstesrdse\ndssertse\nseedsrst\ntdesrses\ndreestss\"\u003e\r\nto contain:\r\n \u003c\"desserts\"\u003e\r\n (ignoring case)\r\n\tat Modules.AnagramAction.checkAnagram(AnagramAction.java:53)\r\n\tat cucumberStepDefinition.StepDefinitions.generated_word_forms_another_as_defined_by_anagram(StepDefinitions.java:102)\r\n\tat ✽.Then generated word forms another \"desserts\" as defined by anagram(Anagram.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.user_closes_app_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 80584,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "As a user, I would like to calculate the value of two numbers so that my math is accurate",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 108714,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "user is logged in",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 8,
  "name": "login app",
  "description": "",
  "id": "login;login-app",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user is on the \"PalindromePage\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "PalindromePage",
      "offset": 16
    }
  ],
  "location": "StepDefinitions.user_is_on_the(String)"
});
formatter.result({
  "duration": 1541754,
  "status": "passed"
});
formatter.after({
  "duration": 91228,
  "status": "passed"
});
formatter.uri("Palindrome.feature");
formatter.feature({
  "line": 1,
  "name": "Palindrome",
  "description": "As a user,\r\nI would like to evaluate single words so that I can list words that reads the same backward as forward defined as Palindromes",
  "id": "palindrome",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "single word palindromes",
  "description": "",
  "id": "palindrome;single-word-palindromes",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "that user is on the app Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "selects \"palindrome\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters a \"\u003cpalindromeWord\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "submits word entry",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "generated word reads the same backward as it does forward as defined by Palindrome",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user closes app Home Page",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "palindrome;single-word-palindromes;",
  "rows": [
    {
      "cells": [
        "palindromeWord"
      ],
      "line": 15,
      "id": "palindrome;single-word-palindromes;;1"
    },
    {
      "cells": [
        "madam"
      ],
      "line": 16,
      "id": "palindrome;single-word-palindromes;;2"
    },
    {
      "comments": [
        {
          "line": 17,
          "value": "#      | Kingkong       |"
        },
        {
          "line": 18,
          "value": "#      | Rotator        |"
        }
      ],
      "cells": [
        "civic"
      ],
      "line": 19,
      "id": "palindrome;single-word-palindromes;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 149766,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "single word palindromes",
  "description": "",
  "id": "palindrome;single-word-palindromes;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "that user is on the app Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "selects \"palindrome\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters a \"madam\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "submits word entry",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "generated word reads the same backward as it does forward as defined by Palindrome",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user closes app Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.that_user_is_on_the_app_Home_Page()"
});
formatter.result({
  "duration": 129542632,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "palindrome",
      "offset": 9
    }
  ],
  "location": "StepDefinitions.selects(String)"
});
formatter.result({
  "duration": 81725,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "madam",
      "offset": 15
    }
  ],
  "location": "StepDefinitions.user_enters_a(String)"
});
formatter.result({
  "duration": 99595898,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.submits_word_entry()"
});
formatter.result({
  "duration": 110672499,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.generated_word_reads_the_same_backward_as_it_does_forward_as_defined_by_Palindrome()"
});
formatter.result({
  "duration": 64793933,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_closes_app_Home_Page()"
});
formatter.result({
  "duration": 227989438,
  "status": "passed"
});
formatter.after({
  "duration": 85526,
  "status": "passed"
});
formatter.before({
  "duration": 182836,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 17,
      "value": "#      | Kingkong       |"
    },
    {
      "line": 18,
      "value": "#      | Rotator        |"
    }
  ],
  "line": 19,
  "name": "single word palindromes",
  "description": "",
  "id": "palindrome;single-word-palindromes;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "that user is on the app Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "selects \"palindrome\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters a \"civic\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "submits word entry",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "generated word reads the same backward as it does forward as defined by Palindrome",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user closes app Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.that_user_is_on_the_app_Home_Page()"
});
formatter.result({
  "duration": 152053143,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "palindrome",
      "offset": 9
    }
  ],
  "location": "StepDefinitions.selects(String)"
});
formatter.result({
  "duration": 70322,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "civic",
      "offset": 15
    }
  ],
  "location": "StepDefinitions.user_enters_a(String)"
});
formatter.result({
  "duration": 99530518,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.submits_word_entry()"
});
formatter.result({
  "duration": 112826240,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.generated_word_reads_the_same_backward_as_it_does_forward_as_defined_by_Palindrome()"
});
formatter.result({
  "duration": 54933706,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.user_closes_app_Home_Page()"
});
formatter.result({
  "duration": 202657700,
  "status": "passed"
});
formatter.after({
  "duration": 65380,
  "status": "passed"
});
});