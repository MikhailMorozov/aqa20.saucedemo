package steps;

import model.User;
import page.InventoryPage;
import page.LoginPage;

public class InventoryPageSteps {

    public LoginPage logout() {
        InventoryPage inventoryPage = new InventoryPage();
        inventoryPage.openBurgerMenu()
                     .logoutLinkClick();
        return new LoginPage();
    }
}
