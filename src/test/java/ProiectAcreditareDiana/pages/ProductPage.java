package ProiectAcreditareDiana.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject {
    @FindBy(css = ".woocommerce-Tabs-panel#tab-description")
    private WebElementFacade descriptionProductTitle;

    public boolean verifyDescriptionText(String text){return descriptionProductTitle.containsOnlyText(text);}



}
