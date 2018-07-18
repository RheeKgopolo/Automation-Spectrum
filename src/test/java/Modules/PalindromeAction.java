package Modules;

import helper.Log;
import helper.WebDriverUtils;
import org.assertj.core.api.Assert;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.support.PageFactory;
import pageObjects.PalindromePage;

import static pageObjects.PalindromePage.anagram_input;
import static pageObjects.PalindromePage.palindrome_input;

public class PalindromeAction {

    /**
     * Includes methods to automate actionable steps to evaluate palindromes
     */

    //constructor
    public PalindromeAction() {

    }


    public static void setPalindrome(String paladrome_word) {

        try {

            // Create an instance of PalindromePage and initialize any WebElement fields in it
            PageFactory.initElements(WebDriverUtils.getDriver(), PalindromePage.class);

            WebDriverUtils.highlightElement(palindrome_input);
            WebDriverUtils.editFieldAction(PalindromePage.palindrome_input, "originalWord", paladrome_word);


        } catch (Exception e) {
            Log.console(e.getMessage());
        }
    }


    public static void submitPalindrome() {

        try {

            // Create an instance of PalindromePage and initialize any WebElement fields in it
            PageFactory.initElements(WebDriverUtils.getDriver(), PalindromePage.class);
            WebDriverUtils.clickButton(PalindromePage.palindrome_submit, "button1");

        } catch (Exception e) {

            Log.console(e.getMessage());

        }
    }


    public static void checkPalindrome(String palindrome_word) {

        try {

            // Create an instance of PalindromePage and initialize any WebElement fields in it
            PageFactory.initElements(WebDriverUtils.getDriver(), PalindromePage.class);
            String palindromeValue = WebDriverUtils.getElementText(PalindromePage.palindrome_result, "palindromeResult");

            assertThat(palindromeValue).as(" Palindrome_word Comparison Check").containsIgnoringCase(palindrome_word);
            assertThat(palindromeValue).as(" Palindrome_word Comparison Check").containsIgnoringCase("Yes");

        } catch (Exception e) {

            Log.console(e.getMessage());

        }
    }


}
