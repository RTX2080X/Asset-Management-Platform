package com.ampserver.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsrExample() {
        oredCriteria = new ArrayList<>();
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

        public Criteria andUser_nameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("user_name =", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("user_name >", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("user_name <", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("user_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("user_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("user_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRegister_timIsNull() {
            addCriterion("register_tim is null");
            return (Criteria) this;
        }

        public Criteria andRegister_timIsNotNull() {
            addCriterion("register_tim is not null");
            return (Criteria) this;
        }

        public Criteria andRegister_timEqualTo(Date value) {
            addCriterion("register_tim =", value, "register_tim");
            return (Criteria) this;
        }

        public Criteria andRegister_timNotEqualTo(Date value) {
            addCriterion("register_tim <>", value, "register_tim");
            return (Criteria) this;
        }

        public Criteria andRegister_timGreaterThan(Date value) {
            addCriterion("register_tim >", value, "register_tim");
            return (Criteria) this;
        }

        public Criteria andRegister_timGreaterThanOrEqualTo(Date value) {
            addCriterion("register_tim >=", value, "register_tim");
            return (Criteria) this;
        }

        public Criteria andRegister_timLessThan(Date value) {
            addCriterion("register_tim <", value, "register_tim");
            return (Criteria) this;
        }

        public Criteria andRegister_timLessThanOrEqualTo(Date value) {
            addCriterion("register_tim <=", value, "register_tim");
            return (Criteria) this;
        }

        public Criteria andRegister_timIn(List<Date> values) {
            addCriterion("register_tim in", values, "register_tim");
            return (Criteria) this;
        }

        public Criteria andRegister_timNotIn(List<Date> values) {
            addCriterion("register_tim not in", values, "register_tim");
            return (Criteria) this;
        }

        public Criteria andRegister_timBetween(Date value1, Date value2) {
            addCriterion("register_tim between", value1, value2, "register_tim");
            return (Criteria) this;
        }

        public Criteria andRegister_timNotBetween(Date value1, Date value2) {
            addCriterion("register_tim not between", value1, value2, "register_tim");
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