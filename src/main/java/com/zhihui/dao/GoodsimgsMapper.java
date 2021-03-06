package com.zhihui.dao;

import com.zhihui.entity.Goodsimgs;

import java.util.List;

public interface GoodsimgsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goodsimgs record);

    int insertSelective(Goodsimgs record);

    Goodsimgs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goodsimgs record);

    int updateByPrimaryKey(Goodsimgs record);

    List<Goodsimgs> findAllImg(Integer gid);
}