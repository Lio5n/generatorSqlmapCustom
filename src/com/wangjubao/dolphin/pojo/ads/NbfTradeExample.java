package com.wangjubao.dolphin.pojo.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NbfTradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NbfTradeExample() {
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

        public Criteria andAdsCreateTimeIsNull() {
            addCriterion("ads_create_time is null");
            return (Criteria) this;
        }

        public Criteria andAdsCreateTimeIsNotNull() {
            addCriterion("ads_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdsCreateTimeEqualTo(Date value) {
            addCriterion("ads_create_time =", value, "adsCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdsCreateTimeNotEqualTo(Date value) {
            addCriterion("ads_create_time <>", value, "adsCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdsCreateTimeGreaterThan(Date value) {
            addCriterion("ads_create_time >", value, "adsCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdsCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ads_create_time >=", value, "adsCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdsCreateTimeLessThan(Date value) {
            addCriterion("ads_create_time <", value, "adsCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdsCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ads_create_time <=", value, "adsCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdsCreateTimeIn(List<Date> values) {
            addCriterion("ads_create_time in", values, "adsCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdsCreateTimeNotIn(List<Date> values) {
            addCriterion("ads_create_time not in", values, "adsCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdsCreateTimeBetween(Date value1, Date value2) {
            addCriterion("ads_create_time between", value1, value2, "adsCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdsCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ads_create_time not between", value1, value2, "adsCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdsLastUpdateTimeIsNull() {
            addCriterion("ads_last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andAdsLastUpdateTimeIsNotNull() {
            addCriterion("ads_last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdsLastUpdateTimeEqualTo(Date value) {
            addCriterion("ads_last_update_time =", value, "adsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdsLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("ads_last_update_time <>", value, "adsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdsLastUpdateTimeGreaterThan(Date value) {
            addCriterion("ads_last_update_time >", value, "adsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdsLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ads_last_update_time >=", value, "adsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdsLastUpdateTimeLessThan(Date value) {
            addCriterion("ads_last_update_time <", value, "adsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdsLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ads_last_update_time <=", value, "adsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdsLastUpdateTimeIn(List<Date> values) {
            addCriterion("ads_last_update_time in", values, "adsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdsLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("ads_last_update_time not in", values, "adsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdsLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("ads_last_update_time between", value1, value2, "adsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdsLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ads_last_update_time not between", value1, value2, "adsLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Long value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Long value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Long value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Long value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Long value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Long> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Long> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Long value1, Long value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Long value1, Long value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageIsNull() {
            addCriterion("buyer_message is null");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageIsNotNull() {
            addCriterion("buyer_message is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageEqualTo(String value) {
            addCriterion("buyer_message =", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotEqualTo(String value) {
            addCriterion("buyer_message <>", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageGreaterThan(String value) {
            addCriterion("buyer_message >", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_message >=", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageLessThan(String value) {
            addCriterion("buyer_message <", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageLessThanOrEqualTo(String value) {
            addCriterion("buyer_message <=", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageLike(String value) {
            addCriterion("buyer_message like", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotLike(String value) {
            addCriterion("buyer_message not like", value, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageIn(List<String> values) {
            addCriterion("buyer_message in", values, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotIn(List<String> values) {
            addCriterion("buyer_message not in", values, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageBetween(String value1, String value2) {
            addCriterion("buyer_message between", value1, value2, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerMessageNotBetween(String value1, String value2) {
            addCriterion("buyer_message not between", value1, value2, "buyerMessage");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusIsNull() {
            addCriterion("buyer_rate_status is null");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusIsNotNull() {
            addCriterion("buyer_rate_status is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusEqualTo(String value) {
            addCriterion("buyer_rate_status =", value, "buyerRateStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusNotEqualTo(String value) {
            addCriterion("buyer_rate_status <>", value, "buyerRateStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusGreaterThan(String value) {
            addCriterion("buyer_rate_status >", value, "buyerRateStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_rate_status >=", value, "buyerRateStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusLessThan(String value) {
            addCriterion("buyer_rate_status <", value, "buyerRateStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusLessThanOrEqualTo(String value) {
            addCriterion("buyer_rate_status <=", value, "buyerRateStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusLike(String value) {
            addCriterion("buyer_rate_status like", value, "buyerRateStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusNotLike(String value) {
            addCriterion("buyer_rate_status not like", value, "buyerRateStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusIn(List<String> values) {
            addCriterion("buyer_rate_status in", values, "buyerRateStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusNotIn(List<String> values) {
            addCriterion("buyer_rate_status not in", values, "buyerRateStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusBetween(String value1, String value2) {
            addCriterion("buyer_rate_status between", value1, value2, "buyerRateStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerRateStatusNotBetween(String value1, String value2) {
            addCriterion("buyer_rate_status not between", value1, value2, "buyerRateStatus");
            return (Criteria) this;
        }

        public Criteria andConsignTimeIsNull() {
            addCriterion("consign_time is null");
            return (Criteria) this;
        }

        public Criteria andConsignTimeIsNotNull() {
            addCriterion("consign_time is not null");
            return (Criteria) this;
        }

        public Criteria andConsignTimeEqualTo(Date value) {
            addCriterion("consign_time =", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotEqualTo(Date value) {
            addCriterion("consign_time <>", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeGreaterThan(Date value) {
            addCriterion("consign_time >", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("consign_time >=", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeLessThan(Date value) {
            addCriterion("consign_time <", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeLessThanOrEqualTo(Date value) {
            addCriterion("consign_time <=", value, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeIn(List<Date> values) {
            addCriterion("consign_time in", values, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotIn(List<Date> values) {
            addCriterion("consign_time not in", values, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeBetween(Date value1, Date value2) {
            addCriterion("consign_time between", value1, value2, "consignTime");
            return (Criteria) this;
        }

        public Criteria andConsignTimeNotBetween(Date value1, Date value2) {
            addCriterion("consign_time not between", value1, value2, "consignTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(Double value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(Double value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(Double value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(Double value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(Double value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<Double> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<Double> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(Double value1, Double value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(Double value1, Double value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayWeekIsNull() {
            addCriterion("pay_week is null");
            return (Criteria) this;
        }

        public Criteria andPayWeekIsNotNull() {
            addCriterion("pay_week is not null");
            return (Criteria) this;
        }

        public Criteria andPayWeekEqualTo(Long value) {
            addCriterion("pay_week =", value, "payWeek");
            return (Criteria) this;
        }

        public Criteria andPayWeekNotEqualTo(Long value) {
            addCriterion("pay_week <>", value, "payWeek");
            return (Criteria) this;
        }

        public Criteria andPayWeekGreaterThan(Long value) {
            addCriterion("pay_week >", value, "payWeek");
            return (Criteria) this;
        }

        public Criteria andPayWeekGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_week >=", value, "payWeek");
            return (Criteria) this;
        }

        public Criteria andPayWeekLessThan(Long value) {
            addCriterion("pay_week <", value, "payWeek");
            return (Criteria) this;
        }

        public Criteria andPayWeekLessThanOrEqualTo(Long value) {
            addCriterion("pay_week <=", value, "payWeek");
            return (Criteria) this;
        }

        public Criteria andPayWeekIn(List<Long> values) {
            addCriterion("pay_week in", values, "payWeek");
            return (Criteria) this;
        }

        public Criteria andPayWeekNotIn(List<Long> values) {
            addCriterion("pay_week not in", values, "payWeek");
            return (Criteria) this;
        }

        public Criteria andPayWeekBetween(Long value1, Long value2) {
            addCriterion("pay_week between", value1, value2, "payWeek");
            return (Criteria) this;
        }

        public Criteria andPayWeekNotBetween(Long value1, Long value2) {
            addCriterion("pay_week not between", value1, value2, "payWeek");
            return (Criteria) this;
        }

        public Criteria andPostFeeIsNull() {
            addCriterion("post_fee is null");
            return (Criteria) this;
        }

        public Criteria andPostFeeIsNotNull() {
            addCriterion("post_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPostFeeEqualTo(Double value) {
            addCriterion("post_fee =", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotEqualTo(Double value) {
            addCriterion("post_fee <>", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThan(Double value) {
            addCriterion("post_fee >", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("post_fee >=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLessThan(Double value) {
            addCriterion("post_fee <", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLessThanOrEqualTo(Double value) {
            addCriterion("post_fee <=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeIn(List<Double> values) {
            addCriterion("post_fee in", values, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotIn(List<Double> values) {
            addCriterion("post_fee not in", values, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeBetween(Double value1, Double value2) {
            addCriterion("post_fee between", value1, value2, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotBetween(Double value1, Double value2) {
            addCriterion("post_fee not between", value1, value2, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostServiceIsNull() {
            addCriterion("post_service is null");
            return (Criteria) this;
        }

        public Criteria andPostServiceIsNotNull() {
            addCriterion("post_service is not null");
            return (Criteria) this;
        }

        public Criteria andPostServiceEqualTo(String value) {
            addCriterion("post_service =", value, "postService");
            return (Criteria) this;
        }

        public Criteria andPostServiceNotEqualTo(String value) {
            addCriterion("post_service <>", value, "postService");
            return (Criteria) this;
        }

        public Criteria andPostServiceGreaterThan(String value) {
            addCriterion("post_service >", value, "postService");
            return (Criteria) this;
        }

        public Criteria andPostServiceGreaterThanOrEqualTo(String value) {
            addCriterion("post_service >=", value, "postService");
            return (Criteria) this;
        }

        public Criteria andPostServiceLessThan(String value) {
            addCriterion("post_service <", value, "postService");
            return (Criteria) this;
        }

        public Criteria andPostServiceLessThanOrEqualTo(String value) {
            addCriterion("post_service <=", value, "postService");
            return (Criteria) this;
        }

        public Criteria andPostServiceLike(String value) {
            addCriterion("post_service like", value, "postService");
            return (Criteria) this;
        }

        public Criteria andPostServiceNotLike(String value) {
            addCriterion("post_service not like", value, "postService");
            return (Criteria) this;
        }

        public Criteria andPostServiceIn(List<String> values) {
            addCriterion("post_service in", values, "postService");
            return (Criteria) this;
        }

        public Criteria andPostServiceNotIn(List<String> values) {
            addCriterion("post_service not in", values, "postService");
            return (Criteria) this;
        }

        public Criteria andPostServiceBetween(String value1, String value2) {
            addCriterion("post_service between", value1, value2, "postService");
            return (Criteria) this;
        }

        public Criteria andPostServiceNotBetween(String value1, String value2) {
            addCriterion("post_service not between", value1, value2, "postService");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsIsNull() {
            addCriterion("promotion_details is null");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsIsNotNull() {
            addCriterion("promotion_details is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsEqualTo(String value) {
            addCriterion("promotion_details =", value, "promotionDetails");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsNotEqualTo(String value) {
            addCriterion("promotion_details <>", value, "promotionDetails");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsGreaterThan(String value) {
            addCriterion("promotion_details >", value, "promotionDetails");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_details >=", value, "promotionDetails");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsLessThan(String value) {
            addCriterion("promotion_details <", value, "promotionDetails");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsLessThanOrEqualTo(String value) {
            addCriterion("promotion_details <=", value, "promotionDetails");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsLike(String value) {
            addCriterion("promotion_details like", value, "promotionDetails");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsNotLike(String value) {
            addCriterion("promotion_details not like", value, "promotionDetails");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsIn(List<String> values) {
            addCriterion("promotion_details in", values, "promotionDetails");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsNotIn(List<String> values) {
            addCriterion("promotion_details not in", values, "promotionDetails");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsBetween(String value1, String value2) {
            addCriterion("promotion_details between", value1, value2, "promotionDetails");
            return (Criteria) this;
        }

        public Criteria andPromotionDetailsNotBetween(String value1, String value2) {
            addCriterion("promotion_details not between", value1, value2, "promotionDetails");
            return (Criteria) this;
        }

        public Criteria andSellerFlagIsNull() {
            addCriterion("seller_flag is null");
            return (Criteria) this;
        }

        public Criteria andSellerFlagIsNotNull() {
            addCriterion("seller_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSellerFlagEqualTo(Long value) {
            addCriterion("seller_flag =", value, "sellerFlag");
            return (Criteria) this;
        }

        public Criteria andSellerFlagNotEqualTo(Long value) {
            addCriterion("seller_flag <>", value, "sellerFlag");
            return (Criteria) this;
        }

        public Criteria andSellerFlagGreaterThan(Long value) {
            addCriterion("seller_flag >", value, "sellerFlag");
            return (Criteria) this;
        }

        public Criteria andSellerFlagGreaterThanOrEqualTo(Long value) {
            addCriterion("seller_flag >=", value, "sellerFlag");
            return (Criteria) this;
        }

        public Criteria andSellerFlagLessThan(Long value) {
            addCriterion("seller_flag <", value, "sellerFlag");
            return (Criteria) this;
        }

        public Criteria andSellerFlagLessThanOrEqualTo(Long value) {
            addCriterion("seller_flag <=", value, "sellerFlag");
            return (Criteria) this;
        }

        public Criteria andSellerFlagIn(List<Long> values) {
            addCriterion("seller_flag in", values, "sellerFlag");
            return (Criteria) this;
        }

        public Criteria andSellerFlagNotIn(List<Long> values) {
            addCriterion("seller_flag not in", values, "sellerFlag");
            return (Criteria) this;
        }

        public Criteria andSellerFlagBetween(Long value1, Long value2) {
            addCriterion("seller_flag between", value1, value2, "sellerFlag");
            return (Criteria) this;
        }

        public Criteria andSellerFlagNotBetween(Long value1, Long value2) {
            addCriterion("seller_flag not between", value1, value2, "sellerFlag");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Long value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Long value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Long value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Long value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Long> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Long> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Long value1, Long value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Long value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Long value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Long value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Long value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Long value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Long> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Long> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Long value1, Long value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Long value1, Long value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusIsNull() {
            addCriterion("step_trade_status is null");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusIsNotNull() {
            addCriterion("step_trade_status is not null");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusEqualTo(String value) {
            addCriterion("step_trade_status =", value, "stepTradeStatus");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusNotEqualTo(String value) {
            addCriterion("step_trade_status <>", value, "stepTradeStatus");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusGreaterThan(String value) {
            addCriterion("step_trade_status >", value, "stepTradeStatus");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("step_trade_status >=", value, "stepTradeStatus");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusLessThan(String value) {
            addCriterion("step_trade_status <", value, "stepTradeStatus");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusLessThanOrEqualTo(String value) {
            addCriterion("step_trade_status <=", value, "stepTradeStatus");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusLike(String value) {
            addCriterion("step_trade_status like", value, "stepTradeStatus");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusNotLike(String value) {
            addCriterion("step_trade_status not like", value, "stepTradeStatus");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusIn(List<String> values) {
            addCriterion("step_trade_status in", values, "stepTradeStatus");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusNotIn(List<String> values) {
            addCriterion("step_trade_status not in", values, "stepTradeStatus");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusBetween(String value1, String value2) {
            addCriterion("step_trade_status between", value1, value2, "stepTradeStatus");
            return (Criteria) this;
        }

        public Criteria andStepTradeStatusNotBetween(String value1, String value2) {
            addCriterion("step_trade_status not between", value1, value2, "stepTradeStatus");
            return (Criteria) this;
        }

        public Criteria andTradeFromIsNull() {
            addCriterion("trade_from is null");
            return (Criteria) this;
        }

        public Criteria andTradeFromIsNotNull() {
            addCriterion("trade_from is not null");
            return (Criteria) this;
        }

        public Criteria andTradeFromEqualTo(String value) {
            addCriterion("trade_from =", value, "tradeFrom");
            return (Criteria) this;
        }

        public Criteria andTradeFromNotEqualTo(String value) {
            addCriterion("trade_from <>", value, "tradeFrom");
            return (Criteria) this;
        }

        public Criteria andTradeFromGreaterThan(String value) {
            addCriterion("trade_from >", value, "tradeFrom");
            return (Criteria) this;
        }

        public Criteria andTradeFromGreaterThanOrEqualTo(String value) {
            addCriterion("trade_from >=", value, "tradeFrom");
            return (Criteria) this;
        }

        public Criteria andTradeFromLessThan(String value) {
            addCriterion("trade_from <", value, "tradeFrom");
            return (Criteria) this;
        }

        public Criteria andTradeFromLessThanOrEqualTo(String value) {
            addCriterion("trade_from <=", value, "tradeFrom");
            return (Criteria) this;
        }

        public Criteria andTradeFromLike(String value) {
            addCriterion("trade_from like", value, "tradeFrom");
            return (Criteria) this;
        }

        public Criteria andTradeFromNotLike(String value) {
            addCriterion("trade_from not like", value, "tradeFrom");
            return (Criteria) this;
        }

        public Criteria andTradeFromIn(List<String> values) {
            addCriterion("trade_from in", values, "tradeFrom");
            return (Criteria) this;
        }

        public Criteria andTradeFromNotIn(List<String> values) {
            addCriterion("trade_from not in", values, "tradeFrom");
            return (Criteria) this;
        }

        public Criteria andTradeFromBetween(String value1, String value2) {
            addCriterion("trade_from between", value1, value2, "tradeFrom");
            return (Criteria) this;
        }

        public Criteria andTradeFromNotBetween(String value1, String value2) {
            addCriterion("trade_from not between", value1, value2, "tradeFrom");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNull() {
            addCriterion("trade_id is null");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNotNull() {
            addCriterion("trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradeIdEqualTo(Long value) {
            addCriterion("trade_id =", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotEqualTo(Long value) {
            addCriterion("trade_id <>", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThan(Long value) {
            addCriterion("trade_id >", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trade_id >=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThan(Long value) {
            addCriterion("trade_id <", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThanOrEqualTo(Long value) {
            addCriterion("trade_id <=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdIn(List<Long> values) {
            addCriterion("trade_id in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotIn(List<Long> values) {
            addCriterion("trade_id not in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdBetween(Long value1, Long value2) {
            addCriterion("trade_id between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotBetween(Long value1, Long value2) {
            addCriterion("trade_id not between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeNoteIsNull() {
            addCriterion("trade_note is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoteIsNotNull() {
            addCriterion("trade_note is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoteEqualTo(String value) {
            addCriterion("trade_note =", value, "tradeNote");
            return (Criteria) this;
        }

        public Criteria andTradeNoteNotEqualTo(String value) {
            addCriterion("trade_note <>", value, "tradeNote");
            return (Criteria) this;
        }

        public Criteria andTradeNoteGreaterThan(String value) {
            addCriterion("trade_note >", value, "tradeNote");
            return (Criteria) this;
        }

        public Criteria andTradeNoteGreaterThanOrEqualTo(String value) {
            addCriterion("trade_note >=", value, "tradeNote");
            return (Criteria) this;
        }

        public Criteria andTradeNoteLessThan(String value) {
            addCriterion("trade_note <", value, "tradeNote");
            return (Criteria) this;
        }

        public Criteria andTradeNoteLessThanOrEqualTo(String value) {
            addCriterion("trade_note <=", value, "tradeNote");
            return (Criteria) this;
        }

        public Criteria andTradeNoteLike(String value) {
            addCriterion("trade_note like", value, "tradeNote");
            return (Criteria) this;
        }

        public Criteria andTradeNoteNotLike(String value) {
            addCriterion("trade_note not like", value, "tradeNote");
            return (Criteria) this;
        }

        public Criteria andTradeNoteIn(List<String> values) {
            addCriterion("trade_note in", values, "tradeNote");
            return (Criteria) this;
        }

        public Criteria andTradeNoteNotIn(List<String> values) {
            addCriterion("trade_note not in", values, "tradeNote");
            return (Criteria) this;
        }

        public Criteria andTradeNoteBetween(String value1, String value2) {
            addCriterion("trade_note between", value1, value2, "tradeNote");
            return (Criteria) this;
        }

        public Criteria andTradeNoteNotBetween(String value1, String value2) {
            addCriterion("trade_note not between", value1, value2, "tradeNote");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("trade_type like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("trade_type not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andWjbCreateTimeIsNull() {
            addCriterion("wjb_create_time is null");
            return (Criteria) this;
        }

        public Criteria andWjbCreateTimeIsNotNull() {
            addCriterion("wjb_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andWjbCreateTimeEqualTo(Date value) {
            addCriterion("wjb_create_time =", value, "wjbCreateTime");
            return (Criteria) this;
        }

        public Criteria andWjbCreateTimeNotEqualTo(Date value) {
            addCriterion("wjb_create_time <>", value, "wjbCreateTime");
            return (Criteria) this;
        }

        public Criteria andWjbCreateTimeGreaterThan(Date value) {
            addCriterion("wjb_create_time >", value, "wjbCreateTime");
            return (Criteria) this;
        }

        public Criteria andWjbCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("wjb_create_time >=", value, "wjbCreateTime");
            return (Criteria) this;
        }

        public Criteria andWjbCreateTimeLessThan(Date value) {
            addCriterion("wjb_create_time <", value, "wjbCreateTime");
            return (Criteria) this;
        }

        public Criteria andWjbCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("wjb_create_time <=", value, "wjbCreateTime");
            return (Criteria) this;
        }

        public Criteria andWjbCreateTimeIn(List<Date> values) {
            addCriterion("wjb_create_time in", values, "wjbCreateTime");
            return (Criteria) this;
        }

        public Criteria andWjbCreateTimeNotIn(List<Date> values) {
            addCriterion("wjb_create_time not in", values, "wjbCreateTime");
            return (Criteria) this;
        }

        public Criteria andWjbCreateTimeBetween(Date value1, Date value2) {
            addCriterion("wjb_create_time between", value1, value2, "wjbCreateTime");
            return (Criteria) this;
        }

        public Criteria andWjbCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("wjb_create_time not between", value1, value2, "wjbCreateTime");
            return (Criteria) this;
        }

        public Criteria andWjbLastUpdateTimeIsNull() {
            addCriterion("wjb_last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andWjbLastUpdateTimeIsNotNull() {
            addCriterion("wjb_last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andWjbLastUpdateTimeEqualTo(Date value) {
            addCriterion("wjb_last_update_time =", value, "wjbLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWjbLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("wjb_last_update_time <>", value, "wjbLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWjbLastUpdateTimeGreaterThan(Date value) {
            addCriterion("wjb_last_update_time >", value, "wjbLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWjbLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("wjb_last_update_time >=", value, "wjbLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWjbLastUpdateTimeLessThan(Date value) {
            addCriterion("wjb_last_update_time <", value, "wjbLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWjbLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("wjb_last_update_time <=", value, "wjbLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWjbLastUpdateTimeIn(List<Date> values) {
            addCriterion("wjb_last_update_time in", values, "wjbLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWjbLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("wjb_last_update_time not in", values, "wjbLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWjbLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("wjb_last_update_time between", value1, value2, "wjbLastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andWjbLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("wjb_last_update_time not between", value1, value2, "wjbLastUpdateTime");
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