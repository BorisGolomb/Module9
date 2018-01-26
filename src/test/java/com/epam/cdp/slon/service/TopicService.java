package com.epam.cdp.slon.service;

import com.epam.cdp.slon.model.Topic;
import com.epam.cdp.slon.page.AddCustomerAMPage;
import com.epam.cdp.slon.page.NavigationPage;
import org.openqa.selenium.WebDriver;

public class TopicService extends BaseService {

    public TopicService(WebDriver driver) {
        super(driver);
    }

    public void createTopic(Topic topic){

        AddCustomerAMPage addCustomerAMPage =  new NavigationPage(driver).openSupplyonServices().openActioManagement().craeteTopicFromTemlate(topic.getTemplateName());
        addCustomerAMPage.EnterName(topic.getName());
        addCustomerAMPage.EnterDescription(topic.getDescription());
        addCustomerAMPage.SearchSupplier();
        addCustomerAMPage.SearchSupplierResponsible();

    }

}
