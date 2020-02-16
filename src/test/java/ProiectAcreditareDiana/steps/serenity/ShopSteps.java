package ProiectAcreditareDiana.steps.serenity;

import ProiectAcreditareDiana.pages.ProductPage;
import ProiectAcreditareDiana.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ShopSteps {

    private ShopPage shopPage;
    private ProductPage productPage;


    @Step
    public void goToShopPage(){
        shopPage.open();

    }
    @Step
    public void tapOnProduct34Image(){
        shopPage.clickProductImage();
    }

    @Step
    public void checkProductPage(String text){
        productPage.verifyDescriptionText(text);
    }
}
