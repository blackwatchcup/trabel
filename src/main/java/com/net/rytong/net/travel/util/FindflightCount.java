/**
 * 
 */
package com.net.rytong.net.travel.util;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
	 * @throws ParseException 
	 */
	public Map getresultmap(String s,String e,String flight) throws ParseException {
		// 用于储存所有变量
		HashMap<String, Integer> map = new HashMap<>();
		// 结果map
		HashMap<String, List<?>> result_map = new HashMap<>();
		// 航班舱位
		List<String> flight_list = new ArrayList<>();
		List<String> daynumber = new ArrayList<>();
		// 开始时间
		BigInteger Bs ;
		BigInteger Be;
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		Date start = (Date) df.parse(s);
		Date end = (Date) df.parse(e);
		Long days = (end.getTime()-start.getTime())/(1000*60*60*24);
		// j为确定具体查询的天数
		Long date = days;
		Long j = days;
		//map.put("Xpoint", "" + j);
		//如果分析数据天数在2天以内则
		if (j < 3) {
			System.out.println("以小时方式显示");
		} else {
			//天数为循环条件
			for (int f =0;f<=j; f++) {
				
				// 以开始时间为基准增加对应的时间
				end = new Date(start.getTime()+(1000*60*60*24));
				System.out.println("开始态s:" + df.format(start) + "---e:" + df.format(end));
				SimpleDateFormat daydf = new SimpleDateFormat("MM/dd");
				daynumber.add(daydf.format(start));
				
				// 查询符合条件的舱位与销售量
//				List<Count_flight_result> list = service.getcountlist(s, e,
//						flight);
				Bs = new BigInteger(df.format(start));
				Be = new BigInteger(df.format(end));
				List<Count_flight_result> list =findInBD(Bs,Be,flight);
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
					map.put("" + f + list.get(i).getCabin_code(),(Integer)list.get(i).getCount());
				}
				start = end;
				end = new Date(end.getTime()+(1000*60*60*24));
				System.out.println("业务结束s:" + df.format(start)+ "---e:" + df.format(end));
			}
			int number_list = flight_list.size();
			//把数据封装成一个map			
			for (int k = 0; k < number_list; k++) {
				String type = flight_list.get(k);
				List<Integer> count =new ArrayList<>();
				
				Map<String,Integer> map_count= GetMapByKey.maplikeString(type, map);
				for(int t=0 ;t<=date;t++)
				{
					count.add(GetMapByKey.ObjectlikeString(""+t,map_count));
				}
				result_map.put(type, count);
			}
			result_map.put("categories", daynumber);
		}
		Iterator<Map.Entry<String, List<?>>> entries = result_map
				.entrySet().iterator();

		while (entries.hasNext()) {

			Map.Entry<String, List<?>> entry = entries.next();

			System.out.println("Key = " + entry.getKey() + ", Value = "
					+ entry.getValue());

		}
		return result_map;
	}
	public abstract <T> List<T>  findInBD(BigInteger s,BigInteger e,String flight);

}
