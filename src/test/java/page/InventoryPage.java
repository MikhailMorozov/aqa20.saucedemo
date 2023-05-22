package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class InventoryPage extends BasePage{

    private final By TWITTER_BUTTON = By.className("social_twitter");
    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public void switchToTwitter() {
        driver.findElement(TWITTER_BUTTON).click();
        Set<String> windows = driver.getWindowHandles();
        driver.switchTo().window(windows.stream().toList().get(1));
    }
}
