package com.lxz.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		
		for (int i = 1; i <=10000 ; i++) {
			Person p=new Person();
			p.setName(StringUtils.generateChineseName());
			p.setAge(RandomUtils.random(1, 120));
			p.setAbout(StringUtils.randomChineseString(140));
			
			Calendar instance = Calendar.getInstance();
			instance.set(2010, 9, 1);
			p.setCreated(DateUtils.random(instance.getTime(), new Date()));
			System.out.println(i+""+p);
		}
		
	}

}
