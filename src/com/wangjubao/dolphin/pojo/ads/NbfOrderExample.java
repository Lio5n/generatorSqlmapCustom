package com.wangjubao.dolphin.pojo.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NbfOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NbfOrderExample() {
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

        public Criteria andAdjustFeeIsNull() {
            addCriterion("adjust_fee is null");
            return (Criteria) this;
        }

        public Criteria andAdjustFeeIsNotNull() {
            addCriterion("adjust_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustFeeEqualTo(Double value) {
            addCriterion("adjust_fee =", value, "adjustFee");
            return (Criteria) this;
        }

        public Criteria andAdjustFeeNotEqualTo(Double value) {
            addCriterion("adjust_fee <>", value, "adjustFee");
            return (Criteria) this;
        }

        public Criteria andAdjustFeeGreaterThan(Double value) {
            addCriterion("adjust_fee >", value, "adjustFee");
            return (Criteria) this;
        }

        public Criteria andAdjustFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("adjust_fee >=", value, "adjustFee");
            return (Criteria) this;
        }

        public Criteria andAdjustFeeLessThan(Double value) {
            addCriterion("adjust_fee <", value, "adjustFee");
            return (Criteria) this;
        }

        public Criteria andAdjustFeeLessThanOrEqualTo(Double value) {
            addCriterion("adjust_fee <=", value, "adjustFee");
            return (Criteria) this;
        }

        public Criteria andAdjustFeeIn(List<Double> values) {
            addCriterion("adjust_fee in", values, "adjustFee");
            return (Criteria) this;
        }

        public Criteria andAdjustFeeNotIn(List<Double> values) {
            addCriterion("adjust_fee not in", values, "adjustFee");
            return (Criteria) this;
        }

        public Criteria andAdjustFeeBetween(Double value1, Double value2) {
            addCriterion("adjust_fee between", value1, value2, "adjustFee");
            return (Criteria) this;
        }

        public Criteria andAdjustFeeNotBetween(Double value1, Double value2) {
            addCriterion("adjust_fee not between", value1, value2, "adjustFee");
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

        public Criteria andBuyerRateFlagIsNull() {
            addCriterion("buyer_rate_flag is null");
            return (Criteria) this;
        }

        public Criteria andBuyerRateFlagIsNotNull() {
            addCriterion("buyer_rate_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerRateFlagEqualTo(String value) {
            addCriterion("buyer_rate_flag =", value, "buyerRateFlag");
            return (Criteria) this;
        }

        public Criteria andBuyerRateFlagNotEqualTo(String value) {
            addCriterion("buyer_rate_flag <>", value, "buyerRateFlag");
            return (Criteria) this;
        }

        public Criteria andBuyerRateFlagGreaterThan(String value) {
            addCriterion("buyer_rate_flag >", value, "buyerRateFlag");
            return (Criteria) this;
        }

        public Criteria andBuyerRateFlagGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_rate_flag >=", value, "buyerRateFlag");
            return (Criteria) this;
        }

        public Criteria andBuyerRateFlagLessThan(String value) {
            addCriterion("buyer_rate_flag <", value, "buyerRateFlag");
            return (Criteria) this;
        }

        public Criteria andBuyerRateFlagLessThanOrEqualTo(String value) {
            addCriterion("buyer_rate_flag <=", value, "buyerRateFlag");
            return (Criteria) this;
        }

        public Criteria andBuyerRateFlagLike(String value) {
            addCriterion("buyer_rate_flag like", value, "buyerRateFlag");
            return (Criteria) this;
        }

        public Criteria andBuyerRateFlagNotLike(String value) {
            addCriterion("buyer_rate_flag not like", value, "buyerRateFlag");
            return (Criteria) this;
        }

        public Criteria andBuyerRateFlagIn(List<String> values) {
            addCriterion("buyer_rate_flag in", values, "buyerRateFlag");
            return (Criteria) this;
        }

        public Criteria andBuyerRateFlagNotIn(List<String> values) {
            addCriterion("buyer_rate_flag not in", values, "buyerRateFlag");
            return (Criteria) this;
        }

        public Criteria andBuyerRateFlagBetween(String value1, String value2) {
            addCriterion("buyer_rate_flag between", value1, value2, "buyerRateFlag");
            return (Criteria) this;
        }

        public Criteria andBuyerRateFlagNotBetween(String value1, String value2) {
            addCriterion("buyer_rate_flag not between", value1, value2, "buyerRateFlag");
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

        public Criteria andDiscountFeeIsNull() {
            addCriterion("discount_fee is null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNotNull() {
            addCriterion("discount_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeEqualTo(Double value) {
            addCriterion("discount_fee =", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotEqualTo(Double value) {
            addCriterion("discount_fee <>", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThan(Double value) {
            addCriterion("discount_fee >", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_fee >=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThan(Double value) {
            addCriterion("discount_fee <", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThanOrEqualTo(Double value) {
            addCriterion("discount_fee <=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIn(List<Double> values) {
            addCriterion("discount_fee in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotIn(List<Double> values) {
            addCriterion("discount_fee not in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeBetween(Double value1, Double value2) {
            addCriterion("discount_fee between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotBetween(Double value1, Double value2) {
            addCriterion("discount_fee not between", value1, value2, "discountFee");
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNull() {
            addCriterion("last_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIsNotNull() {
            addCriterion("last_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeEqualTo(Date value) {
            addCriterion("last_modified_time =", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotEqualTo(Date value) {
            addCriterion("last_modified_time <>", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThan(Date value) {
            addCriterion("last_modified_time >", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modified_time >=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThan(Date value) {
            addCriterion("last_modified_time <", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modified_time <=", value, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeIn(List<Date> values) {
            addCriterion("last_modified_time in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotIn(List<Date> values) {
            addCriterion("last_modified_time not in", values, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("last_modified_time between", value1, value2, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modified_time not between", value1, value2, "lastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNull() {
            addCriterion("logistics_company is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNotNull() {
            addCriterion("logistics_company is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyEqualTo(String value) {
            addCriterion("logistics_company =", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotEqualTo(String value) {
            addCriterion("logistics_company <>", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThan(String value) {
            addCriterion("logistics_company >", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company >=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThan(String value) {
            addCriterion("logistics_company <", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThanOrEqualTo(String value) {
            addCriterion("logistics_company <=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLike(String value) {
            addCriterion("logistics_company like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotLike(String value) {
            addCriterion("logistics_company not like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIn(List<String> values) {
            addCriterion("logistics_company in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotIn(List<String> values) {
            addCriterion("logistics_company not in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyBetween(String value1, String value2) {
            addCriterion("logistics_company between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotBetween(String value1, String value2) {
            addCriterion("logistics_company not between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Double value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Double value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Double value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Double value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Double value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Double value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Double> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Double> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Double value1, Double value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Double value1, Double value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andOrderFromIsNull() {
            addCriterion("order_from is null");
            return (Criteria) this;
        }

        public Criteria andOrderFromIsNotNull() {
            addCriterion("order_from is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFromEqualTo(String value) {
            addCriterion("order_from =", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotEqualTo(String value) {
            addCriterion("order_from <>", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromGreaterThan(String value) {
            addCriterion("order_from >", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromGreaterThanOrEqualTo(String value) {
            addCriterion("order_from >=", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLessThan(String value) {
            addCriterion("order_from <", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLessThanOrEqualTo(String value) {
            addCriterion("order_from <=", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromLike(String value) {
            addCriterion("order_from like", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotLike(String value) {
            addCriterion("order_from not like", value, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromIn(List<String> values) {
            addCriterion("order_from in", values, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotIn(List<String> values) {
            addCriterion("order_from not in", values, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromBetween(String value1, String value2) {
            addCriterion("order_from between", value1, value2, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderFromNotBetween(String value1, String value2) {
            addCriterion("order_from not between", value1, value2, "orderFrom");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(String value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(String value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(String value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(String value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(String value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLike(String value) {
            addCriterion("refund_status like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotLike(String value) {
            addCriterion("refund_status not like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<String> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<String> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(String value1, String value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(String value1, String value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
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

        public Criteria andSellerRateFlagIsNull() {
            addCriterion("seller_rate_flag is null");
            return (Criteria) this;
        }

        public Criteria andSellerRateFlagIsNotNull() {
            addCriterion("seller_rate_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSellerRateFlagEqualTo(String value) {
            addCriterion("seller_rate_flag =", value, "sellerRateFlag");
            return (Criteria) this;
        }

        public Criteria andSellerRateFlagNotEqualTo(String value) {
            addCriterion("seller_rate_flag <>", value, "sellerRateFlag");
            return (Criteria) this;
        }

        public Criteria andSellerRateFlagGreaterThan(String value) {
            addCriterion("seller_rate_flag >", value, "sellerRateFlag");
            return (Criteria) this;
        }

        public Criteria andSellerRateFlagGreaterThanOrEqualTo(String value) {
            addCriterion("seller_rate_flag >=", value, "sellerRateFlag");
            return (Criteria) this;
        }

        public Criteria andSellerRateFlagLessThan(String value) {
            addCriterion("seller_rate_flag <", value, "sellerRateFlag");
            return (Criteria) this;
        }

        public Criteria andSellerRateFlagLessThanOrEqualTo(String value) {
            addCriterion("seller_rate_flag <=", value, "sellerRateFlag");
            return (Criteria) this;
        }

        public Criteria andSellerRateFlagLike(String value) {
            addCriterion("seller_rate_flag like", value, "sellerRateFlag");
            return (Criteria) this;
        }

        public Criteria andSellerRateFlagNotLike(String value) {
            addCriterion("seller_rate_flag not like", value, "sellerRateFlag");
            return (Criteria) this;
        }

        public Criteria andSellerRateFlagIn(List<String> values) {
            addCriterion("seller_rate_flag in", values, "sellerRateFlag");
            return (Criteria) this;
        }

        public Criteria andSellerRateFlagNotIn(List<String> values) {
            addCriterion("seller_rate_flag not in", values, "sellerRateFlag");
            return (Criteria) this;
        }

        public Criteria andSellerRateFlagBetween(String value1, String value2) {
            addCriterion("seller_rate_flag between", value1, value2, "sellerRateFlag");
            return (Criteria) this;
        }

        public Criteria andSellerRateFlagNotBetween(String value1, String value2) {
            addCriterion("seller_rate_flag not between", value1, value2, "sellerRateFlag");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(String value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(String value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(String value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(String value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(String value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLike(String value) {
            addCriterion("sku_id like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotLike(String value) {
            addCriterion("sku_id not like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<String> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<String> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(String value1, String value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(String value1, String value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameIsNull() {
            addCriterion("sku_prop_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameIsNotNull() {
            addCriterion("sku_prop_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameEqualTo(String value) {
            addCriterion("sku_prop_name =", value, "skuPropName");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameNotEqualTo(String value) {
            addCriterion("sku_prop_name <>", value, "skuPropName");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameGreaterThan(String value) {
            addCriterion("sku_prop_name >", value, "skuPropName");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_prop_name >=", value, "skuPropName");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameLessThan(String value) {
            addCriterion("sku_prop_name <", value, "skuPropName");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameLessThanOrEqualTo(String value) {
            addCriterion("sku_prop_name <=", value, "skuPropName");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameLike(String value) {
            addCriterion("sku_prop_name like", value, "skuPropName");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameNotLike(String value) {
            addCriterion("sku_prop_name not like", value, "skuPropName");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameIn(List<String> values) {
            addCriterion("sku_prop_name in", values, "skuPropName");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameNotIn(List<String> values) {
            addCriterion("sku_prop_name not in", values, "skuPropName");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameBetween(String value1, String value2) {
            addCriterion("sku_prop_name between", value1, value2, "skuPropName");
            return (Criteria) this;
        }

        public Criteria andSkuPropNameNotBetween(String value1, String value2) {
            addCriterion("sku_prop_name not between", value1, value2, "skuPropName");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentIsNull() {
            addCriterion("total_payment is null");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentIsNotNull() {
            addCriterion("total_payment is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentEqualTo(Double value) {
            addCriterion("total_payment =", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentNotEqualTo(Double value) {
            addCriterion("total_payment <>", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentGreaterThan(Double value) {
            addCriterion("total_payment >", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("total_payment >=", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentLessThan(Double value) {
            addCriterion("total_payment <", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentLessThanOrEqualTo(Double value) {
            addCriterion("total_payment <=", value, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentIn(List<Double> values) {
            addCriterion("total_payment in", values, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentNotIn(List<Double> values) {
            addCriterion("total_payment not in", values, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentBetween(Double value1, Double value2) {
            addCriterion("total_payment between", value1, value2, "totalPayment");
            return (Criteria) this;
        }

        public Criteria andTotalPaymentNotBetween(Double value1, Double value2) {
            addCriterion("total_payment not between", value1, value2, "totalPayment");
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