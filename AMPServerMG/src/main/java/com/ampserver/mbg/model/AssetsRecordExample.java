package com.ampserver.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetsRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetsRecordExample() {
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

        public Criteria andFk_ast_st_idIsNull() {
            addCriterion("fk_ast_st_id is null");
            return (Criteria) this;
        }

        public Criteria andFk_ast_st_idIsNotNull() {
            addCriterion("fk_ast_st_id is not null");
            return (Criteria) this;
        }

        public Criteria andFk_ast_st_idEqualTo(Integer value) {
            addCriterion("fk_ast_st_id =", value, "fk_ast_st_id");
            return (Criteria) this;
        }

        public Criteria andFk_ast_st_idNotEqualTo(Integer value) {
            addCriterion("fk_ast_st_id <>", value, "fk_ast_st_id");
            return (Criteria) this;
        }

        public Criteria andFk_ast_st_idGreaterThan(Integer value) {
            addCriterion("fk_ast_st_id >", value, "fk_ast_st_id");
            return (Criteria) this;
        }

        public Criteria andFk_ast_st_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_ast_st_id >=", value, "fk_ast_st_id");
            return (Criteria) this;
        }

        public Criteria andFk_ast_st_idLessThan(Integer value) {
            addCriterion("fk_ast_st_id <", value, "fk_ast_st_id");
            return (Criteria) this;
        }

        public Criteria andFk_ast_st_idLessThanOrEqualTo(Integer value) {
            addCriterion("fk_ast_st_id <=", value, "fk_ast_st_id");
            return (Criteria) this;
        }

        public Criteria andFk_ast_st_idIn(List<Integer> values) {
            addCriterion("fk_ast_st_id in", values, "fk_ast_st_id");
            return (Criteria) this;
        }

        public Criteria andFk_ast_st_idNotIn(List<Integer> values) {
            addCriterion("fk_ast_st_id not in", values, "fk_ast_st_id");
            return (Criteria) this;
        }

        public Criteria andFk_ast_st_idBetween(Integer value1, Integer value2) {
            addCriterion("fk_ast_st_id between", value1, value2, "fk_ast_st_id");
            return (Criteria) this;
        }

        public Criteria andFk_ast_st_idNotBetween(Integer value1, Integer value2) {
            addCriterion("fk_ast_st_id not between", value1, value2, "fk_ast_st_id");
            return (Criteria) this;
        }

        public Criteria andTpeIsNull() {
            addCriterion("tpe is null");
            return (Criteria) this;
        }

        public Criteria andTpeIsNotNull() {
            addCriterion("tpe is not null");
            return (Criteria) this;
        }

        public Criteria andTpeEqualTo(Integer value) {
            addCriterion("tpe =", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeNotEqualTo(Integer value) {
            addCriterion("tpe <>", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeGreaterThan(Integer value) {
            addCriterion("tpe >", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tpe >=", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeLessThan(Integer value) {
            addCriterion("tpe <", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeLessThanOrEqualTo(Integer value) {
            addCriterion("tpe <=", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeIn(List<Integer> values) {
            addCriterion("tpe in", values, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeNotIn(List<Integer> values) {
            addCriterion("tpe not in", values, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeBetween(Integer value1, Integer value2) {
            addCriterion("tpe between", value1, value2, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeNotBetween(Integer value1, Integer value2) {
            addCriterion("tpe not between", value1, value2, "tpe");
            return (Criteria) this;
        }

        public Criteria andFk_rol_idIsNull() {
            addCriterion("fk_rol_id is null");
            return (Criteria) this;
        }

        public Criteria andFk_rol_idIsNotNull() {
            addCriterion("fk_rol_id is not null");
            return (Criteria) this;
        }

        public Criteria andFk_rol_idEqualTo(Integer value) {
            addCriterion("fk_rol_id =", value, "fk_rol_id");
            return (Criteria) this;
        }

        public Criteria andFk_rol_idNotEqualTo(Integer value) {
            addCriterion("fk_rol_id <>", value, "fk_rol_id");
            return (Criteria) this;
        }

        public Criteria andFk_rol_idGreaterThan(Integer value) {
            addCriterion("fk_rol_id >", value, "fk_rol_id");
            return (Criteria) this;
        }

        public Criteria andFk_rol_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_rol_id >=", value, "fk_rol_id");
            return (Criteria) this;
        }

        public Criteria andFk_rol_idLessThan(Integer value) {
            addCriterion("fk_rol_id <", value, "fk_rol_id");
            return (Criteria) this;
        }

        public Criteria andFk_rol_idLessThanOrEqualTo(Integer value) {
            addCriterion("fk_rol_id <=", value, "fk_rol_id");
            return (Criteria) this;
        }

        public Criteria andFk_rol_idIn(List<Integer> values) {
            addCriterion("fk_rol_id in", values, "fk_rol_id");
            return (Criteria) this;
        }

        public Criteria andFk_rol_idNotIn(List<Integer> values) {
            addCriterion("fk_rol_id not in", values, "fk_rol_id");
            return (Criteria) this;
        }

        public Criteria andFk_rol_idBetween(Integer value1, Integer value2) {
            addCriterion("fk_rol_id between", value1, value2, "fk_rol_id");
            return (Criteria) this;
        }

        public Criteria andFk_rol_idNotBetween(Integer value1, Integer value2) {
            addCriterion("fk_rol_id not between", value1, value2, "fk_rol_id");
            return (Criteria) this;
        }

        public Criteria andOperate_timIsNull() {
            addCriterion("operate_tim is null");
            return (Criteria) this;
        }

        public Criteria andOperate_timIsNotNull() {
            addCriterion("operate_tim is not null");
            return (Criteria) this;
        }

        public Criteria andOperate_timEqualTo(Date value) {
            addCriterion("operate_tim =", value, "operate_tim");
            return (Criteria) this;
        }

        public Criteria andOperate_timNotEqualTo(Date value) {
            addCriterion("operate_tim <>", value, "operate_tim");
            return (Criteria) this;
        }

        public Criteria andOperate_timGreaterThan(Date value) {
            addCriterion("operate_tim >", value, "operate_tim");
            return (Criteria) this;
        }

        public Criteria andOperate_timGreaterThanOrEqualTo(Date value) {
            addCriterion("operate_tim >=", value, "operate_tim");
            return (Criteria) this;
        }

        public Criteria andOperate_timLessThan(Date value) {
            addCriterion("operate_tim <", value, "operate_tim");
            return (Criteria) this;
        }

        public Criteria andOperate_timLessThanOrEqualTo(Date value) {
            addCriterion("operate_tim <=", value, "operate_tim");
            return (Criteria) this;
        }

        public Criteria andOperate_timIn(List<Date> values) {
            addCriterion("operate_tim in", values, "operate_tim");
            return (Criteria) this;
        }

        public Criteria andOperate_timNotIn(List<Date> values) {
            addCriterion("operate_tim not in", values, "operate_tim");
            return (Criteria) this;
        }

        public Criteria andOperate_timBetween(Date value1, Date value2) {
            addCriterion("operate_tim between", value1, value2, "operate_tim");
            return (Criteria) this;
        }

        public Criteria andOperate_timNotBetween(Date value1, Date value2) {
            addCriterion("operate_tim not between", value1, value2, "operate_tim");
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