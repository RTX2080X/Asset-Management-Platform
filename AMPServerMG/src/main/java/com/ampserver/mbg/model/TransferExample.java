package com.ampserver.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransferExample() {
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

        public Criteria andFk_usr_idIsNull() {
            addCriterion("fk_usr_id is null");
            return (Criteria) this;
        }

        public Criteria andFk_usr_idIsNotNull() {
            addCriterion("fk_usr_id is not null");
            return (Criteria) this;
        }

        public Criteria andFk_usr_idEqualTo(Integer value) {
            addCriterion("fk_usr_id =", value, "fk_usr_id");
            return (Criteria) this;
        }

        public Criteria andFk_usr_idNotEqualTo(Integer value) {
            addCriterion("fk_usr_id <>", value, "fk_usr_id");
            return (Criteria) this;
        }

        public Criteria andFk_usr_idGreaterThan(Integer value) {
            addCriterion("fk_usr_id >", value, "fk_usr_id");
            return (Criteria) this;
        }

        public Criteria andFk_usr_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_usr_id >=", value, "fk_usr_id");
            return (Criteria) this;
        }

        public Criteria andFk_usr_idLessThan(Integer value) {
            addCriterion("fk_usr_id <", value, "fk_usr_id");
            return (Criteria) this;
        }

        public Criteria andFk_usr_idLessThanOrEqualTo(Integer value) {
            addCriterion("fk_usr_id <=", value, "fk_usr_id");
            return (Criteria) this;
        }

        public Criteria andFk_usr_idIn(List<Integer> values) {
            addCriterion("fk_usr_id in", values, "fk_usr_id");
            return (Criteria) this;
        }

        public Criteria andFk_usr_idNotIn(List<Integer> values) {
            addCriterion("fk_usr_id not in", values, "fk_usr_id");
            return (Criteria) this;
        }

        public Criteria andFk_usr_idBetween(Integer value1, Integer value2) {
            addCriterion("fk_usr_id between", value1, value2, "fk_usr_id");
            return (Criteria) this;
        }

        public Criteria andFk_usr_idNotBetween(Integer value1, Integer value2) {
            addCriterion("fk_usr_id not between", value1, value2, "fk_usr_id");
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

        public Criteria andTransfer_timIsNull() {
            addCriterion("transfer_tim is null");
            return (Criteria) this;
        }

        public Criteria andTransfer_timIsNotNull() {
            addCriterion("transfer_tim is not null");
            return (Criteria) this;
        }

        public Criteria andTransfer_timEqualTo(Date value) {
            addCriterion("transfer_tim =", value, "transfer_tim");
            return (Criteria) this;
        }

        public Criteria andTransfer_timNotEqualTo(Date value) {
            addCriterion("transfer_tim <>", value, "transfer_tim");
            return (Criteria) this;
        }

        public Criteria andTransfer_timGreaterThan(Date value) {
            addCriterion("transfer_tim >", value, "transfer_tim");
            return (Criteria) this;
        }

        public Criteria andTransfer_timGreaterThanOrEqualTo(Date value) {
            addCriterion("transfer_tim >=", value, "transfer_tim");
            return (Criteria) this;
        }

        public Criteria andTransfer_timLessThan(Date value) {
            addCriterion("transfer_tim <", value, "transfer_tim");
            return (Criteria) this;
        }

        public Criteria andTransfer_timLessThanOrEqualTo(Date value) {
            addCriterion("transfer_tim <=", value, "transfer_tim");
            return (Criteria) this;
        }

        public Criteria andTransfer_timIn(List<Date> values) {
            addCriterion("transfer_tim in", values, "transfer_tim");
            return (Criteria) this;
        }

        public Criteria andTransfer_timNotIn(List<Date> values) {
            addCriterion("transfer_tim not in", values, "transfer_tim");
            return (Criteria) this;
        }

        public Criteria andTransfer_timBetween(Date value1, Date value2) {
            addCriterion("transfer_tim between", value1, value2, "transfer_tim");
            return (Criteria) this;
        }

        public Criteria andTransfer_timNotBetween(Date value1, Date value2) {
            addCriterion("transfer_tim not between", value1, value2, "transfer_tim");
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