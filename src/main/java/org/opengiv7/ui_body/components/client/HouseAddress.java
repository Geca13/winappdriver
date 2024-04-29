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
public class HouseAddress {

    private WindowsDriver<WindowsElement> driver;

    @FindBy(xpath = "//xpath-to-postcode-input")
    private WebElement postcodeInput;

    @FindBy(xpath = "//xpath-to-house-input")
    private WebElement houseInput;

    @FindBy(xpath = "//xpath-to-street-input")
    private WebElement streetInput;

    @FindBy(xpath = "//xpath-to-postcode-input")
    private WebElement localityInput;

    @FindBy(xpath = "//xpath-to-house-input")
    private WebElement cityInput;

    @FindBy(xpath = "//xpath-to-street-input")
    private WebElement countyInput;

    @FindBy(xpath = "//xpath-to-postcode-input")
    private WebElement countryInput;

    @FindBy(xpath = "//xpath-to-house-input")
    private WebElement dwellingDropdown;

    @FindBy(xpath = "//xpath-to-street-input")
    private WebElement typeDropdown;

    public HouseAddress(WindowsDriver<WindowsElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step
    public void enterPostcode(String postcode) {
        postcodeInput.sendKeys(postcode);
    }

    @Step
    public String getPostcode() {
        return postcodeInput.getAttribute("value");
    }

    @Step
    public void enterHouse(String house) {
        houseInput.sendKeys(house);
    }

    @Step
    public String getHouse() {
        return houseInput.getAttribute("value");
    }

    @Step
    public void enterStreet(String street) {
        streetInput.sendKeys(street);
    }

    @Step
    public String getStreet() {
        return streetInput.getAttribute("value");
    }

    @Step
    public void enterLocality(String locality) { localityInput.sendKeys(locality);
    }

    @Step
    public String getLocality() {
        return localityInput.getAttribute("value");
    }

    @Step
    public void enterCity(String city) {
        cityInput.sendKeys(city);
    }

    @Step
    public String getCity() {
        return cityInput.getAttribute("value");
    }

    @Step
    public void enterCounty(String county) {
        countyInput.sendKeys(county);
    }

    @Step
    public String getCounty() {
        return countyInput.getAttribute("value");
    }

    @Step
    public void selectCountry(String country) {
        new Select(countryInput).selectByVisibleText(country);
    }

    @Step
    public String getSelectedCountry() {
        return new Select(countryInput).getFirstSelectedOption().getText();
    }

    @Step
    public void selectDwelling(String dwelling) {
        new Select(dwellingDropdown).selectByVisibleText(dwelling);
    }

    @Step
    public String getSelectedDwelling() {
        return new Select(dwellingDropdown).getFirstSelectedOption().getText();
    }

    @Step
    public void selectType(String type) {
        new Select(typeDropdown).selectByVisibleText(type);
    }

    @Step
    public String getSelectedType() {
        return new Select(typeDropdown).getFirstSelectedOption().getText();
    }
}
