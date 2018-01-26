package com.epam.cdp.slon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerAMPage extends BasePage {

    @FindBy(xpath = "//*[@id='inner:incl:supplier_search_panel_grid_id']//button")
    private WebElement supplierButton;

    @FindBy(xpath = "(//TD[@class='x-btn-center'])[4]")
    private WebElement supplierResponsible;

    @FindBy(xpath = "//input[@id='markup_inner:incl:topic_name']")
    private WebElement nameInput;

    @FindBy(xpath = "//label[contains(text(), 'Description')]/ancestor::td/following-sibling::td//textarea")
    private WebElement descriptionInput;

    @FindBy(xpath ="//class[x-form-text x-form-field so-input-markup  x-form-empty-field]" )


    public AddCustomerAMPage(WebDriver driver, WebElement name) {
        super(driver);
    }

    public void SearchSupplier() {
        supplierButton.click();
        return;
    }

    public void SearchSupplierResponsible() {
        supplierResponsible.click();
        return;

    }
    public AddCustomerAMPage EnterName(String name) {
        nameInput.sendKeys(name);
        return this;
    }
    public AddCustomerAMPage EnterDescription(String description) {
        descriptionInput.sendKeys(description);
        return this;
    }
}
