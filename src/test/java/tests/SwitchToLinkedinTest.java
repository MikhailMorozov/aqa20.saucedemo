package tests;

import org.testng.annotations.Test;
import page.MainPage;

public class SwitchToLinkedinTest extends BaseTest{

    private final String expectedSite = "@saucelabs";

    @Test
    public void SwitchToLinkedinTest() {
        MainPage mainPage = new MainPage(driver, expectedSite);
        mainPage.openMainPage();
        mainPage.inputLoginStandardUser();
        mainPage.inputPassword();
        mainPage.clickLoginButton();
        mainPage.switchToTwitterAndWait();
    }
}
