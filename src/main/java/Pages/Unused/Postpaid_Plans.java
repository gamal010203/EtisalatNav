package Pages.Unused;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Postpaid_Plans {

    WebDriver webDriver;
    public Postpaid_Plans(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
@FindBy(xpath = "//div/div[contains (@class , 'swiper-slide swiper-slide-next')]")
    WebElement NewFreedomplan ;
@FindBy(xpath = "(//div/div/div/div/div/button[contains (@class , 'btn btn-dark btn-buy-now  ng-binding')])[1]")
WebElement Buynow1;












}
