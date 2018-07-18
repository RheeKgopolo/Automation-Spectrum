package Utils;

//import gherkin.formatter.model.Scenario;
//import cucumber.api.Scenario;

import java.util.Collection;

public class CucumberScenarioProperties {

    /**
     *  Method to get scenario Name
     * @param scenario
     * @return
     * @throws Exception
     */
    public static String getScenarioName(cucumber.api.Scenario scenario) throws  Exception{
        if (scenario == null)
            throw new Exception("Scenario is null");
        return scenario.getName();
    }


    /**
     *  Method to get scenario ID
     * @param scenario
     * @return
     * @throws Exception
     */
    public static String getScenarioID(cucumber.api.Scenario scenario) throws  Exception{
        if (scenario == null)
            throw new Exception("Scenario is null");
        return scenario.getId();
    }

    /**
     *  Method to get scenario tags
     * @param scenario
     * @return
     * @throws Exception
     */
    public static Collection<String> getScenarioTags(cucumber.api.Scenario scenario) throws  Exception{
        if (scenario == null)
            throw new Exception("Scenario is null");
        return scenario.getSourceTagNames();
    }
}
