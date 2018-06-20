package stepDefination;

import PageClass.AddtoCart;
import PageClass.ComputerParts;
import PageClass.HomeBase;
import PageClass.SelectComputer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CompPurchase {
    HomeBase homebase=new HomeBase();
    ComputerParts computerparts=new ComputerParts();
    SelectComputer selectcomp=new SelectComputer();
    AddtoCart addcart=new AddtoCart();
    @Given("^As i am on HomePage$")
    public void as_i_am_on_HomePage()
    {
        String actual="http://demo.nopcommerce.com/";
        String expected=homebase.isHomePage();
        Assert.assertEquals(expected,actual);
    }

    @When("^i select Computer$")
    public void i_select_Computer() {
        homebase.clickComputer();
    }

    @When("^i should navigate to different category of computer$")
    public void i_should_navigate_to_different_category_of_computer(){
        String expected="http://demo.nopcommerce.com/computers";
        String actaul =computerparts.isCopmuterparts();
      Assert.assertEquals(expected,actaul);
    }

    @When("^i click on Desktop$")
    public void i_click_on_Desktop() {
        computerparts.selectDesktop();
    }

    @When("^i should navigate to different kinds of computer$")
    public void i_should_navigate_to_different_kinds_of_computer(){
        String actual=selectcomp.isOnDesktop();
        String expected="http://demo.nopcommerce.com/desktops";
       // Assert.assertEquals(actual,expected);
    }

    @When("^i choose digital storm and click add to cart$")
    public void i_choose_digital_storm_and_click_add_to_cart(){
        selectcomp.selectDigitalComp();
    }

    @When("^i click on shopping cart$")
    public void i_click_on_shopping_cart(){

        addcart.isOnAddPage();
        addcart.addItem();

    }

    @When("^i click to accept terms-condition and click checkout$")
    public void i_click_to_accept_terms_condition_and_click_checkout() {

        addcart.selectShoippingCart();
        addcart.selectTermsandCondi();
        addcart.selectCheckout();
    }

    @Then("^i should navigate to loginpage to pay$")
    public void i_should_navigate_to_loginpage_to_pay() {
        String expected="http://demo.nopcommerce.com/login/checkoutasguest?returnUrl=%2Fcart";
        String actual=addcart.isOnCheckout();
       // Assert.assertEquals(expected,actual);
    }


}
