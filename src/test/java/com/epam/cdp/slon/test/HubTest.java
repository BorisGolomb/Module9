package com.epam.cdp.slon.test;

import com.epam.cdp.slon.model.User;
import com.epam.cdp.slon.model.UserFactory;
import com.epam.cdp.slon.page.ControlPoint;
import com.epam.cdp.slon.page.LoginPage;
import com.epam.cdp.slon.util.TestConfig;
import org.testng.annotations.Test;

public class HubTest extends BaseTest {

    @Test
    public void testPlantCalendar () {

        String applicationUrl = TestConfig.getApplicationUrl();
        User user = UserFactory.getUser();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user.getUsername(), user.getPassword());
        ControlPoint controlPoint;
        controlPoint = new ControlPoint(driver);


    }


}
