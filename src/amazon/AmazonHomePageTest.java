package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonHomePageTest extends AmazonHomePage {


    @Test
    public void testFindAGiftLink() throws InterruptedException {
        checkFindAGift();
        String expectedText = "Gifts for Men | Amazon.com Gift Finder";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working");
    }

//    @Test
//    public void testCheckBirthdayGiftList() {
//        checkBirthdayGiftList();
//        String expectedText = "Amazon Birthday Gift List";
//        String actualText= driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Birthday gift link is not working as expected");
//
//    }

    @Test
    public void testCheckBooks() {
        checkBooks();
        String expectedText = "Amazon.com: Business & Money: Books: Economics, Management & Leadership, Marketing & Sales & More";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working");

    }

    @Test
    public void testCheckBestSellers() {
        checkBestSellers();
        String expectedText = "Amazon Best Sellers: Best Electronics";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Best Sellers link is not working as expected");
    }


    @Test
    public void testCheckTodaysDeals() {
        checkTodaysDeals();
        String expectedText = "Gold Box Deals | Today's Deals - Amazon.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Today's Deals link is not working as expected");
    }

    @Test
    public void testCheckPrime() {
        checkPrime();
        String expectedText = "Prime Delivery";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Prime link is not working");
    }

    //    @Test
//    public void testCheckCustomerService() {
//        checkCustomerService();
//        String expectedText = "Your Account";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Customer Service link is not working");
//    }
    @Test
    public void testCheckCustomerService() {
        checkCustomerService();
        String expectedText = "Your Orders";
        String actualText = driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/div/span")).getText();
        Assert.assertEquals(actualText, expectedText, "Customer Service link is not working");
    }


    @Test
    public void testCheckNewReleases() {
        checkNewReleases();
        String expectedText = "Amazon.com New Releases: The best-selling new & future releases in Freezers";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "New Releases link is not working");
    }

    @Test
    public void testCheckFashion() {
        checkFashion();
        String expectedText = "Athletic";
        String actualText = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[2]/ul/li[4]/span/a/span")).getText();
        Assert.assertEquals(actualText, expectedText, "Fashion link is not working");

    }


    @Test
    public void testCheckKindleBooks() {
        checkKindleBooks();
        String expectedText = "Amazon.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Kindle Books link is not working");
    }

    @Test
    public void testCheckGiftCards() {
        checkGiftCards();
        String expectedText = "Occasions";
        String actualText = driver.findElement(By.xpath("//*[@id=\"n/2973102011\"]/span/a/span[2]")).getText();
        Assert.assertEquals(actualText, expectedText, "Gift Card link is not working");
    }

    @Test
    public void testCheckToysAndGames() {
        checkToysAndGames();
        String expectedText = "Amazon.com : Building Toys";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Toys & Games link is not working");
    }

//    @Test
//    public void testCheckAmazonHome() {
//        checkAmazonHome();
//        String expectedText = "Shop by Room - Home Office | Amazon.com";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Amazon Home link is not working");

    //}

    @Test
    public void testCheckAllButton() {
        checkAllButton();
        String expectedText = "Amazon Best Sellers: Best Baby";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "All  link is not working");
    }

    @Test
    public void testCheckNewReleasesLink() {
        checkNewReleasesLink();
        String expectedText = "Amazon.com New Releases: The best-selling new & future releases on Amazon";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "New Release link is not working");
    }


    @Test
    public void testCheckCareers() {
        checkCareers();
        String expectedText = "Student Programs | Amazon.jobs";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Careers link is not working");
    }

    @Test
    public void testCheckBlog() {
        checkBlog();
        String expectedText = "Who we are";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Blog link is not working");
    }

    @Test
    public void testCheckAboutAmazon() {
        checkAboutAmazon();
        String expectedText = "Amazon Store";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "About Amazon link is not working");

    }

    @Test
    public void testCheckPressCenter() {
        checkPressCenter();
        String expectedText = "Press release archive | Amazon.com, Inc. - Press Room";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Press Center link is not working");
    }

    @Test
    public void testCheckInvestorRelations() {
        checkInvestorRelations();
        String expectedText = "Amazon.com, Inc. - Events";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Investor Relations link is not working");
    }

    @Test
    public void testCheckAmazonDevices() {
        checkAmazonDevices();
        String expectedText = "Amazon.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Amazon Devices link is not working");

    }

    @Test
    public void testCheckAmazonTours() {
        checkAmazonTours();
        String expectedText = "Join our team on a guided video-tour through a fulfillment center";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Amazon Tours link is not working");
    }

    @Test
    public void testCheckShopNow() {
        checkShopNow();
        String expectedText = "Amazon.com: The New York Times - Daily Edition for Kindle: Kindle Store";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Shop Now link is not working");
    }

    @Test
    public void testCheckHome() {
        checkHome();
        String expectedText = "Amazon.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working");
    }

    @Test
    public void testCheckFurniture() {
        checkFurniture();
        String expectedText = "Amazon.com: $100 to $200 - Furniture / Customers' Most-Loved: Work-from-Home Finds: Home & Kitchen";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, " Furniture Link is not working");
    }

    @Test
    public void testCheckToys() {
        checkToys();
        String expectedText = "St. Patrick's Day | Toys & Games | Amazon.com Gift Finder";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, " Furniture Link is not working");
    }

    @Test
    public void testCheckShopWithPoints() {
        checkShopWithPoints();
        String expectedText = "Amazon.com: Prepaid Cards: Credit & Payment Cards";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, " Shop With Points Link is not working");
    }

    @Test
    public void testCheckReloadYourBalance() {
        checkReloadYourBalance();
        String expectedText = "Your Auto-Reload Setting";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, " Reload Your Balance Link is not working");
    }

    @Test
    public void testCheckAmazonAssistant() {
        checkAmazonAssistant();
        String expectedText = "Amazon.com Help: Buy Now Ordering";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, " Amazon Assistant Link is not working");
    }

    @Test
    public void testCheckCreditCardMarketPlace() {
        checkCreditCardMarketPlace();
        String expectedText = "Amazon Sign-In";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Credit card Market Place is not working");

    }


}
