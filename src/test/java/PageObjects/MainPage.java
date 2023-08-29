package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    static WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "autoComplete")
    private WebElement searchInputElement;

    @FindBy(id = "autoCompleteButton")
    public WebElement searchButton;

    @FindBy(css = "[class = 'splide__arrow splide__arrow--next']")
    public  WebElement sliderButtonForward;

    @FindBy(css = "[class = 'splide__arrow splide__arrow--prev']")
    public  WebElement sliderButtonBack;

    @FindBy(css = "[class = 'd-none d-md-block lazy']")
    public  WebElement sliderImage1;
    @FindBy(css = "[class = 'd-none d-md-block lazy']")
    public  WebElement sliderImage2;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }



    public boolean searchInputIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf((WebElement) searchInputElement));
        return ((WebElement) searchInputElement).isDisplayed();
    }

    public void setCarouselButtonForward() {

        sliderButtonForward.click();
    }

    public void setCarouselButtonBack() {
        sliderButtonBack.click();

    }

    public boolean searchBook(){
        driver.findElement(By.id("autoComplete")).sendKeys("Tu esti muntele. Cum sa transformi autosabotarea in autocontrol");
        return true;
    }



}
