package Tests;

import PageObjects.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBarTest extends BaseTest {
    MainPage mainPage;

    @Test
    public void SearchFunctionalityTest () {
        System.out.println("baseUrl " + baseUrl);
        setUpDriver("");
        driver.get(baseUrl);
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.searchInputIsDisplayed());

    }


    }
