package com.dg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dg.bean.OrderInfoBean;
import com.dg.bean.OrderInfoBeanKey;
@Repository("orderDao")
public interface IOrderDao {
	int deleteByPrimaryKey(OrderInfoBeanKey key);

	int insert(OrderInfoBean record);

	int insertSelective(OrderInfoBean record);

	OrderInfoBean selectByPrimaryKey(OrderInfoBeanKey key);

	int updateByPrimaryKeySelective(OrderInfoBean record);

	int updateByPrimaryKey(OrderInfoBean record);

	List<OrderInfoBean> selectByDate(@Param("startDate") String startDate, @Param("endDate") String endDate);
}