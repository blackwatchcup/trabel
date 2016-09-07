package com.net.rytong.net.travel.dao;

import java.math.BigInteger;
import java.util.List;

import com.net.rytong.net.travel.model.Order_info;
import com.net.rytong.net.travel.result.Count_flight_result;

public interface Order_infoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order_info record);

    int insertSelective(Order_info record);

    Order_info selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order_info record);
  //获取所有的数据
    List<Order_info> getall();
    int updateByPrimaryKey(Order_info record);
  
    //按航班号与时间经行查询各个舱位的销售情况
    List<Count_flight_result> get_count_result(BigInteger opt_dt_start,BigInteger opt_dt_end,String market_flight_no);
}