package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankWirePage extends BasePage {

    @FindBy (xpath = "//p[@id='cart_navigation']//button[@type='submit']")
    public WebElement confirmOrderButton;

    public BankWirePage() {

        PageFactory.initElements(driver, this);

    }

    public OrderConfirmationPage clickConfirmOrderButton() {

        clickOnElement(confirmOrderButton);

        return new OrderConfirmationPage();

    }

}
