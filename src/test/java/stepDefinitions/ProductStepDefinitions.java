package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import pages.HomePage;


public class ProductStepDefinitions extends HomePage {


    @Then("hovers the product of no {string}")
    public void hoversTheProductOfNo(String productNo) {

        hoverAnElement(returnTheProductWithNo(Integer.parseInt(productNo)));
    }

    @And("adds the product of no {string} to the cart")
    public void addsTheProductOfNoToTheCart(String productNo) {
        click(addTheProductOfNoToTheCart(Integer.parseInt(productNo)));
        addTheProductClicked(Integer.parseInt(productNo));
        click(closeThePopUp);
    }

    @And("asserts that the product is in cart")
    public void assertsThatTheProductIsInCart() {
        assertion(productsClicked.get(0),getTheProductNamesInCart().get(0));
    }



    @Then("hovers the cart")
    public void hoversTheCart() {
        hoverAnElement(cart);
    }
}