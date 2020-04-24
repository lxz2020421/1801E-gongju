package com.lxz.utils;


import java.util.Calendar;
import java.util.Date;

import javax.management.RuntimeErrorException;
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
	/**
	 * 
	 * @Title: grtinitMonth 
	 * @Description: 获取月初
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getinitMonth(Date date) {
		//日历类，对日期做计算
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		//设置为这个月的第一天时间0:00
		c.set(Calendar.DAY_OF_MONTH, 1);//一个月的第一天
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		
		return c.getTime();
	}
	/**
	 * 
	 * @Title: getendMonth 
	 * @Description: 月末
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getendMonth(Date date) {
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		c.add(Calendar.MONTH, 1);
		Date nextinitMonth = getinitMonth(c.getTime());
		c.setTime(nextinitMonth);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	public static int getAgeBirthday(Date birthday) {
		Calendar c = Calendar.getInstance();
		int nowyear = c.get(Calendar.YEAR);
		int nowmonth = c.get(Calendar.MONTH);
		int nowdate = c.get(Calendar.DAY_OF_MONTH);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(birthday);
		int birthdayyear = c2.get(Calendar.YEAR);
		int birthdaymonth = c2.get(Calendar.MONTH);
		int birthdaydate = c2.get(Calendar.DAY_OF_MONTH);
		
		if (nowyear <birthdayyear) {
			throw new RuntimeException("传入的日期错误");
		}
		int age=nowyear-birthdayyear;
		if(nowmonth<birthdaymonth) {
			age--;
		}
		if(nowmonth==birthdaymonth && nowdate<birthdaydate) {
			age--;
		}
		return age;
		
	}
}


