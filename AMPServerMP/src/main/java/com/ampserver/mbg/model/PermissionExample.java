package com.ampserver.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
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

        public Criteria andStrIsNull() {
            addCriterion("str is null");
            return (Criteria) this;
        }

        public Criteria andStrIsNotNull() {
            addCriterion("str is not null");
            return (Criteria) this;
        }

        public Criteria andStrEqualTo(String value) {
            addCriterion("str =", value, "str");
            return (Criteria) this;
        }

        public Criteria andStrNotEqualTo(String value) {
            addCriterion("str <>", value, "str");
            return (Criteria) this;
        }

        public Criteria andStrGreaterThan(String value) {
            addCriterion("str >", value, "str");
            return (Criteria) this;
        }

        public Criteria andStrGreaterThanOrEqualTo(String value) {
            addCriterion("str >=", value, "str");
            return (Criteria) this;
        }

        public Criteria andStrLessThan(String value) {
            addCriterion("str <", value, "str");
            return (Criteria) this;
        }

        public Criteria andStrLessThanOrEqualTo(String value) {
            addCriterion("str <=", value, "str");
            return (Criteria) this;
        }

        public Criteria andStrLike(String value) {
            addCriterion("str like", value, "str");
            return (Criteria) this;
        }

        public Criteria andStrNotLike(String value) {
            addCriterion("str not like", value, "str");
            return (Criteria) this;
        }

        public Criteria andStrIn(List<String> values) {
            addCriterion("str in", values, "str");
            return (Criteria) this;
        }

        public Criteria andStrNotIn(List<String> values) {
            addCriterion("str not in", values, "str");
            return (Criteria) this;
        }

        public Criteria andStrBetween(String value1, String value2) {
            addCriterion("str between", value1, value2, "str");
            return (Criteria) this;
        }

        public Criteria andStrNotBetween(String value1, String value2) {
            addCriterion("str not between", value1, value2, "str");
            return (Criteria) this;
        }

        public Criteria andRemakeIsNull() {
            addCriterion("remake is null");
            return (Criteria) this;
        }

        public Criteria andRemakeIsNotNull() {
            addCriterion("remake is not null");
            return (Criteria) this;
        }

        public Criteria andRemakeEqualTo(String value) {
            addCriterion("remake =", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotEqualTo(String value) {
            addCriterion("remake <>", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThan(String value) {
            addCriterion("remake >", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThanOrEqualTo(String value) {
            addCriterion("remake >=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThan(String value) {
            addCriterion("remake <", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThanOrEqualTo(String value) {
            addCriterion("remake <=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLike(String value) {
            addCriterion("remake like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotLike(String value) {
            addCriterion("remake not like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeIn(List<String> values) {
            addCriterion("remake in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotIn(List<String> values) {
            addCriterion("remake not in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeBetween(String value1, String value2) {
            addCriterion("remake between", value1, value2, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotBetween(String value1, String value2) {
            addCriterion("remake not between", value1, value2, "remake");
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