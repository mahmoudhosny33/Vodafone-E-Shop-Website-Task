package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
    static WebDriver driver;
    public static WebDriver setUp(String name){
        String option=name;
        option=name.toLowerCase();
        switch (option){
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                break;
        }
        driver.navigate().to("https://eshop.vodafone.com.eg/ar/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;

    }
}
