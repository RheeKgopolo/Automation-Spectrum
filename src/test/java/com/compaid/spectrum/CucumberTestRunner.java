package com.compaid.spectrum;

import cucumberStepDefinition.Hooks;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import helper.Log;
import helper.WebDriverUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "cucumberStepDefinition",
        features = "src/test/java/CucumberFeatures/",
        tags = {"@RegressionTest,@SmokeTest"},
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml"})

public class CucumberTestRunner {

    @BeforeClass
    public static void beforeAllScenarios() {

        try {

            //initialize driver as first step before any test execute
            WebDriverUtils.startExecution();

        } catch (Exception e) {

            Log.console(e.getMessage());
        }

    }

    @AfterClass
    public static void afterAllScenarios() {
        try {

            // quit instance of driver
            WebDriverUtils.stopExecution();

        } catch (Exception e) {

            Log.console(e.getMessage());
        }
    }
}

