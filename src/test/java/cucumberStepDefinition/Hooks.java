package cucumberStepDefinition;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.Log;
import helper.WebDriverUtils;

/**
 * Setup configuration before and after each test scenario execution
 */
public class Hooks {

    private String scenarioName;


    @Before
    public void BeforeEachScenario(Scenario scenario) {

        helper.Log.console("Execute BeforeEachScenario 'Before Hooks'");
        scenarioName = scenario.getName();

        helper.Log.console("Test Case ****" + scenarioName + "*************");
    }


    /**
     * After Hook to be executed after each scenario tagged @RegressionTest
     */

    @After
    public void AfterEachScenario() {

        try {

            helper.Log.console("Execute 'After Hooks'");

        } catch (Exception e) {
            Log.error(e.getMessage());
        }

    }
}
