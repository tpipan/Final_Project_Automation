package Tests;

import PageObjects.MainPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CarouselTest extends BaseTest {

    @Test
    public void carouselTest() throws InterruptedException {
        setUpDriver("");
        driver.get(baseUrl);
        MainPage mainPage = new MainPage(driver);

        List<WebElement> carouselSlides = driver.findElements(By.className("d-none d-md-block lazy"));
        TimeUnit.SECONDS.sleep(1);
        mainPage.setCarouselButtonForward();
        Assert.assertEquals(4, carouselSlides.size());
//        Assert.assertEquals(mainPage.sliderImage1, mainPage.sliderImage1);
//        MainPage mainPageSlider = new MainPage(driver);
//
//        mainPageSlider.setCarouselButtonBack();
//        Assert.assertEquals(mainPage.sliderImage2, mainPage.sliderImage2);

    }
}
