package Modules;

import helper.Log;
import helper.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;
import pageObjects.PalindromePage;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginAction {

    public static void launchApp(String testUrl) {

        try {

            // Create an instance of CalculatorLoginPage and initialize any WebElement fields in it
            PageFactory.initElements(WebDriverUtils.getDriver(), PalindromePage.class);

            testUrl = WebDriverUtils.getData(testUrl);
            WebDriverUtils.openUrl(testUrl);
            String currentUrl = WebDriverUtils.getDriver().getCurrentUrl();

            assertThat(currentUrl).as(" Palindrome page url Comparison Check").isEqualToIgnoringCase(testUrl);

        } catch (Exception e) {
            Log.console(e.getMessage());

        }

    }

    public static void closeApp() {

        try {

            WebDriverUtils.refreshPage();
            Log.console("Reset Palindrome");

        } catch (Exception e) {
            Log.console(e.getMessage());
        }

    }
}
