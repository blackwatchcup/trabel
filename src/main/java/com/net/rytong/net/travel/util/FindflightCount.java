/**
 * 
 */
package com.net.rytong.net.travel.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.net.rytong.net.travel.result.Count_flight_result;

/**
 *@describe：
 *@author: blank
 *@date： 日期：2016年9月2日 时间：下午3:09:16
 *@version 1.0
 */
public abstract class FindflightCount {
	
	/**
	 * 
	 * @describe
	 * @param s
	 * @param e
	 * @param flight
	 * @return map
	 * @author zzw
	 * 2016年9月2日 下午3:13:38
	 */
	public Map getresultmap(BigInteger s,BigInteger e,String flight) {
		// 用于储存所有变量
		HashMap<String, String> map = new HashMap<>();
		map.clear();
		// 结果map
		HashMap<String, List<String>> result_map = new HashMap<>();
		result_map.clear();
		// 航班舱位
		List<String> flight_list = new ArrayList<>();
		flight_list.clear();
		List<String> daynumber = new ArrayList<>();
		daynumber.clear();
		// 开始时间
		BigInteger result = e.subtract(s);
		BigInteger o = result.divide(new BigInteger("1000000"));
		// j为确定具体查询的天数
		int date = o.intValue();
		int j = o.intValue();
		//map.put("Xpoint", "" + j);
		//如果分析数据天数在2天以内则
		if (j < 3) {
			System.out.println("以小时方式显示");
		} else {
			//天数为循环条件
			for (int f =0;f<=j; f++) {
				daynumber.add(""+(f+1));
				// 以开始时间为基准增加对应的时间
				e = s.add(new BigInteger("1000000"));
				System.out.println("开始态s:" + s.toString() + "---e:" + e.toString());
				// 查询符合条件的舱位与销售量
//				List<Count_flight_result> list = service.getcountlist(s, e,
//						flight);
				List<Count_flight_result> list =findInBD(s,e,flight);
				// 舱位数量
				int listcount = list.size();
				System.out.println(listcount);
				//舱位增加到相应的list里面
				for (int i = 0; i < listcount; i++) {
					String f_number = "" + list.get(i).getCabin_code();
					System.out.println(flight_list.contains(f_number));
					if (!flight_list.contains(f_number)) {
						flight_list.add(f_number);
						System.out.println("ok");
					}
		//			String key = ""+j+list.get(i);
					map.put("" + f + list.get(i).getCabin_code(), ""
							+ list.get(i).getCount());
				}
				s = e;
				e = e.add(new BigInteger("1000000"));
				System.out.println("业务结束s:" + s.toString() + "---e:" + e.toString());
			}
			int number_list = flight_list.size();
			//把数据封装成一个map			
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
			
			result_map.put("labels", daynumber);
		}
		Iterator<Map.Entry<String, List<String>>> entries = result_map
				.entrySet().iterator();

		while (entries.hasNext()) {

			Map.Entry<String, List<String>> entry = entries.next();

			System.out.println("Key = " + entry.getKey() + ", Value = "
					+ entry.getValue());

		}
		return result_map;
	}
	public abstract <T> List<T>  findInBD(BigInteger s,BigInteger e,String flight);

}
