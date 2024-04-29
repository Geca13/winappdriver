package org.opengiv7.ui_body.util;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class WindowsDriverManager {

    public static WindowsDriver<WindowsElement> getDriver(String appPath) {
        File file = new File(appPath);
        if (file.exists()) {
            System.out.println("The file exists at: " + file.getAbsolutePath());
        } else {
            System.out.println("The file does not exist.");
        }
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", file.getAbsolutePath());
            return new WindowsDriver<>(new URL("http://127.0.0.1:4723"), capabilities);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize Windows Driver", e);
        }
    }

}

