package com.dail.miaosha.mapper;

import com.dail.miaosha.model.Goods;
import com.dail.miaosha.model.GoodsExample;
import org.springframework.stereotype.Repository;

/**
 * GoodsDAO继承基类
 */
@Repository
public interface GoodsDAO extends MyBatisBaseDao<Goods, Long, GoodsExample> {
}