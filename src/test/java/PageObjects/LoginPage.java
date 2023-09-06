package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    @FindBy(css = "[class = 'header-menu-icon-desk']")
    public WebElement headerAccountIcon;

    @FindBy(id = "date-inregistrare-user")
    public WebElement userInput;
    @FindBy(id = "parola")
    public WebElement passwordInput;

    @FindBy(css = "[class = 'g-recaptcha log-in-cont-inregistrare-btn']")
    public WebElement logInButton;

    WebDriver driver;
    WebDriverWait wait;

    public void goToLoginPage() {
        driver.get("https://www.libris.ro/auth/login.jsp");
        wait.until(ExpectedConditions.elementToBeClickable(userInput));
    }
}

