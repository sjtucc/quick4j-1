package com.cc.quick4j.web.model;

public class TbOrder {
    private String id;

    private String account;

    private String company;

    private String manufactures;

    private String model;

    private String perprice;

    private String num;

    private String allprice;

    private String orderdt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getManufactures() {
        return manufactures;
    }

    public void setManufactures(String manufactures) {
        this.manufactures = manufactures == null ? null : manufactures.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getPerprice() {
        return perprice;
    }

    public void setPerprice(String perprice) {
        this.perprice = perprice == null ? null : perprice.trim();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getAllprice() {
        return allprice;
    }

    public void setAllprice(String allprice) {
        this.allprice = allprice == null ? null : allprice.trim();
    }

    public String getOrderdt() {
        return orderdt;
    }

    public void setOrderdt(String orderdt) {
        this.orderdt = orderdt == null ? null : orderdt.trim();
    }
}