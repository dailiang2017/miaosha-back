package com.dail.miaosha.mapper;

import com.dail.miaosha.model.SeckillScene;
import com.dail.miaosha.model.SeckillSceneExample;
import org.springframework.stereotype.Repository;

/**
 * SeckillSceneDAO继承基类
 */
@Repository
public interface SeckillSceneDAO extends MyBatisBaseDao<SeckillScene, Long, SeckillSceneExample> {
}