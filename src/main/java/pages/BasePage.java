package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    BasePage(WebDriver driver)
    {
        this.driver=driver;
        this.wait = new WebDriverWait(this.driver, 20);
    }
}
