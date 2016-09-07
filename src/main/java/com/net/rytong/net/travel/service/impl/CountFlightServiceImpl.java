package com.net.rytong.net.travel.service.impl;
import java.math.BigInteger;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.net.rytong.net.travel.dao.Order_infoMapper;
import com.net.rytong.net.travel.result.Count_flight_result;
import com.net.rytong.net.travel.service.CountFlightService;
/**
 * 
*@describe：航班销售数量service实现类
*@author: zzw
*@date： 日期：2016年9月1日 时间：下午4:01:29
*@version 1.0
 */
@Service
public class CountFlightServiceImpl implements CountFlightService{
		
	@Resource
	private Order_infoMapper order_info;
	@Override
	public List<Count_flight_result> getcountlist(BigInteger opt_dt_start,
			BigInteger opt_dt_end, String market_flight_no) {
		List<Count_flight_result> list = order_info.get_count_result(opt_dt_start, opt_dt_end, market_flight_no);
		return list;
	}

}
