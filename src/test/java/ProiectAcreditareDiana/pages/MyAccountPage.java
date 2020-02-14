package ProiectAcreditareDiana.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://qa5.fasttrackit.org:8008/?page_id=7")
public class MyAccountPage extends PageObject {

    @FindBy(css = ".woocommerce-MyAccount-content strong")
    private WebElementFacade helloTextParagraph;

    @FindBy(css = ".u-column1 h2")
    private WebElementFacade loginText;


    public boolean checkHelloText(String text){
    return helloTextParagraph.containsOnlyText(text);
    }

    public boolean checkLogOutText(String text){
        return loginText.containsOnlyText(text);
}


}
