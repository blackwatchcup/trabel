package com.dg.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dg.bean.OrderInfoBean;
import com.dg.bean.OrderInfoBeanKey;
import com.dg.dao.IOrderDao;
import com.dg.service.IOrderService;

@Service("orderService")
public class OrderServiceImpl implements IOrderService {

	@Resource(name = "orderDao")
	private IOrderDao orderDao;

	public OrderInfoBean getOrderByPK(String ordDate, String ordId) {

		OrderInfoBeanKey key = new OrderInfoBeanKey();
		key.setOrdDate(ordDate);
		key.setOrdId(ordId);
		return orderDao.selectByPrimaryKey(key);

	}

	@Override
	public List<OrderInfoBean> getOrdersByCond(String startDate, String endDate) {

		return orderDao.selectByDate(startDate, endDate);
	}

	@Override
	public void removeOrder(String ordDate, String ordId) {
		OrderInfoBeanKey key = new OrderInfoBeanKey();
		key.setOrdDate(ordDate);
		key.setOrdId(ordId);
		orderDao.deleteByPrimaryKey(key);
	}

}
