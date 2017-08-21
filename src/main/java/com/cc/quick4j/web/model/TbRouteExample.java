package com.cc.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class TbRouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbRouteExample() {
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

        public Criteria andFromaddIsNull() {
            addCriterion("fromadd is null");
            return (Criteria) this;
        }

        public Criteria andFromaddIsNotNull() {
            addCriterion("fromadd is not null");
            return (Criteria) this;
        }

        public Criteria andFromaddEqualTo(String value) {
            addCriterion("fromadd =", value, "fromadd");
            return (Criteria) this;
        }

        public Criteria andFromaddNotEqualTo(String value) {
            addCriterion("fromadd <>", value, "fromadd");
            return (Criteria) this;
        }

        public Criteria andFromaddGreaterThan(String value) {
            addCriterion("fromadd >", value, "fromadd");
            return (Criteria) this;
        }

        public Criteria andFromaddGreaterThanOrEqualTo(String value) {
            addCriterion("fromadd >=", value, "fromadd");
            return (Criteria) this;
        }

        public Criteria andFromaddLessThan(String value) {
            addCriterion("fromadd <", value, "fromadd");
            return (Criteria) this;
        }

        public Criteria andFromaddLessThanOrEqualTo(String value) {
            addCriterion("fromadd <=", value, "fromadd");
            return (Criteria) this;
        }

        public Criteria andFromaddLike(String value) {
            addCriterion("fromadd like", value, "fromadd");
            return (Criteria) this;
        }

        public Criteria andFromaddNotLike(String value) {
            addCriterion("fromadd not like", value, "fromadd");
            return (Criteria) this;
        }

        public Criteria andFromaddIn(List<String> values) {
            addCriterion("fromadd in", values, "fromadd");
            return (Criteria) this;
        }

        public Criteria andFromaddNotIn(List<String> values) {
            addCriterion("fromadd not in", values, "fromadd");
            return (Criteria) this;
        }

        public Criteria andFromaddBetween(String value1, String value2) {
            addCriterion("fromadd between", value1, value2, "fromadd");
            return (Criteria) this;
        }

        public Criteria andFromaddNotBetween(String value1, String value2) {
            addCriterion("fromadd not between", value1, value2, "fromadd");
            return (Criteria) this;
        }

        public Criteria andDestaddIsNull() {
            addCriterion("destadd is null");
            return (Criteria) this;
        }

        public Criteria andDestaddIsNotNull() {
            addCriterion("destadd is not null");
            return (Criteria) this;
        }

        public Criteria andDestaddEqualTo(String value) {
            addCriterion("destadd =", value, "destadd");
            return (Criteria) this;
        }

        public Criteria andDestaddNotEqualTo(String value) {
            addCriterion("destadd <>", value, "destadd");
            return (Criteria) this;
        }

        public Criteria andDestaddGreaterThan(String value) {
            addCriterion("destadd >", value, "destadd");
            return (Criteria) this;
        }

        public Criteria andDestaddGreaterThanOrEqualTo(String value) {
            addCriterion("destadd >=", value, "destadd");
            return (Criteria) this;
        }

        public Criteria andDestaddLessThan(String value) {
            addCriterion("destadd <", value, "destadd");
            return (Criteria) this;
        }

        public Criteria andDestaddLessThanOrEqualTo(String value) {
            addCriterion("destadd <=", value, "destadd");
            return (Criteria) this;
        }

        public Criteria andDestaddLike(String value) {
            addCriterion("destadd like", value, "destadd");
            return (Criteria) this;
        }

        public Criteria andDestaddNotLike(String value) {
            addCriterion("destadd not like", value, "destadd");
            return (Criteria) this;
        }

        public Criteria andDestaddIn(List<String> values) {
            addCriterion("destadd in", values, "destadd");
            return (Criteria) this;
        }

        public Criteria andDestaddNotIn(List<String> values) {
            addCriterion("destadd not in", values, "destadd");
            return (Criteria) this;
        }

        public Criteria andDestaddBetween(String value1, String value2) {
            addCriterion("destadd between", value1, value2, "destadd");
            return (Criteria) this;
        }

        public Criteria andDestaddNotBetween(String value1, String value2) {
            addCriterion("destadd not between", value1, value2, "destadd");
            return (Criteria) this;
        }

        public Criteria andTransIsNull() {
            addCriterion("trans is null");
            return (Criteria) this;
        }

        public Criteria andTransIsNotNull() {
            addCriterion("trans is not null");
            return (Criteria) this;
        }

        public Criteria andTransEqualTo(String value) {
            addCriterion("trans =", value, "trans");
            return (Criteria) this;
        }

        public Criteria andTransNotEqualTo(String value) {
            addCriterion("trans <>", value, "trans");
            return (Criteria) this;
        }

        public Criteria andTransGreaterThan(String value) {
            addCriterion("trans >", value, "trans");
            return (Criteria) this;
        }

        public Criteria andTransGreaterThanOrEqualTo(String value) {
            addCriterion("trans >=", value, "trans");
            return (Criteria) this;
        }

        public Criteria andTransLessThan(String value) {
            addCriterion("trans <", value, "trans");
            return (Criteria) this;
        }

        public Criteria andTransLessThanOrEqualTo(String value) {
            addCriterion("trans <=", value, "trans");
            return (Criteria) this;
        }

        public Criteria andTransLike(String value) {
            addCriterion("trans like", value, "trans");
            return (Criteria) this;
        }

        public Criteria andTransNotLike(String value) {
            addCriterion("trans not like", value, "trans");
            return (Criteria) this;
        }

        public Criteria andTransIn(List<String> values) {
            addCriterion("trans in", values, "trans");
            return (Criteria) this;
        }

        public Criteria andTransNotIn(List<String> values) {
            addCriterion("trans not in", values, "trans");
            return (Criteria) this;
        }

        public Criteria andTransBetween(String value1, String value2) {
            addCriterion("trans between", value1, value2, "trans");
            return (Criteria) this;
        }

        public Criteria andTransNotBetween(String value1, String value2) {
            addCriterion("trans not between", value1, value2, "trans");
            return (Criteria) this;
        }

        public Criteria andLpriceIsNull() {
            addCriterion("lprice is null");
            return (Criteria) this;
        }

        public Criteria andLpriceIsNotNull() {
            addCriterion("lprice is not null");
            return (Criteria) this;
        }

        public Criteria andLpriceEqualTo(String value) {
            addCriterion("lprice =", value, "lprice");
            return (Criteria) this;
        }

        public Criteria andLpriceNotEqualTo(String value) {
            addCriterion("lprice <>", value, "lprice");
            return (Criteria) this;
        }

        public Criteria andLpriceGreaterThan(String value) {
            addCriterion("lprice >", value, "lprice");
            return (Criteria) this;
        }

        public Criteria andLpriceGreaterThanOrEqualTo(String value) {
            addCriterion("lprice >=", value, "lprice");
            return (Criteria) this;
        }

        public Criteria andLpriceLessThan(String value) {
            addCriterion("lprice <", value, "lprice");
            return (Criteria) this;
        }

        public Criteria andLpriceLessThanOrEqualTo(String value) {
            addCriterion("lprice <=", value, "lprice");
            return (Criteria) this;
        }

        public Criteria andLpriceLike(String value) {
            addCriterion("lprice like", value, "lprice");
            return (Criteria) this;
        }

        public Criteria andLpriceNotLike(String value) {
            addCriterion("lprice not like", value, "lprice");
            return (Criteria) this;
        }

        public Criteria andLpriceIn(List<String> values) {
            addCriterion("lprice in", values, "lprice");
            return (Criteria) this;
        }

        public Criteria andLpriceNotIn(List<String> values) {
            addCriterion("lprice not in", values, "lprice");
            return (Criteria) this;
        }

        public Criteria andLpriceBetween(String value1, String value2) {
            addCriterion("lprice between", value1, value2, "lprice");
            return (Criteria) this;
        }

        public Criteria andLpriceNotBetween(String value1, String value2) {
            addCriterion("lprice not between", value1, value2, "lprice");
            return (Criteria) this;
        }

        public Criteria andHpriceIsNull() {
            addCriterion("hprice is null");
            return (Criteria) this;
        }

        public Criteria andHpriceIsNotNull() {
            addCriterion("hprice is not null");
            return (Criteria) this;
        }

        public Criteria andHpriceEqualTo(String value) {
            addCriterion("hprice =", value, "hprice");
            return (Criteria) this;
        }

        public Criteria andHpriceNotEqualTo(String value) {
            addCriterion("hprice <>", value, "hprice");
            return (Criteria) this;
        }

        public Criteria andHpriceGreaterThan(String value) {
            addCriterion("hprice >", value, "hprice");
            return (Criteria) this;
        }

        public Criteria andHpriceGreaterThanOrEqualTo(String value) {
            addCriterion("hprice >=", value, "hprice");
            return (Criteria) this;
        }

        public Criteria andHpriceLessThan(String value) {
            addCriterion("hprice <", value, "hprice");
            return (Criteria) this;
        }

        public Criteria andHpriceLessThanOrEqualTo(String value) {
            addCriterion("hprice <=", value, "hprice");
            return (Criteria) this;
        }

        public Criteria andHpriceLike(String value) {
            addCriterion("hprice like", value, "hprice");
            return (Criteria) this;
        }

        public Criteria andHpriceNotLike(String value) {
            addCriterion("hprice not like", value, "hprice");
            return (Criteria) this;
        }

        public Criteria andHpriceIn(List<String> values) {
            addCriterion("hprice in", values, "hprice");
            return (Criteria) this;
        }

        public Criteria andHpriceNotIn(List<String> values) {
            addCriterion("hprice not in", values, "hprice");
            return (Criteria) this;
        }

        public Criteria andHpriceBetween(String value1, String value2) {
            addCriterion("hprice between", value1, value2, "hprice");
            return (Criteria) this;
        }

        public Criteria andHpriceNotBetween(String value1, String value2) {
            addCriterion("hprice not between", value1, value2, "hprice");
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