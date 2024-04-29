package org.opengiv7.ui_body.pages;

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
public class ClientDetails {

    private WindowsDriver<WindowsElement> driver;

    @FindBy(xpath = "//xpath-to-creation-client-ref")
    private WebElement clientRef;

    @FindBy(xpath = "//xpath-to-client-date")
    private WebElement clientDate;

    @FindBy(xpath = "//xpath-to-cancel-button")
    private WebElement cancelButton;

    @FindBy(xpath = "//xpath-to-next-button")
    private WebElement nextButton;

    public ClientDetails(WindowsDriver<WindowsElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step
    public boolean clientDetailsModalIsVisible(){
        Waits.setDriver(driver);
        return Waits.waitForElementVisible(clientDate, 60);
    }

    @Step
    public void clickNextButton(){
        nextButton.click();
    }

    @Step
    public void clickCancelButton(){
        cancelButton.click();
    }

}
