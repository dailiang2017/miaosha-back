package com.dail.miaosha.mapper;

import com.dail.miaosha.model.UserInfo;
import com.dail.miaosha.model.UserInfoExample;
import org.springframework.stereotype.Repository;

/**
 * UserInfoDAO继承基类
 */
@Repository
public interface UserInfoDAO extends MyBatisBaseDao<UserInfo, Long, UserInfoExample> {
}