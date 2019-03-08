package com.dail.miaosha.mapper;

import com.dail.miaosha.model.SeckillGoods;
import com.dail.miaosha.model.SeckillGoodsExample;
import org.springframework.stereotype.Repository;

/**
 * SeckillGoodsDAO继承基类
 */
@Repository
public interface SeckillGoodsDAO extends MyBatisBaseDao<SeckillGoods, Long, SeckillGoodsExample> {
}