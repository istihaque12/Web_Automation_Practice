package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.server.PushBuilder;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonHomePage {

    WebDriver driver;
    String amazonUrl = "https://www.amazon.com/";

    @BeforeMethod
    public void setUp() {
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(amazonUrl);
    }

    @Test
    public void checkFindAGift() throws InterruptedException {
        driver.findElement(By.linkText("Find a Gift")).click();
        driver.findElement(By.linkText("MEN")).click();
        Thread.sleep(5000);
    }

////    @Test
////    public void checkBirthdayGiftList(){
////        driver.findElement(By.linkText("Find a Gift")).click();
////        driver.findElement(By.linkText("Birthday Gift List")).click();
////        //driver.findElement(By.linkText("Shop by age")).click();
//
//}

    @Test
    public void checkBooks() {
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.linkText("Business & Investing")).click();

    }

    @Test
    public void checkBestSellers() {
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Electronics")).click();
    }

    @Test
    public void checkTodaysDeals() {
        driver.findElement(By.linkText("Today's Deals")).click();
        driver.findElement(By.linkText("Amazon Devices")).click();
    }

    @Test
    public void checkPrime() {
        driver.findElement(By.linkText("Prime")).click();
        driver.findElement(By.linkText("Delivery")).click();
        // driver.findElement(By.linkText("Join Prime")).click();
    }

    @Test
    public void checkCustomerService() {
        driver.findElement(By.linkText("Customer Service")).click();
        driver.findElement(By.linkText("Your Account")).click();
        //driver.findElement(By.linkText("Trade-in")).click();
    }


    @Test
    public void checkNewReleases() {
        driver.findElement(By.linkText("New Releases")).click();
        driver.findElement(By.linkText("Appliances")).click();
        driver.findElement(By.linkText("Freezers")).click();
    }

    @Test
    public void checkFashion() {
        driver.findElement(By.linkText("Fashion")).click();
        driver.findElement(By.linkText("Men")).click();
        driver.findElement(By.linkText("Shoes")).click();
    }

    @Test
    public void checkKindleBooks() {
        driver.findElement(By.linkText("Kindle Books")).click();
        driver.findElement(By.linkText("Buy a Kindle")).click();
        driver.findElement(By.linkText("New")).click();

    }

    @Test
    public void checkGiftCards() {
        driver.findElement(By.linkText("Gift Cards")).click();
        driver.findElement(By.linkText("Birthdays")).click();
        driver.findElement(By.linkText("eGift Card")).click();
    }

    @Test
    public void checkToysAndGames() {
        driver.findElement(By.linkText("Toys & Games")).click();
        driver.findElement(By.linkText("Building Toys")).click();
    }


    @Test
    public void checkAllButton() {
        driver.findElement(By.linkText("All")).click();
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.linkText("Baby")).click();
    }

    @Test
    public void checkNewReleasesLink() {
        driver.findElement(By.linkText("All")).click();
        driver.findElement(By.linkText("New Releases")).click();
    }

    @Test
    public void checkMoversAndShakers() {
        driver.findElement(By.linkText("All")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[4]/a")).click();
        //driver.findElement(By.cssSelector("#zg_browseRoot > ul > li:nth-child(4) > a")).click();

    }

    @Test
    public void checkCareers() {
        driver.findElement(By.linkText("Careers")).click();
        driver.findElement(By.linkText("View open jobs")).click();

    }

    @Test
    public void checkBlog() {
        driver.findElement(By.linkText("Blog")).click();
        driver.findElement(By.linkText("Read more")).click();
        driver.findElement(By.linkText("Who We Are")).click();

    }

    @Test
    public void checkAboutAmazon() {
        driver.findElement(By.linkText("About Amazon")).click();
        driver.findElement(By.linkText("What We Do")).click();
        driver.findElement(By.linkText("Amazon Store")).click();

    }

    @Test
    public void checkPressCenter() {
        driver.findElement(By.linkText("Press Center")).click();
        driver.findElement(By.linkText("Press release archive")).click();
    }

    @Test
    public void checkInvestorRelations() {
        driver.findElement(By.linkText("Investor Relations")).click();
        driver.findElement(By.linkText("Events")).click();
        //driver.findElement(By.linkText("Q4 2020 WEBCAST SLIDES")).click();

    }

    @Test
    public void checkAmazonDevices() {
        driver.findElement(By.linkText("Amazon Devices")).click();
        driver.findElement(By.linkText("Last 30 days")).click();
        driver.findElement(By.linkText("Under $25")).click();

    }

    @Test
    public void checkAmazonTours() {
        driver.findElement(By.linkText("Amazon Tours")).click();
        driver.findElement(By.linkText("Start my tour")).click();
    }

    @Test
    public void checkShopNow() {
        driver.findElement(By.linkText("Shop now")).click();
        driver.findElement(By.linkText("The New York Times")).click();

    }

    @Test
    public void checkHome() {
        driver.findElement(By.linkText("Home")).click();
        driver.findElement(By.linkText("Bedding")).click();
        driver.findElement(By.linkText("$25 to $50")).click();

    }

    @Test
    public void checkFurniture() {
        driver.findElement(By.linkText("Furniture")).click();
        driver.findElement(By.linkText("$100 to $200")).click();
        // driver.findElement(By.linkText("New")).click();
    }

    @Test
    public void checkToys() {
        driver.findElement(By.linkText("Toys")).click();
        driver.findElement(By.linkText("Handmade")).click();
    }

    @Test
    public void checkShopWithPoints() {
        driver.findElement(By.linkText("Shop with Points")).click();
        driver.findElement(By.linkText("Amazon Store Card")).click();
        driver.findElement(By.linkText("Prepaid Cards")).click();
    }

    @Test
    public void checkReloadYourBalance() {
        driver.findElement(By.linkText("Reload Your Balance")).click();
        driver.findElement(By.linkText("Auto-Reload")).click();
    }

    @Test
    public void checkAmazonAssistant() {
        driver.findElement(By.linkText("Amazon Assistant")).click();
        driver.findElement(By.linkText("help page")).click();
        driver.findElement(By.linkText("Proceed to Checkout")).click();
        driver.findElement(By.linkText("Buy Now Ordering")).click();
    }

    @Test
    public void checkCreditCardMarketPlace() {
        driver.findElement(By.linkText("Credit Card Marketplace")).click();
        driver.findElement(By.linkText("No annual fee")).click();
        driver.findElement(By.linkText("contact us")).click();
    }


    @AfterMethod
    public void tearDown() {
        //driver.close();
        driver.quit();

    }


}











