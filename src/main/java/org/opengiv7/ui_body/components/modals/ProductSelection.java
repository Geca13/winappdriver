package org.opengiv7.ui_body.components.modals;

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
public class ProductSelection {


    private WindowsDriver<WindowsElement> driver;

    @FindBy(xpath = "//*[@Name='Agent Selection']")
    private WebElement agentSelectionDropdown;

    @FindBy(xpath = "//*[@Name='Product Selection']")
    private WebElement productSelectionDropdown;

    @FindBy(xpath = "//*[@Name='Cancel']")
    private WebElement cancelButton;

    @FindBy(xpath = "//*[@Name='OK']")
    private WebElement okButton;

    public ProductSelection(WindowsDriver<WindowsElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step
    public void enterProductInDropdown(String product){
        agentSelectionDropdown.sendKeys(product);
    }

    @Step
    public void enterAgentInDropdown(String agent){
        productSelectionDropdown.sendKeys(agent);
    }

    @Step
    public void clickAgentDropdown(){
        agentSelectionDropdown.click();
    }

    @Step
    public void clickProductDropdown(){
        productSelectionDropdown.click();
    }

    @Step
    public void selectAgent(String agentName){
        new Select(agentSelectionDropdown).selectByVisibleText(agentName);
    }

    @Step
    public void selectProduct(String productName){
        new Select(productSelectionDropdown).selectByVisibleText(productName);
    }

    @Step
    public void clickCancelButton(){
        cancelButton.click();
    }

    @Step
    public void clickOkButton(){
        okButton.click();
    }

}
