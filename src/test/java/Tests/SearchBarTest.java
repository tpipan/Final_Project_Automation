package Tests;

import PageObjects.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBarTest extends BaseTest {


    @Test
    public void SearchFunctionalityTest() {
        setUpDriver("");
        driver.get(baseUrl);
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.searchInputIsDisplayed());
        mainPage.searchBook();
        mainPage.searchButton.click();
        Assert.assertTrue(mainPage.searchBook());

    }


}