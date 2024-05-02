package ui_tests.tests;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import lombok.extern.slf4j.Slf4j;
import org.opengiv7.ui_body.pages.Homepage;
import org.opengiv7.ui_body.util.Apps;
import org.opengiv7.ui_body.util.WindowManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

import static org.opengiv7.ui_body.util.ScreenshotUtil.takeScreenshot;
import static org.testng.Assert.*;


@Slf4j
public class FirstTests  {

    private WindowsDriver<WindowsElement> driver;


    @BeforeMethod
    public void setup() {
        File file = new File(Apps.tcasApp());
        if (file.exists()) {
            System.out.println("The file exists at: " + file.getAbsolutePath());
        } else {
            System.out.println("The file does not exist.");
        }
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", file.getAbsolutePath());
            capabilities.setCapability("platformName", "Windows");
            capabilities.setCapability("deviceName", "WindowsPC");
            driver = new WindowsDriver<>(new URL("http://127.0.0.1:4723"), capabilities);
            Thread.sleep(5000);
            System.out.println(driver.getWindowHandle());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize Windows Driver", e);
        }
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            WindowManager.bringToFront(driver.getWindowHandle());
            takeScreenshot(driver,result.getMethod().getMethodName() + System.currentTimeMillis());
        }
        driver.quit();
    }


    private Homepage steps;
    

    @Test(priority = 1)
    public void testsOne() throws InterruptedException {
        steps = new Homepage(this.driver);

        Thread.sleep(5000);
        assertTrue(steps.clientLinkIsVisible());
        log.info("element located");
        steps.clickClientLink();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void testsTwo() throws InterruptedException {
        steps = new Homepage(this.driver);

        assertTrue(steps.clientLinkIsVisible());
        log.info("element located");
        steps.clickClientLink();
        Thread.sleep(5000);
    }


}
