package com.cc.quick4j.web.model;

public class TbProduct {
    private String id;

    private String manufactures;

    private String model;

    private String price;

    private String address;

    private String godate;

    private String downdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getGodate() {
        return godate;
    }

    public void setGodate(String godate) {
        this.godate = godate == null ? null : godate.trim();
    }

    public String getDowndate() {
        return downdate;
    }

    public void setDowndate(String downdate) {
        this.downdate = downdate == null ? null : downdate.trim();
    }
}