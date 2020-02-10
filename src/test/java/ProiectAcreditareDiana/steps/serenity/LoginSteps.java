package ProiectAcreditareDiana.steps.serenity;

import ProiectAcreditareDiana.pages.DashboeardTabPage;
import ProiectAcreditareDiana.pages.HomePage;
import ProiectAcreditareDiana.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.jruby.RubyBoolean;
import org.junit.Assert;

public class LoginSteps {

    private DashboeardTabPage dashboeardTabPage;
    private HomePage homePage;
    private LoginPage loginPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }

    @Step
    public void goToLogin(){

        homePage.clickLoginLink();
    }

    @Step
    public void enterCredentials(String email, String pass){

        loginPage.setEmailField(email);
        loginPage.setPasswordField(pass);
    }

    @Step
    public void clickLoginButton () {
        loginPage.clickLoginButton();
    }
    @Step
    public void checkValidLogin(String user){
       Assert.assertTrue(dashboeardTabPage.checkHelloText(user));
    }
}
