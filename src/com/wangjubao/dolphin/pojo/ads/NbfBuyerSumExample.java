package com.wangjubao.dolphin.pojo.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NbfBuyerSumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NbfBuyerSumExample() {
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

        public Criteria andAvgBuyerPaymentIsNull() {
            addCriterion("avg_buyer_payment is null");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentIsNotNull() {
            addCriterion("avg_buyer_payment is not null");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentEqualTo(Double value) {
            addCriterion("avg_buyer_payment =", value, "avgBuyerPayment");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNotEqualTo(Double value) {
            addCriterion("avg_buyer_payment <>", value, "avgBuyerPayment");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentGreaterThan(Double value) {
            addCriterion("avg_buyer_payment >", value, "avgBuyerPayment");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_buyer_payment >=", value, "avgBuyerPayment");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentLessThan(Double value) {
            addCriterion("avg_buyer_payment <", value, "avgBuyerPayment");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentLessThanOrEqualTo(Double value) {
            addCriterion("avg_buyer_payment <=", value, "avgBuyerPayment");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentIn(List<Double> values) {
            addCriterion("avg_buyer_payment in", values, "avgBuyerPayment");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNotIn(List<Double> values) {
            addCriterion("avg_buyer_payment not in", values, "avgBuyerPayment");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentBetween(Double value1, Double value2) {
            addCriterion("avg_buyer_payment between", value1, value2, "avgBuyerPayment");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNotBetween(Double value1, Double value2) {
            addCriterion("avg_buyer_payment not between", value1, value2, "avgBuyerPayment");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNoPostFeeIsNull() {
            addCriterion("avg_buyer_payment_no_post_fee is null");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNoPostFeeIsNotNull() {
            addCriterion("avg_buyer_payment_no_post_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNoPostFeeEqualTo(Double value) {
            addCriterion("avg_buyer_payment_no_post_fee =", value, "avgBuyerPaymentNoPostFee");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNoPostFeeNotEqualTo(Double value) {
            addCriterion("avg_buyer_payment_no_post_fee <>", value, "avgBuyerPaymentNoPostFee");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNoPostFeeGreaterThan(Double value) {
            addCriterion("avg_buyer_payment_no_post_fee >", value, "avgBuyerPaymentNoPostFee");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNoPostFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_buyer_payment_no_post_fee >=", value, "avgBuyerPaymentNoPostFee");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNoPostFeeLessThan(Double value) {
            addCriterion("avg_buyer_payment_no_post_fee <", value, "avgBuyerPaymentNoPostFee");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNoPostFeeLessThanOrEqualTo(Double value) {
            addCriterion("avg_buyer_payment_no_post_fee <=", value, "avgBuyerPaymentNoPostFee");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNoPostFeeIn(List<Double> values) {
            addCriterion("avg_buyer_payment_no_post_fee in", values, "avgBuyerPaymentNoPostFee");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNoPostFeeNotIn(List<Double> values) {
            addCriterion("avg_buyer_payment_no_post_fee not in", values, "avgBuyerPaymentNoPostFee");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNoPostFeeBetween(Double value1, Double value2) {
            addCriterion("avg_buyer_payment_no_post_fee between", value1, value2, "avgBuyerPaymentNoPostFee");
            return (Criteria) this;
        }

        public Criteria andAvgBuyerPaymentNoPostFeeNotBetween(Double value1, Double value2) {
            addCriterion("avg_buyer_payment_no_post_fee not between", value1, value2, "avgBuyerPaymentNoPostFee");
            return (Criteria) this;
        }

        public Criteria andAvgItemPaymentIsNull() {
            addCriterion("avg_item_payment is null");
            return (Criteria) this;
        }

        public Criteria andAvgItemPaymentIsNotNull() {
            addCriterion("avg_item_payment is not null");
            return (Criteria) this;
        }

        public Criteria andAvgItemPaymentEqualTo(Double value) {
            addCriterion("avg_item_payment =", value, "avgItemPayment");
            return (Criteria) this;
        }

        public Criteria andAvgItemPaymentNotEqualTo(Double value) {
            addCriterion("avg_item_payment <>", value, "avgItemPayment");
            return (Criteria) this;
        }

        public Criteria andAvgItemPaymentGreaterThan(Double value) {
            addCriterion("avg_item_payment >", value, "avgItemPayment");
            return (Criteria) this;
        }

        public Criteria andAvgItemPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("avg_item_payment >=", value, "avgItemPayment");
            return (Criteria) this;
        }

        public Criteria andAvgItemPaymentLessThan(Double value) {
            addCriterion("avg_item_payment <", value, "avgItemPayment");
            return (Criteria) this;
        }

        public Criteria andAvgItemPaymentLessThanOrEqualTo(Double value) {
            addCriterion("avg_item_payment <=", value, "avgItemPayment");
            return (Criteria) this;
        }

        public Criteria andAvgItemPaymentIn(List<Double> values) {
            addCriterion("avg_item_payment in", values, "avgItemPayment");
            return (Criteria) this;
        }

        public Criteria andAvgItemPaymentNotIn(List<Double> values) {
            addCriterion("avg_item_payment not in", values, "avgItemPayment");
            return (Criteria) this;
        }

        public Criteria andAvgItemPaymentBetween(Double value1, Double value2) {
            addCriterion("avg_item_payment between", value1, value2, "avgItemPayment");
            return (Criteria) this;
        }

        public Criteria andAvgItemPaymentNotBetween(Double value1, Double value2) {
            addCriterion("avg_item_payment not between", value1, value2, "avgItemPayment");
            return (Criteria) this;
        }

        public Criteria andBadRateNumIsNull() {
            addCriterion("bad_rate_num is null");
            return (Criteria) this;
        }

        public Criteria andBadRateNumIsNotNull() {
            addCriterion("bad_rate_num is not null");
            return (Criteria) this;
        }

        public Criteria andBadRateNumEqualTo(Long value) {
            addCriterion("bad_rate_num =", value, "badRateNum");
            return (Criteria) this;
        }

        public Criteria andBadRateNumNotEqualTo(Long value) {
            addCriterion("bad_rate_num <>", value, "badRateNum");
            return (Criteria) this;
        }

        public Criteria andBadRateNumGreaterThan(Long value) {
            addCriterion("bad_rate_num >", value, "badRateNum");
            return (Criteria) this;
        }

        public Criteria andBadRateNumGreaterThanOrEqualTo(Long value) {
            addCriterion("bad_rate_num >=", value, "badRateNum");
            return (Criteria) this;
        }

        public Criteria andBadRateNumLessThan(Long value) {
            addCriterion("bad_rate_num <", value, "badRateNum");
            return (Criteria) this;
        }

        public Criteria andBadRateNumLessThanOrEqualTo(Long value) {
            addCriterion("bad_rate_num <=", value, "badRateNum");
            return (Criteria) this;
        }

        public Criteria andBadRateNumIn(List<Long> values) {
            addCriterion("bad_rate_num in", values, "badRateNum");
            return (Criteria) this;
        }

        public Criteria andBadRateNumNotIn(List<Long> values) {
            addCriterion("bad_rate_num not in", values, "badRateNum");
            return (Criteria) this;
        }

        public Criteria andBadRateNumBetween(Long value1, Long value2) {
            addCriterion("bad_rate_num between", value1, value2, "badRateNum");
            return (Criteria) this;
        }

        public Criteria andBadRateNumNotBetween(Long value1, Long value2) {
            addCriterion("bad_rate_num not between", value1, value2, "badRateNum");
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

        public Criteria andFirstBuyItemIsNull() {
            addCriterion("first_buy_item is null");
            return (Criteria) this;
        }

        public Criteria andFirstBuyItemIsNotNull() {
            addCriterion("first_buy_item is not null");
            return (Criteria) this;
        }

        public Criteria andFirstBuyItemEqualTo(Long value) {
            addCriterion("first_buy_item =", value, "firstBuyItem");
            return (Criteria) this;
        }

        public Criteria andFirstBuyItemNotEqualTo(Long value) {
            addCriterion("first_buy_item <>", value, "firstBuyItem");
            return (Criteria) this;
        }

        public Criteria andFirstBuyItemGreaterThan(Long value) {
            addCriterion("first_buy_item >", value, "firstBuyItem");
            return (Criteria) this;
        }

        public Criteria andFirstBuyItemGreaterThanOrEqualTo(Long value) {
            addCriterion("first_buy_item >=", value, "firstBuyItem");
            return (Criteria) this;
        }

        public Criteria andFirstBuyItemLessThan(Long value) {
            addCriterion("first_buy_item <", value, "firstBuyItem");
            return (Criteria) this;
        }

        public Criteria andFirstBuyItemLessThanOrEqualTo(Long value) {
            addCriterion("first_buy_item <=", value, "firstBuyItem");
            return (Criteria) this;
        }

        public Criteria andFirstBuyItemIn(List<Long> values) {
            addCriterion("first_buy_item in", values, "firstBuyItem");
            return (Criteria) this;
        }

        public Criteria andFirstBuyItemNotIn(List<Long> values) {
            addCriterion("first_buy_item not in", values, "firstBuyItem");
            return (Criteria) this;
        }

        public Criteria andFirstBuyItemBetween(Long value1, Long value2) {
            addCriterion("first_buy_item between", value1, value2, "firstBuyItem");
            return (Criteria) this;
        }

        public Criteria andFirstBuyItemNotBetween(Long value1, Long value2) {
            addCriterion("first_buy_item not between", value1, value2, "firstBuyItem");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeIsNull() {
            addCriterion("first_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeIsNotNull() {
            addCriterion("first_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeEqualTo(Date value) {
            addCriterion("first_pay_time =", value, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeNotEqualTo(Date value) {
            addCriterion("first_pay_time <>", value, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeGreaterThan(Date value) {
            addCriterion("first_pay_time >", value, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_pay_time >=", value, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeLessThan(Date value) {
            addCriterion("first_pay_time <", value, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_pay_time <=", value, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeIn(List<Date> values) {
            addCriterion("first_pay_time in", values, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeNotIn(List<Date> values) {
            addCriterion("first_pay_time not in", values, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeBetween(Date value1, Date value2) {
            addCriterion("first_pay_time between", value1, value2, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andFirstPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_pay_time not between", value1, value2, "firstPayTime");
            return (Criteria) this;
        }

        public Criteria andGoodRateNumIsNull() {
            addCriterion("good_rate_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodRateNumIsNotNull() {
            addCriterion("good_rate_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodRateNumEqualTo(Long value) {
            addCriterion("good_rate_num =", value, "goodRateNum");
            return (Criteria) this;
        }

        public Criteria andGoodRateNumNotEqualTo(Long value) {
            addCriterion("good_rate_num <>", value, "goodRateNum");
            return (Criteria) this;
        }

        public Criteria andGoodRateNumGreaterThan(Long value) {
            addCriterion("good_rate_num >", value, "goodRateNum");
            return (Criteria) this;
        }

        public Criteria andGoodRateNumGreaterThanOrEqualTo(Long value) {
            addCriterion("good_rate_num >=", value, "goodRateNum");
            return (Criteria) this;
        }

        public Criteria andGoodRateNumLessThan(Long value) {
            addCriterion("good_rate_num <", value, "goodRateNum");
            return (Criteria) this;
        }

        public Criteria andGoodRateNumLessThanOrEqualTo(Long value) {
            addCriterion("good_rate_num <=", value, "goodRateNum");
            return (Criteria) this;
        }

        public Criteria andGoodRateNumIn(List<Long> values) {
            addCriterion("good_rate_num in", values, "goodRateNum");
            return (Criteria) this;
        }

        public Criteria andGoodRateNumNotIn(List<Long> values) {
            addCriterion("good_rate_num not in", values, "goodRateNum");
            return (Criteria) this;
        }

        public Criteria andGoodRateNumBetween(Long value1, Long value2) {
            addCriterion("good_rate_num between", value1, value2, "goodRateNum");
            return (Criteria) this;
        }

        public Criteria andGoodRateNumNotBetween(Long value1, Long value2) {
            addCriterion("good_rate_num not between", value1, value2, "goodRateNum");
            return (Criteria) this;
        }

        public Criteria andLastBuyItemIsNull() {
            addCriterion("last_buy_item is null");
            return (Criteria) this;
        }

        public Criteria andLastBuyItemIsNotNull() {
            addCriterion("last_buy_item is not null");
            return (Criteria) this;
        }

        public Criteria andLastBuyItemEqualTo(Long value) {
            addCriterion("last_buy_item =", value, "lastBuyItem");
            return (Criteria) this;
        }

        public Criteria andLastBuyItemNotEqualTo(Long value) {
            addCriterion("last_buy_item <>", value, "lastBuyItem");
            return (Criteria) this;
        }

        public Criteria andLastBuyItemGreaterThan(Long value) {
            addCriterion("last_buy_item >", value, "lastBuyItem");
            return (Criteria) this;
        }

        public Criteria andLastBuyItemGreaterThanOrEqualTo(Long value) {
            addCriterion("last_buy_item >=", value, "lastBuyItem");
            return (Criteria) this;
        }

        public Criteria andLastBuyItemLessThan(Long value) {
            addCriterion("last_buy_item <", value, "lastBuyItem");
            return (Criteria) this;
        }

        public Criteria andLastBuyItemLessThanOrEqualTo(Long value) {
            addCriterion("last_buy_item <=", value, "lastBuyItem");
            return (Criteria) this;
        }

        public Criteria andLastBuyItemIn(List<Long> values) {
            addCriterion("last_buy_item in", values, "lastBuyItem");
            return (Criteria) this;
        }

        public Criteria andLastBuyItemNotIn(List<Long> values) {
            addCriterion("last_buy_item not in", values, "lastBuyItem");
            return (Criteria) this;
        }

        public Criteria andLastBuyItemBetween(Long value1, Long value2) {
            addCriterion("last_buy_item between", value1, value2, "lastBuyItem");
            return (Criteria) this;
        }

        public Criteria andLastBuyItemNotBetween(Long value1, Long value2) {
            addCriterion("last_buy_item not between", value1, value2, "lastBuyItem");
            return (Criteria) this;
        }

        public Criteria andLastMailTimeIsNull() {
            addCriterion("last_mail_time is null");
            return (Criteria) this;
        }

        public Criteria andLastMailTimeIsNotNull() {
            addCriterion("last_mail_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastMailTimeEqualTo(Date value) {
            addCriterion("last_mail_time =", value, "lastMailTime");
            return (Criteria) this;
        }

        public Criteria andLastMailTimeNotEqualTo(Date value) {
            addCriterion("last_mail_time <>", value, "lastMailTime");
            return (Criteria) this;
        }

        public Criteria andLastMailTimeGreaterThan(Date value) {
            addCriterion("last_mail_time >", value, "lastMailTime");
            return (Criteria) this;
        }

        public Criteria andLastMailTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_mail_time >=", value, "lastMailTime");
            return (Criteria) this;
        }

        public Criteria andLastMailTimeLessThan(Date value) {
            addCriterion("last_mail_time <", value, "lastMailTime");
            return (Criteria) this;
        }

        public Criteria andLastMailTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_mail_time <=", value, "lastMailTime");
            return (Criteria) this;
        }

        public Criteria andLastMailTimeIn(List<Date> values) {
            addCriterion("last_mail_time in", values, "lastMailTime");
            return (Criteria) this;
        }

        public Criteria andLastMailTimeNotIn(List<Date> values) {
            addCriterion("last_mail_time not in", values, "lastMailTime");
            return (Criteria) this;
        }

        public Criteria andLastMailTimeBetween(Date value1, Date value2) {
            addCriterion("last_mail_time between", value1, value2, "lastMailTime");
            return (Criteria) this;
        }

        public Criteria andLastMailTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_mail_time not between", value1, value2, "lastMailTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeIsNull() {
            addCriterion("last_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeIsNotNull() {
            addCriterion("last_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeEqualTo(Date value) {
            addCriterion("last_pay_time =", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeNotEqualTo(Date value) {
            addCriterion("last_pay_time <>", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeGreaterThan(Date value) {
            addCriterion("last_pay_time >", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_pay_time >=", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeLessThan(Date value) {
            addCriterion("last_pay_time <", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_pay_time <=", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeIn(List<Date> values) {
            addCriterion("last_pay_time in", values, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeNotIn(List<Date> values) {
            addCriterion("last_pay_time not in", values, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeBetween(Date value1, Date value2) {
            addCriterion("last_pay_time between", value1, value2, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_pay_time not between", value1, value2, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastSmsTimeIsNull() {
            addCriterion("last_sms_time is null");
            return (Criteria) this;
        }

        public Criteria andLastSmsTimeIsNotNull() {
            addCriterion("last_sms_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastSmsTimeEqualTo(Date value) {
            addCriterion("last_sms_time =", value, "lastSmsTime");
            return (Criteria) this;
        }

        public Criteria andLastSmsTimeNotEqualTo(Date value) {
            addCriterion("last_sms_time <>", value, "lastSmsTime");
            return (Criteria) this;
        }

        public Criteria andLastSmsTimeGreaterThan(Date value) {
            addCriterion("last_sms_time >", value, "lastSmsTime");
            return (Criteria) this;
        }

        public Criteria andLastSmsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_sms_time >=", value, "lastSmsTime");
            return (Criteria) this;
        }

        public Criteria andLastSmsTimeLessThan(Date value) {
            addCriterion("last_sms_time <", value, "lastSmsTime");
            return (Criteria) this;
        }

        public Criteria andLastSmsTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_sms_time <=", value, "lastSmsTime");
            return (Criteria) this;
        }

        public Criteria andLastSmsTimeIn(List<Date> values) {
            addCriterion("last_sms_time in", values, "lastSmsTime");
            return (Criteria) this;
        }

        public Criteria andLastSmsTimeNotIn(List<Date> values) {
            addCriterion("last_sms_time not in", values, "lastSmsTime");
            return (Criteria) this;
        }

        public Criteria andLastSmsTimeBetween(Date value1, Date value2) {
            addCriterion("last_sms_time between", value1, value2, "lastSmsTime");
            return (Criteria) this;
        }

        public Criteria andLastSmsTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_sms_time not between", value1, value2, "lastSmsTime");
            return (Criteria) this;
        }

        public Criteria andNeutralRateNumIsNull() {
            addCriterion("neutral_rate_num is null");
            return (Criteria) this;
        }

        public Criteria andNeutralRateNumIsNotNull() {
            addCriterion("neutral_rate_num is not null");
            return (Criteria) this;
        }

        public Criteria andNeutralRateNumEqualTo(Long value) {
            addCriterion("neutral_rate_num =", value, "neutralRateNum");
            return (Criteria) this;
        }

        public Criteria andNeutralRateNumNotEqualTo(Long value) {
            addCriterion("neutral_rate_num <>", value, "neutralRateNum");
            return (Criteria) this;
        }

        public Criteria andNeutralRateNumGreaterThan(Long value) {
            addCriterion("neutral_rate_num >", value, "neutralRateNum");
            return (Criteria) this;
        }

        public Criteria andNeutralRateNumGreaterThanOrEqualTo(Long value) {
            addCriterion("neutral_rate_num >=", value, "neutralRateNum");
            return (Criteria) this;
        }

        public Criteria andNeutralRateNumLessThan(Long value) {
            addCriterion("neutral_rate_num <", value, "neutralRateNum");
            return (Criteria) this;
        }

        public Criteria andNeutralRateNumLessThanOrEqualTo(Long value) {
            addCriterion("neutral_rate_num <=", value, "neutralRateNum");
            return (Criteria) this;
        }

        public Criteria andNeutralRateNumIn(List<Long> values) {
            addCriterion("neutral_rate_num in", values, "neutralRateNum");
            return (Criteria) this;
        }

        public Criteria andNeutralRateNumNotIn(List<Long> values) {
            addCriterion("neutral_rate_num not in", values, "neutralRateNum");
            return (Criteria) this;
        }

        public Criteria andNeutralRateNumBetween(Long value1, Long value2) {
            addCriterion("neutral_rate_num between", value1, value2, "neutralRateNum");
            return (Criteria) this;
        }

        public Criteria andNeutralRateNumNotBetween(Long value1, Long value2) {
            addCriterion("neutral_rate_num not between", value1, value2, "neutralRateNum");
            return (Criteria) this;
        }

        public Criteria andNonPaymentTradesIsNull() {
            addCriterion("non_payment_trades is null");
            return (Criteria) this;
        }

        public Criteria andNonPaymentTradesIsNotNull() {
            addCriterion("non_payment_trades is not null");
            return (Criteria) this;
        }

        public Criteria andNonPaymentTradesEqualTo(Long value) {
            addCriterion("non_payment_trades =", value, "nonPaymentTrades");
            return (Criteria) this;
        }

        public Criteria andNonPaymentTradesNotEqualTo(Long value) {
            addCriterion("non_payment_trades <>", value, "nonPaymentTrades");
            return (Criteria) this;
        }

        public Criteria andNonPaymentTradesGreaterThan(Long value) {
            addCriterion("non_payment_trades >", value, "nonPaymentTrades");
            return (Criteria) this;
        }

        public Criteria andNonPaymentTradesGreaterThanOrEqualTo(Long value) {
            addCriterion("non_payment_trades >=", value, "nonPaymentTrades");
            return (Criteria) this;
        }

        public Criteria andNonPaymentTradesLessThan(Long value) {
            addCriterion("non_payment_trades <", value, "nonPaymentTrades");
            return (Criteria) this;
        }

        public Criteria andNonPaymentTradesLessThanOrEqualTo(Long value) {
            addCriterion("non_payment_trades <=", value, "nonPaymentTrades");
            return (Criteria) this;
        }

        public Criteria andNonPaymentTradesIn(List<Long> values) {
            addCriterion("non_payment_trades in", values, "nonPaymentTrades");
            return (Criteria) this;
        }

        public Criteria andNonPaymentTradesNotIn(List<Long> values) {
            addCriterion("non_payment_trades not in", values, "nonPaymentTrades");
            return (Criteria) this;
        }

        public Criteria andNonPaymentTradesBetween(Long value1, Long value2) {
            addCriterion("non_payment_trades between", value1, value2, "nonPaymentTrades");
            return (Criteria) this;
        }

        public Criteria andNonPaymentTradesNotBetween(Long value1, Long value2) {
            addCriterion("non_payment_trades not between", value1, value2, "nonPaymentTrades");
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

        public Criteria andPaySkusIsNull() {
            addCriterion("pay_skus is null");
            return (Criteria) this;
        }

        public Criteria andPaySkusIsNotNull() {
            addCriterion("pay_skus is not null");
            return (Criteria) this;
        }

        public Criteria andPaySkusEqualTo(Long value) {
            addCriterion("pay_skus =", value, "paySkus");
            return (Criteria) this;
        }

        public Criteria andPaySkusNotEqualTo(Long value) {
            addCriterion("pay_skus <>", value, "paySkus");
            return (Criteria) this;
        }

        public Criteria andPaySkusGreaterThan(Long value) {
            addCriterion("pay_skus >", value, "paySkus");
            return (Criteria) this;
        }

        public Criteria andPaySkusGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_skus >=", value, "paySkus");
            return (Criteria) this;
        }

        public Criteria andPaySkusLessThan(Long value) {
            addCriterion("pay_skus <", value, "paySkus");
            return (Criteria) this;
        }

        public Criteria andPaySkusLessThanOrEqualTo(Long value) {
            addCriterion("pay_skus <=", value, "paySkus");
            return (Criteria) this;
        }

        public Criteria andPaySkusIn(List<Long> values) {
            addCriterion("pay_skus in", values, "paySkus");
            return (Criteria) this;
        }

        public Criteria andPaySkusNotIn(List<Long> values) {
            addCriterion("pay_skus not in", values, "paySkus");
            return (Criteria) this;
        }

        public Criteria andPaySkusBetween(Long value1, Long value2) {
            addCriterion("pay_skus between", value1, value2, "paySkus");
            return (Criteria) this;
        }

        public Criteria andPaySkusNotBetween(Long value1, Long value2) {
            addCriterion("pay_skus not between", value1, value2, "paySkus");
            return (Criteria) this;
        }

        public Criteria andPayTimesIsNull() {
            addCriterion("pay_times is null");
            return (Criteria) this;
        }

        public Criteria andPayTimesIsNotNull() {
            addCriterion("pay_times is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimesEqualTo(Long value) {
            addCriterion("pay_times =", value, "payTimes");
            return (Criteria) this;
        }

        public Criteria andPayTimesNotEqualTo(Long value) {
            addCriterion("pay_times <>", value, "payTimes");
            return (Criteria) this;
        }

        public Criteria andPayTimesGreaterThan(Long value) {
            addCriterion("pay_times >", value, "payTimes");
            return (Criteria) this;
        }

        public Criteria andPayTimesGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_times >=", value, "payTimes");
            return (Criteria) this;
        }

        public Criteria andPayTimesLessThan(Long value) {
            addCriterion("pay_times <", value, "payTimes");
            return (Criteria) this;
        }

        public Criteria andPayTimesLessThanOrEqualTo(Long value) {
            addCriterion("pay_times <=", value, "payTimes");
            return (Criteria) this;
        }

        public Criteria andPayTimesIn(List<Long> values) {
            addCriterion("pay_times in", values, "payTimes");
            return (Criteria) this;
        }

        public Criteria andPayTimesNotIn(List<Long> values) {
            addCriterion("pay_times not in", values, "payTimes");
            return (Criteria) this;
        }

        public Criteria andPayTimesBetween(Long value1, Long value2) {
            addCriterion("pay_times between", value1, value2, "payTimes");
            return (Criteria) this;
        }

        public Criteria andPayTimesNotBetween(Long value1, Long value2) {
            addCriterion("pay_times not between", value1, value2, "payTimes");
            return (Criteria) this;
        }

        public Criteria andPayTradesIsNull() {
            addCriterion("pay_trades is null");
            return (Criteria) this;
        }

        public Criteria andPayTradesIsNotNull() {
            addCriterion("pay_trades is not null");
            return (Criteria) this;
        }

        public Criteria andPayTradesEqualTo(Long value) {
            addCriterion("pay_trades =", value, "payTrades");
            return (Criteria) this;
        }

        public Criteria andPayTradesNotEqualTo(Long value) {
            addCriterion("pay_trades <>", value, "payTrades");
            return (Criteria) this;
        }

        public Criteria andPayTradesGreaterThan(Long value) {
            addCriterion("pay_trades >", value, "payTrades");
            return (Criteria) this;
        }

        public Criteria andPayTradesGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_trades >=", value, "payTrades");
            return (Criteria) this;
        }

        public Criteria andPayTradesLessThan(Long value) {
            addCriterion("pay_trades <", value, "payTrades");
            return (Criteria) this;
        }

        public Criteria andPayTradesLessThanOrEqualTo(Long value) {
            addCriterion("pay_trades <=", value, "payTrades");
            return (Criteria) this;
        }

        public Criteria andPayTradesIn(List<Long> values) {
            addCriterion("pay_trades in", values, "payTrades");
            return (Criteria) this;
        }

        public Criteria andPayTradesNotIn(List<Long> values) {
            addCriterion("pay_trades not in", values, "payTrades");
            return (Criteria) this;
        }

        public Criteria andPayTradesBetween(Long value1, Long value2) {
            addCriterion("pay_trades between", value1, value2, "payTrades");
            return (Criteria) this;
        }

        public Criteria andPayTradesNotBetween(Long value1, Long value2) {
            addCriterion("pay_trades not between", value1, value2, "payTrades");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Long value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Long value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Long value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Long value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Long value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Long value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Long> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Long> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Long value1, Long value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Long value1, Long value2) {
            addCriterion("point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPuchaseTimesIsNull() {
            addCriterion("puchase_times is null");
            return (Criteria) this;
        }

        public Criteria andPuchaseTimesIsNotNull() {
            addCriterion("puchase_times is not null");
            return (Criteria) this;
        }

        public Criteria andPuchaseTimesEqualTo(Long value) {
            addCriterion("puchase_times =", value, "puchaseTimes");
            return (Criteria) this;
        }

        public Criteria andPuchaseTimesNotEqualTo(Long value) {
            addCriterion("puchase_times <>", value, "puchaseTimes");
            return (Criteria) this;
        }

        public Criteria andPuchaseTimesGreaterThan(Long value) {
            addCriterion("puchase_times >", value, "puchaseTimes");
            return (Criteria) this;
        }

        public Criteria andPuchaseTimesGreaterThanOrEqualTo(Long value) {
            addCriterion("puchase_times >=", value, "puchaseTimes");
            return (Criteria) this;
        }

        public Criteria andPuchaseTimesLessThan(Long value) {
            addCriterion("puchase_times <", value, "puchaseTimes");
            return (Criteria) this;
        }

        public Criteria andPuchaseTimesLessThanOrEqualTo(Long value) {
            addCriterion("puchase_times <=", value, "puchaseTimes");
            return (Criteria) this;
        }

        public Criteria andPuchaseTimesIn(List<Long> values) {
            addCriterion("puchase_times in", values, "puchaseTimes");
            return (Criteria) this;
        }

        public Criteria andPuchaseTimesNotIn(List<Long> values) {
            addCriterion("puchase_times not in", values, "puchaseTimes");
            return (Criteria) this;
        }

        public Criteria andPuchaseTimesBetween(Long value1, Long value2) {
            addCriterion("puchase_times between", value1, value2, "puchaseTimes");
            return (Criteria) this;
        }

        public Criteria andPuchaseTimesNotBetween(Long value1, Long value2) {
            addCriterion("puchase_times not between", value1, value2, "puchaseTimes");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(Double value) {
            addCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(Double value) {
            addCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(Double value) {
            addCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(Double value) {
            addCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(Double value) {
            addCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<Double> values) {
            addCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<Double> values) {
            addCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(Double value1, Double value2) {
            addCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(Double value1, Double value2) {
            addCriterion("refund_amount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundItemIsNull() {
            addCriterion("refund_item is null");
            return (Criteria) this;
        }

        public Criteria andRefundItemIsNotNull() {
            addCriterion("refund_item is not null");
            return (Criteria) this;
        }

        public Criteria andRefundItemEqualTo(Long value) {
            addCriterion("refund_item =", value, "refundItem");
            return (Criteria) this;
        }

        public Criteria andRefundItemNotEqualTo(Long value) {
            addCriterion("refund_item <>", value, "refundItem");
            return (Criteria) this;
        }

        public Criteria andRefundItemGreaterThan(Long value) {
            addCriterion("refund_item >", value, "refundItem");
            return (Criteria) this;
        }

        public Criteria andRefundItemGreaterThanOrEqualTo(Long value) {
            addCriterion("refund_item >=", value, "refundItem");
            return (Criteria) this;
        }

        public Criteria andRefundItemLessThan(Long value) {
            addCriterion("refund_item <", value, "refundItem");
            return (Criteria) this;
        }

        public Criteria andRefundItemLessThanOrEqualTo(Long value) {
            addCriterion("refund_item <=", value, "refundItem");
            return (Criteria) this;
        }

        public Criteria andRefundItemIn(List<Long> values) {
            addCriterion("refund_item in", values, "refundItem");
            return (Criteria) this;
        }

        public Criteria andRefundItemNotIn(List<Long> values) {
            addCriterion("refund_item not in", values, "refundItem");
            return (Criteria) this;
        }

        public Criteria andRefundItemBetween(Long value1, Long value2) {
            addCriterion("refund_item between", value1, value2, "refundItem");
            return (Criteria) this;
        }

        public Criteria andRefundItemNotBetween(Long value1, Long value2) {
            addCriterion("refund_item not between", value1, value2, "refundItem");
            return (Criteria) this;
        }

        public Criteria andRefundRatioIsNull() {
            addCriterion("refund_ratio is null");
            return (Criteria) this;
        }

        public Criteria andRefundRatioIsNotNull() {
            addCriterion("refund_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andRefundRatioEqualTo(Double value) {
            addCriterion("refund_ratio =", value, "refundRatio");
            return (Criteria) this;
        }

        public Criteria andRefundRatioNotEqualTo(Double value) {
            addCriterion("refund_ratio <>", value, "refundRatio");
            return (Criteria) this;
        }

        public Criteria andRefundRatioGreaterThan(Double value) {
            addCriterion("refund_ratio >", value, "refundRatio");
            return (Criteria) this;
        }

        public Criteria andRefundRatioGreaterThanOrEqualTo(Double value) {
            addCriterion("refund_ratio >=", value, "refundRatio");
            return (Criteria) this;
        }

        public Criteria andRefundRatioLessThan(Double value) {
            addCriterion("refund_ratio <", value, "refundRatio");
            return (Criteria) this;
        }

        public Criteria andRefundRatioLessThanOrEqualTo(Double value) {
            addCriterion("refund_ratio <=", value, "refundRatio");
            return (Criteria) this;
        }

        public Criteria andRefundRatioIn(List<Double> values) {
            addCriterion("refund_ratio in", values, "refundRatio");
            return (Criteria) this;
        }

        public Criteria andRefundRatioNotIn(List<Double> values) {
            addCriterion("refund_ratio not in", values, "refundRatio");
            return (Criteria) this;
        }

        public Criteria andRefundRatioBetween(Double value1, Double value2) {
            addCriterion("refund_ratio between", value1, value2, "refundRatio");
            return (Criteria) this;
        }

        public Criteria andRefundRatioNotBetween(Double value1, Double value2) {
            addCriterion("refund_ratio not between", value1, value2, "refundRatio");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Long value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Long value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Long value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Long value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Long value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Long> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Long> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Long value1, Long value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Long value1, Long value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andReserveItemsIsNull() {
            addCriterion("reserve_items is null");
            return (Criteria) this;
        }

        public Criteria andReserveItemsIsNotNull() {
            addCriterion("reserve_items is not null");
            return (Criteria) this;
        }

        public Criteria andReserveItemsEqualTo(Long value) {
            addCriterion("reserve_items =", value, "reserveItems");
            return (Criteria) this;
        }

        public Criteria andReserveItemsNotEqualTo(Long value) {
            addCriterion("reserve_items <>", value, "reserveItems");
            return (Criteria) this;
        }

        public Criteria andReserveItemsGreaterThan(Long value) {
            addCriterion("reserve_items >", value, "reserveItems");
            return (Criteria) this;
        }

        public Criteria andReserveItemsGreaterThanOrEqualTo(Long value) {
            addCriterion("reserve_items >=", value, "reserveItems");
            return (Criteria) this;
        }

        public Criteria andReserveItemsLessThan(Long value) {
            addCriterion("reserve_items <", value, "reserveItems");
            return (Criteria) this;
        }

        public Criteria andReserveItemsLessThanOrEqualTo(Long value) {
            addCriterion("reserve_items <=", value, "reserveItems");
            return (Criteria) this;
        }

        public Criteria andReserveItemsIn(List<Long> values) {
            addCriterion("reserve_items in", values, "reserveItems");
            return (Criteria) this;
        }

        public Criteria andReserveItemsNotIn(List<Long> values) {
            addCriterion("reserve_items not in", values, "reserveItems");
            return (Criteria) this;
        }

        public Criteria andReserveItemsBetween(Long value1, Long value2) {
            addCriterion("reserve_items between", value1, value2, "reserveItems");
            return (Criteria) this;
        }

        public Criteria andReserveItemsNotBetween(Long value1, Long value2) {
            addCriterion("reserve_items not between", value1, value2, "reserveItems");
            return (Criteria) this;
        }

        public Criteria andReservePaymentIsNull() {
            addCriterion("reserve_payment is null");
            return (Criteria) this;
        }

        public Criteria andReservePaymentIsNotNull() {
            addCriterion("reserve_payment is not null");
            return (Criteria) this;
        }

        public Criteria andReservePaymentEqualTo(Double value) {
            addCriterion("reserve_payment =", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentNotEqualTo(Double value) {
            addCriterion("reserve_payment <>", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentGreaterThan(Double value) {
            addCriterion("reserve_payment >", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("reserve_payment >=", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentLessThan(Double value) {
            addCriterion("reserve_payment <", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentLessThanOrEqualTo(Double value) {
            addCriterion("reserve_payment <=", value, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentIn(List<Double> values) {
            addCriterion("reserve_payment in", values, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentNotIn(List<Double> values) {
            addCriterion("reserve_payment not in", values, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentBetween(Double value1, Double value2) {
            addCriterion("reserve_payment between", value1, value2, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReservePaymentNotBetween(Double value1, Double value2) {
            addCriterion("reserve_payment not between", value1, value2, "reservePayment");
            return (Criteria) this;
        }

        public Criteria andReserveTradesIsNull() {
            addCriterion("reserve_trades is null");
            return (Criteria) this;
        }

        public Criteria andReserveTradesIsNotNull() {
            addCriterion("reserve_trades is not null");
            return (Criteria) this;
        }

        public Criteria andReserveTradesEqualTo(Long value) {
            addCriterion("reserve_trades =", value, "reserveTrades");
            return (Criteria) this;
        }

        public Criteria andReserveTradesNotEqualTo(Long value) {
            addCriterion("reserve_trades <>", value, "reserveTrades");
            return (Criteria) this;
        }

        public Criteria andReserveTradesGreaterThan(Long value) {
            addCriterion("reserve_trades >", value, "reserveTrades");
            return (Criteria) this;
        }

        public Criteria andReserveTradesGreaterThanOrEqualTo(Long value) {
            addCriterion("reserve_trades >=", value, "reserveTrades");
            return (Criteria) this;
        }

        public Criteria andReserveTradesLessThan(Long value) {
            addCriterion("reserve_trades <", value, "reserveTrades");
            return (Criteria) this;
        }

        public Criteria andReserveTradesLessThanOrEqualTo(Long value) {
            addCriterion("reserve_trades <=", value, "reserveTrades");
            return (Criteria) this;
        }

        public Criteria andReserveTradesIn(List<Long> values) {
            addCriterion("reserve_trades in", values, "reserveTrades");
            return (Criteria) this;
        }

        public Criteria andReserveTradesNotIn(List<Long> values) {
            addCriterion("reserve_trades not in", values, "reserveTrades");
            return (Criteria) this;
        }

        public Criteria andReserveTradesBetween(Long value1, Long value2) {
            addCriterion("reserve_trades between", value1, value2, "reserveTrades");
            return (Criteria) this;
        }

        public Criteria andReserveTradesNotBetween(Long value1, Long value2) {
            addCriterion("reserve_trades not between", value1, value2, "reserveTrades");
            return (Criteria) this;
        }

        public Criteria andSecondPayTimeIsNull() {
            addCriterion("second_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andSecondPayTimeIsNotNull() {
            addCriterion("second_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andSecondPayTimeEqualTo(Date value) {
            addCriterion("second_pay_time =", value, "secondPayTime");
            return (Criteria) this;
        }

        public Criteria andSecondPayTimeNotEqualTo(Date value) {
            addCriterion("second_pay_time <>", value, "secondPayTime");
            return (Criteria) this;
        }

        public Criteria andSecondPayTimeGreaterThan(Date value) {
            addCriterion("second_pay_time >", value, "secondPayTime");
            return (Criteria) this;
        }

        public Criteria andSecondPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("second_pay_time >=", value, "secondPayTime");
            return (Criteria) this;
        }

        public Criteria andSecondPayTimeLessThan(Date value) {
            addCriterion("second_pay_time <", value, "secondPayTime");
            return (Criteria) this;
        }

        public Criteria andSecondPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("second_pay_time <=", value, "secondPayTime");
            return (Criteria) this;
        }

        public Criteria andSecondPayTimeIn(List<Date> values) {
            addCriterion("second_pay_time in", values, "secondPayTime");
            return (Criteria) this;
        }

        public Criteria andSecondPayTimeNotIn(List<Date> values) {
            addCriterion("second_pay_time not in", values, "secondPayTime");
            return (Criteria) this;
        }

        public Criteria andSecondPayTimeBetween(Date value1, Date value2) {
            addCriterion("second_pay_time between", value1, value2, "secondPayTime");
            return (Criteria) this;
        }

        public Criteria andSecondPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("second_pay_time not between", value1, value2, "secondPayTime");
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

        public Criteria andTotalPostFeeIsNull() {
            addCriterion("total_post_fee is null");
            return (Criteria) this;
        }

        public Criteria andTotalPostFeeIsNotNull() {
            addCriterion("total_post_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPostFeeEqualTo(Double value) {
            addCriterion("total_post_fee =", value, "totalPostFee");
            return (Criteria) this;
        }

        public Criteria andTotalPostFeeNotEqualTo(Double value) {
            addCriterion("total_post_fee <>", value, "totalPostFee");
            return (Criteria) this;
        }

        public Criteria andTotalPostFeeGreaterThan(Double value) {
            addCriterion("total_post_fee >", value, "totalPostFee");
            return (Criteria) this;
        }

        public Criteria andTotalPostFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("total_post_fee >=", value, "totalPostFee");
            return (Criteria) this;
        }

        public Criteria andTotalPostFeeLessThan(Double value) {
            addCriterion("total_post_fee <", value, "totalPostFee");
            return (Criteria) this;
        }

        public Criteria andTotalPostFeeLessThanOrEqualTo(Double value) {
            addCriterion("total_post_fee <=", value, "totalPostFee");
            return (Criteria) this;
        }

        public Criteria andTotalPostFeeIn(List<Double> values) {
            addCriterion("total_post_fee in", values, "totalPostFee");
            return (Criteria) this;
        }

        public Criteria andTotalPostFeeNotIn(List<Double> values) {
            addCriterion("total_post_fee not in", values, "totalPostFee");
            return (Criteria) this;
        }

        public Criteria andTotalPostFeeBetween(Double value1, Double value2) {
            addCriterion("total_post_fee between", value1, value2, "totalPostFee");
            return (Criteria) this;
        }

        public Criteria andTotalPostFeeNotBetween(Double value1, Double value2) {
            addCriterion("total_post_fee not between", value1, value2, "totalPostFee");
            return (Criteria) this;
        }

        public Criteria andTotalPresellAmountIsNull() {
            addCriterion("total_presell_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalPresellAmountIsNotNull() {
            addCriterion("total_presell_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPresellAmountEqualTo(Double value) {
            addCriterion("total_presell_amount =", value, "totalPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPresellAmountNotEqualTo(Double value) {
            addCriterion("total_presell_amount <>", value, "totalPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPresellAmountGreaterThan(Double value) {
            addCriterion("total_presell_amount >", value, "totalPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPresellAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("total_presell_amount >=", value, "totalPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPresellAmountLessThan(Double value) {
            addCriterion("total_presell_amount <", value, "totalPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPresellAmountLessThanOrEqualTo(Double value) {
            addCriterion("total_presell_amount <=", value, "totalPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPresellAmountIn(List<Double> values) {
            addCriterion("total_presell_amount in", values, "totalPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPresellAmountNotIn(List<Double> values) {
            addCriterion("total_presell_amount not in", values, "totalPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPresellAmountBetween(Double value1, Double value2) {
            addCriterion("total_presell_amount between", value1, value2, "totalPresellAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPresellAmountNotBetween(Double value1, Double value2) {
            addCriterion("total_presell_amount not between", value1, value2, "totalPresellAmount");
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