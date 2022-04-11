package steps;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage;

    public LoginSteps(TestContext context) {
        loginPage = new LoginPage(context);
    }

    @When("User provide valid username and password")
    public void userProvideValidUsernameAndPassword() {
        loginPage.inputUsername("company")
                .inputPassword("company")
                .andLogin();
    }

    @Then("User directed to the products page")
    public void userDirectedToTheProductsPage() {

    }
}
