package ProiectAcreditareDiana.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.yecht.Data;

public class CheckoutFormPage extends PageObject {







    @FindBy(id = "billing_first_name")
    private WebElementFacade firstNameField;

    @FindBy(id = "billing_last_name")
    private WebElementFacade lastNameField;

    @FindBy(id = "select2-billing_country-container")
    private WebElementFacade countrySelector;

    @FindBy(css = ".select2-search__field")
    private WebElementFacade countryField;

    @FindBy(css = ".input-text#billing_address_1")
    private WebElementFacade billingAddressField;

    @FindBy(css = ".input-text#billing_city")
    private WebElementFacade billingCityField;

    @FindBy(css = ".input-text#billing_postcode")
    private WebElementFacade postalCodeField;

    @FindBy(css = ".input-text#billing_phone")
    private WebElementFacade phoneField;

    @FindBy(id = "place_order")
    private WebElementFacade placeOrderButton;



    public void insertFirstName(String firstName){typeInto(firstNameField, firstName);}
    public void insertLastName(String lastName){typeInto(lastNameField,lastName);}
    public void selectCountry(){clickOn(countrySelector);}
    public void typeTheCountry(String country){typeInto(countryField,country);}
    public void clickBillingAddressField(){clickOn(billingAddressField);}
    public void insertBillingAddress(String billingAddress){typeInto(billingAddressField,billingAddress);}
    public void insertBillingCity(String billingCity){typeInto(billingCityField,billingCity);}
    public void insertPostalCode(String postalCode){typeInto(postalCodeField,postalCode);}
    public void insertPhone(String phoneNumber){typeInto(phoneField,phoneNumber);}
    public void clickPlaceOrder(){clickOn(placeOrderButton);}







}
