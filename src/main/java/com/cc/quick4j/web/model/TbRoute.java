package com.cc.quick4j.web.model;

public class TbRoute {
    private String id;

    private String fromadd;

    private String destadd;

    private String trans;

    private String lprice;

    private String hprice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFromadd() {
        return fromadd;
    }

    public void setFromadd(String fromadd) {
        this.fromadd = fromadd == null ? null : fromadd.trim();
    }

    public String getDestadd() {
        return destadd;
    }

    public void setDestadd(String destadd) {
        this.destadd = destadd == null ? null : destadd.trim();
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans == null ? null : trans.trim();
    }

    public String getLprice() {
        return lprice;
    }

    public void setLprice(String lprice) {
        this.lprice = lprice == null ? null : lprice.trim();
    }

    public String getHprice() {
        return hprice;
    }

    public void setHprice(String hprice) {
        this.hprice = hprice == null ? null : hprice.trim();
    }
}