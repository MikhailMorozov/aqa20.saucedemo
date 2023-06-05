package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TwitterPage extends BasePage{

    @FindBy(xpath = "//span[text()='@saucelabs']")
    private WebElement TWITTER_PAGE;

    public boolean isDisplayTwitterPageAndWait() {
        return waitVisibilityOf(TWITTER_PAGE).isDisplayed();
    }
}
