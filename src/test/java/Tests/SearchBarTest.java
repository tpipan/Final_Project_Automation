package Tests;

import PageObjects.MainPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchBarTest extends BaseTest {
    MainPage mainPage;


    @Test
    public void searchFunctionalityTest() {
        MainPage mainPage = new MainPage(driver);

        Assert.assertTrue(mainPage.searchInputIsDisplayed());
        mainPage.searchFor("Tu esti muntele. Cum sa transformi autosabotarea in autocontrol");
        Assert.assertTrue(mainPage.isResultDisplayed());

    }

    @Test
    public void invalidSearchFunctionalityTest() {
        MainPage mainPage = new MainPage(driver);
        Assert.assertTrue(mainPage.searchInputIsDisplayed());
        mainPage.searchFor(RandomStringUtils.random(5));
        Assert.assertFalse(mainPage.isResultDisplayed());
        Assert.assertTrue(driver.getPageSource().contains("Produsul căutat de tine nu se regăsește printre rafturile noastre? Completează datele de mai jos, iar noi te vom ajuta!"));
    }

}