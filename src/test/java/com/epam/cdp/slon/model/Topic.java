package com.epam.cdp.slon.model;

public class Topic {

    private String name;
    private String description;
    private String supplier;
    private String supplierResponsible;
    private String templateName;

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getSupplierResponsible() {
        return supplierResponsible;
    }

    public void setSupplierResponsible(String supplierResponsible) {
        this.supplierResponsible = supplierResponsible;
    }
}
