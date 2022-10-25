package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy (xpath = "//ul[@id='homefeatured']//img[@alt='Faded Short Sleeve T-shirts']")
    public WebElement fadedShortSleeveTShirtsImage;

    public HomePage () {
        PageFactory.initElements(driver, this);
    }

}
