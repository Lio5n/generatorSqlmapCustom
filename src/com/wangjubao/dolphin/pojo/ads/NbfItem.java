package com.wangjubao.dolphin.pojo.ads;

import java.util.Date;

public class NbfItem {
    private Date adsCreateTime;

    private Date adsLastUpdateTime;

    private Long categoryType;

    private Long itemId;

    private String outerId;

    private Long sellerId;

    private String skuId;

    private String skuPropName;

    private String title;

    private Date wjbCreateTime;

    private Date wjbLastUpdateTime;

    public Date getAdsCreateTime() {
        return adsCreateTime;
    }

    public void setAdsCreateTime(Date adsCreateTime) {
        this.adsCreateTime = adsCreateTime;
    }

    public Date getAdsLastUpdateTime() {
        return adsLastUpdateTime;
    }

    public void setAdsLastUpdateTime(Date adsLastUpdateTime) {
        this.adsLastUpdateTime = adsLastUpdateTime;
    }

    public Long getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Long categoryType) {
        this.categoryType = categoryType;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId == null ? null : outerId.trim();
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId == null ? null : skuId.trim();
    }

    public String getSkuPropName() {
        return skuPropName;
    }

    public void setSkuPropName(String skuPropName) {
        this.skuPropName = skuPropName == null ? null : skuPropName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getWjbCreateTime() {
        return wjbCreateTime;
    }

    public void setWjbCreateTime(Date wjbCreateTime) {
        this.wjbCreateTime = wjbCreateTime;
    }

    public Date getWjbLastUpdateTime() {
        return wjbLastUpdateTime;
    }

    public void setWjbLastUpdateTime(Date wjbLastUpdateTime) {
        this.wjbLastUpdateTime = wjbLastUpdateTime;
    }
}