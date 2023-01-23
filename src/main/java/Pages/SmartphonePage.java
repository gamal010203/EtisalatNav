package Pages;

import Utilites.utilits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static Utilites.utilits.click;
import static Utilites.utilits.waitForElement;
import static Utilites.utilits.*;

public class SmartphonePage {

    WebDriver webDriver;

    public SmartphonePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    //locaotrs
    protected By HonorX9a = By.xpath("(//div/a/div/span[.=\"BUY NOW\"])[1]");

    //methods
    public void BuySPH() throws InterruptedException {
        Thread.sleep(8000);
        waitForElement(HonorX9a);
        scrollDown();
        Thread.sleep(3000);
        scrollDown();
        click(HonorX9a);


    }
}
