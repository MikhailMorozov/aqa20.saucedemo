package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.InventoryPage;
import page.LoginPage;
import page.TwitterPage;

public class SwitchToLinkedinTest extends BaseTest{

    @Test
    public void switchToSauceLabsOnTwitterPageTest() {
        // открытие страницы LoginPage
        LoginPage mainPage = new LoginPage(driver);
        mainPage.openLoginPage();
        mainPage.inputLoginStandardUser();
        mainPage.inputPassword();
        mainPage.clickLoginButton();

        // переход на страницу InventoryPage
        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.switchToTwitter();

        // переход на страницу TwitterPage
        TwitterPage twitterPage = new TwitterPage(driver);
        boolean actualResult = twitterPage.isDisplayTwitterPageAndWait();

        Assert.assertTrue(actualResult,"TwitterPage doesn't open");
    }
}
