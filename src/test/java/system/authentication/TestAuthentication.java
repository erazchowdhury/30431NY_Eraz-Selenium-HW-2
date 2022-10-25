package system.authentication;

import application.page_library.HomePage;
import application.page_library.WomenPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {

    @Test (groups = {"authentication", "smoke"})
    public void testNavigationToWomenPage() {
        HomePage homePage = new HomePage();

        WomenPage womenPage = homePage.clickWomenMenuButton();

        Assert.assertTrue(isElementVisible(womenPage.womenTitleBlock));

    }

}
