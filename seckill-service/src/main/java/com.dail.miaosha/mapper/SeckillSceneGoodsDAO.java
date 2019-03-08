package com.dail.miaosha.mapper;

import com.dail.miaosha.model.SeckillSceneGoods;
import com.dail.miaosha.model.SeckillSceneGoodsExample;
import org.springframework.stereotype.Repository;

/**
 * SeckillSceneGoodsDAO继承基类
 */
@Repository
public interface SeckillSceneGoodsDAO extends MyBatisBaseDao<SeckillSceneGoods, Long, SeckillSceneGoodsExample> {
}