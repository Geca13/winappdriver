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
public class PersonalDetails {

    private WindowsDriver<WindowsElement> driver;

    @FindBy(xpath = "//xpath-to-title-dropdown")
    private WebElement titleDropdown;

    @FindBy(xpath = "//xpath-to-forename-input")
    private WebElement forenameInput;

    @FindBy(xpath = "//xpath-to-surname-input")
    private WebElement surnameInput;

    @FindBy(xpath = "//xpath-to-private-individual-radio")
    private WebElement privateIndividualRadio;

    @FindBy(xpath = "//xpath-to-other-radio")
    private WebElement otherRadio;

    @FindBy(xpath = "//xpath-to-male-radio")
    private WebElement maleRadio;

    @FindBy(xpath = "//xpath-to-female-radio")
    private WebElement femaleRadio;

    @FindBy(xpath = "//xpath-to-female-radio")
    private WebElement honoursInput;

    @FindBy(xpath = "//xpath-to-female-radio")
    private WebElement proposerCheckBox;

    @FindBy(xpath = "//xpath-to-female-radio")
    private WebElement deceasedCheckBox;

    // Repeat for all other elements in the PersonalDetails section...

    public PersonalDetails(WindowsDriver<WindowsElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step
    public void selectTitle(String title){
        new Select(titleDropdown).selectByVisibleText(title);
    }

    @Step
    public void enterForename(String forename){
        forenameInput.sendKeys(forename);
    }

    @Step
    public String getForename(){
        return forenameInput.getAttribute("value");
    }

    @Step
    public void enterSurname(String surname){
        surnameInput.sendKeys(surname);
    }

    @Step
    public String getSurname(){
        return surnameInput.getAttribute("value");
    }

    @Step
    public void clickPrivateIndividualRadio(){
        privateIndividualRadio.click();
    }

    @Step
    public void clickOtherRadio(){
        otherRadio.click();
    }

    @Step
    public void clickMaleRadio(){
        maleRadio.click();
    }

    @Step
    public void clickFemaleRadio(){
        femaleRadio.click();
    }

    @Step
    public void enterHonours(String honours){
        honoursInput.sendKeys(honours);
    }

    @Step
    public String getHonours(){
        return honoursInput.getAttribute("value");
    }

    @Step
    public void clickProposerCheckBox(){
        proposerCheckBox.click();
    }

    @Step
    public boolean isProposerSelected(){
        return proposerCheckBox.isSelected();
    }

    @Step
    public void clickDeceasedCheckBox(){
        deceasedCheckBox.click();
    }

    @Step
    public boolean isDeceasedSelected(){
        return deceasedCheckBox.isSelected();
    }
}
