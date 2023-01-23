package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static Utilites.utilits.*;


public class Microsoft356Page {
    WebDriver webDriver;
    public Microsoft356Page(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
    protected By ClickHere1 = By.xpath("(//*[text ()='click here'])[1]");
    protected By ClickHere2 = By.xpath("(//*[text ()='click here'])[2]");
    protected By ClickHere3 = By.xpath("(//*[text ()='click here'])[3]");

    protected By microsoft365FamilyeLife6 = By.xpath("(//*[text ()='SUBSCRIBE'])[1]");
    protected By microsoft365FamilyeLife1 = By.xpath("(//*[text ()='SUBSCRIBE'])[2]");
    protected By microsoft365post6 = By.xpath("((//*[text ()='SUBSCRIBE'])[1]");
    protected By microsoft365post1 = By.xpath("(//*[text ()='SUBSCRIBE'])[2]");
    protected By microsoft365pre6 = By.xpath("(//*[text ()='SUBSCRIBE'])[2]");
    protected By microsoft365pre1 = By.xpath("(//*[text ()='SUBSCRIBE'])[2]");

    //METHODS

//shadow block
public void Microsoft365eLifeto6(){
waitForElement(ClickHere1);
click(ClickHere1);
waitForElement(microsoft365FamilyeLife6);
click(microsoft365FamilyeLife6);
}
public void Microsoft365eFamilyLife1(){
        waitForElement(ClickHere2);
        click(ClickHere2);
        waitForElement(microsoft365FamilyeLife1);
        click(microsoft365FamilyeLife1);
    }

public void Microsoft365postpaid6(){
        waitForElement(ClickHere2);
        click(ClickHere2);
        waitForElement(microsoft365post6);
        click(microsoft365post6);
    }
public void Microsoft365postpaid1(){
        waitForElement(ClickHere2);
        click(ClickHere2);
        waitForElement(microsoft365post1);
        click(microsoft365post1);
    }

public void Microsoft365preprod6(){
        waitForElement(ClickHere3);
        click(ClickHere3);
        waitForElement(microsoft365pre6);
        click(microsoft365pre6);
    }

public void Microsoft365preprod1(){
        waitForElement(ClickHere3);
        click(ClickHere3);
        waitForElement(microsoft365pre1);
        click(microsoft365pre1);
    }



}
