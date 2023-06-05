package steps;


import model.User;
import page.InventoryPage;
import page.LoginPage;

public class LoginPageSteps {

    public InventoryPage login(User user) {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage()
                 .inputLoginStandardUser(user.getLogin())
                 .inputPassword(user.getPassword())
                 .clickLoginButton();
        return new InventoryPage();
    }
}
