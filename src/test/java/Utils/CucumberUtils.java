package Utils;

import helper.Log;
import helper.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Field;
import java.util.HashMap;

public class CucumberUtils {

    /**
     * Provide pageObject page class to step definition class if Page is parameterizable in scenario step
     * <p>
     * </?> unknownType
     * Class anyType = String.class;
     * Class <?> theUnknownType = String.class;
     * <p>
     * Class is a parameterizable class, hence you can use the syntax Class<T> where T is a type
     * Class<?> declares a Class object which can be of any type (? is a wildcard)
     * By using Class<?> you're aware of Class to be parametrizable but you're not restricting your
     * parameter to have a specific type
     */

    public static HashMap<String, String> pageMap = new HashMap<String, String>();
    private static Class<?> pageObjectClass = null;

    public static Class<?> getPageObjectClass() {
        return pageObjectClass;
    }

    public static void setPageObjectClass(Class<?> pageObjectClass) {
        CucumberUtils.pageObjectClass = pageObjectClass;

    }

    /**
     * Method is used to initialize page class in order to use elements, its actually a
     * key which holds the pages path in the current project, page map
     *
     * @param pagename
     */

    public static void initializePage(String pagename) {
        try {
            String classname = "pageObjects." + pagename;
            setPageObjectClass(Class.forName(classname));
            PageFactory.initElements(WebDriverUtils.getDriver(), pageObjectClass);

        } catch (ClassNotFoundException e) {
            helper.Log.console("Error occurred while initializing Class not found" + pagename + e.getMessage());

        }
    }

    /**
     * Method is used to initialize page class in order to use web elements
     *
     * @param elementName
     * @return element
     * the element of object elementName
     */

    public static WebElement loadElement(String elementName) {
        WebElement element = null;
        try {

            Field field = getPageObjectClass().getField(elementName);
            field.setAccessible(true);
            element = (WebElement) field.get(elementName);

        } catch (Exception e) {

            Log.error("Error loading web element" + e.getMessage());
        }
        return element;

    }

}
