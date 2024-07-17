package org.webdriverutil;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AppiumDriver {

    public static AndroidDriver getAndriodDriverInstant(String sApp) {
        AndroidDriver driver=null;
        try{
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("appium:automationName", "UiAutomator2");
            cap.setCapability("platformName", "Android");
            cap.setCapability("appium:deviceName", "Sample_EMU");
            cap.setCapability("appium:app", sApp);
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        }
        catch (Exception e){
            e.fillInStackTrace();
        }
        return  driver;
    }
}
