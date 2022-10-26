package system.authentication;

import application.page_library.*;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {

    @Test (groups = {"authentication", "smoke"})
    public void testResetPassword() {

        HomePage homePage= new HomePage();

        AuthenticationPage authenticationPage = homePage.clickSignInButton();

        ForgotYourPasswordPage forgotYourPasswordPage = authenticationPage.clickForgotPasswordLink();

        String emailAddress = config.appUser;
        forgotYourPasswordPage.sendForgotPasswordEmail(emailAddress);

        Assert.assertTrue(isElementVisible(forgotYourPasswordPage.emailSentConfirmation));

    }

}
