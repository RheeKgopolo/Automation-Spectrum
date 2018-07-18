package Modules;

import helper.Log;
import helper.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;
import pageObjects.PalindromePage;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static pageObjects.PalindromePage.anagram_input;

public class AnagramAction {

    public static void setAnagram(String anagram_word) {

        try {

            // Create an instance of PalindromePage and initialize any WebElement fields in it
            PageFactory.initElements(WebDriverUtils.getDriver(), PalindromePage.class);

            WebDriverUtils.highlightElement(anagram_input);
            WebDriverUtils.editFieldAction(anagram_input, "anagramWord", anagram_word);


        } catch (Exception e) {
            Log.console(e.getMessage());
        }
    }

    public static void submitAnagram() {

        try {

            // Create an instance of PalindromePage and initialize any WebElement fields in it
            PageFactory.initElements(WebDriverUtils.getDriver(), PalindromePage.class);
            WebDriverUtils.clickButton(PalindromePage.anagram_submit, "button2");

        } catch (Exception e) {

            Log.console(e.getMessage());

        }
    }

    public static void checkAnagram(String anagram_word, String newWord) {

        try {

            // Create an instance of PalindromePage and initialize any WebElement fields in it
            PageFactory.initElements(WebDriverUtils.getDriver(), PalindromePage.class);
            String anagramValue = WebDriverUtils.getElementText(PalindromePage.anagram_result, "anagramResult");
            Log.info("anagramValue: " + anagramValue);

            assertThat(anagramValue).as(" Anagram_word Comparison Check").containsIgnoringCase(newWord);

        } catch (Exception e) {

            Log.console(e.getMessage());
        }
    }


}
