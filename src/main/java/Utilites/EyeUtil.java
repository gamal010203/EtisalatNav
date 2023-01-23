package Utilites;

import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.Eyes;
import org.openqa.selenium.*;

import static Utilites.utilits.driver;


public class EyeUtil {
    public Eyes eyes;
    private WebDriver driver;
String URL ;
    public void SetEye(String Name){
        eyes = new Eyes();
        eyes.setApiKey("xtoVPjuHvEDQAlSey9sRD3wBEoKoBj2dAjTey1id2kQ110");
        eyes.setServerUrl("https://etisalateyes.applitools.com/");
        eyes.setMatchLevel(MatchLevel.LAYOUT);
        eyes.open(driver, "Etisalat Site", Name);
    }
public void TestUI(){
    eyes.checkWindow();

}
    String appName;


    public void validateWindow(String tagName, String testName) {
        eyes.open(driver, appName, testName);
        eyes.checkWindow(tagName);
        eyes.close();
    }


    public void validateElement(By locator) {
        eyes.open(driver, appName, Thread.currentThread().getStackTrace()[2].getMethodName());
        eyes.checkElement(locator);
        eyes.close();
    }
    public void forceAbort() {
        eyes.close();
        eyes.abortIfNotClosed();
    }


}
