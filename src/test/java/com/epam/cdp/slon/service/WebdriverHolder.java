package com.epam.cdp.slon.service;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverHolder {
 private static WebDriver driver;



    private WebdriverHolder() {
    }

    public static WebDriver getInstance(){
        if(driver == null){


            driver = new FirefoxDriver();

        }

        return driver;
    }


    }
