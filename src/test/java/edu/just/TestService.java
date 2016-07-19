package edu.just;
import javax.annotation.Resource;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import com.alibaba.fastjson.JSON;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.just.model.User;
import edu.just.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestService {
	private static Logger logger = Logger.getLogger(TestService.class);
	@Resource
	private UserService userService = null;

	// @Before
	// public void before() {
	// ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	// userService = (IUserService) ac.getBean("userService");
	// }

	@Test
	public void test1() {
		User user = userService.getUserById(2);
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		System.out.println(user);
		logger.info(JSON.toJSONString(user));
	}

}
