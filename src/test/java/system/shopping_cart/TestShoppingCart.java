package system.shopping_cart;

import application.page_library.FadedShortSleeveTShirtPage;
import application.page_library.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestShoppingCart extends BasePage {

    @Test (groups = {"shopping_cart", "smoke"})
    public void testAddingItemToCart() {
        HomePage homePage = new HomePage();

        FadedShortSleeveTShirtPage fadedShortSleeveTShirtPage = homePage.clickFadedShortSleeveTShirtProductLink();

        fadedShortSleeveTShirtPage.clickAddToCartButton();

        Assert.assertTrue(isElementVisible(fadedShortSleeveTShirtPage.layerCart));
    }


}
