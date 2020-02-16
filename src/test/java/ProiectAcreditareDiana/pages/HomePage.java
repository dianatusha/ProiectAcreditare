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

    @FindBy(css = ".entry-title a")
    private WebElementFacade helloText;

    @FindBy(css = ".top-header input.search-field")
    private WebElementFacade searchField;

    @FindBy (css = "#mastheads button.searchsubmit")
    private WebElementFacade searchButton;

    @FindBy(css = "#menu-item-73")
    private WebElementFacade shopHeaderButton;

    @FindBy(css = ".bttn.read-more")
    private WebElementFacade readMoreButton;

    public void clickLoginLink() {
        clickOn(loginLink);
    }

    public boolean checkLogOut(String text){
        return helloText.containsOnlyText(text);
    }

    public void insertSearchText(String text){ typeInto(searchField, text);
    }
    public void clickSearchButton(){
        clickOn(searchButton);
    }
    public void clickShopHeaderButton(){
        clickOn(shopHeaderButton);
    }
    public void clickOnReadMoreButton(){clickOn(readMoreButton);}






}
