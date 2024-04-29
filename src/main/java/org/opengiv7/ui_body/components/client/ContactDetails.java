package org.opengiv7.ui_body.components.client;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import lombok.Data;
import org.opengiv7.qacommon.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Data
public class ContactDetails {

    private WindowsDriver<WindowsElement> driver;

    @FindBy(xpath = "//xpath-to-telephone-number-input")
    private WebElement addedNumbersTextArea;

    @FindBy(xpath = "//xpath-to-telephone-number-input")
    private WebElement telephoneNumberInput;

    @FindBy(xpath = "//xpath-to-telephone-number-input")
    private WebElement extNumberInput;

    @FindBy(xpath = "//xpath-to-telephone-number-input")
    private WebElement exDirectoryCheckBox;

    @FindBy(xpath = "//xpath-to-mobile-number-input")
    private WebElement phoneTypeInput;

    @FindBy(xpath = "//xpath-to-email-input")
    private WebElement emailInput;

    @FindBy(xpath = "//xpath-to-add-button")
    private WebElement addButton;

    @FindBy(xpath = "//xpath-to-remove-button")
    private WebElement removeButton;


    public ContactDetails(WindowsDriver<WindowsElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step
    public String getAddedNumbers() {
        return addedNumbersTextArea.getText();
    }

    @Step
    public void enterTelephoneNumber(String number) {
        telephoneNumberInput.sendKeys(number);
    }

    @Step
    public String getTelephoneNumber() {
        return telephoneNumberInput.getAttribute("value");
    }

    @Step
    public void enterExtNumber(String number) {
        extNumberInput.sendKeys(number);
    }

    @Step
    public String getExtNumber() {
        return extNumberInput.getAttribute("value");
    }

    @Step
    public void clickExDirectoryCheckBox() {
        exDirectoryCheckBox.click();
    }

    @Step
    public boolean isExDirectorySelected() {
        return exDirectoryCheckBox.isSelected();
    }

    @Step
    public void enterPhoneType(String phoneType) {
        phoneTypeInput.sendKeys(phoneType);
    }

    @Step
    public String getPhoneType() {
        return phoneTypeInput.getAttribute("value");
    }

    @Step
    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    @Step
    public String getEmailData() {
        return emailInput.getAttribute("value");
    }

    @Step
    public void clickAddButton() {
        addButton.click();
    }

    @Step
    public void clickRemoveButton() {
        removeButton.click();
    }

}
