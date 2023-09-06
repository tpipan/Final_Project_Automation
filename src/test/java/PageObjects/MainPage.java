package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class MainPage {

    WebDriver driver;
    WebDriverWait wait;

//    @FindBy(id = "autoComplete")
    @FindBy(xpath = "//*[@id='autoComplete']")
    public WebElement searchInputField;

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
    @FindBy(css = "[alt = 'Poza produsului Tu esti muntele. Cum sa transformi autosabotarea in autocontrol - Brianna Wiest]")
    public WebElement tuEstiMunteleResult;




    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.of(15, ChronoUnit.SECONDS));
        PageFactory.initElements(driver, this);
    }

    public void goToMainPage(WebDriver driver) {
        driver.get("https://www.libris.ro/auth/login.jsp");
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
    }



    public boolean searchInputIsDisplayed() {
        this.driver = driver;
        wait.until(ExpectedConditions.visibilityOf(searchInputField));
        return searchButton.isDisplayed();
    }

    public void setCarouselButtonForward() {
        wait.until(ExpectedConditions.visibilityOf(sliderButtonForward));
        sliderButtonForward.click();
    }

    public void setCarouselButtonBack() {
        wait.until(ExpectedConditions.visibilityOf(sliderButtonBack));
        sliderButtonBack.click();
    }

    public void searchFor(String input) {
        wait.until(ExpectedConditions.visibilityOf(searchInputField));
        searchInputField.sendKeys(input);
        searchButton.click();
    }


    public boolean isResultDisplayed() {
        WebElement until = wait.until(ExpectedConditions.visibilityOf(tuEstiMunteleResult));
        return tuEstiMunteleResult.isDisplayed();
    }

}



//    public boolean isSearchBookOpen(){
//        driver.findElement(By.id("autoComplete")).sendKeys("Tu esti muntele. Cum sa transformi autosabotarea in autocontrol");
//        return true;
//    }




