package BasicWebdriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class A001JavaWd {
    public static void main(String[] args) {
        String baseUrl = "http://hrm.seleniumminutes.com";
        String expectedTitle = "OrangeHRM";
//For Firefox:
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // For Chrome:
        //System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle: " + actualTitle);
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Test Passed!");
        }
        else {
            System.out.println("Test Failed");
        }
        driver.quit();
    }
}

