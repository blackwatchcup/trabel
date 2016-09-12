/**
 * 
 */
package com.net.rytong.net.travel.result;

import java.util.List;

/**
 *@describe：
 *@author: blank
 *@date： 日期：2016年9月9日 时间：下午1:19:43
 *@version 1.0
 */
public class Series {
	private String name;
	private List<Integer> data;
	private boolean visible;
	
	
	
	public Series(String name, List<Integer> data, boolean visible) {
		super();
		this.name = name;
		this.data = data;
		this.visible = visible;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getData() {
		return data;
	}
	public void setData(List<Integer> data) {
		this.data = data;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	@Override
	public String toString() {
		return "Series [name=" + name + ", data=" + data + ", visible="
				+ visible + "]";
	}
	
	
}
