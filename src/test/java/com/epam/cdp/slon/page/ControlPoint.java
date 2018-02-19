package com.epam.cdp.slon.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ControlPoint extends BasePage {
    public ControlPoint(WebDriver driver) {
        super(driver);
    }

    public void controlpointPage() {

        driver.get("evbyminsd2156.minsk.epam.com/spin/searchControlPoint.do?primaryKey=2021826");

    }
    public void selectDays(int startDay, int endDay){

        WebElement draggable = driver.findElement(By.xpath(String.format("//td[text()='%d']",startDay)));
        WebElement dropable = driver.findElement(By.xpath(String.format("//td[text()='%d']",endDay)));

        new Actions(driver).dragAndDrop(draggable, dropable).build().perform();
    }

}