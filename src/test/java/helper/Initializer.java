package helper;

/**
 * static initializer static{} block allows initialization of configurations properties used to get user dir path,
 * driver executables and config.properties
 */

public class Initializer {

    public static  String USERDIR;
    public  static String PROPERTIES_FILE_PATH;
    public static final String CONFIG_PROPERTIES_PATH;
    public static final String TEST_DATA_PATH;
    public static final String CHROME_DRIVER_EXE;
    public static final String IE_DRIVER_EXE;
    public static final String GECKO_DRIVER_EXE;
    public static final String PHANTOMJS_DRIVER_EXE;



    public Initializer(){

    }

    static {

        USERDIR = System.getProperty("user.dir");
        CONFIG_PROPERTIES_PATH = USERDIR + "\\src\\test\\resources\\Core\\Config.properties";
        PROPERTIES_FILE_PATH = USERDIR + "\\src\\test\\resources\\Core\\";
        TEST_DATA_PATH = USERDIR + "\\scr\\test\\resources\\testData\\";

        CHROME_DRIVER_EXE = USERDIR + "\\src\\test\\resources\\Drivers\\chromedriver.exe";
        IE_DRIVER_EXE = USERDIR + "\\scr\\src\\resources\\Drivers\\IEDriverServer.exe";
        GECKO_DRIVER_EXE = USERDIR + "\\scr\\test\\resources\\Drivers\\geckodriver.exe";
        PHANTOMJS_DRIVER_EXE = USERDIR + "\\src\\test\\resources\\Drivers\\phantomjs.exe";
    }

}
