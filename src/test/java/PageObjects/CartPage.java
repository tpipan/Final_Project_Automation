package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

    @FindBy(css = "[class = 'slider-btn-add-cart-icon adauga-in-cos-roz-AB-icon']")
    public WebElement addToCart;

    @FindBy(css = "[class = 'card-count']")
    public WebElement cardCount;

    @FindBy(css = "[class = 'header-menu-icon-desk']")
    public WebElement headerCartIcon;

}
