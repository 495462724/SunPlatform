package com.sgx.platform.domain.user;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class StandardUserService extends ServiceImpl<UserMapper, User> {

	public boolean deleteAll() {
		return retBool(baseMapper.deleteAll());
	}

}