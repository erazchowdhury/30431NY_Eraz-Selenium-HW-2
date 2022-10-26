package system.checkout;

import application.page_library.*;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckout extends BasePage {

    @Test (groups = {"checkout", "smoke"})
    public void testPurchasingAnItem() {

        HomePage homePage = new HomePage();

        FadedShortSleeveTShirtPage fadedShortSleeveTShirtPage = homePage.clickFadedShortSleeveTShirtProductLink();

        ShoppingCartPage shoppingCartPage = fadedShortSleeveTShirtPage.addItemToCartAndProceedToCheckout();

        AuthenticationPage authenticationPage = shoppingCartPage.clickProceedToCheckoutButton();

        String emailAddress = config.appUser;
        String password = config.appPassword;
        AddressesPage addressesPage = authenticationPage.signInAndProceed(emailAddress, password);

        ShippingPage shippingPage = addressesPage.clickProceedToCheckOutButton();

        PaymentPage paymentPage = shippingPage.agreeToTermsAndProceedToPayment();

        BankWirePage bankWirePage = paymentPage.clickPayByBankWireButton();

        OrderConfirmationPage orderConfirmationPage = bankWirePage.clickConfirmOrderButton();

        Assert.assertTrue(isElementVisible(orderConfirmationPage.completeOrderText));

    }

}
