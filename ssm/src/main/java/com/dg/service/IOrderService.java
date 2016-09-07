package com.dg.service;

import java.util.List;

import com.dg.bean.OrderInfoBean;

public interface IOrderService {

	public OrderInfoBean getOrderByPK(String ordDate, String ordId);

	public List<OrderInfoBean> getOrdersByCond(String startDate, String endDate);

	public void removeOrder(String ordDate, String ordId);
}
