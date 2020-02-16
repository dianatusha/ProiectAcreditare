package ProiectAcreditareDiana.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.FindBy;

import java.nio.charset.Charset;
import java.util.Random;


public class PostPage extends PageObject {

    @FindBy(css = ".comment-form-comment #comment")
    private WebElementFacade commentField;

    @FindBy(id = "author")
    private WebElementFacade nameField;

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "submit")
    private WebElementFacade postCommentButton;

    @FindBy(css = ".comments-area")
    private WebElementFacade comments;

    public void insertCommentText(String text){typeInto(commentField,text);}
    public void insertName(String text){typeInto(nameField,text);}
    public void insertEmail(String text){typeInto(emailField, text);}
    public void clickPostCommentButton(){clickOn(postCommentButton);}
    public boolean checkPostedComment(String text){return comments.containsOnlyText(text);
    }

    public String generateRandomString() {
        byte[] myArray = new byte[25];
        new Random().nextBytes(myArray);

        String generatedString = new String(myArray, Charset.defaultCharset());
        return generatedString;
    }




}
