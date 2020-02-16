package ProiectAcreditareDiana.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?post_type=product")
public class ShopPage extends PageObject {

    @FindBy(css = ".post-34 .add_to_cart_button" )
    private WebElementFacade product34AddToCartButton;

    @FindBy(css = ".post-34 .added_to_cart")
    private WebElementFacade product34ViewCartButton;

    @FindBy(css = ".entry-title")
    private WebElementFacade shopTitleText;

    @FindBy(css = ".post-34 .attachment-shop_catalog.wp-post-image")
    private WebElementFacade product34Image;


    public void product34AddToCart (){
        clickOn(product34AddToCartButton);}

        public void product34ViewCart(){
        clickOn(product34ViewCartButton);
        }

        public void clickProductImage(){clickOn(product34Image);}
    public boolean checkShopTitleText(String text){return shopTitleText.containsOnlyText(text);

}
    }

