package Runners;

import Pages.Microsoft356Page;
import Pages.Unused.HomePage;
import Pages.Unused.Postpaid_Plans;
import Pages.homePage;
import Utilites.utilits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Utilites.utilits.driver;

public class Microsoft356 {
    homePage homePage = new homePage(driver);

    Microsoft356Page microsoftPage = new Microsoft356Page(driver);

utilits util = new utilits();
    @BeforeTest
    public void test(){
        utilits.initiate();
    }
    @Test(priority = 0)
    public void t0(){
        homePage.wellcomeMassage("hi");
    }
    @Test(priority = 1)
    public void t1(){

        homePage.navMicrosoft356();
         microsoftPage.Microsoft365eLifeto6();
    }


}
