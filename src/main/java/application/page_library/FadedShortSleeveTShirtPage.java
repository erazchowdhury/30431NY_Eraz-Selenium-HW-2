package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FadedShortSleeveTShirtPage extends BasePage {

    @FindBy (xpath = "//form[@id='buy_block']//button[@type='submit']")
    public WebElement addToCartButton;

    @FindBy (xpath = "//div[@id='layer_cart']")
    public WebElement layerCart;

    @FindBy (xpath = "//a[@title='Proceed to checkout']")
    public WebElement proceedToCheckoutButton;

    public FadedShortSleeveTShirtPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public void clickProceedToCheckoutButton() {
        clickOnElement(proceedToCheckoutButton);
    }

    public ShoppingCartPage addItemToCartAndProceedToCheckout() {

        clickAddToCartButton();
        clickProceedToCheckoutButton();

        return new ShoppingCartPage();

    }



}
