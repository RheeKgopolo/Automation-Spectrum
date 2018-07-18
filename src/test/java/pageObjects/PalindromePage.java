package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PalindromePage {

    /**
     * PageFactory Design Pattern:
     * <p>
     *      Defines how to transform given object (field, class, etc) into By class used by webdriver to locate elements.
     *      Looks for one of FindBy , FindBys or FindAll field annotations.
     * </p>
     *
     * <p>
     *     Various Web Element identifies can be used to locate elements on each Page class and build a DOM object library
     *
     *      initElements(WebDriver driver, Class<T> pageClassToProxy)
     *      call from StepDefinition to implement: PageFactory(initElements(WebDriver driver, PalindromePage))
     *      initialize (find) all elements when I instantiate (initialize) the page class
     *
     *      * Note: cannot use PageFactory Annotations with dynamic values that are computed at runtime, only static constant
     * </p>
     */


    @FindBy(how = How.ID, using = "originalWord")
    @CacheLookup // a handy way for quick looks-ups if no changes are expected on the page
    public static WebElement palindrome_input;

    @FindBy(how = How.ID, using = "button1")
    public static WebElement palindrome_submit;

    @FindBy(how = How.ID, using = "palindromeResult")
    public static WebElement palindrome_result;

    @FindBy(how = How.ID, using = "anagramWord")
    public static WebElement anagram_input;

    @FindBy(how = How.ID, using = "button2")
    public static WebElement anagram_submit;

    @FindBy(how = How.ID, using = "anagramResult")
    public static WebElement anagram_result;


    //constructor to initialize class
    public PalindromePage() {

    }
}
