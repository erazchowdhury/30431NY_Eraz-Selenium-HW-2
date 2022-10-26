package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends BasePage {

    @FindBy (xpath = "//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    public ShoppingCartPage() {

        PageFactory.initElements(driver, this);

    }

    public AuthenticationPage clickProceedToCheckoutButton() {

        clickOnElement(proceedToCheckoutButton);

        return new AuthenticationPage();

    }

}
