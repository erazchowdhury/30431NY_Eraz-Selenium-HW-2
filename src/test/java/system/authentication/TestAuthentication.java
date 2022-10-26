package system.authentication;

import application.page_library.ContactPage;
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

    @Test (groups = {"authentication", "smoke"})
    public void testSendingMessageOnContactPage() {
        HomePage homePage = new HomePage();

        ContactPage contactPage = homePage.clickContactUsLink();

        String heading = "Customer service";
        String emailAddress = config.appUser;
        String message = "Where's my diet soda?";

        ContactPage secondContactPage = contactPage.sendMessageOnContactPage(heading, emailAddress, message);

        Assert.assertTrue(isElementVisible(secondContactPage.successParagraph));
    }

}
