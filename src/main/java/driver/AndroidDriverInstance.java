package driver;

import constants.Constants;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInstance {
    public static AndroidDriver<AndroidElement> initialize() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("deviceName", "device");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("automationName", "UiAutomator2");

        caps.setCapability("appPackage", "com.experitest.ExperiBank");
        caps.setCapability("appWaitPackage", "com.experitest.ExperiBank");
        caps.setCapability("appWaitActivity", "com.*");
        caps.setCapability("ignoreHiddenApiPolicyError", true);
        caps.setCapability("noReset", false);
        caps.setCapability("deviceReadyTimeout", 80000);
        caps.setCapability("appWaitDuration", 100000);
        caps.setCapability("newCommandTimeout", 40000);
        if (System.getProperty("androidDriver").equals("SERVER_HUB")) {
            caps.setCapability("app", Constants.APK_SERVER);
        } else {
            caps.setCapability("app", Constants.APK);
        }

        AndroidDriver<AndroidElement> androidDriver = fillAndroidDriver(caps);
        androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return androidDriver;
    }

    private static AndroidDriver<AndroidElement> fillAndroidDriver(DesiredCapabilities caps) throws MalformedURLException {
        AndroidDriver<AndroidElement> androidDriver;
        if (System.getProperty("androidDriver").equals("SERVER_HUB")) {
            androidDriver = new AndroidDriver<>(new URL("http://172.23.0.3:4723/wd/hub"), caps);
        } else {
            androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        }
        return androidDriver;
    }
}