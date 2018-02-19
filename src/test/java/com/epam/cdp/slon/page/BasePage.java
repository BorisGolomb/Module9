package com.epam.cdp.slon.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void waitForAngular() {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeAsyncScript("angular.element(document.querySelector('*[ng-app]')).injector().get('$browser').notifyWhenNoOutstandingRequests(arguments[arguments.length - 1]);");
    }

}
