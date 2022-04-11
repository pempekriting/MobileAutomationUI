package hooks;

import context.TestContext;
import driver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class CucumberHooks {
    private AndroidDriver<AndroidElement> androidDriver;
    private final TestContext context;

    public CucumberHooks(TestContext context) {
        this.context = context;
    }

    @Before
    public void before() throws IOException {
        androidDriver = AndroidDriverInstance.initialize();
        context.androidDriver = androidDriver;
    }

    @After
    public void after(Scenario scenario) {
        scenario.attach(((TakesScreenshot) androidDriver).getScreenshotAs(OutputType.BYTES),
                "image/png", "evidence-test");
        androidDriver.quit();
    }
}
