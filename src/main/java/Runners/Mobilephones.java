package Runners;

import Pages.SmartphonePage;
import Pages.homePage;
import Utilites.utilits;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Utilites.utilits.driver;

public class Mobilephones {

    Pages.homePage homePage = new homePage(driver);
Pages.SmartphonePage BuySmartphone = new SmartphonePage(driver);
    @BeforeTest
    public void initiate(){
        utilits.initiate();

    }

    @Test(priority = 0)
    public void Navigatemobile() throws InterruptedException {

        homePage.navMobile();
        Thread.sleep(5000);
       // BuySmartphone.BuySPH();
    }
    @Test(priority = 1)
    public void buy_Mobile() throws InterruptedException {

        BuySmartphone.BuySPH();
    }
}
