package ProiectAcreditareDiana.steps.serenity;

import ProiectAcreditareDiana.pages.HomePage;
import ProiectAcreditareDiana.pages.PostPage;
import net.thucydides.core.annotations.Step;
import org.junit.experimental.theories.suppliers.TestedOn;

public class PostCommentSteps {

    private HomePage homePage;
    private PostPage postPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }

    @Step
    public void clickOnReadMoreButton(){
        homePage.clickOnReadMoreButton();
    }
    @Step
    public void insertCommentText(String text){
        postPage.insertCommentText(text);
    }

    @Step
    public void insertName(String text){
        postPage.insertName(text);
    }

    @Step
    public void insertEmail(String text){
        postPage.insertEmail(text);
    }

    @Step
    public void clickOnPostCommentButton(){
        postPage.clickPostCommentButton();
    }

    @Step
    public void checkPostedComment(String text){
        postPage.checkPostedComment(text);
    }

    @Step
    public String randomStringGenerator(){
       return postPage.generateRandomString();
    }

}
