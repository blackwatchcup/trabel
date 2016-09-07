package com.dg.bean;

import java.io.Serializable;

public class OrderInfoBeanKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1481061391573274421L;

	private String ordDate;

    private String ordId;

    public String getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(String ordDate) {
        this.ordDate = ordDate == null ? null : ordDate.trim();
    }

    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId == null ? null : ordId.trim();
    }
}