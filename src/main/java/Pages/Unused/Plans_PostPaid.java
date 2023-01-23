package Pages.Unused;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Plans_PostPaid {
    WebDriver driver;

    public Plans_PostPaid(WebDriver driver) {
        this.driver=driver;
    }


    By Planspostpaid_Newfreedom = By.xpath("//div/div[contains (@class , 'swiper-slide active swiper-slide-active')]");
    By Planspostpaid_freedom = By.xpath("//div/div[contains (@class , 'swiper-slide swiper-slide-next')]");

    By Planspostpaid_Newfreedom_plan125 = By.xpath("(//div/div/div/div/div/button[contains (@class , 'btn btn-dark btn-buy-now  ng-binding')])[1]");
    By Planspostpaid_Newfreedom_plan200 = By.xpath("(//div/div/div/div/div/button[contains (@class , 'btn btn-dark btn-buy-now  ng-binding')])[2]");
    By Planspostpaid_Newfreedom_NonStopDataPlan325 = By.xpath("(//div/div/div/div/div/button[contains (@class , 'btn btn-dark btn-buy-now  ng-binding')])[3]");
    By Planspostpaid_Newfreedom_NonStopDataPlan250 = By.xpath("(//div/div/div/div/div/button[contains (@class , 'btn btn-dark btn-buy-now  ng-binding')])[4]");
    By Planspostpaid_Newfreedom_plan260 = By.xpath("(//div/div/div/div/div/button[contains (@class , 'btn btn-dark btn-buy-now  ng-binding')])[5]");


    By Planspostpaid_Newfreedom_Swiperight = By.id("nextButton-455e80f7-d0d1-4b66-8a8c-a680eaf799ad");
    By Planspostpaid_Newfreedom_Swipeleft = By.id("prevButton-455e80f7-d0d1-4b66-8a8c-a680eaf799ad");



    By Planspostpaid_Freedom_plan125 = By.xpath("(//div/div/button[contains (@class , 'btn btn-dark btn-buy-now  ng-binding')])[1]");
    By Planspostpaid_Freedom_plan500 = By.xpath("(//div/div/button[contains (@class , 'btn btn-dark btn-buy-now  ng-binding')])[2]");
    By Planspostpaid_Freedom_plan1000 = By.xpath("(//div/div/button[contains (@class , 'btn btn-dark btn-buy-now  ng-binding')])[3]");
    By Planspostpaid_Freedom_plan100 = By.xpath("(//div/div/button[contains (@class , 'btn btn-dark btn-buy-now  ng-binding')])[4]");
    By Planspostpaid_Freedom_plan175 = By.xpath("(//div/div/button[contains (@class , 'btn btn-dark btn-buy-now  ng-binding')])[5]");
    By Planspostpaid_Freedom_plan275 = By.xpath("(//div/div/button[contains (@class , 'btn btn-dark btn-buy-now  ng-binding')])[6]");

    By Planspostpaid_Newfreedom_Filter = By.xpath("( //span[contains(@class,'nv-text ng-binding')])[1]");
    By Planspostpaid_freedom_Filter = By.xpath("( //span[contains(@class,'nv-text ng-binding')])[1]");

    By Planspostpaid_Newfreedom_Upgradenow = By.xpath("//a[(@title = 'Upgrade now')]");
    By Planspostpaid_freedom_Upgradenow = By.xpath("//a[(@title = 'Upgrade now')]");

    By Planspostpaid_freedom_ViewOurCallingRate = By.xpath("//a[(@title = 'Upgrade now')]");






}
