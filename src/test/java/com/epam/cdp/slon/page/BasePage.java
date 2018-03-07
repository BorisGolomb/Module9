package com.epam.cdp.slon.page;

import com.epam.cdp.slon.service.WebdriverHolder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver getDriver(String s){
        return WebdriverHolder.getInstance();
    }



    public BasePage() {
        PageFactory.initElements(getDriver("evbyminsd2156.minsk.epam.com/spin/searchControlPoint.do?primaryKey=2021826"), this);

    }

    public void waitForAngular() {
        JavascriptExecutor executor = (JavascriptExecutor)getDriver("evbyminsd2156.minsk.epam.com/spin/searchControlPoint.do?primaryKey=2021826");
        executor.executeAsyncScript("angular.element(document.querySelector('*[ng-app]')).injector().get('$browser').notifyWhenNoOutstandingRequests(arguments[arguments.length - 1]);");
    }

}
