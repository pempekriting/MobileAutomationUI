package pages;

import context.TestContext;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private final WebDriverWait wait;
    private final AndroidDriver<AndroidElement> androidDriver;

    public BasePage(TestContext context) {
        wait = context.driverWait;
        androidDriver = context.androidDriver;
    }

    private AndroidDriver<AndroidElement> getDriver() {
        return androidDriver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public String getValueAttribute(WebElement webElement, String attributeName) {
        return webElement.getAttribute(attributeName);
    }
}
