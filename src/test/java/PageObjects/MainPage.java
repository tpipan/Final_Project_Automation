package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    static WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "autoComplete")
    private WebElement searchInputElement;

    @FindBy(id = "autoCompleteButton")
    public WebDriver searchButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }



    public boolean searchInputIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf((WebElement) searchInputElement));
        return ((WebElement) searchInputElement).isDisplayed();
    }

}
