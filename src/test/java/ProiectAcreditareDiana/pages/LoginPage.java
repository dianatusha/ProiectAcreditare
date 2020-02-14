package ProiectAcreditareDiana.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=7")
public class LoginPage extends PageObject {

    @FindBy (id = "username")
    private WebElementFacade emailField;

    @FindBy (id = "password")
    private WebElementFacade passwordField;

    @FindBy (css = ".login button.woocommerce-Button")
    private WebElementFacade loginButton;

    @FindBy (css ="#post-7 li a")
    private WebElementFacade lostPass;

    @FindBy (css = ".login-woocommerce>.logout")
    private WebElementFacade logOutButton;

    public void setEmailField (String email) {
        typeInto(emailField, email);
    }
    public void setPasswordField (String password){
        typeInto(passwordField, password);
    }
    public void clickLoginButton (){
        clickOn(loginButton);
    }
    public boolean checkInvalidLogin(String text){
       return lostPass.containsOnlyText(text);
    }
    public void clickLogOutButton(){
        clickOn(logOutButton);
    }

}
