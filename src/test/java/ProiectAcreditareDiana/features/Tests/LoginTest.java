package ProiectAcreditareDiana.features.Tests;


import ProiectAcreditareDiana.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void validLoginTest(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLogin();
        loginSteps.enterCredentials("diana_tusha@yahoo.com","DianaTusa12");
        loginSteps.clickLoginButton();
        loginSteps.checkValidLogin("diana_tusha");

    }

    @Test
    public void invalidLoginTest() {
        loginSteps.navigateToHomepage();
        loginSteps.goToLogin();
        loginSteps.enterCredentials("diana_tusha@yahoo.com", "Diana");
        loginSteps.clickLoginButton();
        loginSteps.checkInvalidLogin("Lost your password?");

    }

    @Test
    public void logOutTest(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLogin();
        loginSteps.enterCredentials("diana_tusha@yahoo.com", "DianaTusa12");
        loginSteps.clickLoginButton();
        loginSteps.clickLogOutButoon();
        loginSteps.checkLogOut("Hello world!");

    }

}
