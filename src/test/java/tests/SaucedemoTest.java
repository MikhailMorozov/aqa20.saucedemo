package tests;

import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.InventoryPage;

import page.LoginPage;
import page.TwitterPage;
import steps.InventoryPageSteps;
import steps.LoginPageSteps;

public class SaucedemoTest extends BaseTest{

    User user = new User("standard_user", "secret_sauce");

    @Test
    public void switchToSauceLabsOnTwitterPageTest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        InventoryPage inventoryPage = loginPageSteps.login(user);
        inventoryPage.switchToTwitter();
        TwitterPage twitterPage = new TwitterPage();
        boolean actualResult = twitterPage.isDisplayTwitterPageAndWait();
        Assert.assertTrue(actualResult,"TwitterPage doesn't open");
    }

    @Test
    public void logoutTest() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.login(user);
        InventoryPageSteps inventoryPageSteps = new InventoryPageSteps();
        LoginPage loginPage = inventoryPageSteps.logout();
        boolean actualResult = loginPage.loginButtonIsDisplayed();
        Assert.assertTrue(actualResult, "Logout is wrong");
    }
}
