package ProiectAcreditareDiana.features.Tests;

import ProiectAcreditareDiana.steps.serenity.CheckoutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckOutTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void successfulCheckoutTestWithLogin(){
        checkoutSteps.navigateToHomepage();
        checkoutSteps.clickOnShopHeaderButton();
        checkoutSteps.clickOnAddToCartButton();
        checkoutSteps.clickOnViewCartButton();
        checkoutSteps.clickProceedToCheckoutButton();
        checkoutSteps.clickHereToLogin();
        checkoutSteps.insertCredentials("diana_tusha@yahoo.com","DianaTusa12");
        checkoutSteps.clickLoginButton();
        checkoutSteps.insertFirstName("Tusa");
        checkoutSteps.insertLastName("Diana");
        checkoutSteps.clickCountrySelector();
        checkoutSteps.typeTheCountry("ROMANIA");
        checkoutSteps.clickBillingAdressField();
        checkoutSteps.insertAddress("Plopilor");
        checkoutSteps.insertCity("Cluj");
        checkoutSteps.insertPostalCode("400000");
        checkoutSteps.phoneNumber("0744444444");
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkSuccessfulOrder("Thank you. Your order has been received.");
    }



}
