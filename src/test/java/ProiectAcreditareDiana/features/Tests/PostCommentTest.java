package ProiectAcreditareDiana.features.Tests;


import ProiectAcreditareDiana.steps.serenity.PostCommentSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class PostCommentTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private PostCommentSteps postCommentSteps;

    @Test
    public void postCommentTest(){
        postCommentSteps.navigateToHomepage();
        postCommentSteps.clickOnReadMoreButton();
        String randomlyGeneratedComment = postCommentSteps.randomStringGenerator();
        postCommentSteps.insertCommentText(randomlyGeneratedComment);
        postCommentSteps.insertName("Diana");
        postCommentSteps.insertEmail("diana_tusha@yahoo.com");
        postCommentSteps.clickOnPostCommentButton();
        postCommentSteps.checkPostedComment(randomlyGeneratedComment);
    }


}
