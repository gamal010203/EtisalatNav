package Runners;
import Pages.QuickPayRecharge;
import Pages.homePage;
import Utilites.utilits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Utilites.utilits.driver;

public class Quickpay {
    homePage homePage = new homePage(driver);
    QuickPayRecharge Qp = new QuickPayRecharge(driver);
    utilits util = new utilits();

@BeforeTest
    public void initiate(){
    utilits.initiate();

}
@Test(priority = 0)
    public void QuickPay() throws InterruptedException {
    homePage.QuickPay();
}

@Test(priority = 1)
public void adddata(){
        Qp.Qpay();

    }
@AfterTest
    public void Terminate(){
    driver.quit();

}

}

