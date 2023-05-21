package page;

import constants.PageUrls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MainPage extends BasePage{

    private final String loginStandardUser = "standard_user";
    private final String password = "secret_sauce";


    private final By LOGIN_INPUT = By.id("user-name");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("login-button");
    private final By TWITTER_BUTTON = By.className("social_twitter");
    private By TWITTER_PAGE;

    public MainPage(WebDriver driver, String twitterAccount) {
        super(driver);
        this.TWITTER_PAGE = By.xpath("//span[text()='" + twitterAccount + "']");
    }

    public void openMainPage() {
        driver.get(PageUrls.SAUCE_MAIN_PAGE);
    }

    public void inputLoginStandardUser() {
        driver.findElement(LOGIN_INPUT).sendKeys(loginStandardUser);
    }

    public void inputPassword() {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }

    public void switchToTwitterAndWait() {
        driver.findElement(TWITTER_BUTTON).click();
        Set<String> windows = driver.getWindowHandles();
        driver.switchTo().window(windows.stream().toList().get(1));
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(TWITTER_PAGE));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


}
