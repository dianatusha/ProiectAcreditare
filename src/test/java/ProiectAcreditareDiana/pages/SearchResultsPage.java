package ProiectAcreditareDiana.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends PageObject {


    @FindBy(css = ".entry-title")
    private WebElementFacade searchResultsText;

    public boolean checkSearchResults(String text){
        return searchResultsText.containsOnlyText(text);
    }



}
