package com.wangjubao.dolphin.pojo.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NbfBuyerRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NbfBuyerRateExample() {
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

        public Criteria andRateContentIsNull() {
            addCriterion("rate_content is null");
            return (Criteria) this;
        }

        public Criteria andRateContentIsNotNull() {
            addCriterion("rate_content is not null");
            return (Criteria) this;
        }

        public Criteria andRateContentEqualTo(String value) {
            addCriterion("rate_content =", value, "rateContent");
            return (Criteria) this;
        }

        public Criteria andRateContentNotEqualTo(String value) {
            addCriterion("rate_content <>", value, "rateContent");
            return (Criteria) this;
        }

        public Criteria andRateContentGreaterThan(String value) {
            addCriterion("rate_content >", value, "rateContent");
            return (Criteria) this;
        }

        public Criteria andRateContentGreaterThanOrEqualTo(String value) {
            addCriterion("rate_content >=", value, "rateContent");
            return (Criteria) this;
        }

        public Criteria andRateContentLessThan(String value) {
            addCriterion("rate_content <", value, "rateContent");
            return (Criteria) this;
        }

        public Criteria andRateContentLessThanOrEqualTo(String value) {
            addCriterion("rate_content <=", value, "rateContent");
            return (Criteria) this;
        }

        public Criteria andRateContentLike(String value) {
            addCriterion("rate_content like", value, "rateContent");
            return (Criteria) this;
        }

        public Criteria andRateContentNotLike(String value) {
            addCriterion("rate_content not like", value, "rateContent");
            return (Criteria) this;
        }

        public Criteria andRateContentIn(List<String> values) {
            addCriterion("rate_content in", values, "rateContent");
            return (Criteria) this;
        }

        public Criteria andRateContentNotIn(List<String> values) {
            addCriterion("rate_content not in", values, "rateContent");
            return (Criteria) this;
        }

        public Criteria andRateContentBetween(String value1, String value2) {
            addCriterion("rate_content between", value1, value2, "rateContent");
            return (Criteria) this;
        }

        public Criteria andRateContentNotBetween(String value1, String value2) {
            addCriterion("rate_content not between", value1, value2, "rateContent");
            return (Criteria) this;
        }

        public Criteria andRateLabelIsNull() {
            addCriterion("rate_label is null");
            return (Criteria) this;
        }

        public Criteria andRateLabelIsNotNull() {
            addCriterion("rate_label is not null");
            return (Criteria) this;
        }

        public Criteria andRateLabelEqualTo(String value) {
            addCriterion("rate_label =", value, "rateLabel");
            return (Criteria) this;
        }

        public Criteria andRateLabelNotEqualTo(String value) {
            addCriterion("rate_label <>", value, "rateLabel");
            return (Criteria) this;
        }

        public Criteria andRateLabelGreaterThan(String value) {
            addCriterion("rate_label >", value, "rateLabel");
            return (Criteria) this;
        }

        public Criteria andRateLabelGreaterThanOrEqualTo(String value) {
            addCriterion("rate_label >=", value, "rateLabel");
            return (Criteria) this;
        }

        public Criteria andRateLabelLessThan(String value) {
            addCriterion("rate_label <", value, "rateLabel");
            return (Criteria) this;
        }

        public Criteria andRateLabelLessThanOrEqualTo(String value) {
            addCriterion("rate_label <=", value, "rateLabel");
            return (Criteria) this;
        }

        public Criteria andRateLabelLike(String value) {
            addCriterion("rate_label like", value, "rateLabel");
            return (Criteria) this;
        }

        public Criteria andRateLabelNotLike(String value) {
            addCriterion("rate_label not like", value, "rateLabel");
            return (Criteria) this;
        }

        public Criteria andRateLabelIn(List<String> values) {
            addCriterion("rate_label in", values, "rateLabel");
            return (Criteria) this;
        }

        public Criteria andRateLabelNotIn(List<String> values) {
            addCriterion("rate_label not in", values, "rateLabel");
            return (Criteria) this;
        }

        public Criteria andRateLabelBetween(String value1, String value2) {
            addCriterion("rate_label between", value1, value2, "rateLabel");
            return (Criteria) this;
        }

        public Criteria andRateLabelNotBetween(String value1, String value2) {
            addCriterion("rate_label not between", value1, value2, "rateLabel");
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