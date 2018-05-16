package com.wangjubao.dolphin.pojo.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NbfBuyerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NbfBuyerExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
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

        public Criteria andAffectionStatusIsNull() {
            addCriterion("affection_status is null");
            return (Criteria) this;
        }

        public Criteria andAffectionStatusIsNotNull() {
            addCriterion("affection_status is not null");
            return (Criteria) this;
        }

        public Criteria andAffectionStatusEqualTo(Long value) {
            addCriterion("affection_status =", value, "affectionStatus");
            return (Criteria) this;
        }

        public Criteria andAffectionStatusNotEqualTo(Long value) {
            addCriterion("affection_status <>", value, "affectionStatus");
            return (Criteria) this;
        }

        public Criteria andAffectionStatusGreaterThan(Long value) {
            addCriterion("affection_status >", value, "affectionStatus");
            return (Criteria) this;
        }

        public Criteria andAffectionStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("affection_status >=", value, "affectionStatus");
            return (Criteria) this;
        }

        public Criteria andAffectionStatusLessThan(Long value) {
            addCriterion("affection_status <", value, "affectionStatus");
            return (Criteria) this;
        }

        public Criteria andAffectionStatusLessThanOrEqualTo(Long value) {
            addCriterion("affection_status <=", value, "affectionStatus");
            return (Criteria) this;
        }

        public Criteria andAffectionStatusIn(List<Long> values) {
            addCriterion("affection_status in", values, "affectionStatus");
            return (Criteria) this;
        }

        public Criteria andAffectionStatusNotIn(List<Long> values) {
            addCriterion("affection_status not in", values, "affectionStatus");
            return (Criteria) this;
        }

        public Criteria andAffectionStatusBetween(Long value1, Long value2) {
            addCriterion("affection_status between", value1, value2, "affectionStatus");
            return (Criteria) this;
        }

        public Criteria andAffectionStatusNotBetween(Long value1, Long value2) {
            addCriterion("affection_status not between", value1, value2, "affectionStatus");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Long value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Long value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Long value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Long value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Long value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Long value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Long> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Long> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Long value1, Long value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Long value1, Long value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNull() {
            addCriterion("alipay is null");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNotNull() {
            addCriterion("alipay is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayEqualTo(String value) {
            addCriterion("alipay =", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotEqualTo(String value) {
            addCriterion("alipay <>", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThan(String value) {
            addCriterion("alipay >", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThanOrEqualTo(String value) {
            addCriterion("alipay >=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThan(String value) {
            addCriterion("alipay <", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThanOrEqualTo(String value) {
            addCriterion("alipay <=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLike(String value) {
            addCriterion("alipay like", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotLike(String value) {
            addCriterion("alipay not like", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayIn(List<String> values) {
            addCriterion("alipay in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotIn(List<String> values) {
            addCriterion("alipay not in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayBetween(String value1, String value2) {
            addCriterion("alipay between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotBetween(String value1, String value2) {
            addCriterion("alipay not between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayFlagIsNull() {
            addCriterion("alipay_flag is null");
            return (Criteria) this;
        }

        public Criteria andAlipayFlagIsNotNull() {
            addCriterion("alipay_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayFlagEqualTo(Long value) {
            addCriterion("alipay_flag =", value, "alipayFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayFlagNotEqualTo(Long value) {
            addCriterion("alipay_flag <>", value, "alipayFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayFlagGreaterThan(Long value) {
            addCriterion("alipay_flag >", value, "alipayFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayFlagGreaterThanOrEqualTo(Long value) {
            addCriterion("alipay_flag >=", value, "alipayFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayFlagLessThan(Long value) {
            addCriterion("alipay_flag <", value, "alipayFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayFlagLessThanOrEqualTo(Long value) {
            addCriterion("alipay_flag <=", value, "alipayFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayFlagIn(List<Long> values) {
            addCriterion("alipay_flag in", values, "alipayFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayFlagNotIn(List<Long> values) {
            addCriterion("alipay_flag not in", values, "alipayFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayFlagBetween(Long value1, Long value2) {
            addCriterion("alipay_flag between", value1, value2, "alipayFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayFlagNotBetween(Long value1, Long value2) {
            addCriterion("alipay_flag not between", value1, value2, "alipayFlag");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBlackListFlagIsNull() {
            addCriterion("black_list_flag is null");
            return (Criteria) this;
        }

        public Criteria andBlackListFlagIsNotNull() {
            addCriterion("black_list_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBlackListFlagEqualTo(Long value) {
            addCriterion("black_list_flag =", value, "blackListFlag");
            return (Criteria) this;
        }

        public Criteria andBlackListFlagNotEqualTo(Long value) {
            addCriterion("black_list_flag <>", value, "blackListFlag");
            return (Criteria) this;
        }

        public Criteria andBlackListFlagGreaterThan(Long value) {
            addCriterion("black_list_flag >", value, "blackListFlag");
            return (Criteria) this;
        }

        public Criteria andBlackListFlagGreaterThanOrEqualTo(Long value) {
            addCriterion("black_list_flag >=", value, "blackListFlag");
            return (Criteria) this;
        }

        public Criteria andBlackListFlagLessThan(Long value) {
            addCriterion("black_list_flag <", value, "blackListFlag");
            return (Criteria) this;
        }

        public Criteria andBlackListFlagLessThanOrEqualTo(Long value) {
            addCriterion("black_list_flag <=", value, "blackListFlag");
            return (Criteria) this;
        }

        public Criteria andBlackListFlagIn(List<Long> values) {
            addCriterion("black_list_flag in", values, "blackListFlag");
            return (Criteria) this;
        }

        public Criteria andBlackListFlagNotIn(List<Long> values) {
            addCriterion("black_list_flag not in", values, "blackListFlag");
            return (Criteria) this;
        }

        public Criteria andBlackListFlagBetween(Long value1, Long value2) {
            addCriterion("black_list_flag between", value1, value2, "blackListFlag");
            return (Criteria) this;
        }

        public Criteria andBlackListFlagNotBetween(Long value1, Long value2) {
            addCriterion("black_list_flag not between", value1, value2, "blackListFlag");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIsNull() {
            addCriterion("blood_type is null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIsNotNull() {
            addCriterion("blood_type is not null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeEqualTo(Long value) {
            addCriterion("blood_type =", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotEqualTo(Long value) {
            addCriterion("blood_type <>", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeGreaterThan(Long value) {
            addCriterion("blood_type >", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("blood_type >=", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLessThan(Long value) {
            addCriterion("blood_type <", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLessThanOrEqualTo(Long value) {
            addCriterion("blood_type <=", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIn(List<Long> values) {
            addCriterion("blood_type in", values, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotIn(List<Long> values) {
            addCriterion("blood_type not in", values, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeBetween(Long value1, Long value2) {
            addCriterion("blood_type between", value1, value2, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotBetween(Long value1, Long value2) {
            addCriterion("blood_type not between", value1, value2, "bloodType");
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

        public Criteria andCardIsNull() {
            addCriterion("card is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("card is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("card =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("card <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("card >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("card >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("card <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("card <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("card like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("card not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("card in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("card not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("card between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("card not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Long value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Long value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Long value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Long value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Long value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Long value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Long> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Long> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Long value1, Long value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Long value1, Long value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIsNull() {
            addCriterion("credit_level is null");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIsNotNull() {
            addCriterion("credit_level is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLevelEqualTo(Long value) {
            addCriterion("credit_level =", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelNotEqualTo(Long value) {
            addCriterion("credit_level <>", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelGreaterThan(Long value) {
            addCriterion("credit_level >", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("credit_level >=", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelLessThan(Long value) {
            addCriterion("credit_level <", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelLessThanOrEqualTo(Long value) {
            addCriterion("credit_level <=", value, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelIn(List<Long> values) {
            addCriterion("credit_level in", values, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelNotIn(List<Long> values) {
            addCriterion("credit_level not in", values, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelBetween(Long value1, Long value2) {
            addCriterion("credit_level between", value1, value2, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andCreditLevelNotBetween(Long value1, Long value2) {
            addCriterion("credit_level not between", value1, value2, "creditLevel");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Long value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Long value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Long value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Long value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Long value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Long value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Long> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Long> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Long value1, Long value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Long value1, Long value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Long value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Long value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Long value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Long value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Long value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Long value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Long> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Long> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Long value1, Long value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Long value1, Long value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andNickIsNull() {
            addCriterion("nick is null");
            return (Criteria) this;
        }

        public Criteria andNickIsNotNull() {
            addCriterion("nick is not null");
            return (Criteria) this;
        }

        public Criteria andNickEqualTo(String value) {
            addCriterion("nick =", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotEqualTo(String value) {
            addCriterion("nick <>", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThan(String value) {
            addCriterion("nick >", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThanOrEqualTo(String value) {
            addCriterion("nick >=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThan(String value) {
            addCriterion("nick <", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThanOrEqualTo(String value) {
            addCriterion("nick <=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLike(String value) {
            addCriterion("nick like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotLike(String value) {
            addCriterion("nick not like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickIn(List<String> values) {
            addCriterion("nick in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotIn(List<String> values) {
            addCriterion("nick not in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickBetween(String value1, String value2) {
            addCriterion("nick between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotBetween(String value1, String value2) {
            addCriterion("nick not between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andPointLevelIsNull() {
            addCriterion("point_level is null");
            return (Criteria) this;
        }

        public Criteria andPointLevelIsNotNull() {
            addCriterion("point_level is not null");
            return (Criteria) this;
        }

        public Criteria andPointLevelEqualTo(Long value) {
            addCriterion("point_level =", value, "pointLevel");
            return (Criteria) this;
        }

        public Criteria andPointLevelNotEqualTo(Long value) {
            addCriterion("point_level <>", value, "pointLevel");
            return (Criteria) this;
        }

        public Criteria andPointLevelGreaterThan(Long value) {
            addCriterion("point_level >", value, "pointLevel");
            return (Criteria) this;
        }

        public Criteria andPointLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("point_level >=", value, "pointLevel");
            return (Criteria) this;
        }

        public Criteria andPointLevelLessThan(Long value) {
            addCriterion("point_level <", value, "pointLevel");
            return (Criteria) this;
        }

        public Criteria andPointLevelLessThanOrEqualTo(Long value) {
            addCriterion("point_level <=", value, "pointLevel");
            return (Criteria) this;
        }

        public Criteria andPointLevelIn(List<Long> values) {
            addCriterion("point_level in", values, "pointLevel");
            return (Criteria) this;
        }

        public Criteria andPointLevelNotIn(List<Long> values) {
            addCriterion("point_level not in", values, "pointLevel");
            return (Criteria) this;
        }

        public Criteria andPointLevelBetween(Long value1, Long value2) {
            addCriterion("point_level between", value1, value2, "pointLevel");
            return (Criteria) this;
        }

        public Criteria andPointLevelNotBetween(Long value1, Long value2) {
            addCriterion("point_level not between", value1, value2, "pointLevel");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Long value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Long value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Long value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Long value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Long value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Long value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Long> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Long> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Long value1, Long value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Long value1, Long value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailIsNull() {
            addCriterion("receiver_email is null");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailIsNotNull() {
            addCriterion("receiver_email is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailEqualTo(String value) {
            addCriterion("receiver_email =", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailNotEqualTo(String value) {
            addCriterion("receiver_email <>", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailGreaterThan(String value) {
            addCriterion("receiver_email >", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_email >=", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailLessThan(String value) {
            addCriterion("receiver_email <", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailLessThanOrEqualTo(String value) {
            addCriterion("receiver_email <=", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailLike(String value) {
            addCriterion("receiver_email like", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailNotLike(String value) {
            addCriterion("receiver_email not like", value, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailIn(List<String> values) {
            addCriterion("receiver_email in", values, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailNotIn(List<String> values) {
            addCriterion("receiver_email not in", values, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailBetween(String value1, String value2) {
            addCriterion("receiver_email between", value1, value2, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailNotBetween(String value1, String value2) {
            addCriterion("receiver_email not between", value1, value2, "receiverEmail");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeIsNull() {
            addCriterion("receiver_email_type is null");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeIsNotNull() {
            addCriterion("receiver_email_type is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeEqualTo(String value) {
            addCriterion("receiver_email_type =", value, "receiverEmailType");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeNotEqualTo(String value) {
            addCriterion("receiver_email_type <>", value, "receiverEmailType");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeGreaterThan(String value) {
            addCriterion("receiver_email_type >", value, "receiverEmailType");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_email_type >=", value, "receiverEmailType");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeLessThan(String value) {
            addCriterion("receiver_email_type <", value, "receiverEmailType");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeLessThanOrEqualTo(String value) {
            addCriterion("receiver_email_type <=", value, "receiverEmailType");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeLike(String value) {
            addCriterion("receiver_email_type like", value, "receiverEmailType");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeNotLike(String value) {
            addCriterion("receiver_email_type not like", value, "receiverEmailType");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeIn(List<String> values) {
            addCriterion("receiver_email_type in", values, "receiverEmailType");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeNotIn(List<String> values) {
            addCriterion("receiver_email_type not in", values, "receiverEmailType");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeBetween(String value1, String value2) {
            addCriterion("receiver_email_type between", value1, value2, "receiverEmailType");
            return (Criteria) this;
        }

        public Criteria andReceiverEmailTypeNotBetween(String value1, String value2) {
            addCriterion("receiver_email_type not between", value1, value2, "receiverEmailType");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNull() {
            addCriterion("receiver_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIsNotNull() {
            addCriterion("receiver_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileEqualTo(String value) {
            addCriterion("receiver_mobile =", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotEqualTo(String value) {
            addCriterion("receiver_mobile <>", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThan(String value) {
            addCriterion("receiver_mobile >", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile >=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThan(String value) {
            addCriterion("receiver_mobile <", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLessThanOrEqualTo(String value) {
            addCriterion("receiver_mobile <=", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileLike(String value) {
            addCriterion("receiver_mobile like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotLike(String value) {
            addCriterion("receiver_mobile not like", value, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileIn(List<String> values) {
            addCriterion("receiver_mobile in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotIn(List<String> values) {
            addCriterion("receiver_mobile not in", values, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileBetween(String value1, String value2) {
            addCriterion("receiver_mobile between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileNotBetween(String value1, String value2) {
            addCriterion("receiver_mobile not between", value1, value2, "receiverMobile");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeIsNull() {
            addCriterion("receiver_mobile_type is null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeIsNotNull() {
            addCriterion("receiver_mobile_type is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeEqualTo(String value) {
            addCriterion("receiver_mobile_type =", value, "receiverMobileType");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeNotEqualTo(String value) {
            addCriterion("receiver_mobile_type <>", value, "receiverMobileType");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeGreaterThan(String value) {
            addCriterion("receiver_mobile_type >", value, "receiverMobileType");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_mobile_type >=", value, "receiverMobileType");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeLessThan(String value) {
            addCriterion("receiver_mobile_type <", value, "receiverMobileType");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeLessThanOrEqualTo(String value) {
            addCriterion("receiver_mobile_type <=", value, "receiverMobileType");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeLike(String value) {
            addCriterion("receiver_mobile_type like", value, "receiverMobileType");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeNotLike(String value) {
            addCriterion("receiver_mobile_type not like", value, "receiverMobileType");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeIn(List<String> values) {
            addCriterion("receiver_mobile_type in", values, "receiverMobileType");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeNotIn(List<String> values) {
            addCriterion("receiver_mobile_type not in", values, "receiverMobileType");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeBetween(String value1, String value2) {
            addCriterion("receiver_mobile_type between", value1, value2, "receiverMobileType");
            return (Criteria) this;
        }

        public Criteria andReceiverMobileTypeNotBetween(String value1, String value2) {
            addCriterion("receiver_mobile_type not between", value1, value2, "receiverMobileType");
            return (Criteria) this;
        }

        public Criteria andRegEmailIsNull() {
            addCriterion("reg_email is null");
            return (Criteria) this;
        }

        public Criteria andRegEmailIsNotNull() {
            addCriterion("reg_email is not null");
            return (Criteria) this;
        }

        public Criteria andRegEmailEqualTo(String value) {
            addCriterion("reg_email =", value, "regEmail");
            return (Criteria) this;
        }

        public Criteria andRegEmailNotEqualTo(String value) {
            addCriterion("reg_email <>", value, "regEmail");
            return (Criteria) this;
        }

        public Criteria andRegEmailGreaterThan(String value) {
            addCriterion("reg_email >", value, "regEmail");
            return (Criteria) this;
        }

        public Criteria andRegEmailGreaterThanOrEqualTo(String value) {
            addCriterion("reg_email >=", value, "regEmail");
            return (Criteria) this;
        }

        public Criteria andRegEmailLessThan(String value) {
            addCriterion("reg_email <", value, "regEmail");
            return (Criteria) this;
        }

        public Criteria andRegEmailLessThanOrEqualTo(String value) {
            addCriterion("reg_email <=", value, "regEmail");
            return (Criteria) this;
        }

        public Criteria andRegEmailLike(String value) {
            addCriterion("reg_email like", value, "regEmail");
            return (Criteria) this;
        }

        public Criteria andRegEmailNotLike(String value) {
            addCriterion("reg_email not like", value, "regEmail");
            return (Criteria) this;
        }

        public Criteria andRegEmailIn(List<String> values) {
            addCriterion("reg_email in", values, "regEmail");
            return (Criteria) this;
        }

        public Criteria andRegEmailNotIn(List<String> values) {
            addCriterion("reg_email not in", values, "regEmail");
            return (Criteria) this;
        }

        public Criteria andRegEmailBetween(String value1, String value2) {
            addCriterion("reg_email between", value1, value2, "regEmail");
            return (Criteria) this;
        }

        public Criteria andRegEmailNotBetween(String value1, String value2) {
            addCriterion("reg_email not between", value1, value2, "regEmail");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeIsNull() {
            addCriterion("reg_email_type is null");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeIsNotNull() {
            addCriterion("reg_email_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeEqualTo(String value) {
            addCriterion("reg_email_type =", value, "regEmailType");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeNotEqualTo(String value) {
            addCriterion("reg_email_type <>", value, "regEmailType");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeGreaterThan(String value) {
            addCriterion("reg_email_type >", value, "regEmailType");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeGreaterThanOrEqualTo(String value) {
            addCriterion("reg_email_type >=", value, "regEmailType");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeLessThan(String value) {
            addCriterion("reg_email_type <", value, "regEmailType");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeLessThanOrEqualTo(String value) {
            addCriterion("reg_email_type <=", value, "regEmailType");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeLike(String value) {
            addCriterion("reg_email_type like", value, "regEmailType");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeNotLike(String value) {
            addCriterion("reg_email_type not like", value, "regEmailType");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeIn(List<String> values) {
            addCriterion("reg_email_type in", values, "regEmailType");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeNotIn(List<String> values) {
            addCriterion("reg_email_type not in", values, "regEmailType");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeBetween(String value1, String value2) {
            addCriterion("reg_email_type between", value1, value2, "regEmailType");
            return (Criteria) this;
        }

        public Criteria andRegEmailTypeNotBetween(String value1, String value2) {
            addCriterion("reg_email_type not between", value1, value2, "regEmailType");
            return (Criteria) this;
        }

        public Criteria andRegMobileIsNull() {
            addCriterion("reg_mobile is null");
            return (Criteria) this;
        }

        public Criteria andRegMobileIsNotNull() {
            addCriterion("reg_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andRegMobileEqualTo(String value) {
            addCriterion("reg_mobile =", value, "regMobile");
            return (Criteria) this;
        }

        public Criteria andRegMobileNotEqualTo(String value) {
            addCriterion("reg_mobile <>", value, "regMobile");
            return (Criteria) this;
        }

        public Criteria andRegMobileGreaterThan(String value) {
            addCriterion("reg_mobile >", value, "regMobile");
            return (Criteria) this;
        }

        public Criteria andRegMobileGreaterThanOrEqualTo(String value) {
            addCriterion("reg_mobile >=", value, "regMobile");
            return (Criteria) this;
        }

        public Criteria andRegMobileLessThan(String value) {
            addCriterion("reg_mobile <", value, "regMobile");
            return (Criteria) this;
        }

        public Criteria andRegMobileLessThanOrEqualTo(String value) {
            addCriterion("reg_mobile <=", value, "regMobile");
            return (Criteria) this;
        }

        public Criteria andRegMobileLike(String value) {
            addCriterion("reg_mobile like", value, "regMobile");
            return (Criteria) this;
        }

        public Criteria andRegMobileNotLike(String value) {
            addCriterion("reg_mobile not like", value, "regMobile");
            return (Criteria) this;
        }

        public Criteria andRegMobileIn(List<String> values) {
            addCriterion("reg_mobile in", values, "regMobile");
            return (Criteria) this;
        }

        public Criteria andRegMobileNotIn(List<String> values) {
            addCriterion("reg_mobile not in", values, "regMobile");
            return (Criteria) this;
        }

        public Criteria andRegMobileBetween(String value1, String value2) {
            addCriterion("reg_mobile between", value1, value2, "regMobile");
            return (Criteria) this;
        }

        public Criteria andRegMobileNotBetween(String value1, String value2) {
            addCriterion("reg_mobile not between", value1, value2, "regMobile");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeIsNull() {
            addCriterion("reg_mobile_type is null");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeIsNotNull() {
            addCriterion("reg_mobile_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeEqualTo(String value) {
            addCriterion("reg_mobile_type =", value, "regMobileType");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeNotEqualTo(String value) {
            addCriterion("reg_mobile_type <>", value, "regMobileType");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeGreaterThan(String value) {
            addCriterion("reg_mobile_type >", value, "regMobileType");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("reg_mobile_type >=", value, "regMobileType");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeLessThan(String value) {
            addCriterion("reg_mobile_type <", value, "regMobileType");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeLessThanOrEqualTo(String value) {
            addCriterion("reg_mobile_type <=", value, "regMobileType");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeLike(String value) {
            addCriterion("reg_mobile_type like", value, "regMobileType");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeNotLike(String value) {
            addCriterion("reg_mobile_type not like", value, "regMobileType");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeIn(List<String> values) {
            addCriterion("reg_mobile_type in", values, "regMobileType");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeNotIn(List<String> values) {
            addCriterion("reg_mobile_type not in", values, "regMobileType");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeBetween(String value1, String value2) {
            addCriterion("reg_mobile_type between", value1, value2, "regMobileType");
            return (Criteria) this;
        }

        public Criteria andRegMobileTypeNotBetween(String value1, String value2) {
            addCriterion("reg_mobile_type not between", value1, value2, "regMobileType");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Date value) {
            addCriterion("reg_time =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Date value) {
            addCriterion("reg_time <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Date value) {
            addCriterion("reg_time >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_time >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Date value) {
            addCriterion("reg_time <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Date value) {
            addCriterion("reg_time <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Date> values) {
            addCriterion("reg_time in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Date> values) {
            addCriterion("reg_time not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Date value1, Date value2) {
            addCriterion("reg_time between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Date value1, Date value2) {
            addCriterion("reg_time not between", value1, value2, "regTime");
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

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
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

        public Criteria andZodiacIsNull() {
            addCriterion("zodiac is null");
            return (Criteria) this;
        }

        public Criteria andZodiacIsNotNull() {
            addCriterion("zodiac is not null");
            return (Criteria) this;
        }

        public Criteria andZodiacEqualTo(Long value) {
            addCriterion("zodiac =", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacNotEqualTo(Long value) {
            addCriterion("zodiac <>", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacGreaterThan(Long value) {
            addCriterion("zodiac >", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacGreaterThanOrEqualTo(Long value) {
            addCriterion("zodiac >=", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacLessThan(Long value) {
            addCriterion("zodiac <", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacLessThanOrEqualTo(Long value) {
            addCriterion("zodiac <=", value, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacIn(List<Long> values) {
            addCriterion("zodiac in", values, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacNotIn(List<Long> values) {
            addCriterion("zodiac not in", values, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacBetween(Long value1, Long value2) {
            addCriterion("zodiac between", value1, value2, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacNotBetween(Long value1, Long value2) {
            addCriterion("zodiac not between", value1, value2, "zodiac");
            return (Criteria) this;
        }

        public Criteria andZodiacChineseIsNull() {
            addCriterion("zodiac_chinese is null");
            return (Criteria) this;
        }

        public Criteria andZodiacChineseIsNotNull() {
            addCriterion("zodiac_chinese is not null");
            return (Criteria) this;
        }

        public Criteria andZodiacChineseEqualTo(Long value) {
            addCriterion("zodiac_chinese =", value, "zodiacChinese");
            return (Criteria) this;
        }

        public Criteria andZodiacChineseNotEqualTo(Long value) {
            addCriterion("zodiac_chinese <>", value, "zodiacChinese");
            return (Criteria) this;
        }

        public Criteria andZodiacChineseGreaterThan(Long value) {
            addCriterion("zodiac_chinese >", value, "zodiacChinese");
            return (Criteria) this;
        }

        public Criteria andZodiacChineseGreaterThanOrEqualTo(Long value) {
            addCriterion("zodiac_chinese >=", value, "zodiacChinese");
            return (Criteria) this;
        }

        public Criteria andZodiacChineseLessThan(Long value) {
            addCriterion("zodiac_chinese <", value, "zodiacChinese");
            return (Criteria) this;
        }

        public Criteria andZodiacChineseLessThanOrEqualTo(Long value) {
            addCriterion("zodiac_chinese <=", value, "zodiacChinese");
            return (Criteria) this;
        }

        public Criteria andZodiacChineseIn(List<Long> values) {
            addCriterion("zodiac_chinese in", values, "zodiacChinese");
            return (Criteria) this;
        }

        public Criteria andZodiacChineseNotIn(List<Long> values) {
            addCriterion("zodiac_chinese not in", values, "zodiacChinese");
            return (Criteria) this;
        }

        public Criteria andZodiacChineseBetween(Long value1, Long value2) {
            addCriterion("zodiac_chinese between", value1, value2, "zodiacChinese");
            return (Criteria) this;
        }

        public Criteria andZodiacChineseNotBetween(Long value1, Long value2) {
            addCriterion("zodiac_chinese not between", value1, value2, "zodiacChinese");
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