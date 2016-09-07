package com.dg;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

public class RedisTest {
	
	@Test
	public void testRedis(){
		
		Jedis jedis = new Jedis("192.168.12.90", 6379);
		
		jedis.set("name", "mrdg");
		jedis.set("age", "24");
		
		System.out.println("name:"+jedis.get("name"));
		System.out.println("age:"+jedis.get("age"));
		System.out.println("tel:"+jedis.get("Tel"));
		System.out.println("no:"+jedis.get("No"));
	}
	
	@Test
	public void testCluster(){
		
		Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
		//Jedis Cluster will attempt to discover cluster nodes automatically
		jedisClusterNodes.add(new HostAndPort("192.168.12.90", 7001));
		JedisCluster jc = new JedisCluster(jedisClusterNodes);
		jc.set("foo", "bar");
		String value = jc.get("foo");
		
		System.out.println(value);
		try {
			jc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
