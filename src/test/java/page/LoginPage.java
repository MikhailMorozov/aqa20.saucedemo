package page;

import constants.PageUrls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private final By LOGIN_INPUT = By.id("user-name");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void openLoginPage() {
        driver.get(PageUrls.SAUCE_LOGIN_PAGE);
    }
    public void inputLoginStandardUser() {
        driver.findElement(LOGIN_INPUT).sendKeys(System.getProperty("loginStandardUser"));
    }
    public void inputPassword() {
        driver.findElement(PASSWORD_INPUT).sendKeys(System.getProperty("password"));
    }
    public void clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }
}
