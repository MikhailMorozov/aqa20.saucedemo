package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;
import java.util.stream.Collectors;


public class InventoryPage extends BasePage{

    @FindBy(xpath = "//li[@class='social_twitter']")
    private WebElement TWITTER_BUTTON;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement BURGER_MENU;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement LOGOUT_LINK;



    public InventoryPage switchToTwitter(){
        waitElementToBeClickable(TWITTER_BUTTON).click();
        Set<String> windows = driver.getWindowHandles();
        driver.switchTo().window(windows.stream().collect(Collectors.toList()).get(1));
        return this;
    }

    public InventoryPage openBurgerMenu() {
        waitElementToBeClickable(BURGER_MENU).click();
        return this;
    }

    public InventoryPage logoutLinkClick() {
        waitElementToBeClickable(LOGOUT_LINK).click();
        return this;
    }




}
