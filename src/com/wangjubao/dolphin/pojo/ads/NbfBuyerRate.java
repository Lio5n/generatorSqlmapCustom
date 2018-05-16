package com.wangjubao.dolphin.pojo.ads;

import java.util.Date;

public class NbfBuyerRate {
    private Date adsCreateTime;

    private Date adsLastUpdateTime;

    private Long buyerId;

    private String rateContent;

    private String rateLabel;

    private Long sellerId;

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

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public String getRateContent() {
        return rateContent;
    }

    public void setRateContent(String rateContent) {
        this.rateContent = rateContent == null ? null : rateContent.trim();
    }

    public String getRateLabel() {
        return rateLabel;
    }

    public void setRateLabel(String rateLabel) {
        this.rateLabel = rateLabel == null ? null : rateLabel.trim();
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
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