package org.opengiv7.ui_body.components.modals;

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
public class Info {

    private WindowsDriver<WindowsElement> driver;

    @FindBy(xpath = "//*[@Name='Maximize']")
    private WebElement message;

    private WebElement okButton;


    public Info(WindowsDriver<WindowsElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step
    public boolean infoModalIsDisplayed(){
        Waits.setDriver(driver);
        return Waits.waitForElementVisible(message, 60);
    }

    @Step
    public String getInfoMessageText(){
        return message.getText();
    }

    @Step
    public void clickOkButton(){
        okButton.click();
    }
}
