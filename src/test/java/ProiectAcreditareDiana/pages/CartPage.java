package ProiectAcreditareDiana.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=5")
public class CartPage extends PageObject {

    @FindBy(css = ".checkout-button.alt")
    private WebElementFacade proceedToChekoutButton;

    @FindBy(css = ".button.wc-backward")
    private WebElementFacade returnToShopButton;

    public void clickCheckoutButton(){
        clickOn(proceedToChekoutButton);
    }
    public void clickReturnToShopButton(){clickOn(returnToShopButton);}

}
