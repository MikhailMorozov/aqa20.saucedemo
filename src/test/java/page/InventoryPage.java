package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;


public class InventoryPage extends BasePage{

    @FindBy(xpath = "//li[@class='social_twitter']")
    private WebElement TWITTER_BUTTON;

    public boolean isDisplayTwitterButton(){
        return waitVisibilityOf(TWITTER_BUTTON).isDisplayed();
    }

    public InventoryPage switchToTwitter(){
        waitElementToBeClickable(TWITTER_BUTTON).click();
        Set<String> windows = driver.getWindowHandles();
        driver.switchTo().window(windows.stream().toList().get(1));
        return this;
    }





}
