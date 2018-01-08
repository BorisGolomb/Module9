import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class firsttest {

    @Test
    public void testSrcCreatingBo(){

        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
        System.setProperty("webdriver.firefox.logfile", "/dev/null");
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);
        driver.get("http://evbyminsd2156.minsk.epam.com/logon/logonServlet");
        driver.findElement(By.xpath("//input[@name='j_username']")).sendKeys("pb-001");
        driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys("Support-2");
        driver.findElement(By.xpath("(//div[@class='login-button']/a)[1]")).click();
        driver.get("http://evbyminsd2156.minsk.epam.com/sourcing");



        driver.close();
    }

}




