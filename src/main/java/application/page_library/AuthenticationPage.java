package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage {

    @FindBy (xpath = "//a[@title='Recover your forgotten password']")
    public WebElement forgotPasswordLink;

    public AuthenticationPage() {

        PageFactory.initElements(driver, this);

    }

    public ForgotYourPasswordPage clickForgotPasswordLink() {

        clickOnElement(forgotPasswordLink);

        return new ForgotYourPasswordPage();

    }

}
