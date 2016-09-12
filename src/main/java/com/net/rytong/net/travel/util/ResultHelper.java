package com.net.rytong.net.travel.util;

/**
 * ��������
 * 
 */
public class ResultHelper {
	private Object rows; 		// ��ݼ���
	private Integer results;	// ��¼����
	private Integer code; 		// �Ƿ���ڴ���
	private String message;		// �����Ϣ

	public ResultHelper() {
		super();
	}

	public ResultHelper(Object rows, Integer results) {
		super();
		this.rows = rows;
		this.results = results;
	}

	public ResultHelper(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public ResultHelper(Object rows, Integer results, Integer code,
			String message) {
		super();
		this.rows = rows;
		this.results = results;
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}

	public Integer getResults() {
		return results;
	}

	public void setResults(Integer results) {
		this.results = results;
	}
}
