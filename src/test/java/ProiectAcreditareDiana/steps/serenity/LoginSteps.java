package ProiectAcreditareDiana.steps.serenity;

import ProiectAcreditareDiana.pages.MyAccountPage;
import ProiectAcreditareDiana.pages.HomePage;
import ProiectAcreditareDiana.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginSteps {

    private MyAccountPage myAccountPage;
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
       Assert.assertTrue(myAccountPage.checkHelloText(user));
    }
    @Step
    public void checkInvalidLogin(String text){
        Assert.assertTrue(loginPage.checkInvalidLogin(text));
    }

    @Step
    public void clickLogOutButoon(){
        loginPage.clickLogOutButton();
    }

    @Step
    public void checkLogOut(String text){
        Assert.assertTrue(homePage.checkLogOut(text));
    }


}
