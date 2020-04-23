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

}
