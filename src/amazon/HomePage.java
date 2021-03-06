package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {

    WebDriver driver;
    String amazonUrl = "https://www.amazon.com/";
    String productName = "Mask";
    String searchBoxLocator = "twotabsearchtextbox";
    String searchButtonLocator = "nav-search-submit-button";


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
    public void testSearchBox() {
        checkSearchBox();
        String expectedText = "\"Mask\"";
        String actualText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
        Assert.assertEquals(actualText, expectedText, "Product does not match");


    }

// Action method
    public void checkSearchBox() {
        // Enter product name
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        // Click on search button
        driver.findElement(By.id(searchButtonLocator)).click();


    }

    @AfterMethod
    public void tearDown() {
        //driver.close();
        driver.quit();


    }


}
