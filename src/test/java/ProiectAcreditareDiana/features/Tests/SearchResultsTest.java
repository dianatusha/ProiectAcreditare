package ProiectAcreditareDiana.features.Tests;


import ProiectAcreditareDiana.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchResultsTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private SearchSteps searchSteps;

    @Test
    public void validSearchResultTest(){
        searchSteps.navigateToHomepage();
        searchSteps.insertTextInSearchField("beanie");
        searchSteps.clickSearchButton();
        searchSteps.checkValidSearchResults("SEARCH RESULTS: “BEANIE”");
    }

    @Test
    public void invalidSearchResultTest(){
        searchSteps.navigateToHomepage();
        searchSteps.insertTextInSearchField("alabalaportocala");
        searchSteps.clickSearchButton();
        searchSteps.checkInvalidSearchResult("No products were found matching your selection.");
    }

}
