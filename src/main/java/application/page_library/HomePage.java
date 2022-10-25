package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy (linkText = "Women")
    public WebElement womenMenuButton;

    public HomePage () {
        PageFactory.initElements(driver, this);
    }

    public WomenPage clickWomenMenuButton() {
        clickOnElement(womenMenuButton);

        return new WomenPage();
    }


}
