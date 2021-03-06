package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class HomePageOld {

    public static void main(String[] args) throws InterruptedException {

        String amazonUrl = "https://www.amazon.com/";
        String productName = "Mask";
        String searchBoxLocator = "twotabsearchtextbox";
        String searchButtonLocator = "nav-search-submit-button";

 //Firefox browser
//        String fireFoxDriverPath = "BrowserDriver/windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get("https://www.amazon.com/");

        //Chrome browser
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("amazonUrl");
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        driver.findElement(By.className(searchButtonLocator)).click();
        Thread.sleep(5000); // Wait purpose
        driver.close();


    }


}
