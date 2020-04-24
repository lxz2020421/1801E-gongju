package com.lxz.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void testRandom() {
		Calendar instance = Calendar.getInstance();
		instance.set(2010, 9, 1);
		Date date = DateUtils.random(instance.getTime(), new Date());
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String format = sd.format(date);
		System.out.println(format);
	}
	/**
	 * 
	 * @Title: textgetinitMonth 
	 * @Description: 测试月初
	 * @return: void
	 */

	@Test
	public void textgetinitMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 8, 18);
		Date date = DateUtils.getinitMonth(c.getTime());
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String format = sd.format(date);
		System.out.println(format);
	}
	/**
	 * 
	 * @Title: textgetendMonth 
	 * @Description: 测试月末
	 * @return: void
	 */
	@Test
	public void textgetendMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 7, 15);
		Date date = DateUtils.getendMonth(c.getTime());
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String format = sd.format(date);
		System.out.println(format);
	}
	/**
	 * 
	 * @Title: textgetAgeBirthday 
	 * @Description: 测试年龄
	 * @return: void
	 */
	@Test
	public void textgetAgeBirthday() {
		Calendar c = Calendar.getInstance();
		c.set(2000, 3, 22);
		int age = DateUtils.getAgeBirthday(c.getTime());
		System.out.println(age);
	}
	@Test
	public void textsql() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		Date initdate = DateUtils.getinitMonth(new Date());
		Date endMonth = DateUtils.getendMonth(new Date());
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = sd.format(initdate);
		String date2 = sd.format(endMonth);
		String newsql=sql.replace("{1}", date1).replace("{2}", date2);
		System.out.println(newsql);
	}

}
