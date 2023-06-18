/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ampserver.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetsExample() {
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

        public Criteria andPk_IdIsNull() {
            addCriterion("pk_Id is null");
            return (Criteria) this;
        }

        public Criteria andPk_IdIsNotNull() {
            addCriterion("pk_Id is not null");
            return (Criteria) this;
        }

        public Criteria andPk_IdEqualTo(Integer value) {
            addCriterion("pk_Id =", value, "pk_Id");
            return (Criteria) this;
        }

        public Criteria andPk_IdNotEqualTo(Integer value) {
            addCriterion("pk_Id <>", value, "pk_Id");
            return (Criteria) this;
        }

        public Criteria andPk_IdGreaterThan(Integer value) {
            addCriterion("pk_Id >", value, "pk_Id");
            return (Criteria) this;
        }

        public Criteria andPk_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_Id >=", value, "pk_Id");
            return (Criteria) this;
        }

        public Criteria andPk_IdLessThan(Integer value) {
            addCriterion("pk_Id <", value, "pk_Id");
            return (Criteria) this;
        }

        public Criteria andPk_IdLessThanOrEqualTo(Integer value) {
            addCriterion("pk_Id <=", value, "pk_Id");
            return (Criteria) this;
        }

        public Criteria andPk_IdIn(List<Integer> values) {
            addCriterion("pk_Id in", values, "pk_Id");
            return (Criteria) this;
        }

        public Criteria andPk_IdNotIn(List<Integer> values) {
            addCriterion("pk_Id not in", values, "pk_Id");
            return (Criteria) this;
        }

        public Criteria andPk_IdBetween(Integer value1, Integer value2) {
            addCriterion("pk_Id between", value1, value2, "pk_Id");
            return (Criteria) this;
        }

        public Criteria andPk_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_Id not between", value1, value2, "pk_Id");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
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

        public Criteria andTpeEqualTo(String value) {
            addCriterion("tpe =", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeNotEqualTo(String value) {
            addCriterion("tpe <>", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeGreaterThan(String value) {
            addCriterion("tpe >", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeGreaterThanOrEqualTo(String value) {
            addCriterion("tpe >=", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeLessThan(String value) {
            addCriterion("tpe <", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeLessThanOrEqualTo(String value) {
            addCriterion("tpe <=", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeLike(String value) {
            addCriterion("tpe like", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeNotLike(String value) {
            addCriterion("tpe not like", value, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeIn(List<String> values) {
            addCriterion("tpe in", values, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeNotIn(List<String> values) {
            addCriterion("tpe not in", values, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeBetween(String value1, String value2) {
            addCriterion("tpe between", value1, value2, "tpe");
            return (Criteria) this;
        }

        public Criteria andTpeNotBetween(String value1, String value2) {
            addCriterion("tpe not between", value1, value2, "tpe");
            return (Criteria) this;
        }

        public Criteria andPump_headIsNull() {
            addCriterion("pump_head is null");
            return (Criteria) this;
        }

        public Criteria andPump_headIsNotNull() {
            addCriterion("pump_head is not null");
            return (Criteria) this;
        }

        public Criteria andPump_headEqualTo(Integer value) {
            addCriterion("pump_head =", value, "pump_head");
            return (Criteria) this;
        }

        public Criteria andPump_headNotEqualTo(Integer value) {
            addCriterion("pump_head <>", value, "pump_head");
            return (Criteria) this;
        }

        public Criteria andPump_headGreaterThan(Integer value) {
            addCriterion("pump_head >", value, "pump_head");
            return (Criteria) this;
        }

        public Criteria andPump_headGreaterThanOrEqualTo(Integer value) {
            addCriterion("pump_head >=", value, "pump_head");
            return (Criteria) this;
        }

        public Criteria andPump_headLessThan(Integer value) {
            addCriterion("pump_head <", value, "pump_head");
            return (Criteria) this;
        }

        public Criteria andPump_headLessThanOrEqualTo(Integer value) {
            addCriterion("pump_head <=", value, "pump_head");
            return (Criteria) this;
        }

        public Criteria andPump_headIn(List<Integer> values) {
            addCriterion("pump_head in", values, "pump_head");
            return (Criteria) this;
        }

        public Criteria andPump_headNotIn(List<Integer> values) {
            addCriterion("pump_head not in", values, "pump_head");
            return (Criteria) this;
        }

        public Criteria andPump_headBetween(Integer value1, Integer value2) {
            addCriterion("pump_head between", value1, value2, "pump_head");
            return (Criteria) this;
        }

        public Criteria andPump_headNotBetween(Integer value1, Integer value2) {
            addCriterion("pump_head not between", value1, value2, "pump_head");
            return (Criteria) this;
        }

        public Criteria andFlowIsNull() {
            addCriterion("flow is null");
            return (Criteria) this;
        }

        public Criteria andFlowIsNotNull() {
            addCriterion("flow is not null");
            return (Criteria) this;
        }

        public Criteria andFlowEqualTo(Float value) {
            addCriterion("flow =", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotEqualTo(Float value) {
            addCriterion("flow <>", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThan(Float value) {
            addCriterion("flow >", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThanOrEqualTo(Float value) {
            addCriterion("flow >=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThan(Float value) {
            addCriterion("flow <", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThanOrEqualTo(Float value) {
            addCriterion("flow <=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowIn(List<Float> values) {
            addCriterion("flow in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotIn(List<Float> values) {
            addCriterion("flow not in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowBetween(Float value1, Float value2) {
            addCriterion("flow between", value1, value2, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotBetween(Float value1, Float value2) {
            addCriterion("flow not between", value1, value2, "flow");
            return (Criteria) this;
        }

        public Criteria andRpmIsNull() {
            addCriterion("rpm is null");
            return (Criteria) this;
        }

        public Criteria andRpmIsNotNull() {
            addCriterion("rpm is not null");
            return (Criteria) this;
        }

        public Criteria andRpmEqualTo(Integer value) {
            addCriterion("rpm =", value, "rpm");
            return (Criteria) this;
        }

        public Criteria andRpmNotEqualTo(Integer value) {
            addCriterion("rpm <>", value, "rpm");
            return (Criteria) this;
        }

        public Criteria andRpmGreaterThan(Integer value) {
            addCriterion("rpm >", value, "rpm");
            return (Criteria) this;
        }

        public Criteria andRpmGreaterThanOrEqualTo(Integer value) {
            addCriterion("rpm >=", value, "rpm");
            return (Criteria) this;
        }

        public Criteria andRpmLessThan(Integer value) {
            addCriterion("rpm <", value, "rpm");
            return (Criteria) this;
        }

        public Criteria andRpmLessThanOrEqualTo(Integer value) {
            addCriterion("rpm <=", value, "rpm");
            return (Criteria) this;
        }

        public Criteria andRpmIn(List<Integer> values) {
            addCriterion("rpm in", values, "rpm");
            return (Criteria) this;
        }

        public Criteria andRpmNotIn(List<Integer> values) {
            addCriterion("rpm not in", values, "rpm");
            return (Criteria) this;
        }

        public Criteria andRpmBetween(Integer value1, Integer value2) {
            addCriterion("rpm between", value1, value2, "rpm");
            return (Criteria) this;
        }

        public Criteria andRpmNotBetween(Integer value1, Integer value2) {
            addCriterion("rpm not between", value1, value2, "rpm");
            return (Criteria) this;
        }

        public Criteria andQualityIsNull() {
            addCriterion("quality is null");
            return (Criteria) this;
        }

        public Criteria andQualityIsNotNull() {
            addCriterion("quality is not null");
            return (Criteria) this;
        }

        public Criteria andQualityEqualTo(Integer value) {
            addCriterion("quality =", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotEqualTo(Integer value) {
            addCriterion("quality <>", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThan(Integer value) {
            addCriterion("quality >", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality >=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThan(Integer value) {
            addCriterion("quality <", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThanOrEqualTo(Integer value) {
            addCriterion("quality <=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityIn(List<Integer> values) {
            addCriterion("quality in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotIn(List<Integer> values) {
            addCriterion("quality not in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityBetween(Integer value1, Integer value2) {
            addCriterion("quality between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotBetween(Integer value1, Integer value2) {
            addCriterion("quality not between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andSpare_partIsNull() {
            addCriterion("spare_part is null");
            return (Criteria) this;
        }

        public Criteria andSpare_partIsNotNull() {
            addCriterion("spare_part is not null");
            return (Criteria) this;
        }

        public Criteria andSpare_partEqualTo(String value) {
            addCriterion("spare_part =", value, "spare_part");
            return (Criteria) this;
        }

        public Criteria andSpare_partNotEqualTo(String value) {
            addCriterion("spare_part <>", value, "spare_part");
            return (Criteria) this;
        }

        public Criteria andSpare_partGreaterThan(String value) {
            addCriterion("spare_part >", value, "spare_part");
            return (Criteria) this;
        }

        public Criteria andSpare_partGreaterThanOrEqualTo(String value) {
            addCriterion("spare_part >=", value, "spare_part");
            return (Criteria) this;
        }

        public Criteria andSpare_partLessThan(String value) {
            addCriterion("spare_part <", value, "spare_part");
            return (Criteria) this;
        }

        public Criteria andSpare_partLessThanOrEqualTo(String value) {
            addCriterion("spare_part <=", value, "spare_part");
            return (Criteria) this;
        }

        public Criteria andSpare_partLike(String value) {
            addCriterion("spare_part like", value, "spare_part");
            return (Criteria) this;
        }

        public Criteria andSpare_partNotLike(String value) {
            addCriterion("spare_part not like", value, "spare_part");
            return (Criteria) this;
        }

        public Criteria andSpare_partIn(List<String> values) {
            addCriterion("spare_part in", values, "spare_part");
            return (Criteria) this;
        }

        public Criteria andSpare_partNotIn(List<String> values) {
            addCriterion("spare_part not in", values, "spare_part");
            return (Criteria) this;
        }

        public Criteria andSpare_partBetween(String value1, String value2) {
            addCriterion("spare_part between", value1, value2, "spare_part");
            return (Criteria) this;
        }

        public Criteria andSpare_partNotBetween(String value1, String value2) {
            addCriterion("spare_part not between", value1, value2, "spare_part");
            return (Criteria) this;
        }

        public Criteria andPowrIsNull() {
            addCriterion("powr is null");
            return (Criteria) this;
        }

        public Criteria andPowrIsNotNull() {
            addCriterion("powr is not null");
            return (Criteria) this;
        }

        public Criteria andPowrEqualTo(Float value) {
            addCriterion("powr =", value, "powr");
            return (Criteria) this;
        }

        public Criteria andPowrNotEqualTo(Float value) {
            addCriterion("powr <>", value, "powr");
            return (Criteria) this;
        }

        public Criteria andPowrGreaterThan(Float value) {
            addCriterion("powr >", value, "powr");
            return (Criteria) this;
        }

        public Criteria andPowrGreaterThanOrEqualTo(Float value) {
            addCriterion("powr >=", value, "powr");
            return (Criteria) this;
        }

        public Criteria andPowrLessThan(Float value) {
            addCriterion("powr <", value, "powr");
            return (Criteria) this;
        }

        public Criteria andPowrLessThanOrEqualTo(Float value) {
            addCriterion("powr <=", value, "powr");
            return (Criteria) this;
        }

        public Criteria andPowrIn(List<Float> values) {
            addCriterion("powr in", values, "powr");
            return (Criteria) this;
        }

        public Criteria andPowrNotIn(List<Float> values) {
            addCriterion("powr not in", values, "powr");
            return (Criteria) this;
        }

        public Criteria andPowrBetween(Float value1, Float value2) {
            addCriterion("powr between", value1, value2, "powr");
            return (Criteria) this;
        }

        public Criteria andPowrNotBetween(Float value1, Float value2) {
            addCriterion("powr not between", value1, value2, "powr");
            return (Criteria) this;
        }

        public Criteria andFactory_timIsNull() {
            addCriterion("factory_tim is null");
            return (Criteria) this;
        }

        public Criteria andFactory_timIsNotNull() {
            addCriterion("factory_tim is not null");
            return (Criteria) this;
        }

        public Criteria andFactory_timEqualTo(Date value) {
            addCriterion("factory_tim =", value, "factory_tim");
            return (Criteria) this;
        }

        public Criteria andFactory_timNotEqualTo(Date value) {
            addCriterion("factory_tim <>", value, "factory_tim");
            return (Criteria) this;
        }

        public Criteria andFactory_timGreaterThan(Date value) {
            addCriterion("factory_tim >", value, "factory_tim");
            return (Criteria) this;
        }

        public Criteria andFactory_timGreaterThanOrEqualTo(Date value) {
            addCriterion("factory_tim >=", value, "factory_tim");
            return (Criteria) this;
        }

        public Criteria andFactory_timLessThan(Date value) {
            addCriterion("factory_tim <", value, "factory_tim");
            return (Criteria) this;
        }

        public Criteria andFactory_timLessThanOrEqualTo(Date value) {
            addCriterion("factory_tim <=", value, "factory_tim");
            return (Criteria) this;
        }

        public Criteria andFactory_timIn(List<Date> values) {
            addCriterion("factory_tim in", values, "factory_tim");
            return (Criteria) this;
        }

        public Criteria andFactory_timNotIn(List<Date> values) {
            addCriterion("factory_tim not in", values, "factory_tim");
            return (Criteria) this;
        }

        public Criteria andFactory_timBetween(Date value1, Date value2) {
            addCriterion("factory_tim between", value1, value2, "factory_tim");
            return (Criteria) this;
        }

        public Criteria andFactory_timNotBetween(Date value1, Date value2) {
            addCriterion("factory_tim not between", value1, value2, "factory_tim");
            return (Criteria) this;
        }

        public Criteria andFactory_numIsNull() {
            addCriterion("factory_num is null");
            return (Criteria) this;
        }

        public Criteria andFactory_numIsNotNull() {
            addCriterion("factory_num is not null");
            return (Criteria) this;
        }

        public Criteria andFactory_numEqualTo(String value) {
            addCriterion("factory_num =", value, "factory_num");
            return (Criteria) this;
        }

        public Criteria andFactory_numNotEqualTo(String value) {
            addCriterion("factory_num <>", value, "factory_num");
            return (Criteria) this;
        }

        public Criteria andFactory_numGreaterThan(String value) {
            addCriterion("factory_num >", value, "factory_num");
            return (Criteria) this;
        }

        public Criteria andFactory_numGreaterThanOrEqualTo(String value) {
            addCriterion("factory_num >=", value, "factory_num");
            return (Criteria) this;
        }

        public Criteria andFactory_numLessThan(String value) {
            addCriterion("factory_num <", value, "factory_num");
            return (Criteria) this;
        }

        public Criteria andFactory_numLessThanOrEqualTo(String value) {
            addCriterion("factory_num <=", value, "factory_num");
            return (Criteria) this;
        }

        public Criteria andFactory_numLike(String value) {
            addCriterion("factory_num like", value, "factory_num");
            return (Criteria) this;
        }

        public Criteria andFactory_numNotLike(String value) {
            addCriterion("factory_num not like", value, "factory_num");
            return (Criteria) this;
        }

        public Criteria andFactory_numIn(List<String> values) {
            addCriterion("factory_num in", values, "factory_num");
            return (Criteria) this;
        }

        public Criteria andFactory_numNotIn(List<String> values) {
            addCriterion("factory_num not in", values, "factory_num");
            return (Criteria) this;
        }

        public Criteria andFactory_numBetween(String value1, String value2) {
            addCriterion("factory_num between", value1, value2, "factory_num");
            return (Criteria) this;
        }

        public Criteria andFactory_numNotBetween(String value1, String value2) {
            addCriterion("factory_num not between", value1, value2, "factory_num");
            return (Criteria) this;
        }

        public Criteria andFactory_namIsNull() {
            addCriterion("factory_nam is null");
            return (Criteria) this;
        }

        public Criteria andFactory_namIsNotNull() {
            addCriterion("factory_nam is not null");
            return (Criteria) this;
        }

        public Criteria andFactory_namEqualTo(String value) {
            addCriterion("factory_nam =", value, "factory_nam");
            return (Criteria) this;
        }

        public Criteria andFactory_namNotEqualTo(String value) {
            addCriterion("factory_nam <>", value, "factory_nam");
            return (Criteria) this;
        }

        public Criteria andFactory_namGreaterThan(String value) {
            addCriterion("factory_nam >", value, "factory_nam");
            return (Criteria) this;
        }

        public Criteria andFactory_namGreaterThanOrEqualTo(String value) {
            addCriterion("factory_nam >=", value, "factory_nam");
            return (Criteria) this;
        }

        public Criteria andFactory_namLessThan(String value) {
            addCriterion("factory_nam <", value, "factory_nam");
            return (Criteria) this;
        }

        public Criteria andFactory_namLessThanOrEqualTo(String value) {
            addCriterion("factory_nam <=", value, "factory_nam");
            return (Criteria) this;
        }

        public Criteria andFactory_namLike(String value) {
            addCriterion("factory_nam like", value, "factory_nam");
            return (Criteria) this;
        }

        public Criteria andFactory_namNotLike(String value) {
            addCriterion("factory_nam not like", value, "factory_nam");
            return (Criteria) this;
        }

        public Criteria andFactory_namIn(List<String> values) {
            addCriterion("factory_nam in", values, "factory_nam");
            return (Criteria) this;
        }

        public Criteria andFactory_namNotIn(List<String> values) {
            addCriterion("factory_nam not in", values, "factory_nam");
            return (Criteria) this;
        }

        public Criteria andFactory_namBetween(String value1, String value2) {
            addCriterion("factory_nam between", value1, value2, "factory_nam");
            return (Criteria) this;
        }

        public Criteria andFactory_namNotBetween(String value1, String value2) {
            addCriterion("factory_nam not between", value1, value2, "factory_nam");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
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