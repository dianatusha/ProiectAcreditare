package ProiectAcreditareDiana.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {

    @FindBy(css = ".checkout-button.alt")
    private WebElementFacade proceedToChekoutButton;

    public void clickCheckoutButton(){
        clickOn(proceedToChekoutButton);
    }
}
