package com.epam.cdp.slon.model;

public class UserFactory {
    public static User getUser(){
        User user = new User();
        user.setUsername("ivan_500");
        user.setPassword("Support-2");
        return user;
    }
}
