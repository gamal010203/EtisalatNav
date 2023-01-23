package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

import static Utilites.utilits.*;

public class homePage {
    WebDriver webDriver;
    public homePage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    //Elements
//    @FindBy(id= "searchInput")
//    WebElement searchBar;
//    @FindBy(xpath = "(//*[@id=\"collapse10\"]/div)[1]")
//    WebElement searchResult;
//@FindBy (xpath = "(//ul/li/a[contains(@class , 'px-8 px-xxl-16 py-16')])[1]")
//WebElement MobilePlan;
private  By Digitalproducts = By.xpath ("(//ul/li/A[@Class='px-8 px-xxl-16 py-16'])[4]");

 private By btnicrosoft356 = By.xpath ("(//*[text ()='Microsoft 365'])[1]");

 protected By Quickpay = By.xpath("(//div/ul/li/a[contains(@class , 'd-flex w-100 align-items-center ')])[3]");

 protected By Search = By.id("searchInput");

 protected By DevicesList = By.xpath("(//ul/li/a[contains(@class , 'px-8 px-xxl-16 py-16')])[3]");

 protected By Devices_Smartphones = By.xpath("(//*[text () = 'Smartphones'])[1]");

 protected By GamingDigPro = By.xpath("(//*[text ()='Gaming'])[1]");
 protected By Devices = By.xpath("(//*[text()='Devices'])[1]");
 protected By Smartphones = By.xpath("(//*[text ()='Smartphones'])[1]");
 protected By Laptops = By.xpath("(//*[text ()='Laptops & Tablets'])[1]");
 protected By Accessories = By.xpath("(//*[text ()='Accessories'])[1]");
 protected By SmartHome = By.xpath("(//*[text ()='Smart Home Devices'])[1]");
protected By GamingGadgets = By.xpath("(//*[text ()='Gaming & Gadgets'])[1]");
protected By Wearables = By.xpath("(xpath=\"(//*[text ()='Wearables'])[1]");
    protected By Apple = By.xpath("((//div[contains(@class,'category-tile-logo')])[1]/div)[1]");
    protected By Samsung = By.xpath("((//div[contains(@class,'category-tile-logo')])[1]/div)[2]");
    protected By Huawei = By.xpath("((//div[contains(@class,'category-tile-logo')])[1]/div)[3]");
    protected By Sony = By.xpath("((//div[contains(@class,'category-tile-logo')])[1]/div)[4]");
    protected By Belkin = By.xpath("((//div[contains(@class,'category-tile-logo')])[1]/div)[5]");
    protected By Amazon= By.xpath("((//div[contains(@class,'category-tile-logo')])[1]/div)[6]");


 //Methods
public void hoverApple (){
    waitForElement(Devices);
    hover(Devices);
    waitForElement(Apple);
    Click(Apple);
    }
    public void hoverSamsung(){
    waitForElement(Devices);
    hover(Devices);
    waitForElement(Samsung);
    Click(Samsung);
    }
public void hoverHuawi(){
    waitForElement(Devices);
    hover(Devices);
    waitForElement(Huawei);
    Click(Huawei);
}
public void HoverSony(){
    waitForElement(Devices);
    hover(Devices);
    waitForElement(Sony);
    Click(Sony);
}

public void HoverBelkin(){
    waitForElement(Devices);
    hover(Devices);
    waitForElement(Belkin);
    Click(Belkin);
}
public void hoverAmazon(){
    waitForElement(Devices);
    hover(Devices);
    waitForElement(Amazon);
    Click(Amazon);
}
    public void hoverGaming(){
        waitForElement(Devices);
        hover(Devices);
        waitForElement(GamingDigPro);
        Click(GamingDigPro);
    }
    public void navMobile(){
        waitForElement(DevicesList);
    hover(DevicesList);
        waitForElement(Devices_Smartphones);
    Click(Devices_Smartphones);
    }
public void HPSearch (){
    waitForElement(Search);
    EnterData(Search,"Iphone");
    submit(Search);

}


    public void wellcomeMassage(String massage) {
        System.out.println(massage);
    }
//    public  void searchForItem (String keyword){
//        searchBar.clear();
//        searchBar.sendKeys(keyword);
//    }
    public void navMicrosoft356(){


                waitForElement(Digitalproducts);

        hover(Digitalproducts);

        waitForElement(btnicrosoft356);
click(btnicrosoft356);


    }

//
//public void hovermobileplan (){
//        waitForElement(MobilePlan);
//        hover(MobilePlan);
//        MobilePlan.click();
//}
//    public void selectFromSearch(){
//        waitForElement(searchResult);
//
//        searchResult.click();
//    }
public void QuickPay() throws InterruptedException {
        waitForElement(Quickpay);
        click(Quickpay);
    Thread.sleep(5000);

}
public void navSmartphones(){
        waitForElement(Devices);
        hover(Devices);
waitForElement(Smartphones);
click(Smartphones);
}
public void navLaptops(){
        waitForElement(Devices);
        hover(Devices);
waitForElement(Laptops);
click(Laptops);
}
public void navAccessories(){
        waitForElement(Devices);
        hover(Devices);
waitForElement(Accessories);
click(Accessories);
}
public void navSmartSmarthomes(){
        waitForElement(Devices);
        hover(Devices);
waitForElement(SmartHome);
click(SmartHome);
}
public void navGamingGadgets(){
        waitForElement(Devices);
        hover(Devices);
waitForElement(GamingGadgets);
click(GamingGadgets);
}
public void navWearables(){
        waitForElement(Devices);
        hover(Devices);
waitForElement(Wearables);
click(Wearables);
}

}
