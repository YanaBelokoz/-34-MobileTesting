import Driver.AndroidDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;

import java.util.logging.LogManager;

public class BaseTest {

    private static final Logger LOGGER = LogManager.getLogManager(BaseTest.class);
    public static AndroidDriver driver;

    @AfterSuite
    public void quitDriver() {
        LOGGER.info("AfterSuite: ");
        driver.quit();
    }

    @BeforeSuite
    protected void setUp() {
        LOGGER.info("BeforeSuite: ");
        LOGGER.info("Setting up the driver");
        driver = new DriverConfig().getDriver();
    }
}
