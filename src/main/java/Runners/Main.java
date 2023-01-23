package Runners;

import Pages.Unused.HomePage;
import Pages.homePage;
import Utilites.utilits;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Utilites.utilits.driver;
import static Utilites.utilits.waitForElement;

public class Main {

    homePage homePage = new homePage(driver);
    @BeforeTest
    public void test(){
        utilits.initiate();
    }


    @Test(priority = 0)
    public void  launchingBroadCast () throws InterruptedException {
        homePage.wellcomeMassage("Launching E& Website");
        Thread.sleep(3000);
        }
//
//        @Test(priority = 1)
//    public void scenarioTwo_Banner() throws InterruptedException {
////            Pages.homePage home = new homePage(driver);
//homePage.searchForItem("Airpods");
//            homePage.selectFromSearch();
//
//        }

        @AfterTest
    public void terminate() throws InterruptedException {
        System.out.println("Terminating Browser..");
        Thread.sleep(2000);
        driver.quit();
        }

}
