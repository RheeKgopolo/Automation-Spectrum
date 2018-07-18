package cucumberStepDefinition;

import Modules.AnagramAction;
import Modules.LoginAction;
import Modules.PalindromeAction;
import Utils.CucumberUtils;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Log;

public class StepDefinitions {

    public static String palindromeWord;
    public static String anagramWord;
    public static String wordTestOption;

    public static Boolean isPalindrome = false;
    public static Boolean isAnagram = false;

    @Given("^user is on the \"([^\"]*)\"$")
    public void user_is_on_the(String pageName) throws Throwable {

        CucumberUtils.initializePage(pageName);
    }


    @Given("^that user is on the app Home Page$")
    public void that_user_is_on_the_app_Home_Page() throws Throwable {

        LoginAction.launchApp("PalindromeUrl");
    }


    @Given("^selects \"([^\"]*)\"$")
    public void selects(String wordOption) throws Throwable {
        wordTestOption = wordOption;

    }

    @When("^user enters a \"([^\"]*)\"$")
    public void user_enters_a(String testWord) throws Throwable {

        try {
            if ((wordTestOption).equals("palindrome")) {

                isPalindrome = true;
                palindromeWord = testWord;
                PalindromeAction.setPalindrome(palindromeWord);

            } else if ((wordTestOption).equals("anagram")) {

                // anagram submission
                isAnagram = true;
                anagramWord = testWord;
                AnagramAction.setAnagram(anagramWord);

            } else {
                Log.error("Test word '" + testWord + "' is not palindrome or anagram");

            }

        } catch (Exception e) {

            Log.error(e.getMessage());
        }
    }

    @When("^submits word entry$")
    public void submits_word_entry() throws Throwable {

        try {

            if (wordTestOption != null && isPalindrome) {

                PalindromeAction.submitPalindrome();

            } else if (wordTestOption != null && isAnagram) {

                AnagramAction.submitAnagram();
            }

        } catch (Exception e) {
            Log.error(e.getMessage());
        }


    }


    @Then("^generated word reads the same backward as it does forward as defined by Palindrome$")
    public void generated_word_reads_the_same_backward_as_it_does_forward_as_defined_by_Palindrome() throws Throwable {

        PalindromeAction.checkPalindrome(palindromeWord);
    }


    @Then("^generated word forms another \"([^\"]*)\" as defined by anagram$")
    public void generated_word_forms_another_as_defined_by_anagram(String newWord) throws Throwable {

        AnagramAction.checkAnagram(anagramWord, newWord);
    }

    @Then("^user closes app Home Page$")
    public void user_closes_app_Home_Page() throws Throwable {

        LoginAction.closeApp();
    }
}

