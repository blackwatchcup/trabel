/**
 * 
 */
package com.net.rytong.net.travel.result;

import java.util.List;

/**
 *@describe：
 *@author: blank
 *@date： 日期：2016年9月6日 时间：上午11:26:09
 *@version 1.0
 */
public class Linedatas {
	private List<String> labels;
	private List<Dataset> datasets;
	
	public Linedatas(List<String> labels, List<Dataset> datasets) {
		super();
		this.labels = labels;
		this.datasets = datasets;
	}
	public List<String> getLabels() {
		return labels;
	}
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
	public List<Dataset> getDatasets() {
		return datasets;
	}
	public void setDatasets(List<Dataset> datasets) {
		this.datasets = datasets;
	}
	
}
