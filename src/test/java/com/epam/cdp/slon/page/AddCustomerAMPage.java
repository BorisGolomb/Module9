package com.epam.cdp.slon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerAMPage extends BasePage {

    @FindBy(xpath = "//*[@id='inner:incl:supplier_search_panel_grid_id']//button")
    private WebElement supplierButton;

    public AddCustomerAMPage(WebDriver driver) {
        super(driver);
    }

    public void SearchSupplier() {
        supplierButton.click();
        return;
    }
}
