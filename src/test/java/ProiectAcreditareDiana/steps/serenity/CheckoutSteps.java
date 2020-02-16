package ProiectAcreditareDiana.steps.serenity;

import ProiectAcreditareDiana.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;


public class CheckoutSteps  {

    private HomePage homePage;
    private ShopPage shopPage;
    private CartPage cartPage;
    private CheckOutPage checkOutPage;
    private CheckoutFormPage checkoutFormPage;

    @Step
    public void navigateToHomepage(){
        homePage.open();}

    @Step
    public void clickOnShopHeaderButton()
    {homePage.clickShopHeaderButton();
    }

    @Step
    public void clickOnAddToCartButton()
    {shopPage.product34AddToCart();}

    @Step
    public void clickOnViewCartButton()
    {shopPage.product34ViewCart();}

   @Step
    public void clickProceedToCheckoutButton(){
        cartPage.clickCheckoutButton(); }

   @Step
    public void clickHereToLogin(){
        checkOutPage.clickHereToLogin();}


   @Step
   public void insertCredentials(String email,String pass){
        checkOutPage.insertEmailAdress(email);
        checkOutPage.insertPassword(pass);
   }

   @Step
    public void clickLoginButton(){checkOutPage.clickLoginButton();}

    @Step
    public void insertFirstName(String firstName){
        checkoutFormPage.insertFirstName(firstName); }

        @Step
    public void insertLastName(String lastName){
        checkoutFormPage.insertLastName(lastName);
        }

        @Step
    public void clickCountrySelector(){
        checkoutFormPage.selectCountry();
        }


        @Step
    public void typeTheCountry(String country){checkoutFormPage.typeTheCountry(country);}

    @Step
    public void clickBillingAdressField(){checkoutFormPage.clickBillingAddressField();}

        @Step
    public void insertAddress(String address){
        checkoutFormPage.insertBillingAddress(address);
        }

        @Step
    public void insertCity(String city){
        checkoutFormPage.insertBillingCity(city);
        }

        @Step
    public void insertPostalCode(String postalCode){
        checkoutFormPage.insertPostalCode(postalCode);
        }

        @Step
    public void phoneNumber(String phoneNumber){
        checkoutFormPage.insertPhone(phoneNumber);
        }

        @Step
    public void clickPlaceOrderButton(){
        checkoutFormPage.clickPlaceOrder();
        }

        @Step
    public void checkSuccessfulOrder(String success){
        checkOutPage.checkSuccessfullCheckout(success);
        }


}
