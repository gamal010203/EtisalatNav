package Pages;

import Utilites.utilits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static Utilites.utilits.click;
import static Utilites.utilits.waitForElement;

public class Gamingpage
{
    WebDriver webDriver;
    public Gamingpage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
protected By xbox = By.xpath("div/div[contains(@class, 'third-action-wrapper action-link')])[3]");


    public void navxbox() throws InterruptedException {
        Thread.sleep(3000);
 waitForElement(xbox);
 click(xbox);
    }
}
