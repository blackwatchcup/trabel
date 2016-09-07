package com.net.rytong.net.travel.controller;

import java.math.BigInteger;
import java.util.ArrayList;
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
import com.net.rytong.net.travel.result.Dataset;
import com.net.rytong.net.travel.result.Linedatas;
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
	public String showlistpoint(ServletResponse response,String fights,String start, String end){
		System.out.println("f:"+fights+"s："+start+"e:"+end);
		((HttpServletResponse) response).setHeader("Access-Control-Allow-Origin", "*");
		start = start.replace(".","")+"000000";
		end = end.replace(".","")+"000000";
		BigInteger s = new BigInteger(start);
		BigInteger e = new BigInteger(end);
		BigInteger result = e.divide(s);	
		String flight = fights;
		Map<String, List<String>> resultmap;
		//结果集
		Linedatas linedatas ;
		//天数list
		List<String> daynumber = new ArrayList<>();
		daynumber.clear();
		//具体销售量
		List<String> data = new ArrayList<>();
		data.clear();
		//线实体类
		Dataset line;
		List<Dataset> linelist= new ArrayList<>();
		linelist.clear();
		FindflightCount flight_count = new FindflightCount() {
			@Override
			public  List<Count_flight_result> findInBD(BigInteger s, BigInteger e, String flight) {
				List<Count_flight_result> list = countservice.getcountlist(s, e,
						flight);
				return list;
			}
		};
		resultmap=flight_count.getresultmap(s,e,flight);
		Iterator<Map.Entry<String, List<String>>> entries = resultmap
				.entrySet().iterator();

		while (entries.hasNext()){

			Map.Entry<String, List<String>> entry = entries.next();
			String key =entry.getKey();
			List<String> value = entry.getValue();
			if(key.equals("labels")){
				daynumber = value;
			}else {
				line = new Dataset(key, value);
				linelist.add(line);
			}
			System.out.println("Key = " + entry.getKey() + ", Value = "
					+ entry.getValue());
		}
		linedatas = new Linedatas(daynumber, linelist);
		System.out.println(JSON.toJSONString(linedatas));
		String dataresult = JSON.toJSONString(linedatas);
		return dataresult; 
	}
}