/**
 * 
 */
package com.net.rytong.net.travel.result;

/**
 *@describe：用于包装各个舱位销售情况实体类
 *@author: zzw
 *@date： 日期：2016年9月1日 时间：下午4:05:22
 *@version 1.0
 */
public class Count_flight_result {
	private int count;
	private char cabin_code;
	
	
	public Count_flight_result() {
		super();
	}
	public Count_flight_result(int count, char cabin_code) {
		super();
		this.count = count;
		this.cabin_code = cabin_code;
	}
	
	@Override
	public String toString() {
		return "Count_flight_result [count=" + count + ", cabin_code="
				+ cabin_code + "]";
	}
	public int getCount() {
		return count;
	}
	public void Count(int count) {
		this.count = count;
	}
	public char getCabin_code() {
		return cabin_code;
	}
	public void Cabin_code(char cabin_code) {
		this.cabin_code = cabin_code;
	}
	
}
