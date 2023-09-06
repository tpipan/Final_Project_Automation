package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "[class = 'pr-title-categ-pg']")
    public WebElement bookTitle;
    @FindBy(css = "[class = 'alert text-center cookiealert show']")
    public WebElement cookieAlertButton;

}







