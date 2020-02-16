package ProiectAcreditareDiana.steps.serenity;

import ProiectAcreditareDiana.pages.CartPage;
import ProiectAcreditareDiana.pages.CheckOutPage;
import ProiectAcreditareDiana.pages.HomePage;
import ProiectAcreditareDiana.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps {
    private HomePage homePage;
    private ShopPage shopPage;
    private CheckOutPage checkOutPage;
    private CartPage cartPage;

@Step
public void navigateToHomepage(){
    homePage.open();}

    @Step
    public void navigateToCartPage(){
    cartPage.open();
    }

    @Step
    public void clickOnShopHeaderButton()
    {homePage.clickShopHeaderButton();
    }

    @Step
    public void clickOnAddToCartButton()
    {shopPage.product34AddToCart();}

    @Step
    public void clickOnViewCartButton()
    {shopPage.product34ViewCart();}

    @Step
    public void checkProductInCart(String text){
        Assert.assertTrue(checkOutPage.checkProductName(text));
    }

    @Step
    public void clickReturnToShopButton(){cartPage.clickReturnToShopButton();}

    @Step
        public void checkShopTitleText(String text) {Assert.assertTrue(shopPage.checkShopTitleText(text));
    }






}