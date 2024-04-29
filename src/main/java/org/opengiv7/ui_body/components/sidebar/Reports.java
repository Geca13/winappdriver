package org.opengiv7.ui_body.components.sidebar;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import lombok.Data;
import org.opengiv7.qacommon.annotations.Step;
import org.opengiv7.ui_body.util.Waits;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Data
public class Reports {

    private WindowsDriver<WindowsElement> driver;

    @FindBy(xpath = "//*[@Name='Maximize']")
    private WebElement printViewReports;

    public Reports(WindowsDriver<WindowsElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step
    public boolean reportsSubmodulesAreVisible(){
        Waits.setDriver(driver);
        return Waits.waitForElementVisible(printViewReports, 60);
    }

    @Step
    public void clickPrintViewReports(){
        printViewReports.click();
    }
}
