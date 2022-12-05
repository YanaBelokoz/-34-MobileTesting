package Driver;


import io.appium.java_client.MobileElement;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriver {
    private static Logger LOGGER = LogManager.getLogger(AndroidDriver.class);
    private io.appium.java_client.android.AndroidDriver<?> driver;

    public io.appium.java_client.android.AndroidDriver<?> getDriver() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("PLATFORM_NAME", "Android");
            capabilities.setCapability("DEVICE_NAME", "RedMi_Note_4X");
            capabilities.setCapability("APP_ACTIVITY", "com.google.android.gm.GmailActivity");
            capabilities.setCapability("APP_PACKAGE", "com.google.android.gm");
            capabilities.setCapability("", "");

            driver = new io.appium.java_client.android.AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            LOGGER.error("Filed test for the device Android", e);
        }
        return driver;

    }
}
