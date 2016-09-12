package com.net.rytong.net.travel.dao;

import java.math.BigInteger;
import java.util.List;

import com.net.rytong.net.travel.model.Pax_seg;
import com.net.rytong.net.travel.result.Pageflight;

public interface Pax_segMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Pax_seg record);

    int insertSelective(Pax_seg record);

    Pax_seg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Pax_seg record);

    int updateByPrimaryKey(Pax_seg record);
    /**
     * 
     * @describe 返回符合条件的航班信息
     * @return list
     * @author zzw
     * 2016年9月12日 下午4:07:22
     */
    List<Pageflight> flightBynumber(String flight ,	BigInteger start,BigInteger end);
    /**
     * 
     * @describe 返回符合条件的所有航班信息总数
     * @param flight
     * @param start
     * @param end
     * @return int 
     * @author zzw 
     * 2016年9月12日 下午4:10:24
     */
    int flightcount(String flight ,	BigInteger start,BigInteger end);
}