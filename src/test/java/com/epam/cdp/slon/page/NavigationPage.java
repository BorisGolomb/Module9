package com.epam.cdp.slon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NavigationPage extends BasePage {


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

        WebElement element = getDriver("evbyminsd2156.minsk.epam.com/spin/searchControlPoint.do?primaryKey=2021826").findElement(By.xpath("//div[text()='SupplyOn Services']/ancestor::li[@class='navBarTopMenuItemContainer']"));
        new Actions(getDriver("evbyminsd2156.minsk.epam.com/spin/searchControlPoint.do?primaryKey=2021826")).moveToElement(element).build().perform();

        return new SupplyOnServices();
    }

    public class SupplyOnServices {
        public CreateApPage openActioManagement() {
           getDriver("evbyminsd2156.minsk.epam.com/spin/searchControlPoint.do?primaryKey=2021826").findElement(By.xpath("//div[@templateid='navbarSubmenuItemText'][text()='Action Management']")).click();
            return new CreateApPage();
        }
    }
}


//                WebElement myDynamicElement = (new WebDriverWait(driver, 10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class,'am-create-from-template-dropdown')]/div)[1]")));
//                myDynamicElement.click();