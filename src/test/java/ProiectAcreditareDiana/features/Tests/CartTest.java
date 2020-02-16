package ProiectAcreditareDiana.features.Tests;

import ProiectAcreditareDiana.steps.serenity.CartSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void addProductToCartTest(){
        cartSteps.navigateToHomepage();
        cartSteps.clickOnShopHeaderButton();
        cartSteps.clickOnAddToCartButton();
        cartSteps.clickOnViewCartButton();
        cartSteps.checkProductInCart("Album");
    }

    @Test
    public void returnToShopRedirection(){
        cartSteps.navigateToCartPage();
        cartSteps.clickReturnToShopButton();
        cartSteps.checkShopTitleText("SHOP");

    }
}
