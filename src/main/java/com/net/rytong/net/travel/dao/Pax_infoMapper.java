package com.net.rytong.net.travel.dao;

import com.net.rytong.net.travel.model.Pax_info;

public interface Pax_infoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Pax_info record);

    int insertSelective(Pax_info record);

    Pax_info selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Pax_info record);

    int updateByPrimaryKey(Pax_info record);
}