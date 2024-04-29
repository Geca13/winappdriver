package org.opengiv7.ui_body.components.client;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import lombok.Data;
import org.opengiv7.qacommon.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

@Data
public class ClientSecurity {

    private WindowsDriver<WindowsElement> driver;

    @FindBy(xpath = "//xpath-to-security-question-dropdown")
    private WebElement securityQuestionDropdown;

    @FindBy(xpath = "//xpath-to-security-answer-input")
    private WebElement securityAnswerInput;

    @FindBy(xpath = "//xpath-to-mothers-maiden-name-input")
    private WebElement mothersMaidenNameInput;

    @FindBy(xpath = "//xpath-to-password-input")
    private WebElement passwordInput;

    @FindBy(xpath = "//xpath-to-confirm-password-input")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "//xpath-to-confirm-password-input")
    private WebElement dateOfBirthInput;


    public ClientSecurity(WindowsDriver<WindowsElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step
    public void selectSecurityQuestion(String question) {
        new Select(securityQuestionDropdown).selectByVisibleText(question);
    }

    @Step
    public String getSelectedSecurityQuestion() {
        return new Select(securityQuestionDropdown).getFirstSelectedOption().getText();
    }

    @Step
    public void enterSecurityAnswer(String answer) {
        securityAnswerInput.sendKeys(answer);
    }

    @Step
    public String getSecurityAnswer() {
        return securityAnswerInput.getAttribute("value");
    }

    @Step
    public void enterMothersMaidenName(String maidenName) {
        mothersMaidenNameInput.sendKeys(maidenName);
    }

    @Step
    public String getMothersMaidenName() {
        return mothersMaidenNameInput.getAttribute("value");
    }

    @Step
    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    @Step
    public String getPassword() {
        return passwordInput.getAttribute("value");
    }

    @Step
    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    @Step
    public String getConfirmPassword() {
        return confirmPasswordInput.getAttribute("value");
    }

    @Step
    public void enterDateOfBirth(String dob) {
        dateOfBirthInput.sendKeys(dob);
    }

    @Step
    public String getDateOfBirth() {
        return dateOfBirthInput.getAttribute("value");
    }
}
