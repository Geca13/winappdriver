package ui_tests.base;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import lombok.extern.slf4j.Slf4j;
/*import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;*/
import org.opengiv7.ui_body.util.ScreenshotUtil;
import org.opengiv7.ui_body.util.Waits;
import org.opengiv7.ui_body.util.WindowsDriverManager;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.opengiv7.ui_body.util.ScreenshotUtil.takeScreenshot;

@Slf4j


public abstract class BaseTest  {

    protected abstract String getAppPath();

    protected WindowsDriver<WindowsElement> driver;

    @BeforeMethod
    public void setUp() {
        driver = WindowsDriverManager.getDriver(getAppPath());
        Waits.setDriver(driver);

    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            // If it failed, take a screenshot
            takeScreenshot(driver,result.getMethod().getMethodName() + System.currentTimeMillis());
        }
            driver.quit();
    }
    public void switchApp(String appPath) {
        if (driver != null) {
            driver.quit();
        }
        driver = WindowsDriverManager.getDriver(appPath);
        Waits.setDriver(driver);
    }




}