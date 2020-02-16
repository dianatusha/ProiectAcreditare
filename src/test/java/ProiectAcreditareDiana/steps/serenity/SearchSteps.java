package ProiectAcreditareDiana.steps.serenity;

import ProiectAcreditareDiana.pages.HomePage;
import ProiectAcreditareDiana.pages.SearchResultsPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps {

    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }

    @Step
    public void insertTextInSearchField(String search){
        homePage.insertSearchText(search);
    }

    @Step
    public void clickSearchButton(){homePage.clickSearchButton();
    }

    @Step
    public void checkValidSearchResults(String searchResult){
        Assert.assertTrue(searchResultsPage.checkSearchResults(searchResult));
    }

    @Step
    public void checkInvalidSearchResult(String invalidSearchResult){
        Assert.assertTrue(searchResultsPage.checkInvalidSearchResult(invalidSearchResult));
    }
}
