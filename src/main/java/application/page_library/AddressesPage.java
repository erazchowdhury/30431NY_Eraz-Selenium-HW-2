package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage extends BasePage {

    @FindBy (xpath = "//button[@name='processAddress']")
    public WebElement proceedToCheckOutButton;

    public AddressesPage() {

        PageFactory.initElements(driver, this);

    }

    public ShippingPage clickProceedToCheckOutButton() {

        clickOnElement(proceedToCheckOutButton);

        return new ShippingPage();

    }

}
