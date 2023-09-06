package Tests;

import PageObjects.LoginPage;
import PageObjects.MainPage;
import PageObjects.SearchPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class ShoppingCartTest extends BaseTest {
    LoginPage loginPage;
    MainPage mainPage;
    SearchPage searchPage;

    WebDriverWait wait;


    @FindBy(css = "[title = 'adauga in cos']")
    public WebElement addToCart;

    @FindBy(css = "[class = 'card-count']")
    public WebElement cardCount;
    @Test
    public void ShoppingCartTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.searchInputIsDisplayed());
        mainPage.searchFor("Tu esti muntele. Cum sa transformi autosabotarea in autocontrol");
        TimeUnit.SECONDS.sleep(1);
        Assert.assertTrue(mainPage.isResultDisplayed());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(10000)");


        Assert.assertTrue(this.addToCart.isDisplayed());
        this.addToCart.click();

        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("cart/products.jsp"));

        Assert.assertTrue(cardCount.getText().contains("1"));
    }


}