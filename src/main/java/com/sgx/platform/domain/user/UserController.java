package com.sgx.platform.domain.user;

import com.baomidou.mybatisplus.plugins.Page;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 代码生成器，参考源码测试用例：
 * 
 * /mybatis-plus/src/test/java/com/baomidou/mybatisplus/test/generator/MysqlGenerator.java
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {


	@Autowired
	private StandardUserService userService;

	@RequestMapping(value = "/test",method = RequestMethod.GET)
	@ApiOperation(value="测试用户", notes="用户测试接口详细描述")
	public void findByName() throws Exception {
		userService.insert(new User("CCC",20,1));
		Page<User> userPage = new Page<User>();
		userPage.setSize(4);
		userPage.setCurrent(10);
		userPage = userService.selectPage(userPage);
		System.out.println("======" + userPage);
	}

}
