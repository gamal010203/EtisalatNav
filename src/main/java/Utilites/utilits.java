package Utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.sql.Statement;
import java.time.Duration;

public class utilits {

    public static WebDriver driver;
    public static JavascriptExecutor jsExecutor;

    public static void scrollDown() throws InterruptedException {
        Thread.sleep(5000);
        jsExecutor.executeScript("scroll(0,400);");
        Thread.sleep(2000);
        jsExecutor.executeScript("scroll(0,100);");
    }

    public static void Click(By Item) {
        driver.findElement(Item).click();
    }

    public static void hover(WebElement Item) {
//        Actions action = new Actions(driver);
//        action.moveToElement(Item).perform();
//        action.click();
        Actions action = new Actions(driver);
        action.moveToElement(Item).perform();
        action.click();
    }

    public static void hover(By loc) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(loc)).perform();
        action.click();
    }

    public static void initiate() {

        WebDriverManager.chromedriver().setup();
        utilits.driver = new ChromeDriver();
        jsExecutor = (JavascriptExecutor) driver;
        utilits.driver.manage().window().maximize();
        utilits.driver.get("https://www.etisalat.ae/en/index.html");
    }

//
//
//    public void scrollDown(int x , int y) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        // scroll down by 1000 pixels
//        js.executeScript("window.scrollBy(x,y)");
//    }

    public static void EnterData(By loc, String data) {
        driver.findElement(loc).clear();
        driver.findElement(loc).sendKeys(data);
    }

    public static void submit(By loc) {
        driver.findElement(loc).submit();
    }

    public static void click(By loc) {
        driver.findElement(loc)
                .click();
    }

    public static void waitForElement(WebElement element) {
        int time = 20;
        int polling = 1;

        try {
            FluentWait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(time))
                    .pollingEvery(Duration.ofSeconds(polling))
                    .ignoring(NoSuchElementException.class)
                    .withMessage("Waiting for element to appear time waited " + time);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (NoSuchElementException error) {
            System.out.println("Failed to find element \n " + error);

        }


    }


    public static void waitForElement(By loc) {
        int time = 20;
        int polling = 1;

        try {
            FluentWait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(time))
                    .pollingEvery(Duration.ofSeconds(polling))
                    .ignoring(NoSuchElementException.class)
                    .withMessage("Waiting for element to appear time waited " + time);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(loc)));
        } catch (NoSuchElementException error) {
            System.out.println("Failed to find element \n " + error);

        }

    }


}
