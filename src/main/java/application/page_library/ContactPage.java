package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BasePage {

    @FindBy (id = "id_contact")
    public WebElement subjectHeadingComboBox;

    @FindBy (id = "email")
    public WebElement emailAddressField;

    @FindBy (id = "message")
    public WebElement messageField;

    @FindBy (id = "submitMessage")
    public WebElement sendButton;

    @FindBy (xpath = "//p[@class='alert alert-success']")
    public WebElement successParagraph;

    public ContactPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectSubjectHeading (String heading) {

        selectFromDropdownByVisibleText(subjectHeadingComboBox, heading);

    }

    public void inputEmailAddress (String emailAddress) {

        sendKeysToElement(emailAddressField,emailAddress);

    }

    public void inputMessage (String message) {

        sendKeysToElement(messageField, message);

    }

    public void clickSendButton() {

        clickOnElement(sendButton);

    }

    public void sendMessageOnContactPage(String heading, String emailAddress, String message) {

        selectSubjectHeading(heading);
        inputEmailAddress(emailAddress);
        inputMessage(message);
        clickSendButton();

    }

}
