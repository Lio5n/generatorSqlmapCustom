package com.wangjubao.dolphin.pojo.ads;

import java.util.Date;

public class NbfTrade {
    private Date adsCreateTime;

    private Date adsLastUpdateTime;

    private Long buyerId;

    private String buyerMessage;

    private String buyerRateStatus;

    private Date consignTime;

    private Date createdTime;

    private Date endTime;

    private Double payment;

    private Date payTime;

    private Long payWeek;

    private Double postFee;

    private String postService;

    private String promotionDetails;

    private Long sellerFlag;

    private Long sellerId;

    private Long status;

    private String stepTradeStatus;

    private String tradeFrom;

    private Long tradeId;

    private String tradeNote;

    private String tradeType;

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

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    public String getBuyerRateStatus() {
        return buyerRateStatus;
    }

    public void setBuyerRateStatus(String buyerRateStatus) {
        this.buyerRateStatus = buyerRateStatus == null ? null : buyerRateStatus.trim();
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Long getPayWeek() {
        return payWeek;
    }

    public void setPayWeek(Long payWeek) {
        this.payWeek = payWeek;
    }

    public Double getPostFee() {
        return postFee;
    }

    public void setPostFee(Double postFee) {
        this.postFee = postFee;
    }

    public String getPostService() {
        return postService;
    }

    public void setPostService(String postService) {
        this.postService = postService == null ? null : postService.trim();
    }

    public String getPromotionDetails() {
        return promotionDetails;
    }

    public void setPromotionDetails(String promotionDetails) {
        this.promotionDetails = promotionDetails == null ? null : promotionDetails.trim();
    }

    public Long getSellerFlag() {
        return sellerFlag;
    }

    public void setSellerFlag(Long sellerFlag) {
        this.sellerFlag = sellerFlag;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getStepTradeStatus() {
        return stepTradeStatus;
    }

    public void setStepTradeStatus(String stepTradeStatus) {
        this.stepTradeStatus = stepTradeStatus == null ? null : stepTradeStatus.trim();
    }

    public String getTradeFrom() {
        return tradeFrom;
    }

    public void setTradeFrom(String tradeFrom) {
        this.tradeFrom = tradeFrom == null ? null : tradeFrom.trim();
    }

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public String getTradeNote() {
        return tradeNote;
    }

    public void setTradeNote(String tradeNote) {
        this.tradeNote = tradeNote == null ? null : tradeNote.trim();
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
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