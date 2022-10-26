package application.page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends BasePage {

    @FindBy (xpath = "//p[@class='cheque-indent']")
    public WebElement completeOrderText;

    public OrderConfirmationPage() {

        PageFactory.initElements(driver, this);

    }



}
