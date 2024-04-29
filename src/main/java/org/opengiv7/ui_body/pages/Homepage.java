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
public class Homepage {

    private WindowsDriver<WindowsElement> driver;

    @FindBy(xpath = "//*[@Name='Maximize']")
    private WebElement client;

    private WebElement query;

    private WebElement documents;

    private WebElement reports;

    private WebElement renewals;

    private WebElement diary;

    private WebElement system;

    public Homepage(WindowsDriver<WindowsElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Step
    public boolean clientLinkIsVisible(){
        Waits.setDriver(driver);
        return Waits.waitForElementVisible(client, 10);
    }

    @Step
    public void clickClientLink(){
        client.click();
    }

    @Step
    public void clickQuery() {
        query.click();
    }

    @Step
    public void clickDocuments() {
        documents.click();
    }

    @Step
    public void clickReports() {
        reports.click();
    }

    @Step
    public void clickRenewals() {
        renewals.click();
    }

    @Step
    public void clickDiary() {
        diary.click();
    }

    @Step
    public void clickSystem() {
        system.click();
    }

}
