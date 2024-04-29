package org.opengiv7.ui_body.util;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.opengiv7.qacommon.annotations.Util;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Data
@Slf4j
public class Waits {
    private static WindowsDriver<WindowsElement> driver;


    public static void setDriver(WindowsDriver<WindowsElement> driver) {
        Waits.driver = driver;
    }

    /**
     * Waits for a WebElement to be visible on the page and returns true if it becomes visible, false otherwise.
     * @param element WebElement to wait for.
     * @param timeoutInSeconds Maximum time to wait for the element.
     * @return true if the element is visible within the timeout, false otherwise.
     */

    @Util
    public static boolean waitForElementVisible(WebElement element, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            log.info("Element is now visible: {}", element);
            return true;
        } catch (TimeoutException e) {
            log.error("Timed out waiting for element to be visible: {}", element, e);
            return false;
        }
    }

    @Util
    public static boolean waitForElementToBeSelected( WebElement element, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        try {
            wait.until(ExpectedConditions.elementToBeSelected(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Util
    public static boolean waitForElementToBeUnselected( WebElement element, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        try {
            wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeSelected(element)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Util
    public static void timeout(int seconds){
        CompletableFuture<Void> future = new CompletableFuture<>();
        Executors.newSingleThreadScheduledExecutor().schedule(() -> future.complete(null), seconds, TimeUnit.SECONDS);
        future.join();
    }
}
