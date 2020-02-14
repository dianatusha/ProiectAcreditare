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
    public void searchResultsTest(){
        searchSteps.navigateToHomepage();
        searchSteps.insertTextInSearchField("beanie");
        searchSteps.clickSearchButton();
        searchSteps.checkSearchResults("SEARCH RESULTS: “BEANIE”");
    }


}
