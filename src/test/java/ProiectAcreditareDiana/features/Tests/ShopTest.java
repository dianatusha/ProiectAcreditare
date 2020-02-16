package ProiectAcreditareDiana.features.Tests;


import ProiectAcreditareDiana.steps.serenity.ShopSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ShopTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private ShopSteps shopSteps;

    @Test
    public void productPageLanding(){
        shopSteps.goToShopPage();
        shopSteps.tapOnProduct34Image();
        shopSteps.checkProductPage("Description");
    }

}
