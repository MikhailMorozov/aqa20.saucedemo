package page;

import constants.PageUrls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage{

    private final String loginStandardUser = "standard_user";
    private final String password = "secret_sauce";


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
        driver.findElement(LOGIN_INPUT).sendKeys(loginStandardUser);
    }

    public void inputPassword() {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }


}
