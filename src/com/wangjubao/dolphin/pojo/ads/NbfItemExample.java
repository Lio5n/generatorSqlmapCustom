package com.wangjubao.dolphin.pojo.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NbfItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NbfItemExample() {
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

        public Criteria andCategoryTypeIsNull() {
            addCriterion("category_type is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIsNotNull() {
            addCriterion("category_type is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeEqualTo(Long value) {
            addCriterion("category_type =", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotEqualTo(Long value) {
            addCriterion("category_type <>", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeGreaterThan(Long value) {
            addCriterion("category_type >", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("category_type >=", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeLessThan(Long value) {
            addCriterion("category_type <", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeLessThanOrEqualTo(Long value) {
            addCriterion("category_type <=", value, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeIn(List<Long> values) {
            addCriterion("category_type in", values, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotIn(List<Long> values) {
            addCriterion("category_type not in", values, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeBetween(Long value1, Long value2) {
            addCriterion("category_type between", value1, value2, "categoryType");
            return (Criteria) this;
        }

        public Criteria andCategoryTypeNotBetween(Long value1, Long value2) {
            addCriterion("category_type not between", value1, value2, "categoryType");
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

        public Criteria andOuterIdIsNull() {
            addCriterion("outer_id is null");
            return (Criteria) this;
        }

        public Criteria andOuterIdIsNotNull() {
            addCriterion("outer_id is not null");
            return (Criteria) this;
        }

        public Criteria andOuterIdEqualTo(String value) {
            addCriterion("outer_id =", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotEqualTo(String value) {
            addCriterion("outer_id <>", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThan(String value) {
            addCriterion("outer_id >", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdGreaterThanOrEqualTo(String value) {
            addCriterion("outer_id >=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThan(String value) {
            addCriterion("outer_id <", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLessThanOrEqualTo(String value) {
            addCriterion("outer_id <=", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdLike(String value) {
            addCriterion("outer_id like", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotLike(String value) {
            addCriterion("outer_id not like", value, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdIn(List<String> values) {
            addCriterion("outer_id in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotIn(List<String> values) {
            addCriterion("outer_id not in", values, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdBetween(String value1, String value2) {
            addCriterion("outer_id between", value1, value2, "outerId");
            return (Criteria) this;
        }

        public Criteria andOuterIdNotBetween(String value1, String value2) {
            addCriterion("outer_id not between", value1, value2, "outerId");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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