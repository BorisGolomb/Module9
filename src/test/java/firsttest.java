import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class firsttest {

    WebDriver driver;

    @Test
    public void testSrcCreatingBo(){

        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
        System.setProperty("webdriver.firefox.logfile", "/dev/null");
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://evbyminsd2156.minsk.epam.com/logon/logonServlet");
        driver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("ivan_500");
        driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("Support-1");
        driver.findElement(By.xpath("(//div[@class='login-button']/a)[1]")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector("a.navBarLogoutLink"));
        //Assert.assertEquals(elements.size(), 2, "failed to login");
        //driver.get("http://evbyminsd2156.minsk.epam.com/sourcing");
        WebElement element = driver.findElement(By.xpath("//div[text()='SupplyOn Services']/ancestor::li[@class='navBarTopMenuItemContainer']"));
        new Actions(driver).moveToElement(element).build().perform();
        driver.findElement(By.xpath("//div[@templateid='navbarSubmenuItemText'][text()='Action Management']")).click();
        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[contains(@class,'am-create-from-template-dropdown')]/div)[1]")));
        myDynamicElement.click();

        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'bgo-t-1610-1')]"))).click();
        driver.findElement(By.xpath("//input[@id='markup_inner:incl:topic_name']")).sendKeys("selenium_test");
        driver.findElement(By.xpath("//label[contains(text(), 'Description')]/ancestor::td/following-sibling::td//textarea")).sendKeys("selenium_test");




       // new WebDriverWait(driver, 15).until(ExpectedConditions.);
       // driver.close();
    }

    //@AfterClass
   // public void tearDown(){
     //   driver.close();
    //}
}




