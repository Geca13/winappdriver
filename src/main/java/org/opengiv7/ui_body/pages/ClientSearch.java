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
public class ClientSearch {

    private WindowsDriver<WindowsElement> driver;

    @FindBy(xpath = "")
    private WebElement policyQuoteNumberRadio;

    @FindBy(xpath = "")
    private WebElement policyQuoteNumberLabel;

    @FindBy(xpath = "")
    private WebElement policyQuoteNumberInput;

    @FindBy(xpath = "")
    private WebElement surnamePostcodeRadio;

    @FindBy(xpath = "")
    private WebElement surnamePostcodeLabel;

    @FindBy(xpath = "")
    private WebElement surnameInput;

    @FindBy(xpath = "")
    private WebElement postcodeInput;

    @FindBy(xpath = "")
    private WebElement surnameInceptionDateRadio;

    @FindBy(xpath = "")
    private WebElement inceptionDateInput;

    @FindBy(xpath = "")
    private WebElement surnameInceptionDateLabel;

    @FindBy(xpath = "")
    private WebElement surnameOperatorRadio;

    @FindBy(xpath = "")
    private WebElement surnameOperatorLabel;

    @FindBy(xpath = "")
    private WebElement operatorInput;

    @FindBy(xpath = "")
    private WebElement surnameInsurerRadio;

    @FindBy(xpath = "")
    private WebElement surnameInsurerLabel;

    @FindBy(xpath = "")
    private WebElement insurerInput;

    @FindBy(xpath = "")
    private WebElement surnameDOBRadio;

    @FindBy(xpath = "")
    private WebElement surnameDOBLabel;

    @FindBy(xpath = "")
    private WebElement dobInput;

    @FindBy(xpath = "")
    private WebElement bankDetailsRadio;

    @FindBy(xpath = "")
    private WebElement bankDetailsLabel;

    @FindBy(xpath = "")
    private WebElement accountNumberInput;

    @FindBy(xpath = "")
    private WebElement sortCodeInput;

    @FindBy(xpath = "")
    private WebElement registrationNumberRadio;

    @FindBy(xpath = "")
    private WebElement registrationNumberLabel;

    @FindBy(xpath = "")
    private WebElement registrationNumberInput;

    @FindBy(xpath = "")
    private WebElement invoiceNumberRadio;

    @FindBy(xpath = "")
    private WebElement invoiceNumberLabel;

    @FindBy(xpath = "")
    private WebElement invoiceNumberInput;

    @FindBy(xpath = "")
    private WebElement clientReferenceRadio;

    @FindBy(xpath = "")
    private WebElement clientReferenceLabel;

    @FindBy(xpath = "")
    private WebElement clientReferenceInput;

    @FindBy(xpath = "")
    private WebElement insurerPolicyNumberRadio;

    @FindBy(xpath = "")
    private WebElement insurerPolicyNumberLabel;

    @FindBy(xpath = "")
    private WebElement insurerPolicyNumberInput;

    @FindBy(xpath = "")
    private WebElement emailAddressRadio;

    @FindBy(xpath = "")
    private WebElement emailAddressLabel;

    @FindBy(xpath = "")
    private WebElement emailAddressInput;

    @FindBy(xpath = "")
    private WebElement externalReferenceRadio;

    @FindBy(xpath = "")
    private WebElement externalReferenceLabel;

    @FindBy(xpath = "")
    private WebElement externalReferenceInput;

    @FindBy(xpath = "")
    private WebElement quoteReferenceRadio;

    @FindBy(xpath = "")
    private WebElement quoteReferenceLabel;

    @FindBy(xpath = "")
    private WebElement quoteReferenceInput;

    @FindBy(xpath = "")
    private WebElement cancelButton;

    @FindBy(xpath = "")
    private WebElement newClientButton;

    @FindBy(xpath = "")
    private WebElement searchButton;

    public ClientSearch(WindowsDriver<WindowsElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @Step
    public void clickPolicyQuoteNumberLabel(){
        policyQuoteNumberLabel.click();
    }

    @Step
    public void clickSurnamePostcodeLabel() {
        surnamePostcodeLabel.click();
    }

    @Step
    public void clickSurnameInceptionDateLabel() {
        surnameInceptionDateLabel.click();
    }

    @Step
    public void clickSurnameOperatorLabel() {
        surnameOperatorLabel.click();
    }

    @Step
    public void clickSurnameInsurerLabel() {
        surnameInsurerLabel.click();
    }

    @Step
    public void clickSurnameDOBLabel() {
        surnameDOBLabel.click();
    }

    @Step
    public void clickBankDetailsLabel() {
        bankDetailsLabel.click();
    }

    @Step
    public void clickRegistrationNumberLabel() {
        registrationNumberLabel.click();
    }

    @Step
    public void clickInvoiceNumberLabel() {
        invoiceNumberLabel.click();
    }

    @Step
    public void clickClientReferenceLabel() {
        clientReferenceLabel.click();
    }

    @Step
    public void clickInsurerPolicyNumberLabel() {
        insurerPolicyNumberLabel.click();
    }

    @Step
    public void clickEmailAddressLabel() {
        emailAddressLabel.click();
    }

    @Step
    public void clickExternalReferenceLabel() {
        externalReferenceLabel.click();
    }

    @Step
    public void clickQuoteReferenceLabel() {
        quoteReferenceLabel.click();
    }

    @Step
    public void clickCancelButton() {
        cancelButton.click();
    }

    @Step
    public void clickNewClientButton() {
        newClientButton.click();
    }

    @Step
    public void clickSearchButton() {
        searchButton.click();
    }

    @Step
    public boolean isPolicyQuoteNumberRadioSelected() {
        return policyQuoteNumberRadio.isSelected();
    }

    @Step
    public boolean isSurnamePostcodeRadioSelected() {
        return surnamePostcodeRadio.isSelected();
    }

    @Step
    public boolean isSurnameInceptionDateRadioSelected() {
        return surnameInceptionDateRadio.isSelected();
    }

    @Step
    public boolean isSurnameOperatorRadioSelected() {
        return surnameOperatorRadio.isSelected();
    }

    @Step
    public boolean isSurnameInsurerRadioSelected() {
        return surnameInsurerRadio.isSelected();
    }

    @Step
    public boolean isSurnameDOBRadioSelected() {
        return surnameDOBRadio.isSelected();
    }

    @Step
    public boolean isBankDetailsRadioSelected() {
        return bankDetailsRadio.isSelected();
    }

    @Step
    public boolean isRegistrationNumberRadioSelected() {
        return registrationNumberRadio.isSelected();
    }

    @Step
    public boolean isInvoiceNumberRadioSelected() {
        return invoiceNumberRadio.isSelected();
    }

    @Step
    public boolean isClientReferenceRadioSelected() {
        return clientReferenceRadio.isSelected();
    }

    @Step
    public boolean isInsurerPolicyNumberRadioSelected() {
        return insurerPolicyNumberRadio.isSelected();
    }

    @Step
    public boolean isEmailAddressRadioSelected() {
        return emailAddressRadio.isSelected();
    }

    @Step
    public boolean isExternalReferenceRadioSelected() {
        return externalReferenceRadio.isSelected();
    }

    @Step
    public boolean isQuoteReferenceRadioSelected() {
        return quoteReferenceRadio.isSelected();
    }

    @Step
    public void enterTextInPolicyQuoteNumberInput(String text){
        policyQuoteNumberInput.sendKeys(text);
    }

    @Step
    public void enterTextInSurnameInput(String text) {
        surnameInput.sendKeys(text);
    }

    @Step
    public void enterTextInPostcodeInput(String text) {
        postcodeInput.sendKeys(text);
    }

    @Step
    public void enterTextInInceptionDateInput(String text) {
        inceptionDateInput.sendKeys(text);
    }

    @Step
    public void enterTextInOperatorInput(String text) {
        operatorInput.sendKeys(text);
    }

    @Step
    public void enterTextInInsurerInput(String text) {
        insurerInput.sendKeys(text);
    }

    @Step
    public void enterTextInDOBInput(String text) {
        dobInput.sendKeys(text);
    }

    @Step
    public void enterTextInAccountNumberInput(String text) {
        accountNumberInput.sendKeys(text);
    }

    @Step
    public void enterTextInSortCodeInput(String text) {
        sortCodeInput.sendKeys(text);
    }

    @Step
    public void enterTextInRegistrationNumberInput(String text) {
        registrationNumberInput.sendKeys(text);
    }

    @Step
    public void enterTextInInvoiceNumberInput(String text) {
        invoiceNumberInput.sendKeys(text);
    }

    @Step
    public void enterTextInClientReferenceInput(String text) {
        clientReferenceInput.sendKeys(text);
    }

    @Step
    public void enterTextInInsurerPolicyNumberInput(String text) {
        insurerPolicyNumberInput.sendKeys(text);
    }

    @Step
    public void enterTextInEmailAddressInput(String text) {
        emailAddressInput.sendKeys(text);
    }

    @Step
    public void enterTextInExternalReferenceInput(String text) {
        externalReferenceInput.sendKeys(text);
    }

    @Step
    public void enterTextInQuoteReferenceInput(String text) {
        quoteReferenceInput.sendKeys(text);
    }

    @Step
    public boolean waitForPolicyQuoteNumberRadioToBeSelected(){
        return Waits.waitForElementToBeSelected(policyQuoteNumberRadio, 10);
    }

    @Step
    public boolean waitForPolicyQuoteNumberRadioToBeUnSelected(){
        return Waits.waitForElementToBeUnselected(policyQuoteNumberRadio, 10);
    }

    @Step
    public boolean waitForSurnamePostcodeRadioToBeSelected() {
        return Waits.waitForElementToBeSelected(surnamePostcodeRadio, 10);
    }

    @Step
    public boolean waitForSurnamePostcodeRadioToBeUnSelected() {
        return Waits.waitForElementToBeUnselected(surnamePostcodeRadio, 10);
    }

    @Step
    public boolean waitForSurnameInceptionDateRadioToBeSelected() {
        return Waits.waitForElementToBeSelected(surnameInceptionDateRadio, 10);
    }

    @Step
    public boolean waitForSurnameInceptionDateRadioToBeUnSelected() {
        return Waits.waitForElementToBeUnselected(surnameInceptionDateRadio, 10);
    }

    @Step
    public boolean waitForSurnameOperatorRadioToBeSelected() {
        return Waits.waitForElementToBeSelected(surnameOperatorRadio, 10);
    }

    @Step
    public boolean waitForSurnameOperatorRadioToBeUnSelected() {
        return Waits.waitForElementToBeUnselected(surnameOperatorRadio, 10);
    }

    @Step
    public boolean waitForSurnameInsurerRadioToBeSelected() {
        return Waits.waitForElementToBeSelected(surnameInsurerRadio, 10);
    }

    @Step
    public boolean waitForSurnameInsurerRadioToBeUnSelected() {
        return Waits.waitForElementToBeUnselected(surnameInsurerRadio, 10);
    }

    @Step
    public boolean waitForSurnameDOBRadioToBeSelected() {
        return Waits.waitForElementToBeSelected(surnameDOBRadio, 10);
    }

    @Step
    public boolean waitForSurnameDOBRadioToBeUnSelected() {
        return Waits.waitForElementToBeUnselected(surnameDOBRadio, 10);
    }

    @Step
    public boolean waitForBankDetailsRadioToBeSelected() {
        return Waits.waitForElementToBeSelected(bankDetailsRadio, 10);
    }

    @Step
    public boolean waitForBankDetailsRadioToBeUnSelected() {
        return Waits.waitForElementToBeUnselected(bankDetailsRadio, 10);
    }

    @Step
    public boolean waitForRegistrationNumberRadioToBeSelected() {
        return Waits.waitForElementToBeSelected(registrationNumberRadio, 10);
    }

    @Step
    public boolean waitForRegistrationNumberRadioToBeUnSelected() {
        return Waits.waitForElementToBeUnselected(registrationNumberRadio, 10);
    }

    @Step
    public boolean waitForInvoiceNumberRadioToBeSelected() {
        return Waits.waitForElementToBeSelected(invoiceNumberRadio, 10);
    }

    @Step
    public boolean waitForInvoiceNumberRadioToBeUnSelected() {
        return Waits.waitForElementToBeUnselected(invoiceNumberRadio, 10);
    }

    @Step
    public boolean waitForClientReferenceRadioToBeSelected() {
        return Waits.waitForElementToBeSelected(clientReferenceRadio, 10);
    }

    @Step
    public boolean waitForClientReferenceRadioToBeUnSelected() {
        return Waits.waitForElementToBeUnselected(clientReferenceRadio, 10);
    }

    @Step
    public boolean waitForInsurerPolicyNumberRadioToBeSelected() {
        return Waits.waitForElementToBeSelected(insurerPolicyNumberRadio, 10);
    }

    @Step
    public boolean waitForInsurerPolicyNumberRadioToBeUnSelected() {
        return Waits.waitForElementToBeUnselected(insurerPolicyNumberRadio, 10);
    }

    @Step
    public boolean waitForEmailAddressRadioToBeSelected() {
        return Waits.waitForElementToBeSelected(emailAddressRadio, 10);
    }

    @Step
    public boolean waitForEmailAddressRadioToBeUnSelected() {
        return Waits.waitForElementToBeUnselected(emailAddressRadio, 10);
    }

    @Step
    public boolean waitForExternalReferenceRadioToBeSelected() {
        return Waits.waitForElementToBeSelected(externalReferenceRadio, 10);
    }

    @Step
    public boolean waitForExternalReferenceRadioToBeUnSelected() {
        return Waits.waitForElementToBeUnselected(externalReferenceRadio, 10);
    }

    @Step
    public boolean waitForQuoteReferenceRadioToBeSelected() {
        return Waits.waitForElementToBeSelected(quoteReferenceRadio, 10);
    }

    @Step
    public boolean waitForQuoteReferenceRadioToBeUnSelected() {
        return Waits.waitForElementToBeUnselected(quoteReferenceRadio, 10);
    }


}
