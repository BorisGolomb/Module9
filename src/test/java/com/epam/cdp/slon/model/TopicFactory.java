package com.epam.cdp.slon.model;

import org.apache.commons.lang3.RandomStringUtils;

public class TopicFactory {

    public static Topic getTopic(){
        Topic topic = new Topic();
        topic.setName("bgo-test-" + RandomStringUtils.randomAlphanumeric(8));
        topic.setDescription("Test description");
        topic.setSupplier("alas");
        topic.setSupplierResponsible("ivan_500");
        topic.setTemplateName("bgo-t-1610-1");
        return topic;
    }

}
