/**
 * 
 */
package com.net.rytong.net.travel.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *@describe：用于map中通过key模糊查询数据
 *@author: zzw
 *@date： 日期：2016年9月2日 时间：上午9:54:28
 *@version 1.0
 */
public class GetMapByKey {
	/**
	 * @describe：用于map中通过key模糊查询数据
	 * @param key
	 * @param map
	 * @return map集合
	 */
	public static <T> Map<String,T> maplikeString(String key, Map<String, T> map) {
	    List<T> list = new ArrayList<>();
	    Iterator<T> it = (Iterator<T>) map.entrySet().iterator();
	    Map<String ,String> result = new HashMap<>();
	    while(it.hasNext()) {
	        Map.Entry<String, T> entry = (Map.Entry<String, T>)it.next();
	        if (entry.getKey().indexOf(key) != -1) {
	            list.add(entry.getValue());
	            result.put(""+entry.getKey(),""+entry.getValue());
	        }
	    }
	    return (Map<String, T>) result;
	}
	
	/**
	 * 
	 * @describe 模糊查询判断map中是否有key;
	 * @param key
	 * @param map
	 * @return boolean
	 * @author zzw
	 * 2016年9月2日 下午2:37:40
	 */
	public static <T> Boolean islikeString(String key, Map<String,T> map){
		Iterator<T> it = (Iterator<T>) map.entrySet().iterator();
	    while(it.hasNext()) {
	        Map.Entry<String, T> entry = (Map.Entry<String, T>)it.next();
	        if (entry.getKey().indexOf(key) != -1) {
	        	return true;
	        }
	    }
		return false;
	}
	/**
	 * 
	 * @describe 模糊匹配map中key值并返回相应的list集合
	 * @param key
	 * @param map
	 * @return list
	 * @author zzw
	 * 2016年9月2日 下午2:40:39
	 */
	public static <T> List<T> listlikeString(String key, Map<String, T> map) {
	    List<T> list = new ArrayList<>();
	    Iterator<T> it = (Iterator<T>) map.entrySet().iterator();
	    while(it.hasNext()) {
	        Map.Entry<String, T> entry = (Map.Entry<String, T>)it.next();
	        if (entry.getKey().indexOf(key) != -1) {
	            list.add(entry.getValue());
	        }
	    }
	    return list;
	}
	public static <T> Integer ObjectlikeString(String key, Map<String, T> map) {
	    String result;
	    Iterator<T> it = (Iterator<T>) map.entrySet().iterator();
	    while(it.hasNext()) {
	        Map.Entry<String, T> entry = (Map.Entry<String, T>)it.next();
	        if (entry.getKey().indexOf(key) != -1) {
	        	return Integer.valueOf(""+entry.getValue());
	        }
	    }
	    return 0;
	}
}