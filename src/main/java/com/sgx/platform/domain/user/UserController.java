package com.sgx.platform.domain.user;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

	@RequestMapping(value = "/add",method = RequestMethod.POST)
	@ApiOperation(value="测试用户", notes="用户测试接口详细描述")
	public void add(@ApiParam(required=true, name="name", value="姓名")
					@RequestParam(name = "name") String name,
					@ApiParam(required=true, name="age", value="年龄")
					@RequestParam(name = "age") Integer age) throws Exception {
		userService.insert(new User(name,age,1));
	}

	@RequestMapping(value = "/del",method = RequestMethod.POST)
	@ApiOperation(value="删除用户", notes="删除用户接口详细描述")
	public String del(@ApiParam(required=true, name="name", value="姓名")
					@RequestParam(name = "name") String name) throws Exception {
		Wrapper<User> userWrapper = new EntityWrapper<User>();
		userWrapper.eq("name",name);
		userService.delete(userWrapper);
		return "DEL Sucess";
	}

	@RequestMapping(value = "/edit",method = RequestMethod.POST)
	@ApiOperation(value="编辑用户", notes="编辑用户接口详细描述")
	public String edit(@ApiParam(required=true, name="name", value="姓名")
					  @RequestParam(name = "name") String name,
					   @ApiParam(required=true, name="age", value="年龄")
	@RequestParam(name = "age") Integer age) throws Exception {
		userService.insertOrUpdate(new User(name,age,1));
		return "Edit Sucess";
	}


	@RequestMapping(value = "/list",method = RequestMethod.GET)
	@ApiOperation(value="列出所有用户", notes="列出所有用户")
	public List<User> findAll() throws Exception {
		Wrapper<User> wrapper = new EntityWrapper<User>();
		return userService.selectList(wrapper);
	}

}
