package ProiectAcreditareDiana.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/")
public class HomePage extends PageObject {



    @FindBy(css = "a.account")
    private WebElementFacade loginLink;

    public void clickLoginLink() {
        clickOn(loginLink);
    }









}
