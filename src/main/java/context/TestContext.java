package context;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestContext {
    public AndroidDriver<AndroidElement> androidDriver;
    public WebDriverWait driverWait;
}