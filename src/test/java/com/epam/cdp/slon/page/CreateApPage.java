package com.epam.cdp.slon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateApPage extends BasePage {

    @FindBy(xpath = "(//div[contains(@class,'am-create-from-template-dropdown')]/div)[1]")
    private WebElement actionplanDropdown;



    public CreateApPage(WebDriver driver) {
        super(driver);
    }

    public AddCustomerAMPage craeteTopicFromTemlate(String templateName) {

        actionplanDropdown.click();
        driver.findElement(By.xpath(String.format("//span[contains(text(),'%s')]", templateName ))) .click();
        return new AddCustomerAMPage(driver, name);
    }


}


//WebElement myDynamicElement = (new WebDriverWait(driver, 10))
//.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class,'am-create-from-template-dropdown')]/div)[1]")));
//myDynamicElement.click();

//    new WebDriverWait(driver, 10)
//    .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'bgo-t-1610-1')]"))).click();
//      driver.findElement(By.xpath("//input[@id='markup_inner:incl:topic_name']")).sendKeys("selenium_test");
//        driver.findElement(By.xpath("//label[contains(text(), 'Description')]/ancestor::td/following-sibling::td//textarea")).sendKeys("selenium_test");
//          driver.findElement(By.xpath("//*[@id='inner:incl:supplier_search_panel_grid_id']//button")).click();