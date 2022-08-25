package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ConfigReader;



public class LoginStepDefinitions extends LoginPage {
    @Given("user navigates to the website {string}")
    public void userNavigatesToTheWebsite(String url) {
       get(url);

    }

    @When("User Navigate to Login Page")
    public void userNavigateToLoginPage()  {
     click(signInButton);
    }

    @And("enters a valid email")
    public void entersAValidEmail() {
        sendKeys(inputEmail, ConfigReader.getProperty("email"));

    }

    @And("enters a valid password")
    public void entersAValidPassword() {
        sendKeys(inputPassword, ConfigReader.getProperty("password"));
    }


    @Then("login must be successful")
    public void loginMustBeSuccessful() {
        click(submitButton);
        assertion(getTitle(),ConfigReader.getProperty("Login_title"));
    }

    @Then("navigates to homepage")
    public void navigatesToHomepage() {
        click(homePageLink);
    }
}
