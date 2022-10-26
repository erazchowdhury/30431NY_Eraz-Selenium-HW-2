package system.contact;

import application.page_library.ContactPage;
import application.page_library.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContact extends BasePage{

    @Test (groups = {"contact", "smoke"})
    public void testSendingMessageOnContactPage() {
        HomePage homePage = new HomePage();

        ContactPage contactPage = homePage.clickContactUsButton();

        String heading = "Customer service";
        String emailAddress = config.appUser;
        String message = "Where's my diet soda?";

        contactPage.sendMessageOnContactPage(heading, emailAddress, message);

        Assert.assertTrue(isElementVisible(contactPage.successParagraph));
    }

}
