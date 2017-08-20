package com.cc.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class TbOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderExample() {
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
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

        public Criteria andPerpriceIsNull() {
            addCriterion("perprice is null");
            return (Criteria) this;
        }

        public Criteria andPerpriceIsNotNull() {
            addCriterion("perprice is not null");
            return (Criteria) this;
        }

        public Criteria andPerpriceEqualTo(String value) {
            addCriterion("perprice =", value, "perprice");
            return (Criteria) this;
        }

        public Criteria andPerpriceNotEqualTo(String value) {
            addCriterion("perprice <>", value, "perprice");
            return (Criteria) this;
        }

        public Criteria andPerpriceGreaterThan(String value) {
            addCriterion("perprice >", value, "perprice");
            return (Criteria) this;
        }

        public Criteria andPerpriceGreaterThanOrEqualTo(String value) {
            addCriterion("perprice >=", value, "perprice");
            return (Criteria) this;
        }

        public Criteria andPerpriceLessThan(String value) {
            addCriterion("perprice <", value, "perprice");
            return (Criteria) this;
        }

        public Criteria andPerpriceLessThanOrEqualTo(String value) {
            addCriterion("perprice <=", value, "perprice");
            return (Criteria) this;
        }

        public Criteria andPerpriceLike(String value) {
            addCriterion("perprice like", value, "perprice");
            return (Criteria) this;
        }

        public Criteria andPerpriceNotLike(String value) {
            addCriterion("perprice not like", value, "perprice");
            return (Criteria) this;
        }

        public Criteria andPerpriceIn(List<String> values) {
            addCriterion("perprice in", values, "perprice");
            return (Criteria) this;
        }

        public Criteria andPerpriceNotIn(List<String> values) {
            addCriterion("perprice not in", values, "perprice");
            return (Criteria) this;
        }

        public Criteria andPerpriceBetween(String value1, String value2) {
            addCriterion("perprice between", value1, value2, "perprice");
            return (Criteria) this;
        }

        public Criteria andPerpriceNotBetween(String value1, String value2) {
            addCriterion("perprice not between", value1, value2, "perprice");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andAllpriceIsNull() {
            addCriterion("allprice is null");
            return (Criteria) this;
        }

        public Criteria andAllpriceIsNotNull() {
            addCriterion("allprice is not null");
            return (Criteria) this;
        }

        public Criteria andAllpriceEqualTo(String value) {
            addCriterion("allprice =", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceNotEqualTo(String value) {
            addCriterion("allprice <>", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceGreaterThan(String value) {
            addCriterion("allprice >", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceGreaterThanOrEqualTo(String value) {
            addCriterion("allprice >=", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceLessThan(String value) {
            addCriterion("allprice <", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceLessThanOrEqualTo(String value) {
            addCriterion("allprice <=", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceLike(String value) {
            addCriterion("allprice like", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceNotLike(String value) {
            addCriterion("allprice not like", value, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceIn(List<String> values) {
            addCriterion("allprice in", values, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceNotIn(List<String> values) {
            addCriterion("allprice not in", values, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceBetween(String value1, String value2) {
            addCriterion("allprice between", value1, value2, "allprice");
            return (Criteria) this;
        }

        public Criteria andAllpriceNotBetween(String value1, String value2) {
            addCriterion("allprice not between", value1, value2, "allprice");
            return (Criteria) this;
        }

        public Criteria andOrderdtIsNull() {
            addCriterion("orderdt is null");
            return (Criteria) this;
        }

        public Criteria andOrderdtIsNotNull() {
            addCriterion("orderdt is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdtEqualTo(String value) {
            addCriterion("orderdt =", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtNotEqualTo(String value) {
            addCriterion("orderdt <>", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtGreaterThan(String value) {
            addCriterion("orderdt >", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtGreaterThanOrEqualTo(String value) {
            addCriterion("orderdt >=", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtLessThan(String value) {
            addCriterion("orderdt <", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtLessThanOrEqualTo(String value) {
            addCriterion("orderdt <=", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtLike(String value) {
            addCriterion("orderdt like", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtNotLike(String value) {
            addCriterion("orderdt not like", value, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtIn(List<String> values) {
            addCriterion("orderdt in", values, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtNotIn(List<String> values) {
            addCriterion("orderdt not in", values, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtBetween(String value1, String value2) {
            addCriterion("orderdt between", value1, value2, "orderdt");
            return (Criteria) this;
        }

        public Criteria andOrderdtNotBetween(String value1, String value2) {
            addCriterion("orderdt not between", value1, value2, "orderdt");
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