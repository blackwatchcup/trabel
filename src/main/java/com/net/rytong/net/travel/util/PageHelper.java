package com.net.rytong.net.travel.util;

/**
 * ��ҳ�����࣬��װ��ҳ�������ݣ����ṩ����֧��
 * @param <T>
 */
public class PageHelper<T> {
	private int pageIndex;		// ��ǰҳ
	private int start;	// ��ǰҳ��ʼ��¼��
	private int limit;	// ÿҳ��С
	
	public PageHelper() {
		super();
	}
	
	public PageHelper(int pageIndex, int limit) {
		this.pageIndex = pageIndex > 1 ? pageIndex : 1; // ��ҳ��С��1��ʱ����ʾ��һҳ��û��С��0��ҳ��
		this.limit = limit;
	}

	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start; // ÿҳ��ʼ��¼��
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
}
