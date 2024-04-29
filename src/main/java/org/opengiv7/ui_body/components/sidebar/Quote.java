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
public class Quote {

    private WindowsDriver<WindowsElement> driver;

    @FindBy(xpath = "//*[@Name='Maximize']")
    private WebElement newQuote;

    private WebElement quoteReSolicitation;

    private WebElement automatedReSolicitation;

    private WebElement purgeProspect;

    private WebElement onlineReferrals;

    private WebElement subAgentTransfer;

    public Quote(WindowsDriver<WindowsElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step
    public boolean documentsSubmodulesAreVisible(){
        Waits.setDriver(driver);
        return Waits.waitForElementVisible(newQuote, 60);
    }

    @Step
    public void clickNewQuote() {
        newQuote.click();
    }

    @Step
    public void clickQuoteReSolicitation() {
        quoteReSolicitation.click();
    }

    @Step
    public void clickAutomatedReSolicitation() {
        automatedReSolicitation.click();
    }

    @Step
    public void clickPurgeProspect() {
        purgeProspect.click();
    }

    @Step
    public void clickOnlineReferrals() {
        onlineReferrals.click();
    }

    @Step
    public void clickSubAgentTransfer() {
        subAgentTransfer.click();
    }
}
