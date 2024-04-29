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
public class System {

    private WindowsDriver<WindowsElement> driver;

    @FindBy(xpath = "//*[@Name='Maximize']")
    private WebElement changePassword;

    private WebElement switchUser;

    private WebElement about;

    private WebElement exit;

    public System(WindowsDriver<WindowsElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step
    public boolean systemSubmodulesAreVisible(){
        Waits.setDriver(driver);
        return Waits.waitForElementVisible(changePassword, 60);
    }

    @Step
    public void clickChangePassword() {
        changePassword.click();
    }

    @Step
    public void clickSwitchUser() {
        switchUser.click();
    }

    @Step
    public void clickAbout() {
        about.click();
    }

    @Step
    public void clickExit() {
        exit.click();
    }

}
