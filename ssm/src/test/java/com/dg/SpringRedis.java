package com.dg;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.connection.RedisSentinelConnection;
import org.springframework.data.redis.connection.RedisServer;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.dg.bean.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-redis.xml" })
public class SpringRedis {

	@Resource(name = "stringRedisTemplate")
	private StringRedisTemplate stringRedisTemplate;

	/**
	 * redis 读写测试
	 */
	@Test
	public void testSpringRedis() {

		try {
			// ApplicationContext context = new
			// ClassPathXmlApplicationContext("spring-redis.xml");
			// StringRedisTemplate stringRedisTemplate =
			// context.getBean("stringRedisTemplate",
			// StringRedisTemplate.class);
			// String读写
			stringRedisTemplate.delete("myStr");
			stringRedisTemplate.opsForValue().set("myStr", "http://yjmyzz.cnblogs.com/");
			System.out.println(stringRedisTemplate.opsForValue().get("myStr"));
			System.out.println("---------------");

			// List读写
			stringRedisTemplate.delete("myList");
			stringRedisTemplate.opsForList().rightPush("myList", "A");
			stringRedisTemplate.opsForList().rightPush("myList", "B");
			stringRedisTemplate.opsForList().leftPush("myList", "0");
			List<String> listCache = stringRedisTemplate.opsForList().range("myList", 0, -1);
			for (String s : listCache) {
				System.out.println(s);
			}
			System.out.println("---------------");

			// Set读写
			stringRedisTemplate.delete("mySet");
			stringRedisTemplate.opsForSet().add("mySet", "A");
			stringRedisTemplate.opsForSet().add("mySet", "B");
			stringRedisTemplate.opsForSet().add("mySet", "C");
			Set<String> setCache = stringRedisTemplate.opsForSet().members("mySet");
			for (String s : setCache) {
				System.out.println(s);
			}
			System.out.println("---------------");

			// Hash读写
			stringRedisTemplate.delete("myHash");
			stringRedisTemplate.opsForHash().put("myHash", "PEK", "北京");
			stringRedisTemplate.opsForHash().put("myHash", "SHA", "上海虹桥");
			stringRedisTemplate.opsForHash().put("myHash", "PVG", "浦东");
			Map<Object, Object> hashCache = stringRedisTemplate.opsForHash().entries("myHash");
			for (Map.Entry<Object, Object> entry : hashCache.entrySet()) {
				System.out.println(entry.getKey() + " - " + entry.getValue());
			}
			System.out.println("---------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * redis 得到所有的master and slave 信息
	 */
	@Test
	public void testGetAllMasterAndSlave() {

		RedisSentinelConnection conn = stringRedisTemplate.getConnectionFactory().getSentinelConnection();

		for (RedisServer master : conn.masters()) {
			System.out.println("master => " + master);// 打印master信息
			Collection<RedisServer> slaves = conn.slaves(master);
			// 打印该master下的所有slave信息
			for (RedisServer slave : slaves) {
				System.out.println("slaves of " + master + " => " + slave);
			}
			System.out.println("--------------");
		}
	}

	/*
	 * 测试redis 缓存object 和 list 类型数据(方案：用json将object和list序列化)
	 */
	@Test
	public void testRedisCacheObjectAndList() {

		User user1 = new User("zhangsan", "123456", "222888@qq.com", "15824812342", 'M', 22);
//		// fastJson 序列化
//		String jsonStr = JSONObject.toJSONString(user1);
//		System.out.println(">>>>>>>>>>>>>>>>" + jsonStr);
//		// fastJson 反序列化
//		user1 = JSONObject.parseObject(jsonStr, User.class);
//		System.out.println(">>>>>>>>>>>>>>>>>>" + user1);

		stringRedisTemplate.delete("user1");
		// 将object 用 json 序列化后保存redis
		stringRedisTemplate.opsForValue().set("user1", JSONObject.toJSONString(user1));

		user1 = JSONObject.parseObject(stringRedisTemplate.opsForValue().get("user1"), User.class);
		System.out.println("-----------------------" + user1);
	}
}
