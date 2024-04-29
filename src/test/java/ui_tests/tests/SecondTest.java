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
import static org.testng.AssertJUnit.assertTrue;

@Slf4j
public class SecondTest {

    private WindowsDriver<WindowsElement> driver;


    private Homepage homepage;


    @BeforeMethod
    public void setup() {
        File file = new File(Apps.smpApp());
        if (file.exists()) {
            System.out.println("The file exists at: " + file.getAbsolutePath());
        } else {
            System.out.println("The file does not exist.");
        }
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", file.getAbsolutePath());
            driver = new WindowsDriver<>(new URL("http://127.0.0.1:4723"), capabilities);
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

    @Test(priority = 1)
    public void testsThree() throws InterruptedException {

        homepage = new Homepage(this.driver);
        Thread.sleep(25000);
        assertTrue(homepage.clientLinkIsVisible());
        log.info("element located");
        homepage.clickClientLink();
    }

    @Test(priority = 2)
    public void testsFour() throws InterruptedException {

        homepage = new Homepage(this.driver);
        Thread.sleep(25000);
        assertTrue(homepage.clientLinkIsVisible());
        log.info("element located");
        homepage.clickClientLink();
    }


}
