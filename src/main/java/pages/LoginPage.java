package pages;

import context.TestContext;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    @AndroidFindBy(id = "com.experitest.ExperiBank:id/loginButton")
    WebElement btnLogin;

    @AndroidFindBy(id = "com.experitest.ExperiBank:id/usernameTextField")
    WebElement inpUsername;

    @AndroidFindBy(id = "com.experitest.ExperiBank:id/passwordTextField")
    WebElement inpPassword;

    public LoginPage(TestContext context) {
        super(context);
    }

    public LoginPage inputUsername(String username) {
        inpUsername.sendKeys(username);
        return this;
    }

    public LoginPage inputPassword(String password) {
        inpPassword.sendKeys(password);
        return this;
    }

    public void andLogin() {
        btnLogin.click();
    }
}