package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy (linkText = "Women")
    public WebElement womenMenuButton;

    @FindBy (xpath = "//ul[@id='homefeatured']//a[@title='Faded Short Sleeve T-shirts' and @class='product-name']")
    public WebElement fadedShortSleeveTShirtProductLink;

    public HomePage () {
        PageFactory.initElements(driver, this);
    }

    public WomenPage clickWomenMenuButton() {
        clickOnElement(womenMenuButton);

        return new WomenPage();
    }

    public FadedShortSleeveTShirtPage clickFadedShortSleeveTShirtProductLink() {
        clickOnElement(fadedShortSleeveTShirtProductLink);

        return new FadedShortSleeveTShirtPage();
    }


}
