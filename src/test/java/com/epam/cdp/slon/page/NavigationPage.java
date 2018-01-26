package com.epam.cdp.slon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.cssSelector;

public class NavigationPage extends BasePage {

    public NavigationPage(WebDriver driver) {
        super(driver);
    }
//    @FindBy(xpath = "//div[text()='SupplyOn Services']/ancestor::li[@class='navBarTopMenuItemContainer']")
//    private WebElement supplierButton;

//    public AddCustomerAMPage(WebDriver driver) {
//        super(driver);
//    }

//    public void SearchSupplier() {
//        supplierButton.click();
//        return;
//    }

    public SupplyOnServices openSupplyonServices() {

        WebElement element = driver.findElement(By.xpath("//div[text()='SupplyOn Services']/ancestor::li[@class='navBarTopMenuItemContainer']"));
        new Actions(driver).moveToElement(element).build().perform();

        return new SupplyOnServices();
    }

    public class SupplyOnServices {
        public CreateApPage openActioManagement() {
            driver.findElement(By.xpath("//div[@templateid='navbarSubmenuItemText'][text()='Action Management']")).click();
            return new CreateApPage(driver);
        }
    }
}


//                WebElement myDynamicElement = (new WebDriverWait(driver, 10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class,'am-create-from-template-dropdown')]/div)[1]")));
//                myDynamicElement.click();