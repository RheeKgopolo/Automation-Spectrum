package helper;


import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Log {

    private static Logger Log = LoggerFactory.getLogger(Log.class);

    private Log() {

        // do not instantiate
    }

    /**
     * Start test case
     *
     * @param sTestCaseName
     */
    public static void startTestCase(String sTestCaseName) {
        Log.info("Started Test Case {}", sTestCaseName);
    }

    /**
     * Stop test case
     *
     * @param sTestCaseName
     */
    public static void stopTestCase(String sTestCaseName) {
        Log.info("Stopped Test Case {}", sTestCaseName);
    }

    /**
     * Info
     *
     * @param message
     */
    public static void info(String message) {
        Log.info(message);
    }

    /**
     * Console
     *
     * @param message
     */
    public static void console(String message) {
        System.out.println(message);
        Log.info(message);
    }

    /**
     * Console and Info
     *
     * @param message
     */
    public static void error(String message) {
        Log.info("\t \t \t{}", message);
        Log.info("\t \t \t {}[Failed]", WebDriverUtils.testcaseName);
        Assert.fail("Test case " + WebDriverUtils.testcaseName + "Failed Due to '" + message + "'");
    }

}
