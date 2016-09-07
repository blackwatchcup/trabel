package com.dg;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dg.bean.OrderInfoBean;
import com.dg.service.IOrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class SSMTest {

	private static Logger logger = Logger.getLogger(SSMTest.class);

	@Resource(name = "orderService")
	private IOrderService orderService = null;

	/**
	 * 测试Spring 和 Mybatis 整合效果
	 */
	@Test
	public void testSM() {
		
		// 如果没自动加载机制得用下边的
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//		orderService = (IOrderService) context.getBean("orderService");
		OrderInfoBean orderInfo = orderService.getOrderByPK("20150817", "00181340000068");
		logger.info("orderInfo："+orderInfo.toString());  
	}
}
