package com.net.rytong.net.travel.controller;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.net.rytong.net.travel.result.Count_flight_result;
import com.net.rytong.net.travel.result.Series;
import com.net.rytong.net.travel.service.CountFlightService;
import com.net.rytong.net.travel.util.FindflightCount;


/**
 * 
*@describe：控制层处理航班销售数量
*@author: zzw
*@date： 日期：2016年9月1日 时间：下午3:59:59
*@version 1.0
 */
@Controller
public class CountFlightController
{

	@Autowired
	private CountFlightService countservice;
//	
	
	@RequestMapping("/getcount")
	@ResponseBody
	public String showlistpoint(ServletResponse response,String fights,String start, String end) throws ParseException{
		System.out.println("f:"+fights+"s："+start+"e:"+end);
		((HttpServletResponse) response).setHeader("Access-Control-Allow-Origin", "*");
		start = start.replace(".","")+"000000";
		end = end.replace(".","")+"000000";
		String flight = fights;
		Map<String, List<?>> resultmap;
		Map<String,List<?>> Linedateresult = new HashMap<>();
		//结果集
		Series series = null ;
		List<Series> sereslist = new ArrayList<>();
		//天数list
		List<String> daynumber = new ArrayList<>();
		daynumber.clear();
		//具体销售量
		List<String> data = new ArrayList<>();
		data.clear();
		FindflightCount flight_count = new FindflightCount() {
			@Override
			public  List<Count_flight_result> findInBD(BigInteger s, BigInteger e, String flight) {
				List<Count_flight_result> list = countservice.getcountlist(s, e,
						flight);
				return list;
			}
		};
		resultmap=flight_count.getresultmap(start,end,flight);
		Iterator<Map.Entry<String, List<?>>> entries = resultmap
				.entrySet().iterator();
		while (entries.hasNext()){

			Map.Entry<String, List<?>> entry = entries.next();
			String key =entry.getKey();
			List<?> value = entry.getValue();
			if(key.equals("categories")){
				daynumber = (List<String>) value;
			}else if(key.equals("F") ||key.equals("Y")||key.equals("J")){
				series = new Series(key, (List<Integer>) value, true);
			}else{
				series = new Series(key, (List<Integer>) value, false);
			}
			System.out.println("Key = " + entry.getKey() + ", Value = "
					+ entry.getValue());
			if(series!=null){
				sereslist.add(series);
				series=null;
			}
		}
		Linedateresult.put("xAxis", daynumber);
		Linedateresult.put("series", sereslist);
		System.out.println(JSON.toJSONString(Linedateresult));
		String dataresult = JSON.toJSONString(Linedateresult);
		return dataresult;
	}
	
	
	



}