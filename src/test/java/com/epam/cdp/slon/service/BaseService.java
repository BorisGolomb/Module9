package com.epam.cdp.slon.service;

import org.openqa.selenium.WebDriver;

public abstract class BaseService {
    protected final WebDriver driver;



    public BaseService(WebDriver driver) {
        this.driver = driver;
    }
}
