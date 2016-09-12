/**
 * 
 */
package com.net.rytong.net.travel.result;

import com.net.rytong.net.travel.util.PageHelper;

/**
 *@describe：返回结果集实体类
 *@author: zzw
 *@date： 日期：2016年9月12日 时间：下午2:23:46
 *@version 1.0
 */
public class Pageflight extends PageHelper<Pageflight>{
	private String flight;
	private Integer count;
	private double max;
	private double min;
	public String getFlight() {
		return flight;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	@Override
	public String toString() {
		return "Pageflight [flight=" + flight + ", count=" + count + ", max="
				+ max + ", min=" + min + "]";
	}
	
}
