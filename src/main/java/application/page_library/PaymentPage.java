package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BasePage {

    @FindBy (xpath = "//a[@title='Pay by bank wire']")
    public WebElement payByBankWireButton;

    public PaymentPage() {

        PageFactory.initElements(driver, this);

    }

    public BankWirePage clickPayByBankWireButton() {

        clickOnElement(payByBankWireButton);

        return new BankWirePage();

    }

}
