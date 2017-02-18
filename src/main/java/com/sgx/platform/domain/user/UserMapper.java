package com.sgx.platform.domain.user;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 *
 * User 表数据库控制层接口
 *
 */
public interface UserMapper extends BaseMapper<User> {

	/**
	 * 自定义注入方法
	 */
	int deleteAll();

}