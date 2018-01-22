package com.epam.cdp.slon.util;

public class TestConfig {
    public static String getApplicationUrl(){
//        return System.getProperty("sut.url");
        return Config.getProperty("sut.url");
    }
}
