package com.net.rytong.net.travel.dao;

import com.net.rytong.net.travel.model.Pax_seg;

public interface Pax_segMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Pax_seg record);

    int insertSelective(Pax_seg record);

    Pax_seg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Pax_seg record);

    int updateByPrimaryKey(Pax_seg record);
}