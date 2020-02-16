package ProiectAcreditareDiana.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?post_type=product")
public class ShopPage extends PageObject {

    @FindBy(css = ".post-34 .add_to_cart_button" )
    private WebElement product34AddToCartButton;

    @FindBy(css = ".post-34 .added_to_cart")
    private WebElement product34ViewCartButton;

    public void product34AddToCart (){
        clickOn(product34AddToCartButton);}

        public void product34ViewCart(){
        clickOn(product34ViewCartButton);
        }


    }

