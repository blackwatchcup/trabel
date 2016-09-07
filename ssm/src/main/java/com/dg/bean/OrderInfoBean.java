package com.dg.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderInfoBean extends OrderInfoBeanKey implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5734989058501028423L;

	private String createTime;

    private String lstUpdTime;

    private String txnTime;

    private String transStat;

    private String noticeStat;

    private String txnType;

    private String txnSubType;

    private String bizType;

    private String accessType;

    private String accessMode;

    private String inBatchDate;

    private String inBatchId;

    private String signMethod;

    private String version;

    private String merId;

    private String merOrderId;

    private String subMerId;

    private String signKeyVersion;

    private String payTimeOut;

    private String payType;

    private String channelId;

    private String channelDate;

    private String channelSeqId;

    private String channelSuccTime;

    private String succTime;

    private String reconStat;

    private String reconTime;

    private String backUrl;

    private String frontUrl;

    private String currency;

    private String preAuthId;

    private String txnAmt;

    private String orderAmt;

    private String feeAmt;

    private String dcType;

    private String settleStatus;

    private String settleAmount;

    private String settleCurrency;

    private String exchangeRate;

    private String settleDate;

    private String exchangeDate;

    private String errMsg;

    private String customerIp;

    private String priv;

    private String clientAgent;

    private String appId;

    private String traceNo;

    private String orgOrdDate;

    private String orgOrdId;

    private String canRefAmt;

    private BigDecimal refCnt;

    private String refAmt;

    private String acqCode;

    private String merResv1;

    private String subject;

    private String body;

    private String transDate;

    private String transSeqId;

    private String resv1;

    private String resv2;

    private String resv3;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getLstUpdTime() {
        return lstUpdTime;
    }

    public void setLstUpdTime(String lstUpdTime) {
        this.lstUpdTime = lstUpdTime == null ? null : lstUpdTime.trim();
    }

    public String getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(String txnTime) {
        this.txnTime = txnTime == null ? null : txnTime.trim();
    }

    public String getTransStat() {
        return transStat;
    }

    public void setTransStat(String transStat) {
        this.transStat = transStat == null ? null : transStat.trim();
    }

    public String getNoticeStat() {
        return noticeStat;
    }

    public void setNoticeStat(String noticeStat) {
        this.noticeStat = noticeStat == null ? null : noticeStat.trim();
    }

    public String getTxnType() {
        return txnType;
    }

    public void setTxnType(String txnType) {
        this.txnType = txnType == null ? null : txnType.trim();
    }

    public String getTxnSubType() {
        return txnSubType;
    }

    public void setTxnSubType(String txnSubType) {
        this.txnSubType = txnSubType == null ? null : txnSubType.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType == null ? null : accessType.trim();
    }

    public String getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode == null ? null : accessMode.trim();
    }

    public String getInBatchDate() {
        return inBatchDate;
    }

    public void setInBatchDate(String inBatchDate) {
        this.inBatchDate = inBatchDate == null ? null : inBatchDate.trim();
    }

    public String getInBatchId() {
        return inBatchId;
    }

    public void setInBatchId(String inBatchId) {
        this.inBatchId = inBatchId == null ? null : inBatchId.trim();
    }

    public String getSignMethod() {
        return signMethod;
    }

    public void setSignMethod(String signMethod) {
        this.signMethod = signMethod == null ? null : signMethod.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getMerId() {
        return merId;
    }

    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    public String getMerOrderId() {
        return merOrderId;
    }

    public void setMerOrderId(String merOrderId) {
        this.merOrderId = merOrderId == null ? null : merOrderId.trim();
    }

    public String getSubMerId() {
        return subMerId;
    }

    public void setSubMerId(String subMerId) {
        this.subMerId = subMerId == null ? null : subMerId.trim();
    }

    public String getSignKeyVersion() {
        return signKeyVersion;
    }

    public void setSignKeyVersion(String signKeyVersion) {
        this.signKeyVersion = signKeyVersion == null ? null : signKeyVersion.trim();
    }

    public String getPayTimeOut() {
        return payTimeOut;
    }

    public void setPayTimeOut(String payTimeOut) {
        this.payTimeOut = payTimeOut == null ? null : payTimeOut.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getChannelDate() {
        return channelDate;
    }

    public void setChannelDate(String channelDate) {
        this.channelDate = channelDate == null ? null : channelDate.trim();
    }

    public String getChannelSeqId() {
        return channelSeqId;
    }

    public void setChannelSeqId(String channelSeqId) {
        this.channelSeqId = channelSeqId == null ? null : channelSeqId.trim();
    }

    public String getChannelSuccTime() {
        return channelSuccTime;
    }

    public void setChannelSuccTime(String channelSuccTime) {
        this.channelSuccTime = channelSuccTime == null ? null : channelSuccTime.trim();
    }

    public String getSuccTime() {
        return succTime;
    }

    public void setSuccTime(String succTime) {
        this.succTime = succTime == null ? null : succTime.trim();
    }

    public String getReconStat() {
        return reconStat;
    }

    public void setReconStat(String reconStat) {
        this.reconStat = reconStat == null ? null : reconStat.trim();
    }

    public String getReconTime() {
        return reconTime;
    }

    public void setReconTime(String reconTime) {
        this.reconTime = reconTime == null ? null : reconTime.trim();
    }

    public String getBackUrl() {
        return backUrl;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl == null ? null : backUrl.trim();
    }

    public String getFrontUrl() {
        return frontUrl;
    }

    public void setFrontUrl(String frontUrl) {
        this.frontUrl = frontUrl == null ? null : frontUrl.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getPreAuthId() {
        return preAuthId;
    }

    public void setPreAuthId(String preAuthId) {
        this.preAuthId = preAuthId == null ? null : preAuthId.trim();
    }

    public String getTxnAmt() {
        return txnAmt;
    }

    public void setTxnAmt(String txnAmt) {
        this.txnAmt = txnAmt == null ? null : txnAmt.trim();
    }

    public String getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(String orderAmt) {
        this.orderAmt = orderAmt == null ? null : orderAmt.trim();
    }

    public String getFeeAmt() {
        return feeAmt;
    }

    public void setFeeAmt(String feeAmt) {
        this.feeAmt = feeAmt == null ? null : feeAmt.trim();
    }

    public String getDcType() {
        return dcType;
    }

    public void setDcType(String dcType) {
        this.dcType = dcType == null ? null : dcType.trim();
    }

    public String getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus == null ? null : settleStatus.trim();
    }

    public String getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(String settleAmount) {
        this.settleAmount = settleAmount == null ? null : settleAmount.trim();
    }

    public String getSettleCurrency() {
        return settleCurrency;
    }

    public void setSettleCurrency(String settleCurrency) {
        this.settleCurrency = settleCurrency == null ? null : settleCurrency.trim();
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate == null ? null : exchangeRate.trim();
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate == null ? null : settleDate.trim();
    }

    public String getExchangeDate() {
        return exchangeDate;
    }

    public void setExchangeDate(String exchangeDate) {
        this.exchangeDate = exchangeDate == null ? null : exchangeDate.trim();
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg == null ? null : errMsg.trim();
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp == null ? null : customerIp.trim();
    }

    public String getPriv() {
        return priv;
    }

    public void setPriv(String priv) {
        this.priv = priv == null ? null : priv.trim();
    }

    public String getClientAgent() {
        return clientAgent;
    }

    public void setClientAgent(String clientAgent) {
        this.clientAgent = clientAgent == null ? null : clientAgent.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getTraceNo() {
        return traceNo;
    }

    public void setTraceNo(String traceNo) {
        this.traceNo = traceNo == null ? null : traceNo.trim();
    }

    public String getOrgOrdDate() {
        return orgOrdDate;
    }

    public void setOrgOrdDate(String orgOrdDate) {
        this.orgOrdDate = orgOrdDate == null ? null : orgOrdDate.trim();
    }

    public String getOrgOrdId() {
        return orgOrdId;
    }

    public void setOrgOrdId(String orgOrdId) {
        this.orgOrdId = orgOrdId == null ? null : orgOrdId.trim();
    }

    public String getCanRefAmt() {
        return canRefAmt;
    }

    public void setCanRefAmt(String canRefAmt) {
        this.canRefAmt = canRefAmt == null ? null : canRefAmt.trim();
    }

    public BigDecimal getRefCnt() {
        return refCnt;
    }

    public void setRefCnt(BigDecimal refCnt) {
        this.refCnt = refCnt;
    }

    public String getRefAmt() {
        return refAmt;
    }

    public void setRefAmt(String refAmt) {
        this.refAmt = refAmt == null ? null : refAmt.trim();
    }

    public String getAcqCode() {
        return acqCode;
    }

    public void setAcqCode(String acqCode) {
        this.acqCode = acqCode == null ? null : acqCode.trim();
    }

    public String getMerResv1() {
        return merResv1;
    }

    public void setMerResv1(String merResv1) {
        this.merResv1 = merResv1 == null ? null : merResv1.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate == null ? null : transDate.trim();
    }

    public String getTransSeqId() {
        return transSeqId;
    }

    public void setTransSeqId(String transSeqId) {
        this.transSeqId = transSeqId == null ? null : transSeqId.trim();
    }

    public String getResv1() {
        return resv1;
    }

    public void setResv1(String resv1) {
        this.resv1 = resv1 == null ? null : resv1.trim();
    }

    public String getResv2() {
        return resv2;
    }

    public void setResv2(String resv2) {
        this.resv2 = resv2 == null ? null : resv2.trim();
    }

    public String getResv3() {
        return resv3;
    }

    public void setResv3(String resv3) {
        this.resv3 = resv3 == null ? null : resv3.trim();
    }

	public String toString() {
		return "OrderInfoBean [createTime=" + createTime + ", lstUpdTime=" + lstUpdTime + ", txnTime=" + txnTime
				+ ", transStat=" + transStat + ", noticeStat=" + noticeStat + ", txnType=" + txnType + ", txnSubType="
				+ txnSubType + ", bizType=" + bizType + ", accessType=" + accessType + ", accessMode=" + accessMode
				+ ", inBatchDate=" + inBatchDate + ", inBatchId=" + inBatchId + ", signMethod=" + signMethod
				+ ", version=" + version + ", merId=" + merId + ", merOrderId=" + merOrderId + ", subMerId=" + subMerId
				+ ", signKeyVersion=" + signKeyVersion + ", payTimeOut=" + payTimeOut + ", payType=" + payType
				+ ", channelId=" + channelId + ", channelDate=" + channelDate + ", channelSeqId=" + channelSeqId
				+ ", channelSuccTime=" + channelSuccTime + ", succTime=" + succTime + ", reconStat=" + reconStat
				+ ", reconTime=" + reconTime + ", backUrl=" + backUrl + ", frontUrl=" + frontUrl + ", currency="
				+ currency + ", preAuthId=" + preAuthId + ", txnAmt=" + txnAmt + ", orderAmt=" + orderAmt + ", feeAmt="
				+ feeAmt + ", dcType=" + dcType + ", settleStatus=" + settleStatus + ", settleAmount=" + settleAmount
				+ ", settleCurrency=" + settleCurrency + ", exchangeRate=" + exchangeRate + ", settleDate="
				+ settleDate + ", exchangeDate=" + exchangeDate + ", errMsg=" + errMsg + ", customerIp=" + customerIp
				+ ", priv=" + priv + ", clientAgent=" + clientAgent + ", appId=" + appId + ", traceNo=" + traceNo
				+ ", orgOrdDate=" + orgOrdDate + ", orgOrdId=" + orgOrdId + ", canRefAmt=" + canRefAmt + ", refCnt="
				+ refCnt + ", refAmt=" + refAmt + ", acqCode=" + acqCode + ", merResv1=" + merResv1 + ", subject="
				+ subject + ", body=" + body + ", transDate=" + transDate + ", transSeqId=" + transSeqId + ", resv1="
				+ resv1 + ", resv2=" + resv2 + ", resv3=" + resv3 + "]";
	}
}