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
public class Renewals {

    private WindowsDriver<WindowsElement> driver;

    @FindBy(xpath = "//*[@Name='Maximize']")
    private WebElement inviteAutomatic;

    private WebElement inviteManual;

    private WebElement updateManual;

    private WebElement lapseAutomatic;

    private WebElement lapseManual;

    private WebElement viewLapsed;

    private WebElement viewRenewalAudit;

    private WebElement indexLinkingRates;

    private WebElement updateAutomatic;

    public Renewals(WindowsDriver<WindowsElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step
    public boolean renewalsSubmodulesAreVisible(){
        Waits.setDriver(driver);
        return Waits.waitForElementVisible(inviteAutomatic, 60);
    }

    @Step
    public void clickInviteAutomatic() {
        inviteAutomatic.click();
    }

    @Step
    public void clickInviteManual() {
        inviteManual.click();
    }

    @Step
    public void clickUpdateManual() {
        updateManual.click();
    }

    @Step
    public void clickLapseAutomatic() {
        lapseAutomatic.click();
    }

    @Step
    public void clickLapseManual() {
        lapseManual.click();
    }

    @Step
    public void clickViewLapsed() {
        viewLapsed.click();
    }

    @Step
    public void clickViewRenewalAudit() {
        viewRenewalAudit.click();
    }

    @Step
    public void clickIndexLinkingRates() {
        indexLinkingRates.click();
    }

    @Step
    public void clickUpdateAutomatic() {
        updateAutomatic.click();
    }
}
