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

    public FadedShortSleeveTShirtPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCartButton() {
        clickOnElement(addToCartButton);
    }

}
