package com.net.rytong.net.travel.service;

import java.math.BigInteger;
import java.util.List;

import com.net.rytong.net.travel.result.Count_flight_result;




/**
 * 
*@describe：
*@author: zzw
*@date： 日期：2016年9月1日 时间：下午4:02:40
*@version 1.0
 */
public interface CountFlightService {
	
	//获取确定航班与时间点集
	List<Count_flight_result> getcountlist(BigInteger opt_dt_start,BigInteger opt_dt_end,String market_flight_no);
}
