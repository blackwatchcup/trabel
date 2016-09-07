package travel;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import redis.clients.jedis.Jedis;

import com.net.rytong.net.travel.result.Count_flight_result;
import com.net.rytong.net.travel.service.CountFlightService;
import com.net.rytong.net.travel.util.GetMapByKey;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:config/spring-mvc.xml",
		"classpath*:config/spring-mybatis.xml" })
public class Testshow {

	@Resource
	private CountFlightService service;

	@Test
	public void redis (){
		Jedis jedis = new Jedis("localhost");
		System.out.println("server:"+jedis.ping());
//		jedis.set("java","miss");
//		System.out.println(jedis.get("java"));
//		jedis.lpush("javalist", "redis");
//		jedis.lpush("javalist", "mysql");
//		jedis.lpush("javalist", "mongodb");
//		List<String> list = jedis.lrange("javalist", 0, 5);
//		for(int i =0;i<list.size();i++){
//			System.out.println("javalist"+i+":"+list.get(i));
//		}
		Set<String> listkey =jedis.keys("*");
		  Iterator i = listkey.iterator();//先迭代出来  
          
	        while(i.hasNext()){//遍历  
	            System.out.println(i.next());  
	        }  
	}
	@Test
	public void getdata() throws ParseException{
		String data1 = "20160701000000";
		String data2 = "20160920000000";
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		Date start = (Date) df.parse(data1);
		Date end = (Date) df.parse(data2);
		Long a = (end.getTime()-start.getTime())/(1000*60*60*24);
		Long b = 365*1000*60*60*24l;
		end = new Date(start.getTime()+b);
		System.out.println("ends:"+df.format(end));
		System.out.println(a);
	}
	@Test
	public void getshow() {
		// 用于储存所有变量
		HashMap<String, String> map = new HashMap<>();
		// 结果map
		HashMap<String, List<String>> result_map = new HashMap<>();
		// 航班舱位
		List<String> flight_list = new ArrayList<>();

		// 开始时间
		BigInteger s = new BigInteger("20160707160600");
		// 结束时间
		BigInteger e = new BigInteger("20160731160600");
		// 航班号
		String flight = "MU2219";
		BigInteger result = e.subtract(s);
		BigInteger o = result.divide(new BigInteger("1000000"));
		// j为确定具体查询的天数
		int date = o.intValue();
		int j = o.intValue();
		map.put("Xpoint", "" + j);
		if (j < 3) {
			System.out.println("以小时方式显示");
		} else {
			for (; j >= 0; j--) {
				// 以开始时间为基准增加对应的时间
				e = s.add(new BigInteger("1000000"));
				System.out.println("开始态s:" + s.toString() + "---e:" + e.toString());
				// 查询符合条件的舱位与销售量
				List<Count_flight_result> list = service.getcountlist(s, e,
						flight);
				// 舱位数量
				int listcount = list.size();
				System.out.println(listcount);
				for (int i = 0; i < listcount; i++) {
					String f_number = "" + list.get(i).getCabin_code();
					System.out.println(flight_list.contains(f_number));
					if (!flight_list.contains(f_number)) {
						flight_list.add(f_number);
						System.out.println("ok");
					}
		//			String key = ""+j+list.get(i);
					map.put("" + j + list.get(i).getCabin_code(), ""
							+ list.get(i).getCount());

				}
				s = e;
				e = e.add(new BigInteger("1000000"));
				System.out.println("业务结束s:" + s.toString() + "---e:" + e.toString());
			

			}
			int number_list = flight_list.size();
			for (int k = 0; k < number_list; k++) {
				String type = flight_list.get(k);
				List<String> count =new ArrayList<>();
				Map<String,String> map_count= GetMapByKey.maplikeString(type, map);
				for(int t=0 ;t<=date;t++)
				{
					count.add(GetMapByKey.ObjectlikeString(""+t,map_count));
				}
				result_map.put(type, count);
			}
			
			
		}
		Iterator<Map.Entry<String, List<String>>> entries = result_map
				.entrySet().iterator();

		while (entries.hasNext()) {

			Map.Entry<String, List<String>> entry = entries.next();

			System.out.println("Key = " + entry.getKey() + ", Value = "
					+ entry.getValue());

		}
	}

	@Test
	public void show() {
		// 开始时间
		BigInteger s = new BigInteger("20160707160600");
		// 结束时间
		BigInteger e = new BigInteger("20160712160600");
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		for(int j =0;j<4;j++){
			System.out.println(list.contains("e"));
		}
//		for (int i = 0; i <= 5; i++) {
//			BigInteger c = s;
//			e = s.add(new BigInteger("1000000"));
//			System.out.println("开始态s:" + s.toString() + "---e:" + e.toString());
//			System.out.println("----业务处理");
//			s = e;
//			e = e.add(new BigInteger("1000000"));
//			System.out.println("s:" + s.toString() + "---e:" + e.toString());
//		}
	}

}
