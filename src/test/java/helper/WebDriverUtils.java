package helper;

import org.assertj.core.api.SoftAssertions;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class WebDriverUtils {

    // constructor is evoked to create objects from the class blue print, constructor declarations look like methods
    // except they use the name of the class and have no return type
    private static WebDriver driver;
    public static HashMap<String, String> datamap;
    public static Properties prop;
    public static DesiredCapabilities dc = null;
    public static FirefoxProfile myprofile = null;
    public static WebDriverWait wait;
    public static JavascriptExecutor js;
    public static String testcaseName;
    public static String teststatus;
    public static SoftAssertions softly;

    public WebDriverUtils() {

    }

    /**
     * Initialize web IE, FF, Chrome or Phantom drivers
     * Driver is set from properties file
     *
     * @return
     */

    public static WebDriver getDriver() {
        boolean var0 = false;
        try {
            if (driver == null) {
//                datamap = new HashMap();
                String browserName = " ";

                if (System.getProperty("Browser") != null) {
                    browserName = System.getProperty("Browser");
                } else {
                    browserName = getData("Browser");
//                      browserName = "CH";
                }

                String var2 = String.valueOf(browserName);
                byte var3 = -1;

                switch (var2.hashCode()) {
                    case 2149:
                        if (var2.equals("CH")) {
                            var3 = 2;
                        }
                        break;
                    case 2240:
                        if (var2.equals("FF")) {
                            var3 = 0;
                        }
                        break;
                    case 2316:
                        if (var2.equals("IE")) {
                            var3 = 1;
                        }
                        break;
                }

                int fireFoxBrowserVersion;
                switch (var3) {

                    case 0:
                        fireFoxBrowserVersion = getFireFoxBrowserVersion();
                        startFireFoxBrowser(fireFoxBrowserVersion);

                        break;
                    case 1:
                        System.setProperty("webdriver.ie.driver", Initializer.IE_DRIVER_EXE);
                        DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
                        caps.setCapability("ignoreProtectedModeSetting", true);
                        caps.setCapability("ignoreZoomSettings", true);
                        driver = new InternetExplorerDriver(caps);
                        driver.findElement(By.tagName("html")).sendKeys(new CharSequence[]{Keys.chord((new CharSequence[]{Keys.CONTROL, "0"}))});
                        break;
                    case 2:
                        System.setProperty("webdriver.chrome.driver", Initializer.CHROME_DRIVER_EXE);//CHROME_DRIVER_EXE
                        ChromeOptions options = new ChromeOptions();
                        options.addArguments(new String[]{"start-maximized"});
                        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                        capabilities.setCapability("chromeoptions", options);
                        driver = new ChromeDriver(capabilities);
                        break;
                    case 3:
                        DesiredCapabilities htcaps = new DesiredCapabilities();
                        htcaps.setJavascriptEnabled(true);
                        htcaps.setCapability("phantom.binary.path", Initializer.PHANTOMJS_DRIVER_EXE);//phantomJS
                        htcaps.setCapability("takesScreenShot", true);
                        //driver = new PhantomJSDriver(htcaps);
                        break;
                    default:
                        fireFoxBrowserVersion = getFireFoxBrowserVersion();
                        startFireFoxBrowser(fireFoxBrowserVersion);

                }
                if (browserName.equalsIgnoreCase("CH")) {
                    driver.manage().window().maximize();

                }

                driver.manage().deleteAllCookies();
                if (browserName != null && !browserName.equalsIgnoreCase("IE")) {
                    driver.manage().timeouts().pageLoadTimeout((long) Integer.parseInt(getData("PageLoadTimeOut")), TimeUnit.SECONDS);

                }

                driver.manage().timeouts().pageLoadTimeout((long) Integer.parseInt(getData("PageLoadTimeOut")), TimeUnit.SECONDS);

                //cast to WebDriverWait(WebDriver driver, long timeOutInSeconds)
                wait = new WebDriverWait(driver, (long) Integer.parseInt(getData("WebDriverWaitTimeOut")));
                js = (JavascriptExecutor) driver;
            }

        } catch (Exception var8) {
            var8.printStackTrace();
            Log.console("Error while instantiating driver object");
        }
        return driver;
    }

    public static int getFireFoxBrowserVersion() {
        int versionInt = 0;
        String browserVersion = null;

        try {
            if (browserVersion != null) {
                versionInt = Integer.parseInt(browserVersion);
            }

        } catch (Exception e) {
            Log.error(e.getMessage());

        }

        return versionInt;
    }

    /**
     * Start an instance of Firefox
     */

    public static void startFireFoxBrowser(int fireFoxVersion) {

        dc = DesiredCapabilities.firefox();
        if (fireFoxVersion >= 47) {
            System.setProperty("webdriver.gecko.driver", Initializer.GECKO_DRIVER_EXE);
            dc.setCapability("marionette", true);
        } else {
            //less than 47, Gecko is not
            dc.setCapability("marionette", false);
        }


        //  disable the warning when you type in a name/password field
        myprofile = new FirefoxProfile();
        myprofile.setPreference("security.insecure_field_warning.contextual.enabled", false);

        dc.setCapability("firefox_profile", myprofile);
        driver = new FirefoxDriver(dc);

    }

    /*
    Retrieve configuration data from properties file
    */
    public static String getData(String propertyKey) {
        try {
            if (prop == null) {
                prop = new Properties();
                try {
                    prop.load(new FileInputStream(Initializer.CONFIG_PROPERTIES_PATH));

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop.getProperty(propertyKey);
    }

    public static void openUrl(String sURL) {

        try {
            driver.get(sURL);
            Log.console("Launched url " + sURL);

        } catch (Exception e) {
            Log.console("Failed to launch url " + sURL);
            Log.console(e.getMessage());

        }
    }

    /**
     * return test case method name
     *
     * @return
     */
    public static String getTestcaseName() {
        return testcaseName;
    }


    public static void initiateSoftAssertion() {
        try {

            SoftAssertions softly = new SoftAssertions();
            setTestStatus("Failed");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void softAssertAll() {
        softly.assertAll();
        String finalTestStatus = evaluateTestStatus();
        setTestStatus(finalTestStatus);
        Log.console("Test Case  " + getTestcaseName() + " " + finalTestStatus);
    }

    public static String evaluateTestStatus() {

        String finalTestStatus = "";
        int errorCount = softly.errorsCollected().size();
        if (errorCount == 0) {
            finalTestStatus = "Passed";
        } else {
            finalTestStatus = "Failed";
        }
        return finalTestStatus;

    }

    /**
     * get test status execution
     *
     * @return
     */

    public static String getTestName() {
        return testcaseName;
    }

    public static String getTeststatus() {
        return teststatus;
    }


    public static void setTestStatus(String testStatus) {

        testStatus = testStatus;
    }

    public static void startExecution() {
        getDriver();
    }

    public static void stopExecution() {
        try {

            getDriver().quit();
            getDriver().close();
            driver = null;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickOnLink(WebElement element, String elementDesc) {

        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
            Log.console("Clicked '" + elementDesc + "' link");

        } catch (Exception var4) {
            var4.printStackTrace();
            Log.console("Failed to Click '" + elementDesc + "' link");
        }
    }

    public static void editFieldAction(WebElement element, String elementDesc, String value) {
        if (value != "" && value != null)
            try {

                highlightElement(element); // demo or debug mode
                element.clear();
                element.sendKeys(new CharSequence[]{value});
                Log.console("Entered '" + value + "' in '" + elementDesc + "' field");

            } catch (Exception var4) {
                var4.printStackTrace();
            }

    }

    /**
     * Highlight the web element configured for demo mode
     *
     * @param element
     */
    public static void highlightElement(WebElement element) {
        try {
            String execType = getData("ExecutionType");
            if (execType.equals("Demo") || execType.equals("Debug")) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].style.border='solid 2px red'", new Object[]{element});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void clickButton(WebElement element, String elementDesc) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
            Log.console("Clicked '" + elementDesc + "' button successfully");

        } catch (Exception e) {

            Log.console("Could not click '" + elementDesc + "' ");
            e.printStackTrace();
        }

    }

    public static Boolean isWebElementPresent(WebElement element, String elementDesc) {
        Boolean flag = false;

        try {
            element.isDisplayed();
            flag = true;

        } catch (Exception e) {
            Assert.fail("Element '" + elementDesc + "' is not displayed");
            Log.error(e.getMessage());
        }

        return flag;
    }

    public static WebElement getElementFromListByValue(WebElement selectList, String elementDesc, String elementName) {

        Object elementToBeSelected = null;

        try {
            Select ElementList = new Select(selectList);
            ElementList.selectByValue(elementName);
            Log.info("Selected '" + elementDesc + " ' from List by value");

        } catch (Exception e) {
            Log.error("");
        }

        return (WebElement) elementToBeSelected;
    }

    public static WebElement getElementFromListByName(WebElement selectList, String elementDesc, String elementName) {

        Object elementToBeSelected = null;

        try {
            Select ElementList = new Select(selectList);
            ElementList.selectByVisibleText(elementName);
            Log.info("Selected '" + elementDesc + " ' from List by visible text");

        } catch (Exception e) {
            Log.error("Error selecting visible text");
        }

        return (WebElement) elementToBeSelected;
    }


    public static String getElementText(WebElement element, String elementDesc) {

        String elementValue = null;

        try {
            highlightElement(element);
            elementValue = element.getText();
            Log.info("Returned text  '" + elementValue + "' for element '" + elementDesc + "'");

        } catch (Exception e) {
            Log.error("Unable to read value of '" + elementValue + "' for element '" + elementDesc + "'");
        }

        return elementValue;
    }


    public static void validateDropDown(String expectedValues, List<WebElement> elements) {
        List<String> expectedDropDownValues = null;
        HashSet actualDropDownValues = null;

        try {
            String[] expValues = expectedValues.split(",");
            actualDropDownValues = new HashSet();
            Iterator addactualValues = elements.iterator();
            while (addactualValues.hasNext()) {
                actualDropDownValues.add(((WebElement) addactualValues.next()).getText());
            }
            if (expectedDropDownValues == null || actualDropDownValues == null || expectedDropDownValues.size() != actualDropDownValues.size())
                throw new Exception();
            if (!expectedDropDownValues.containsAll(actualDropDownValues)) {
                throw new Exception();

            }
            Log.console("The provided drop down values :" + expectedDropDownValues + " matched with actual values " + actualDropDownValues);

        } catch (Exception e) {
            Log.console("The provided drop down values :" + expectedDropDownValues + " does not match with actual values " + actualDropDownValues);

        }
    }

    public static void refreshPage() {

        try {

            driver.navigate().refresh();

        } catch (Exception e) {
            Log.error(e.getMessage());
        }
    }

    /**
     * Generate random number to salt test data
     *
     * @param min
     * @param max
     * @return
     */

    public static String generateRandomNumber(int min, int max) {
        Random aRandom = new Random();
        int randomNumber = aRandom.nextInt(max + 1 - min) + min;

        return Integer.toString(randomNumber);

    }

    /**
     * Generate GUUIDs to salt test data
     *
     * @return
     */
    public static UUID generateUniqueUUID() {
        UUID uniqueKey = UUID.randomUUID();
        return uniqueKey;
    }

    /**
     * Assertions
     */

    public static void validateAssertTrue(boolean bActual, String sValidationDesc) {

        softly.assertThat(bActual).isEqualTo(true);
        if (bActual) {
            Log.info("\t \t \t validation " + sValidationDesc + " Actual " + bActual + " match expected 'true'");
        } else
            Log.info("\t \t \t validation " + sValidationDesc + " Actual " + bActual + " did not match expected 'false'");

    }

    public static void validateEqualAssert(String sActual, String sExpected, String sValidationDesc) {


        try {

            softly.assertThat(sActual).isEqualTo(sExpected);
            if (sExpected.equalsIgnoreCase(sActual)) {
                Log.info("\t \t \t validation " + sValidationDesc + " Actual " + sActual + " match expected 'true'" + sExpected);

            } else {
                Log.info("\t \t \t validation " + sValidationDesc + " Actual " + sActual + " did not match expected 'false'" + sExpected);
            }

        } catch (Exception e) {
            Log.error("Error validateEqualAssert " + e.getMessage());
        }


    }

    public static void validateEqualAssert(int intActual, int intExpected, String sValidationDesc) {

        softly.assertThat(intActual).isEqualTo(intExpected);
        if (intActual == intExpected) {
            Log.info("\t \t \t validation " + sValidationDesc + " Actual " + intActual + " match expected 'true'" + intExpected);

        } else {
            Log.info("\t \t \t validation " + sValidationDesc + " Actual " + intActual + " did not match expected 'false'" + intExpected);
        }

    }
}
