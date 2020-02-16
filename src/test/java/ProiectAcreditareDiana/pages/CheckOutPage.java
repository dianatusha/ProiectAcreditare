package ProiectAcreditareDiana.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=5")
public class CheckOutPage extends PageObject {

    @FindBy(css = "header .entry-title")
    private WebElementFacade cartText;

    @FindBy(css = ".product-name [href*='=album']")
    private WebElementFacade product34Name;

    @FindBy(css=".showlogin")
    private WebElementFacade clickHereToLogin;

    @FindBy(css=".input-text#username")
    private WebElementFacade emailField;

    @FindBy(css=".input-text#password")
    private WebElementFacade passwordField;

    @FindBy(css="[value='Login']")
    private WebElementFacade loginButton;

    @FindBy(css = ".woocommerce-notice--success")
    private WebElementFacade successfulOrderMessage;

    public boolean checkLandingOnCartPage(String text){
        return cartText.containsOnlyText(text);
    }
    public boolean checkProductName(String text){return product34Name.containsOnlyText(text);}
    public void clickHereToLogin (){clickOn(clickHereToLogin);}
    public void insertEmailAdress(String email){typeInto(emailField, email);}
    public void insertPassword(String pass){typeInto(passwordField, pass);}
    public void clickLoginButton(){clickOn(loginButton);}
    public boolean checkSuccessfullCheckout(String text){
        waitABit(3500);
        return successfulOrderMessage.containsOnlyText(text);
    }

}
