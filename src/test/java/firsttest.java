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
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class firsttest {

    @Test
    public void testSrcCreatingBo(){

        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
        System.setProperty("webdriver.firefox.logfile", "/dev/null");
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);
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
        driver.findElement(By.xpath("//DIV[@templateid='navbarSubmenuItemText'][text()='Action Management']")).click();
        driver.findElement(By.xpath("//DIV[@id='innerTopics:j_id113:j_id125_span']"));



       // new WebDriverWait(driver, 15).until(ExpectedConditions.);
       // driver.close();
    }

}




