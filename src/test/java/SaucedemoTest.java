import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SaucedemoTest {
    WebDriver driver;

    @Test
    public void saucedemoLocatorsTest(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
//        открыть https://www.saucedemo.com/inventory.html
        driver.get("https://www.saucedemo.com/inventory.html");
//        id
        WebElement reactBurgerMenuButton = driver.findElement(By.id("react-burger-menu-btn"));
//        name
        WebElement addToCartButton = driver.findElement(By.name("add-to-cart-sauce-labs-onesie"));
//        classname
        WebElement CloseMenuButton = driver.findElement(By.className("bm-cross"));
//        tagname
        WebElement image = driver.findElement(By.tagName("img"));
//        linktext
        WebElement linkTolinkedin = driver.findElement(By.linkText("https://www.linkedin.com/company/sauce-labs"));
//        partiallinktext
        WebElement partiallinktextToTwitter = driver.findElement(By.partialLinkText("witter"));
//        xpath
//        Поиск по атрибуту, например By.xpath("//tag[@attribute='value']");
        WebElement xpathAttribute = driver.findElement(By.xpath("//div[@class='app_logo']"));
//        Поиск по тексту, например By.xpath("//tag[text()='text']");
        WebElement xpathText = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
//        Поиск по частичному совпадению атрибута, например By.xpath("//tag[contains(@attribute,'text')]");
        WebElement xpathPartialAttribute = driver.findElement(By.xpath("//img[contains(@alt,'Bolt')]"));
//        Поиск по частичному совпадению текста, например By.xpath("//tag[contains(text(),'text')]");
        WebElement xpathPartialText = driver.findElement(By.xpath("//div[contains(text(),'superhero')]"));
//        ancestor, например //*[text()='Enterprise Testing']//ancestor::div
        WebElement xpathAncestor = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']/ancestor::a"));
//        descendant
        WebElement xpathDescendant = driver.findElement(By.xpath("//div[@class='pricebar']/descendant::button[@class='btn btn_primary btn_small btn_inventory']"));
//        following
        WebElement xpathFollowing = driver.findElement(By.xpath("//div[@id='menu_button_container']/following::div[@class='app_logo']"));
//        parent
        WebElement xpathParent = driver.findElement(By.xpath("//div[@id='menu_button_container']/parent::*"));
//        preceding
        WebElement xpathPreceding = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']/preceding::a[@id='item_4_title_link']"));
//        поиск элемента с условием AND, например //input[@class='_2zrpKA _1dBPDZ' and @type='text']
        WebElement xpathAND = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory' and @id='add-to-cart-sauce-labs-onesie']"));
//        css
//                .class
        WebElement locatorClass = driver.findElement(By.cssSelector(".bm-burger-button"));
//                .class1.class2
        WebElement locatorClass = driver.findElement(By.cssSelector(".bm-burger-button"));
//                #id
//                tagname
//                tagname.class
//                [attribute=value]
//                [attribute~=value]
//                [attribute|=value]
//                [attribute^=value]
//                [attribute$=value]
//                [attribute*=value]
//                element:first-child
//                element:nth-child(0)




    }
}
