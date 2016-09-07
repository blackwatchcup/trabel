/**
 * 
 */
package com.net.rytong.net.travel.result;

import java.util.List;

/**
 *@describe：
 *@author: blank
 *@date： 日期：2016年9月6日 时间：下午12:15:16
 *@version 1.0
 */
public class Dataset {
	private String label;
	private String fillColor;
	private String strokeColor;
	private String pointColor;
	private String pointStrokeColor;
	private String pointHighlightFill;
	private String pointHighlightStroke;
	private List<String> data;
	public Dataset(String label,List<String> data) {
		super();
		this.label = label;
		this.fillColor = "rgba(220,220,220,0.0)";
		this.strokeColor = "rgba(75,144,249,1)";
		this.pointColor = "rgba(222,16,16,1)";
		this.pointStrokeColor = "#fff";
		this.pointHighlightFill =  "#fff";
		this.pointHighlightStroke = "rgba(222,16,16,1)";
		this.data = data;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getStrokeColor() {
		return strokeColor;
	}
	public void setStrokeColor(String strokeColor) {
		this.strokeColor = strokeColor;
	}
	public String getPointColor() {
		return pointColor;
	}
	public void setPointColor(String pointColor) {
		this.pointColor = pointColor;
	}
	public String getPointStrokeColor() {
		return pointStrokeColor;
	}
	public void setPointStrokeColor(String pointStrokeColor) {
		this.pointStrokeColor = pointStrokeColor;
	}
	public String getPointHighlightFill() {
		return pointHighlightFill;
	}
	public void setPointHighlightFill(String pointHighlightFill) {
		this.pointHighlightFill = pointHighlightFill;
	}
	public String getPointHighlightStroke() {
		return pointHighlightStroke;
	}
	public void setPointHighlightStroke(String pointHighlightStroke) {
		this.pointHighlightStroke = pointHighlightStroke;
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
}
