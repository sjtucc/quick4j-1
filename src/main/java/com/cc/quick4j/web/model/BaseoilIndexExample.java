package com.cc.quick4j.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseoilIndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseoilIndexExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIndexIdIsNull() {
            addCriterion("index_id is null");
            return (Criteria) this;
        }

        public Criteria andIndexIdIsNotNull() {
            addCriterion("index_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndexIdEqualTo(String value) {
            addCriterion("index_id =", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotEqualTo(String value) {
            addCriterion("index_id <>", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdGreaterThan(String value) {
            addCriterion("index_id >", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdGreaterThanOrEqualTo(String value) {
            addCriterion("index_id >=", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdLessThan(String value) {
            addCriterion("index_id <", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdLessThanOrEqualTo(String value) {
            addCriterion("index_id <=", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdLike(String value) {
            addCriterion("index_id like", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotLike(String value) {
            addCriterion("index_id not like", value, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdIn(List<String> values) {
            addCriterion("index_id in", values, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotIn(List<String> values) {
            addCriterion("index_id not in", values, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdBetween(String value1, String value2) {
            addCriterion("index_id between", value1, value2, "indexId");
            return (Criteria) this;
        }

        public Criteria andIndexIdNotBetween(String value1, String value2) {
            addCriterion("index_id not between", value1, value2, "indexId");
            return (Criteria) this;
        }

        public Criteria andManufacturersIsNull() {
            addCriterion("manufacturers is null");
            return (Criteria) this;
        }

        public Criteria andManufacturersIsNotNull() {
            addCriterion("manufacturers is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturersEqualTo(String value) {
            addCriterion("manufacturers =", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersNotEqualTo(String value) {
            addCriterion("manufacturers <>", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersGreaterThan(String value) {
            addCriterion("manufacturers >", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturers >=", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersLessThan(String value) {
            addCriterion("manufacturers <", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersLessThanOrEqualTo(String value) {
            addCriterion("manufacturers <=", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersLike(String value) {
            addCriterion("manufacturers like", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersNotLike(String value) {
            addCriterion("manufacturers not like", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersIn(List<String> values) {
            addCriterion("manufacturers in", values, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersNotIn(List<String> values) {
            addCriterion("manufacturers not in", values, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersBetween(String value1, String value2) {
            addCriterion("manufacturers between", value1, value2, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersNotBetween(String value1, String value2) {
            addCriterion("manufacturers not between", value1, value2, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andExteriorIsNull() {
            addCriterion("exterior is null");
            return (Criteria) this;
        }

        public Criteria andExteriorIsNotNull() {
            addCriterion("exterior is not null");
            return (Criteria) this;
        }

        public Criteria andExteriorEqualTo(String value) {
            addCriterion("exterior =", value, "exterior");
            return (Criteria) this;
        }

        public Criteria andExteriorNotEqualTo(String value) {
            addCriterion("exterior <>", value, "exterior");
            return (Criteria) this;
        }

        public Criteria andExteriorGreaterThan(String value) {
            addCriterion("exterior >", value, "exterior");
            return (Criteria) this;
        }

        public Criteria andExteriorGreaterThanOrEqualTo(String value) {
            addCriterion("exterior >=", value, "exterior");
            return (Criteria) this;
        }

        public Criteria andExteriorLessThan(String value) {
            addCriterion("exterior <", value, "exterior");
            return (Criteria) this;
        }

        public Criteria andExteriorLessThanOrEqualTo(String value) {
            addCriterion("exterior <=", value, "exterior");
            return (Criteria) this;
        }

        public Criteria andExteriorLike(String value) {
            addCriterion("exterior like", value, "exterior");
            return (Criteria) this;
        }

        public Criteria andExteriorNotLike(String value) {
            addCriterion("exterior not like", value, "exterior");
            return (Criteria) this;
        }

        public Criteria andExteriorIn(List<String> values) {
            addCriterion("exterior in", values, "exterior");
            return (Criteria) this;
        }

        public Criteria andExteriorNotIn(List<String> values) {
            addCriterion("exterior not in", values, "exterior");
            return (Criteria) this;
        }

        public Criteria andExteriorBetween(String value1, String value2) {
            addCriterion("exterior between", value1, value2, "exterior");
            return (Criteria) this;
        }

        public Criteria andExteriorNotBetween(String value1, String value2) {
            addCriterion("exterior not between", value1, value2, "exterior");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andFlashPointIsNull() {
            addCriterion("flash_point is null");
            return (Criteria) this;
        }

        public Criteria andFlashPointIsNotNull() {
            addCriterion("flash_point is not null");
            return (Criteria) this;
        }

        public Criteria andFlashPointEqualTo(Integer value) {
            addCriterion("flash_point =", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointNotEqualTo(Integer value) {
            addCriterion("flash_point <>", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointGreaterThan(Integer value) {
            addCriterion("flash_point >", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("flash_point >=", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointLessThan(Integer value) {
            addCriterion("flash_point <", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointLessThanOrEqualTo(Integer value) {
            addCriterion("flash_point <=", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointIn(List<Integer> values) {
            addCriterion("flash_point in", values, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointNotIn(List<Integer> values) {
            addCriterion("flash_point not in", values, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointBetween(Integer value1, Integer value2) {
            addCriterion("flash_point between", value1, value2, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointNotBetween(Integer value1, Integer value2) {
            addCriterion("flash_point not between", value1, value2, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlowPointIsNull() {
            addCriterion("flow_point is null");
            return (Criteria) this;
        }

        public Criteria andFlowPointIsNotNull() {
            addCriterion("flow_point is not null");
            return (Criteria) this;
        }

        public Criteria andFlowPointEqualTo(BigDecimal value) {
            addCriterion("flow_point =", value, "flowPoint");
            return (Criteria) this;
        }

        public Criteria andFlowPointNotEqualTo(BigDecimal value) {
            addCriterion("flow_point <>", value, "flowPoint");
            return (Criteria) this;
        }

        public Criteria andFlowPointGreaterThan(BigDecimal value) {
            addCriterion("flow_point >", value, "flowPoint");
            return (Criteria) this;
        }

        public Criteria andFlowPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("flow_point >=", value, "flowPoint");
            return (Criteria) this;
        }

        public Criteria andFlowPointLessThan(BigDecimal value) {
            addCriterion("flow_point <", value, "flowPoint");
            return (Criteria) this;
        }

        public Criteria andFlowPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("flow_point <=", value, "flowPoint");
            return (Criteria) this;
        }

        public Criteria andFlowPointIn(List<BigDecimal> values) {
            addCriterion("flow_point in", values, "flowPoint");
            return (Criteria) this;
        }

        public Criteria andFlowPointNotIn(List<BigDecimal> values) {
            addCriterion("flow_point not in", values, "flowPoint");
            return (Criteria) this;
        }

        public Criteria andFlowPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("flow_point between", value1, value2, "flowPoint");
            return (Criteria) this;
        }

        public Criteria andFlowPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("flow_point not between", value1, value2, "flowPoint");
            return (Criteria) this;
        }

        public Criteria andSContentIsNull() {
            addCriterion("s_content is null");
            return (Criteria) this;
        }

        public Criteria andSContentIsNotNull() {
            addCriterion("s_content is not null");
            return (Criteria) this;
        }

        public Criteria andSContentEqualTo(String value) {
            addCriterion("s_content =", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentNotEqualTo(String value) {
            addCriterion("s_content <>", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentGreaterThan(String value) {
            addCriterion("s_content >", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentGreaterThanOrEqualTo(String value) {
            addCriterion("s_content >=", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentLessThan(String value) {
            addCriterion("s_content <", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentLessThanOrEqualTo(String value) {
            addCriterion("s_content <=", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentLike(String value) {
            addCriterion("s_content like", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentNotLike(String value) {
            addCriterion("s_content not like", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentIn(List<String> values) {
            addCriterion("s_content in", values, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentNotIn(List<String> values) {
            addCriterion("s_content not in", values, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentBetween(String value1, String value2) {
            addCriterion("s_content between", value1, value2, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentNotBetween(String value1, String value2) {
            addCriterion("s_content not between", value1, value2, "sContent");
            return (Criteria) this;
        }

        public Criteria andWContentIsNull() {
            addCriterion("w_content is null");
            return (Criteria) this;
        }

        public Criteria andWContentIsNotNull() {
            addCriterion("w_content is not null");
            return (Criteria) this;
        }

        public Criteria andWContentEqualTo(String value) {
            addCriterion("w_content =", value, "wContent");
            return (Criteria) this;
        }

        public Criteria andWContentNotEqualTo(String value) {
            addCriterion("w_content <>", value, "wContent");
            return (Criteria) this;
        }

        public Criteria andWContentGreaterThan(String value) {
            addCriterion("w_content >", value, "wContent");
            return (Criteria) this;
        }

        public Criteria andWContentGreaterThanOrEqualTo(String value) {
            addCriterion("w_content >=", value, "wContent");
            return (Criteria) this;
        }

        public Criteria andWContentLessThan(String value) {
            addCriterion("w_content <", value, "wContent");
            return (Criteria) this;
        }

        public Criteria andWContentLessThanOrEqualTo(String value) {
            addCriterion("w_content <=", value, "wContent");
            return (Criteria) this;
        }

        public Criteria andWContentLike(String value) {
            addCriterion("w_content like", value, "wContent");
            return (Criteria) this;
        }

        public Criteria andWContentNotLike(String value) {
            addCriterion("w_content not like", value, "wContent");
            return (Criteria) this;
        }

        public Criteria andWContentIn(List<String> values) {
            addCriterion("w_content in", values, "wContent");
            return (Criteria) this;
        }

        public Criteria andWContentNotIn(List<String> values) {
            addCriterion("w_content not in", values, "wContent");
            return (Criteria) this;
        }

        public Criteria andWContentBetween(String value1, String value2) {
            addCriterion("w_content between", value1, value2, "wContent");
            return (Criteria) this;
        }

        public Criteria andWContentNotBetween(String value1, String value2) {
            addCriterion("w_content not between", value1, value2, "wContent");
            return (Criteria) this;
        }

        public Criteria andViscosity40IsNull() {
            addCriterion("viscosity_40 is null");
            return (Criteria) this;
        }

        public Criteria andViscosity40IsNotNull() {
            addCriterion("viscosity_40 is not null");
            return (Criteria) this;
        }

        public Criteria andViscosity40EqualTo(BigDecimal value) {
            addCriterion("viscosity_40 =", value, "viscosity40");
            return (Criteria) this;
        }

        public Criteria andViscosity40NotEqualTo(BigDecimal value) {
            addCriterion("viscosity_40 <>", value, "viscosity40");
            return (Criteria) this;
        }

        public Criteria andViscosity40GreaterThan(BigDecimal value) {
            addCriterion("viscosity_40 >", value, "viscosity40");
            return (Criteria) this;
        }

        public Criteria andViscosity40GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("viscosity_40 >=", value, "viscosity40");
            return (Criteria) this;
        }

        public Criteria andViscosity40LessThan(BigDecimal value) {
            addCriterion("viscosity_40 <", value, "viscosity40");
            return (Criteria) this;
        }

        public Criteria andViscosity40LessThanOrEqualTo(BigDecimal value) {
            addCriterion("viscosity_40 <=", value, "viscosity40");
            return (Criteria) this;
        }

        public Criteria andViscosity40In(List<BigDecimal> values) {
            addCriterion("viscosity_40 in", values, "viscosity40");
            return (Criteria) this;
        }

        public Criteria andViscosity40NotIn(List<BigDecimal> values) {
            addCriterion("viscosity_40 not in", values, "viscosity40");
            return (Criteria) this;
        }

        public Criteria andViscosity40Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("viscosity_40 between", value1, value2, "viscosity40");
            return (Criteria) this;
        }

        public Criteria andViscosity40NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("viscosity_40 not between", value1, value2, "viscosity40");
            return (Criteria) this;
        }

        public Criteria andViscosity100IsNull() {
            addCriterion("viscosity_100 is null");
            return (Criteria) this;
        }

        public Criteria andViscosity100IsNotNull() {
            addCriterion("viscosity_100 is not null");
            return (Criteria) this;
        }

        public Criteria andViscosity100EqualTo(BigDecimal value) {
            addCriterion("viscosity_100 =", value, "viscosity100");
            return (Criteria) this;
        }

        public Criteria andViscosity100NotEqualTo(BigDecimal value) {
            addCriterion("viscosity_100 <>", value, "viscosity100");
            return (Criteria) this;
        }

        public Criteria andViscosity100GreaterThan(BigDecimal value) {
            addCriterion("viscosity_100 >", value, "viscosity100");
            return (Criteria) this;
        }

        public Criteria andViscosity100GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("viscosity_100 >=", value, "viscosity100");
            return (Criteria) this;
        }

        public Criteria andViscosity100LessThan(BigDecimal value) {
            addCriterion("viscosity_100 <", value, "viscosity100");
            return (Criteria) this;
        }

        public Criteria andViscosity100LessThanOrEqualTo(BigDecimal value) {
            addCriterion("viscosity_100 <=", value, "viscosity100");
            return (Criteria) this;
        }

        public Criteria andViscosity100In(List<BigDecimal> values) {
            addCriterion("viscosity_100 in", values, "viscosity100");
            return (Criteria) this;
        }

        public Criteria andViscosity100NotIn(List<BigDecimal> values) {
            addCriterion("viscosity_100 not in", values, "viscosity100");
            return (Criteria) this;
        }

        public Criteria andViscosity100Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("viscosity_100 between", value1, value2, "viscosity100");
            return (Criteria) this;
        }

        public Criteria andViscosity100NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("viscosity_100 not between", value1, value2, "viscosity100");
            return (Criteria) this;
        }

        public Criteria andViscosityIndexIsNull() {
            addCriterion("viscosity_index is null");
            return (Criteria) this;
        }

        public Criteria andViscosityIndexIsNotNull() {
            addCriterion("viscosity_index is not null");
            return (Criteria) this;
        }

        public Criteria andViscosityIndexEqualTo(Integer value) {
            addCriterion("viscosity_index =", value, "viscosityIndex");
            return (Criteria) this;
        }

        public Criteria andViscosityIndexNotEqualTo(Integer value) {
            addCriterion("viscosity_index <>", value, "viscosityIndex");
            return (Criteria) this;
        }

        public Criteria andViscosityIndexGreaterThan(Integer value) {
            addCriterion("viscosity_index >", value, "viscosityIndex");
            return (Criteria) this;
        }

        public Criteria andViscosityIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("viscosity_index >=", value, "viscosityIndex");
            return (Criteria) this;
        }

        public Criteria andViscosityIndexLessThan(Integer value) {
            addCriterion("viscosity_index <", value, "viscosityIndex");
            return (Criteria) this;
        }

        public Criteria andViscosityIndexLessThanOrEqualTo(Integer value) {
            addCriterion("viscosity_index <=", value, "viscosityIndex");
            return (Criteria) this;
        }

        public Criteria andViscosityIndexIn(List<Integer> values) {
            addCriterion("viscosity_index in", values, "viscosityIndex");
            return (Criteria) this;
        }

        public Criteria andViscosityIndexNotIn(List<Integer> values) {
            addCriterion("viscosity_index not in", values, "viscosityIndex");
            return (Criteria) this;
        }

        public Criteria andViscosityIndexBetween(Integer value1, Integer value2) {
            addCriterion("viscosity_index between", value1, value2, "viscosityIndex");
            return (Criteria) this;
        }

        public Criteria andViscosityIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("viscosity_index not between", value1, value2, "viscosityIndex");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIsNull() {
            addCriterion("sales_price is null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIsNotNull() {
            addCriterion("sales_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceEqualTo(Integer value) {
            addCriterion("sales_price =", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotEqualTo(Integer value) {
            addCriterion("sales_price <>", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThan(Integer value) {
            addCriterion("sales_price >", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_price >=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThan(Integer value) {
            addCriterion("sales_price <", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThanOrEqualTo(Integer value) {
            addCriterion("sales_price <=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIn(List<Integer> values) {
            addCriterion("sales_price in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotIn(List<Integer> values) {
            addCriterion("sales_price not in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceBetween(Integer value1, Integer value2) {
            addCriterion("sales_price between", value1, value2, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_price not between", value1, value2, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andLowdynamicViscosityIsNull() {
            addCriterion("lowDynamic_viscosity is null");
            return (Criteria) this;
        }

        public Criteria andLowdynamicViscosityIsNotNull() {
            addCriterion("lowDynamic_viscosity is not null");
            return (Criteria) this;
        }

        public Criteria andLowdynamicViscosityEqualTo(BigDecimal value) {
            addCriterion("lowDynamic_viscosity =", value, "lowdynamicViscosity");
            return (Criteria) this;
        }

        public Criteria andLowdynamicViscosityNotEqualTo(BigDecimal value) {
            addCriterion("lowDynamic_viscosity <>", value, "lowdynamicViscosity");
            return (Criteria) this;
        }

        public Criteria andLowdynamicViscosityGreaterThan(BigDecimal value) {
            addCriterion("lowDynamic_viscosity >", value, "lowdynamicViscosity");
            return (Criteria) this;
        }

        public Criteria andLowdynamicViscosityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lowDynamic_viscosity >=", value, "lowdynamicViscosity");
            return (Criteria) this;
        }

        public Criteria andLowdynamicViscosityLessThan(BigDecimal value) {
            addCriterion("lowDynamic_viscosity <", value, "lowdynamicViscosity");
            return (Criteria) this;
        }

        public Criteria andLowdynamicViscosityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lowDynamic_viscosity <=", value, "lowdynamicViscosity");
            return (Criteria) this;
        }

        public Criteria andLowdynamicViscosityIn(List<BigDecimal> values) {
            addCriterion("lowDynamic_viscosity in", values, "lowdynamicViscosity");
            return (Criteria) this;
        }

        public Criteria andLowdynamicViscosityNotIn(List<BigDecimal> values) {
            addCriterion("lowDynamic_viscosity not in", values, "lowdynamicViscosity");
            return (Criteria) this;
        }

        public Criteria andLowdynamicViscosityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowDynamic_viscosity between", value1, value2, "lowdynamicViscosity");
            return (Criteria) this;
        }

        public Criteria andLowdynamicViscosityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lowDynamic_viscosity not between", value1, value2, "lowdynamicViscosity");
            return (Criteria) this;
        }

        public Criteria andVolatileLossIsNull() {
            addCriterion("volatile_loss is null");
            return (Criteria) this;
        }

        public Criteria andVolatileLossIsNotNull() {
            addCriterion("volatile_loss is not null");
            return (Criteria) this;
        }

        public Criteria andVolatileLossEqualTo(String value) {
            addCriterion("volatile_loss =", value, "volatileLoss");
            return (Criteria) this;
        }

        public Criteria andVolatileLossNotEqualTo(String value) {
            addCriterion("volatile_loss <>", value, "volatileLoss");
            return (Criteria) this;
        }

        public Criteria andVolatileLossGreaterThan(String value) {
            addCriterion("volatile_loss >", value, "volatileLoss");
            return (Criteria) this;
        }

        public Criteria andVolatileLossGreaterThanOrEqualTo(String value) {
            addCriterion("volatile_loss >=", value, "volatileLoss");
            return (Criteria) this;
        }

        public Criteria andVolatileLossLessThan(String value) {
            addCriterion("volatile_loss <", value, "volatileLoss");
            return (Criteria) this;
        }

        public Criteria andVolatileLossLessThanOrEqualTo(String value) {
            addCriterion("volatile_loss <=", value, "volatileLoss");
            return (Criteria) this;
        }

        public Criteria andVolatileLossLike(String value) {
            addCriterion("volatile_loss like", value, "volatileLoss");
            return (Criteria) this;
        }

        public Criteria andVolatileLossNotLike(String value) {
            addCriterion("volatile_loss not like", value, "volatileLoss");
            return (Criteria) this;
        }

        public Criteria andVolatileLossIn(List<String> values) {
            addCriterion("volatile_loss in", values, "volatileLoss");
            return (Criteria) this;
        }

        public Criteria andVolatileLossNotIn(List<String> values) {
            addCriterion("volatile_loss not in", values, "volatileLoss");
            return (Criteria) this;
        }

        public Criteria andVolatileLossBetween(String value1, String value2) {
            addCriterion("volatile_loss between", value1, value2, "volatileLoss");
            return (Criteria) this;
        }

        public Criteria andVolatileLossNotBetween(String value1, String value2) {
            addCriterion("volatile_loss not between", value1, value2, "volatileLoss");
            return (Criteria) this;
        }

        public Criteria andDensityIsNull() {
            addCriterion("density is null");
            return (Criteria) this;
        }

        public Criteria andDensityIsNotNull() {
            addCriterion("density is not null");
            return (Criteria) this;
        }

        public Criteria andDensityEqualTo(BigDecimal value) {
            addCriterion("density =", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityNotEqualTo(BigDecimal value) {
            addCriterion("density <>", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityGreaterThan(BigDecimal value) {
            addCriterion("density >", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("density >=", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityLessThan(BigDecimal value) {
            addCriterion("density <", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("density <=", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityIn(List<BigDecimal> values) {
            addCriterion("density in", values, "density");
            return (Criteria) this;
        }

        public Criteria andDensityNotIn(List<BigDecimal> values) {
            addCriterion("density not in", values, "density");
            return (Criteria) this;
        }

        public Criteria andDensityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("density between", value1, value2, "density");
            return (Criteria) this;
        }

        public Criteria andDensityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("density not between", value1, value2, "density");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}