package com.ampserver.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleExample() {
        oredCriteria = new ArrayList<>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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
            criteria = new ArrayList<>();
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

        public Criteria andPk_idIsNull() {
            addCriterion("pk_id is null");
            return (Criteria) this;
        }

        public Criteria andPk_idIsNotNull() {
            addCriterion("pk_id is not null");
            return (Criteria) this;
        }

        public Criteria andPk_idEqualTo(Integer value) {
            addCriterion("pk_id =", value, "pk_id");
            return (Criteria) this;
        }

        public Criteria andPk_idNotEqualTo(Integer value) {
            addCriterion("pk_id <>", value, "pk_id");
            return (Criteria) this;
        }

        public Criteria andPk_idGreaterThan(Integer value) {
            addCriterion("pk_id >", value, "pk_id");
            return (Criteria) this;
        }

        public Criteria andPk_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_id >=", value, "pk_id");
            return (Criteria) this;
        }

        public Criteria andPk_idLessThan(Integer value) {
            addCriterion("pk_id <", value, "pk_id");
            return (Criteria) this;
        }

        public Criteria andPk_idLessThanOrEqualTo(Integer value) {
            addCriterion("pk_id <=", value, "pk_id");
            return (Criteria) this;
        }

        public Criteria andPk_idIn(List<Integer> values) {
            addCriterion("pk_id in", values, "pk_id");
            return (Criteria) this;
        }

        public Criteria andPk_idNotIn(List<Integer> values) {
            addCriterion("pk_id not in", values, "pk_id");
            return (Criteria) this;
        }

        public Criteria andPk_idBetween(Integer value1, Integer value2) {
            addCriterion("pk_id between", value1, value2, "pk_id");
            return (Criteria) this;
        }

        public Criteria andPk_idNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_id not between", value1, value2, "pk_id");
            return (Criteria) this;
        }

        public Criteria andNamIsNull() {
            addCriterion("nam is null");
            return (Criteria) this;
        }

        public Criteria andNamIsNotNull() {
            addCriterion("nam is not null");
            return (Criteria) this;
        }

        public Criteria andNamEqualTo(String value) {
            addCriterion("nam =", value, "nam");
            return (Criteria) this;
        }

        public Criteria andNamNotEqualTo(String value) {
            addCriterion("nam <>", value, "nam");
            return (Criteria) this;
        }

        public Criteria andNamGreaterThan(String value) {
            addCriterion("nam >", value, "nam");
            return (Criteria) this;
        }

        public Criteria andNamGreaterThanOrEqualTo(String value) {
            addCriterion("nam >=", value, "nam");
            return (Criteria) this;
        }

        public Criteria andNamLessThan(String value) {
            addCriterion("nam <", value, "nam");
            return (Criteria) this;
        }

        public Criteria andNamLessThanOrEqualTo(String value) {
            addCriterion("nam <=", value, "nam");
            return (Criteria) this;
        }

        public Criteria andNamLike(String value) {
            addCriterion("nam like", value, "nam");
            return (Criteria) this;
        }

        public Criteria andNamNotLike(String value) {
            addCriterion("nam not like", value, "nam");
            return (Criteria) this;
        }

        public Criteria andNamIn(List<String> values) {
            addCriterion("nam in", values, "nam");
            return (Criteria) this;
        }

        public Criteria andNamNotIn(List<String> values) {
            addCriterion("nam not in", values, "nam");
            return (Criteria) this;
        }

        public Criteria andNamBetween(String value1, String value2) {
            addCriterion("nam between", value1, value2, "nam");
            return (Criteria) this;
        }

        public Criteria andNamNotBetween(String value1, String value2) {
            addCriterion("nam not between", value1, value2, "nam");
            return (Criteria) this;
        }

        public Criteria andCreate_timIsNull() {
            addCriterion("create_tim is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timIsNotNull() {
            addCriterion("create_tim is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timEqualTo(Date value) {
            addCriterion("create_tim =", value, "create_tim");
            return (Criteria) this;
        }

        public Criteria andCreate_timNotEqualTo(Date value) {
            addCriterion("create_tim <>", value, "create_tim");
            return (Criteria) this;
        }

        public Criteria andCreate_timGreaterThan(Date value) {
            addCriterion("create_tim >", value, "create_tim");
            return (Criteria) this;
        }

        public Criteria andCreate_timGreaterThanOrEqualTo(Date value) {
            addCriterion("create_tim >=", value, "create_tim");
            return (Criteria) this;
        }

        public Criteria andCreate_timLessThan(Date value) {
            addCriterion("create_tim <", value, "create_tim");
            return (Criteria) this;
        }

        public Criteria andCreate_timLessThanOrEqualTo(Date value) {
            addCriterion("create_tim <=", value, "create_tim");
            return (Criteria) this;
        }

        public Criteria andCreate_timIn(List<Date> values) {
            addCriterion("create_tim in", values, "create_tim");
            return (Criteria) this;
        }

        public Criteria andCreate_timNotIn(List<Date> values) {
            addCriterion("create_tim not in", values, "create_tim");
            return (Criteria) this;
        }

        public Criteria andCreate_timBetween(Date value1, Date value2) {
            addCriterion("create_tim between", value1, value2, "create_tim");
            return (Criteria) this;
        }

        public Criteria andCreate_timNotBetween(Date value1, Date value2) {
            addCriterion("create_tim not between", value1, value2, "create_tim");
            return (Criteria) this;
        }

        public Criteria andCorrection_timIsNull() {
            addCriterion("correction_tim is null");
            return (Criteria) this;
        }

        public Criteria andCorrection_timIsNotNull() {
            addCriterion("correction_tim is not null");
            return (Criteria) this;
        }

        public Criteria andCorrection_timEqualTo(Date value) {
            addCriterion("correction_tim =", value, "correction_tim");
            return (Criteria) this;
        }

        public Criteria andCorrection_timNotEqualTo(Date value) {
            addCriterion("correction_tim <>", value, "correction_tim");
            return (Criteria) this;
        }

        public Criteria andCorrection_timGreaterThan(Date value) {
            addCriterion("correction_tim >", value, "correction_tim");
            return (Criteria) this;
        }

        public Criteria andCorrection_timGreaterThanOrEqualTo(Date value) {
            addCriterion("correction_tim >=", value, "correction_tim");
            return (Criteria) this;
        }

        public Criteria andCorrection_timLessThan(Date value) {
            addCriterion("correction_tim <", value, "correction_tim");
            return (Criteria) this;
        }

        public Criteria andCorrection_timLessThanOrEqualTo(Date value) {
            addCriterion("correction_tim <=", value, "correction_tim");
            return (Criteria) this;
        }

        public Criteria andCorrection_timIn(List<Date> values) {
            addCriterion("correction_tim in", values, "correction_tim");
            return (Criteria) this;
        }

        public Criteria andCorrection_timNotIn(List<Date> values) {
            addCriterion("correction_tim not in", values, "correction_tim");
            return (Criteria) this;
        }

        public Criteria andCorrection_timBetween(Date value1, Date value2) {
            addCriterion("correction_tim between", value1, value2, "correction_tim");
            return (Criteria) this;
        }

        public Criteria andCorrection_timNotBetween(Date value1, Date value2) {
            addCriterion("correction_tim not between", value1, value2, "correction_tim");
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
    }
}