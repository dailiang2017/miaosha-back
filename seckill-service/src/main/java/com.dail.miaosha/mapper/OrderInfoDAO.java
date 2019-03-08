package com.dail.miaosha.mapper;

import com.dail.miaosha.model.OrderInfo;
import com.dail.miaosha.model.OrderInfoExample;
import org.springframework.stereotype.Repository;

/**
 * OrderInfoDAO继承基类
 */
@Repository
public interface OrderInfoDAO extends MyBatisBaseDao<OrderInfo, Long, OrderInfoExample> {
}