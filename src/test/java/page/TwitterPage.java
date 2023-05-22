package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TwitterPage extends BasePage{

    private By TWITTER_PAGE = By.xpath("//span[text()='@saucelabs']");
    public TwitterPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayTwitterPageAndWait() {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(TWITTER_PAGE));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return true;
    }
}
