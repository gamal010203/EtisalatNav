package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static Utilites.utilits.*;

public class QuickPayRecharge {

    WebDriver webDriver;
    public QuickPayRecharge(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
//Elements
protected By MobileorinternetLine = By.xpath("//div/input[@name='quickPayAcNum']");
    protected By NextBtn = By.xpath("//button[normalize-space()='next']");




    //Method
    public void Qpay(){
        waitForElement(MobileorinternetLine);
        EnterData(MobileorinternetLine,"123124");
        waitForElement(NextBtn);
        click(NextBtn);
    }
}
