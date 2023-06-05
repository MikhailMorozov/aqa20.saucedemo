package page;

import constants.PageUrls;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement LOGIN_INPUT;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement  PASSWORD_INPUT;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement LOGIN_BUTTON;


    public LoginPage openLoginPage() {
        driver.get(PageUrls.SAUCE_LOGIN_PAGE);
        return this;
    }
    public LoginPage inputLoginStandardUser(String login) {
        waitVisibilityOf(LOGIN_INPUT).sendKeys(login);
        return this;
    }
    public LoginPage inputPassword(String password) {
        waitVisibilityOf(PASSWORD_INPUT).sendKeys(password);
        return this;
    }
    public void clickLoginButton() {
        waitElementToBeClickable(LOGIN_BUTTON).click();
    }

    public boolean loginButtonIsDisplayed() {
        return waitVisibilityOf(LOGIN_BUTTON).isDisplayed();
    }


}
