package org.opengiv7.ui_body.util;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ScreenshotUtil {

    public static void takeScreenshot( WindowsDriver<WindowsElement> driver, String fileName) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Path destination = Paths.get("./screenshots/" + fileName + ".png");
            Files.createDirectories(destination.getParent());
            Files.copy(scrFile.toPath(), destination);
            System.out.println("Screenshot saved to: " + destination);
            Waits.timeout(3);
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
}
