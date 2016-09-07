package com.net.rytong.net.travel.model;

public class Order_info {
    private Long id;

    private Long passportId;

    private String account;

    private String accountType;

    private String userName;

    private String orderNo;

    private String airOrderNo;

    private String airOrderTypeTravelsky;

    private String airOrderType;

    private String tripType;

    private Boolean isInter;

    private Boolean isPackage;

    private Integer paxNum;

    private Integer adtNum;

    private Integer chdNum;

    private Integer infNum;

    private String status;

    private String channelNo;

    private String secondChannelNo;

    private String platform;

    private String siteCode;

    private String shoppingType;

    private String payType;

    private Long paidTime;

    private Double payAmt;

    private Double tktAmt;

    private String payCurrency;

    private Double taxAmt;

    private Double exchangeRmb;

    private Double pointAmt;

    private Double cashAmt;

    private String cashPayCurrency;

    private Double cashExchangeRmb;

    private Integer couponAmt;

    private String couponType;

    private Double couponDiscountAmt;

    private String couponPayUnit;

    private Double rate;

    private String contactName;

    private String contactMobile;

    private String contactFfpNo;

    private String contactEmail;

    private String remark;

    private Boolean isValid;

    private Long crtDt;

    private Long optDt;

    private Long versionNum;

    private String clientVersion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPassportId() {
        return passportId;
    }

    public void setPassportId(Long passportId) {
        this.passportId = passportId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getAirOrderNo() {
        return airOrderNo;
    }

    public void setAirOrderNo(String airOrderNo) {
        this.airOrderNo = airOrderNo == null ? null : airOrderNo.trim();
    }

    public String getAirOrderTypeTravelsky() {
        return airOrderTypeTravelsky;
    }

    public void setAirOrderTypeTravelsky(String airOrderTypeTravelsky) {
        this.airOrderTypeTravelsky = airOrderTypeTravelsky == null ? null : airOrderTypeTravelsky.trim();
    }

    public String getAirOrderType() {
        return airOrderType;
    }

    public void setAirOrderType(String airOrderType) {
        this.airOrderType = airOrderType == null ? null : airOrderType.trim();
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType == null ? null : tripType.trim();
    }

    public Boolean getIsInter() {
        return isInter;
    }

    public void setIsInter(Boolean isInter) {
        this.isInter = isInter;
    }

    public Boolean getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(Boolean isPackage) {
        this.isPackage = isPackage;
    }

    public Integer getPaxNum() {
        return paxNum;
    }

    public void setPaxNum(Integer paxNum) {
        this.paxNum = paxNum;
    }

    public Integer getAdtNum() {
        return adtNum;
    }

    public void setAdtNum(Integer adtNum) {
        this.adtNum = adtNum;
    }

    public Integer getChdNum() {
        return chdNum;
    }

    public void setChdNum(Integer chdNum) {
        this.chdNum = chdNum;
    }

    public Integer getInfNum() {
        return infNum;
    }

    public void setInfNum(Integer infNum) {
        this.infNum = infNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo == null ? null : channelNo.trim();
    }

    public String getSecondChannelNo() {
        return secondChannelNo;
    }

    public void setSecondChannelNo(String secondChannelNo) {
        this.secondChannelNo = secondChannelNo == null ? null : secondChannelNo.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode == null ? null : siteCode.trim();
    }

    public String getShoppingType() {
        return shoppingType;
    }

    public void setShoppingType(String shoppingType) {
        this.shoppingType = shoppingType == null ? null : shoppingType.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public Long getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Long paidTime) {
        this.paidTime = paidTime;
    }

    public Double getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(Double payAmt) {
        this.payAmt = payAmt;
    }

    public Double getTktAmt() {
        return tktAmt;
    }

    public void setTktAmt(Double tktAmt) {
        this.tktAmt = tktAmt;
    }

    public String getPayCurrency() {
        return payCurrency;
    }

    public void setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency == null ? null : payCurrency.trim();
    }

    public Double getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(Double taxAmt) {
        this.taxAmt = taxAmt;
    }

    public Double getExchangeRmb() {
        return exchangeRmb;
    }

    public void setExchangeRmb(Double exchangeRmb) {
        this.exchangeRmb = exchangeRmb;
    }

    public Double getPointAmt() {
        return pointAmt;
    }

    public void setPointAmt(Double pointAmt) {
        this.pointAmt = pointAmt;
    }

    public Double getCashAmt() {
        return cashAmt;
    }

    public void setCashAmt(Double cashAmt) {
        this.cashAmt = cashAmt;
    }

    public String getCashPayCurrency() {
        return cashPayCurrency;
    }

    public void setCashPayCurrency(String cashPayCurrency) {
        this.cashPayCurrency = cashPayCurrency == null ? null : cashPayCurrency.trim();
    }

    public Double getCashExchangeRmb() {
        return cashExchangeRmb;
    }

    public void setCashExchangeRmb(Double cashExchangeRmb) {
        this.cashExchangeRmb = cashExchangeRmb;
    }

    public Integer getCouponAmt() {
        return couponAmt;
    }

    public void setCouponAmt(Integer couponAmt) {
        this.couponAmt = couponAmt;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType == null ? null : couponType.trim();
    }

    public Double getCouponDiscountAmt() {
        return couponDiscountAmt;
    }

    public void setCouponDiscountAmt(Double couponDiscountAmt) {
        this.couponDiscountAmt = couponDiscountAmt;
    }

    public String getCouponPayUnit() {
        return couponPayUnit;
    }

    public void setCouponPayUnit(String couponPayUnit) {
        this.couponPayUnit = couponPayUnit == null ? null : couponPayUnit.trim();
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile == null ? null : contactMobile.trim();
    }

    public String getContactFfpNo() {
        return contactFfpNo;
    }

    public void setContactFfpNo(String contactFfpNo) {
        this.contactFfpNo = contactFfpNo == null ? null : contactFfpNo.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Long getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Long crtDt) {
        this.crtDt = crtDt;
    }

    public Long getOptDt() {
        return optDt;
    }

    public void setOptDt(Long optDt) {
        this.optDt = optDt;
    }

    public Long getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(Long versionNum) {
        this.versionNum = versionNum;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion == null ? null : clientVersion.trim();
    }

	@Override
	public String toString() {
		return "Order_info [id=" + id + ", passportId=" + passportId
				+ ", account=" + account + ", accountType=" + accountType
				+ ", userName=" + userName + ", orderNo=" + orderNo
				+ ", airOrderNo=" + airOrderNo + ", airOrderTypeTravelsky="
				+ airOrderTypeTravelsky + ", airOrderType=" + airOrderType
				+ ", tripType=" + tripType + ", isInter=" + isInter
				+ ", isPackage=" + isPackage + ", paxNum=" + paxNum
				+ ", adtNum=" + adtNum + ", chdNum=" + chdNum + ", infNum="
				+ infNum + ", status=" + status + ", channelNo=" + channelNo
				+ ", secondChannelNo=" + secondChannelNo + ", platform="
				+ platform + ", siteCode=" + siteCode + ", shoppingType="
				+ shoppingType + ", payType=" + payType + ", paidTime="
				+ paidTime + ", payAmt=" + payAmt + ", tktAmt=" + tktAmt
				+ ", payCurrency=" + payCurrency + ", taxAmt=" + taxAmt
				+ ", exchangeRmb=" + exchangeRmb + ", pointAmt=" + pointAmt
				+ ", cashAmt=" + cashAmt + ", cashPayCurrency="
				+ cashPayCurrency + ", cashExchangeRmb=" + cashExchangeRmb
				+ ", couponAmt=" + couponAmt + ", couponType=" + couponType
				+ ", couponDiscountAmt=" + couponDiscountAmt
				+ ", couponPayUnit=" + couponPayUnit + ", rate=" + rate
				+ ", contactName=" + contactName + ", contactMobile="
				+ contactMobile + ", contactFfpNo=" + contactFfpNo
				+ ", contactEmail=" + contactEmail + ", remark=" + remark
				+ ", isValid=" + isValid + ", crtDt=" + crtDt + ", optDt="
				+ optDt + ", versionNum=" + versionNum + ", clientVersion="
				+ clientVersion + "]";
	}

    
}