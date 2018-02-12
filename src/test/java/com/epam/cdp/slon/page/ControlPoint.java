package com.epam.cdp.slon.page;

import org.openqa.selenium.WebDriver;

public class ControlPoint extends BasePage{
    public ControlPoint(WebDriver driver) {
        super(driver);
    }

    public void controlpointPage() {

        driver.get("evbyminsd2156.minsk.epam.com/spin/searchControlPoint.do?primaryKey=2021826");

    }
