package com.dail.miaosha.mapper;

import com.dail.miaosha.model.SeckillOrder;
import com.dail.miaosha.model.SeckillOrderExample;
import org.springframework.stereotype.Repository;

/**
 * SeckillOrderDAO继承基类
 */
@Repository
public interface SeckillOrderDAO extends MyBatisBaseDao<SeckillOrder, Long, SeckillOrderExample> {
}