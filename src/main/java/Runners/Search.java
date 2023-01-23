package Runners;

import Pages.homePage;
import Utilites.utilits;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Utilites.utilits.driver;

public class Search {
    Pages.homePage homePage = new homePage(driver);


    @BeforeTest
    public void initiate(){
        utilits.initiate();

    }

    @Test
    public void Search(){
        homePage.HPSearch();

    }
    @AfterTest
    public void terminate(){
driver.quit();
    }
}
