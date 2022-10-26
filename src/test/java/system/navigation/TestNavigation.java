package system.navigation;

import application.page_library.HomePage;
import application.page_library.WomenPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNavigation extends BasePage{

    @Test (groups = {"navigation", "smoke"})
    public void testNavigationToWomenPage() {
        HomePage homePage = new HomePage();

        WomenPage womenPage = homePage.clickWomenMenuButton();

        Assert.assertTrue(isElementVisible(womenPage.womenTitleBlock));

    }

}
