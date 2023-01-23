package Runners;

import Pages.Gamingpage;
import Pages.homePage;
import Utilites.utilits;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Utilites.utilits.driver;

public class Xbox {
    Pages.homePage homePage = new homePage(driver);
    Pages.Gamingpage GP = new Gamingpage(driver);

    @BeforeTest
    public void initiate(){
        utilits.initiate();

    }
@Test(priority = 0)
    public void try1(){
    homePage.hoverGaming();

}
    @Test
    public void clXbox() throws InterruptedException {

        GP.navxbox();

    }

}
