package Pages.Unused;

import Utilites.utilits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
WebDriver driver;
    public HomePage(WebDriver driver1) {
        this.driver= driver1;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//img[@alt= 'etisalat-logo-english']")
    WebElement HPI;



    @FindBy(xpath="/img[@alt= 'etisalat-logo-english']")
 WebElement HomePageIcon;

    @FindBy (xpath="/div[contains(@class , 'container position-relative')]")
    WebElement homepage_Banner;

    @FindBy(xpath="(//ul/li/a[contains(@class , 'px-8 px-xxl-16 py-16')])[1]")
    WebElement Homepage_mobilePlans;

        @FindBy(xpath="(//ul/li/a[contains(@class , 'px-8 px-xxl-16 py-16')])[2]")
        WebElement    Homepage_Tv_Internet;

    @FindBy(xpath="(//ul/li/a[contains(@class , 'px-8 px-xxl-16 py-16')])[3]")
    WebElement Homepage_Devices;

        @FindBy(xpath="(//ul/li/a[contains(@class , 'px-8 px-xxl-16 py-16')])[4]")
        WebElement Homepage_Digital_products;



        @FindBy(xpath="/div/ul/li/a[contains(@class , 'px-12 py-16 ')]")
        WebElement Homepage_Support;

    @FindBy(xpath="/div/ul/li/a[contains(@class , 'px-12 py-16 accountName')]")
    WebElement Homepage_My_Account;

        @FindBy(xpath="/div/li/a[contains(@class , 'd-flex w-100 align-items-center')]")
        WebElement Homepage_Shopingcart;

    @FindBy(xpath="/div/div[contains(@class , 'swiper-button-next generic icon icon-lg-48 d-none d-lg-flex flex-center hbRight0')]")
    WebElement Homepage_RighSwapper;

        @FindBy(xpath="/div/div[contains(@class , '//div/div[contains(@class , 'swiper-button-prev generic icon icon-lg-48 d-none d-lg-flex flex-center hbLeft0')]")
        WebElement Homepage_leftSwapper;

    @FindBy(xpath="(//div/div/div/div/div[contains(@class , 'eand-box box-card-tile border-2 border-eand-primary-10 hover-eand-dark-red rounded-16 h-100 ')])[1]")
WebElement Homepage_Explore_Postpaid_plans;

        @FindBy(xpath="(//div/div/div/div/div[contains(@class , 'eand-box box-card-tile border-2 border-eand-primary-10 hover-eand-dark-red rounded-16 h-100 ')])[2]")
        WebElement Homepage_Explore_Tv_Internet;

    @FindBy(xpath="(//div/div/div/div/div[contains(@class , 'eand-box box-card-tile border-2 border-eand-primary-10 hover-eand-dark-red rounded-16 h-100 ')])[3]")
    WebElement Homepage_Explore_PrePaid_Plans ;

        @FindBy(xpath="(//div/div/div/div/div[contains(@class , 'eand-box box-card-tile border-2 border-eand-primary-10 hover-eand-dark-red rounded-16 h-100 ')])[4]")
    WebElement Homepage_Explore_Quickpay_recharge;

    @FindBy(xpath="(//div/div/div/div/div[contains(@class , 'eand-box box-card-tile border-2 border-eand-primary-10 hover-eand-dark-red rounded-16 h-100 ')])[5]")
    WebElement Homepage_Explore_Setup_autopay;

        @FindBy(xpath="(//div/div/div/div/div[contains(@class , 'eand-box box-card-tile border-2 border-eand-primary-10 hover-eand-dark-red rounded-16 h-100 ')])[6]")
WebElement     Homepage_Explore_Switch_to_etisalat;


    @FindBy(xpath="/div/div/div[contains(@class , 'swiper-button-next generic icon icon-lg-48 d-none d-lg-flex flex-center cp2Right0')]")
    WebElement Homepage_latest_offers_SwipeRight;

        @FindBy(xpath="/div/div/div[contains(@class , 'swiper-button-prev generic icon icon-lg-48 d-none d-lg-flex flex-center cp2Left0')]")
        WebElement Homepage_latest_offers_Swipeleft;


    @FindBy(xpath="(//*[text ()='Postpaid'])[1]")
    WebElement HomePage_Mobileplans_Plans_Postpaid;

        @FindBy(xpath="(//*[text ()='Prepaid'])[1]")
    WebElement Homepage_Mobileplans_Plans_prepaid;

    @FindBy(xpath="(//*[text ()='Visitor Line'])[1]")
    WebElement Homepage_Mobileplans_Plans_visitorLine;

        @FindBy(xpath="(//*[text ()='Control Line'])[1]")
    WebElement Homepage_Mobileplans_Plans_ControleLine;

    @FindBy(xpath="(//*[text ()='Roaming'])[1]")
    WebElement Homepage_Mobileplans_Plans_Roaming;

        @FindBy(xpath="(//*[text ()='Emirati Freedom'])[2]")
    WebElement Homepage_Mobileplans_Emirati_Freedom;

    @FindBy(xpath="(//*[text ()='Emirati Wasel'])[1]")
    WebElement Homepage_Mobileplans_Emirati_Wasel;

        @FindBy(xpath="(//*[text ()='Postpaid'])[2]")
    WebElement Homepage_Mobileplans_Addons_Postpaid;

        @FindBy(xpath="(//*[text ()='Prepaid'])[2]")
    WebElement Homepage_Mobileplans_Addons_prepaid ;

        @FindBy(xpath="(//*[text ()='Visitor Line'])[2]")
    WebElement Homepage_Mobileplans_Addons_visitorLine ;

    @FindBy(xpath="(//*[text ()='Control Line'])[2]")
    WebElement Homepage_Mobileplans_Addons_ControleLine;

        @FindBy(xpath="(//*[text ()='Roaming'])[2]")
    WebElement Homepage_Mobileplans_Addons_Roaming;

    @FindBy(xpath="(//*[text ()='Switch from Prepaid to Postpaid'])[1]")
    WebElement Homepage_Mobileplans_ShortCuts_Switchfrompretopost;

        @FindBy(xpath="(//*[text ()='Switch to Etisalat'])[1]")
    WebElement Homepage_Mobileplans_ShortCuts_SwitchToEtisalat;

    @FindBy(xpath="(//*[text ()='eSIM'])[1]")
    WebElement Homepage_Mobileplans_ShortCuts_eSim;

        @FindBy(xpath="(//*[text ()='Multi SIM'])[1]")
    WebElement Homepage_Mobileplans_ShortCuts_MultiSim;

    @FindBy(xpath="(//*[text ()='Play on Demand'])[1]")
    WebElement Homepage_Mobileplans_ShortCuts_PlayOnDemand;

        @FindBy(xpath="(//*[text ()='Goodbye 2G'])[1]")
    WebElement Homepage_Mobileplans_ShortCuts_Google2G;

    @FindBy(xpath="(//*[text ()='Leaving UAE'])[1]")
WebElement Homepage_Mobileplans_ShortCuts_LeavingUAE;


        @FindBy(xpath="(//*[text ()='eLife Plans'])[1]")
    WebElement Homepage_TVInternet_Products_elifeplans;

    @FindBy(xpath="(//*[text ()='Home Wireless'])[1]")
    WebElement Homepage_TVInternet_Products_Homewireless;

        @FindBy(xpath="(//*[text ()='Full Home Wi-Fi'])[1]")
    WebElement Homepage_TVInternet_Products_FullHomeWI_FI;

    @FindBy(xpath="(//*[text ()='Home Protection'])[1]")
    WebElement Homepage_TVInternet_Products_HomeProtection;

        @FindBy(xpath="(//*[text ()='eLife TV Gaming'])[1]")
    WebElement Homepage_TVInternet_Products_eLifeTVGaming;

    @FindBy(xpath="(//*[text ()='Smart Living'])[1]")
WebElement Homepage_TVInternet_Products_SmartLiving;

        @FindBy(xpath="(//*[text ()='eLife'])[1]")
        WebElement Homepage_TVInternet_AddOns_elife;

    @FindBy(xpath="(//*[text ()='TV'])[1]")
    WebElement Homepage_TVInternet_AddOns_TV;

        @FindBy(xpath="(//*[text ()='Calls'])[1]")
WebElement Homepage_TVInternet_AddOns_Calls;

    @FindBy(xpath="(//*[text ()='Switch to Etisalat'])[2]")
    WebElement    Homepage_TVInternet_Shortcuts_SwithtoEtisalat;

        @FindBy(xpath="(//*[text ()='Home move'])[1]")
        WebElement Homepage_TVInternet_Shortcuts_HomeMove;

    @FindBy(xpath="(//*[text ()='Premium TV Channels'])[1]")
    WebElement Homepage_TVInternet_Shortcuts_PremiumTvChannels;
        @FindBy(xpath="(//*[text ()='Smart monitoring'])[1]")
        WebElement Homepage_TVInternet_Shortcuts_SmartMonitoring;

    @FindBy(xpath="(//*[text ()='Home telephone'])[1]")
WebElement    Homepage_TVInternet_Shortcuts_HomeTelephone;

        @FindBy(xpath="(//*[text ()='Manage beIN Connect account'])[1]")
        WebElement   Homepage_TVInternet_Shortcuts_ManageBeinConnectAccount;


    @FindBy(xpath="(//*[text ()='Smartphones'])[1]")
    WebElement Homepage_Devices_Alldevices_Smartphones_;
        @FindBy(xpath="(//*[text ()='Laptops & Tablets'])[1]")
    WebElement    Homepage_Devices_Alldevices_LaptopsTablets_;


    @FindBy(xpath="(//*[text ()='Accessories'])[1]")
   WebElement Homepage_Devices_Alldevices_Accessories;
        @FindBy(xpath="(//*[text ()='Smart Home Devices'])[1]")
   WebElement Homepage_Devices_Alldevices_SmartHomeDevices;
    @FindBy(xpath="(//*[text ()='Gaming & Gadgets'])[1]")
    WebElement Homepage_Devices_Alldevices_GamingGadgets;
        @FindBy(xpath="(//*[text ()='Wearables'])[1]")
    WebElement Homepage_Devices_Alldevices_Wearables;
//    /* top brands*0/
//
//
//
//
//
//
//     */


    @FindBy(xpath="(//*[text ()='Order tracking'])[1]")
    WebElement    Homepage_Devices_Shortcuts_Ordertracking;

        @FindBy(xpath="(//*[text ()='Xbox All Access'])[1]")
        WebElement    Homepage_Devices_Shortcuts_XboxAllAccess;


    @FindBy(xpath="//*[text ()='Discover Entertainment'])[1]")
WebElement Homepage_Digitalroducts_Entertainment_DiscoverEntertainment;
        @FindBy(xpath="(//*[text ()='Gaming'])[1]")
  WebElement  Homepage_Digitalroducts_Entertainment_Gaming;

    @FindBy(xpath="(//*[text ()='Music'])[1]")
 WebElement   Homepage_Digitalroducts_Entertainment_Music;

      @FindBy(xpath="(//*[text ()='Video'])[1]")
       WebElement Homepage_Digitalroducts_Entertainment_Video;

   @FindBy(xpath="(//*[text ()='Switch TV'])[3]")
WebElement  Homepage_Digitalroducts_Entertainment_SwitchTV;


        @FindBy(xpath="(//*[text ()='Discover Lifestyle'])[1]")
WebElement  Homepage_Digitalroducts_Lifestyle_DiscoverLifestyle;

    @FindBy(xpath="(//*[text ()='Smart Home'])[1]")
 WebElement   Homepage_Digitalroducts_Lifestyle_SmartHome;
       @FindBy(xpath="(//*[text ()='Easy Insurance'])[1]")
  WebElement Homepage_Digitalroducts_Lifestyle_EasyInsurance;
   @FindBy(xpath="(//*[text ()='Smiles'])[3]")
  WebElement Homepage_Digitalroducts_Lifestyle_Smiles ;
        @FindBy(xpath="(//*[text ()='GoWell'])[1]")
WebElement Homepage_Digitalroducts_Lifestyle_GoWell;
   @FindBy(xpath="(//*[text ()='Microsoft 365'])[1]")
WebElement   Homepage_Digitalroducts_Productivity_Microsoft365;

       @FindBy(xpath="(//*[text ()='e& money'])[1]")
WebElement Homepage_Digitalroducts_PayWithEtisalat_emoney;



    //@FindBy(id= "searchInput")
  //  WebElement Homepage_Searchbar = driver.findElement(By.id("searchInput"));
public  void navigateToBanner (){
  utilits.driver.findElement(By.id("searchInput")).sendKeys("test");
    //homepage_Banner.click();
    System.out.println("This is a test for nacigation");
}

}
