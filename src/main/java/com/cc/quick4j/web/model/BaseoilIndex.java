package com.cc.quick4j.web.model;

import java.math.BigDecimal;
import java.util.Date;

public class BaseoilIndex {
    private String indexId;

    private String manufacturers;

    private String model;

    private String exterior;

    private String color;

    private Integer flashPoint;

    private BigDecimal flowPoint;

    private String sContent;

    private String wContent;

    private BigDecimal viscosity40;

    private BigDecimal viscosity100;

    private Integer viscosityIndex;

    private Integer salesPrice;

    private Date createTime;

    private Date updateTime;

    private String groupId;

    private BigDecimal lowdynamicViscosity;

    private String volatileLoss;

    private BigDecimal density;

    public String getIndexId() {
        return indexId;
    }

    public void setIndexId(String indexId) {
        this.indexId = indexId == null ? null : indexId.trim();
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers == null ? null : manufacturers.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getExterior() {
        return exterior;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior == null ? null : exterior.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public Integer getFlashPoint() {
        return flashPoint;
    }

    public void setFlashPoint(Integer flashPoint) {
        this.flashPoint = flashPoint;
    }

    public BigDecimal getFlowPoint() {
        return flowPoint;
    }

    public void setFlowPoint(BigDecimal flowPoint) {
        this.flowPoint = flowPoint;
    }

    public String getsContent() {
        return sContent;
    }

    public void setsContent(String sContent) {
        this.sContent = sContent == null ? null : sContent.trim();
    }

    public String getwContent() {
        return wContent;
    }

    public void setwContent(String wContent) {
        this.wContent = wContent == null ? null : wContent.trim();
    }

    public BigDecimal getViscosity40() {
        return viscosity40;
    }

    public void setViscosity40(BigDecimal viscosity40) {
        this.viscosity40 = viscosity40;
    }

    public BigDecimal getViscosity100() {
        return viscosity100;
    }

    public void setViscosity100(BigDecimal viscosity100) {
        this.viscosity100 = viscosity100;
    }

    public Integer getViscosityIndex() {
        return viscosityIndex;
    }

    public void setViscosityIndex(Integer viscosityIndex) {
        this.viscosityIndex = viscosityIndex;
    }

    public Integer getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Integer salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public BigDecimal getLowdynamicViscosity() {
        return lowdynamicViscosity;
    }

    public void setLowdynamicViscosity(BigDecimal lowdynamicViscosity) {
        this.lowdynamicViscosity = lowdynamicViscosity;
    }

    public String getVolatileLoss() {
        return volatileLoss;
    }

    public void setVolatileLoss(String volatileLoss) {
        this.volatileLoss = volatileLoss == null ? null : volatileLoss.trim();
    }

    public BigDecimal getDensity() {
        return density;
    }

    public void setDensity(BigDecimal density) {
        this.density = density;
    }
}