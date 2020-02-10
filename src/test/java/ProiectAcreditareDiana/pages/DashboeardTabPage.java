package ProiectAcreditareDiana.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=7")
public class DashboeardTabPage extends PageObject {

    @FindBy(css = ".woocommerce-MyAccount-content strong")
    private WebElementFacade helloTextParagraph;

    public boolean checkHelloText(String text){
    return helloTextParagraph.containsOnlyText(text);


    }



}
