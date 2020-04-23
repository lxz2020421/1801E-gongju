package com.lxz.utils;


import java.util.Date;
/**
 * 
 * @ClassName: DateUtils 
 * @Description: 日期
 * @author: asus
 * @date: 2020年4月23日 下午9:31:01
 */
public class DateUtils {
	public static Date random(Date min,Date max) {
		long time1 = min.getTime();
		long time2 = max.getTime();
		
		long t=(long) (Math.random()*(time2-time1)+time1);
		
		return new Date(t);
	}
}
