package com.cc.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class TbProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbProductExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andManufacturesIsNull() {
            addCriterion("manufactures is null");
            return (Criteria) this;
        }

        public Criteria andManufacturesIsNotNull() {
            addCriterion("manufactures is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturesEqualTo(String value) {
            addCriterion("manufactures =", value, "manufactures");
            return (Criteria) this;
        }

        public Criteria andManufacturesNotEqualTo(String value) {
            addCriterion("manufactures <>", value, "manufactures");
            return (Criteria) this;
        }

        public Criteria andManufacturesGreaterThan(String value) {
            addCriterion("manufactures >", value, "manufactures");
            return (Criteria) this;
        }

        public Criteria andManufacturesGreaterThanOrEqualTo(String value) {
            addCriterion("manufactures >=", value, "manufactures");
            return (Criteria) this;
        }

        public Criteria andManufacturesLessThan(String value) {
            addCriterion("manufactures <", value, "manufactures");
            return (Criteria) this;
        }

        public Criteria andManufacturesLessThanOrEqualTo(String value) {
            addCriterion("manufactures <=", value, "manufactures");
            return (Criteria) this;
        }

        public Criteria andManufacturesLike(String value) {
            addCriterion("manufactures like", value, "manufactures");
            return (Criteria) this;
        }

        public Criteria andManufacturesNotLike(String value) {
            addCriterion("manufactures not like", value, "manufactures");
            return (Criteria) this;
        }

        public Criteria andManufacturesIn(List<String> values) {
            addCriterion("manufactures in", values, "manufactures");
            return (Criteria) this;
        }

        public Criteria andManufacturesNotIn(List<String> values) {
            addCriterion("manufactures not in", values, "manufactures");
            return (Criteria) this;
        }

        public Criteria andManufacturesBetween(String value1, String value2) {
            addCriterion("manufactures between", value1, value2, "manufactures");
            return (Criteria) this;
        }

        public Criteria andManufacturesNotBetween(String value1, String value2) {
            addCriterion("manufactures not between", value1, value2, "manufactures");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andGodateIsNull() {
            addCriterion("godate is null");
            return (Criteria) this;
        }

        public Criteria andGodateIsNotNull() {
            addCriterion("godate is not null");
            return (Criteria) this;
        }

        public Criteria andGodateEqualTo(String value) {
            addCriterion("godate =", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateNotEqualTo(String value) {
            addCriterion("godate <>", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateGreaterThan(String value) {
            addCriterion("godate >", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateGreaterThanOrEqualTo(String value) {
            addCriterion("godate >=", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateLessThan(String value) {
            addCriterion("godate <", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateLessThanOrEqualTo(String value) {
            addCriterion("godate <=", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateLike(String value) {
            addCriterion("godate like", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateNotLike(String value) {
            addCriterion("godate not like", value, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateIn(List<String> values) {
            addCriterion("godate in", values, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateNotIn(List<String> values) {
            addCriterion("godate not in", values, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateBetween(String value1, String value2) {
            addCriterion("godate between", value1, value2, "godate");
            return (Criteria) this;
        }

        public Criteria andGodateNotBetween(String value1, String value2) {
            addCriterion("godate not between", value1, value2, "godate");
            return (Criteria) this;
        }

        public Criteria andDowndateIsNull() {
            addCriterion("downdate is null");
            return (Criteria) this;
        }

        public Criteria andDowndateIsNotNull() {
            addCriterion("downdate is not null");
            return (Criteria) this;
        }

        public Criteria andDowndateEqualTo(String value) {
            addCriterion("downdate =", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateNotEqualTo(String value) {
            addCriterion("downdate <>", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateGreaterThan(String value) {
            addCriterion("downdate >", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateGreaterThanOrEqualTo(String value) {
            addCriterion("downdate >=", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateLessThan(String value) {
            addCriterion("downdate <", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateLessThanOrEqualTo(String value) {
            addCriterion("downdate <=", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateLike(String value) {
            addCriterion("downdate like", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateNotLike(String value) {
            addCriterion("downdate not like", value, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateIn(List<String> values) {
            addCriterion("downdate in", values, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateNotIn(List<String> values) {
            addCriterion("downdate not in", values, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateBetween(String value1, String value2) {
            addCriterion("downdate between", value1, value2, "downdate");
            return (Criteria) this;
        }

        public Criteria andDowndateNotBetween(String value1, String value2) {
            addCriterion("downdate not between", value1, value2, "downdate");
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