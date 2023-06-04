package tests;

import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.InventoryPage;

import page.TwitterPage;
import steps.LoginPageSteps;

public class SwitchToLinkedinTest extends BaseTest{

    @Test
    public void switchToSauceLabsOnTwitterPageTest() {
        //Создание юзера
        User user = new User("standard_user", "secret_sauce");
        // открытие страницы LoginPage
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        InventoryPage inventoryPage = loginPageSteps.login(user);
        inventoryPage.switchToTwitter();


        // переход на страницу InventoryPage
//        InventoryPage inventoryPage = new InventoryPage();
//        inventoryPage.switchToTwitter();

        // переход на страницу TwitterPage
        TwitterPage twitterPage = new TwitterPage();
        boolean actualResult = twitterPage.isDisplayTwitterPageAndWait();

        Assert.assertTrue(actualResult,"TwitterPage doesn't open");
    }
}
