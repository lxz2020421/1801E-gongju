package com.lxz.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtils.hasLength("啊");
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		boolean b = StringUtils.hasText(" ");
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String td = StringUtils.randomChineseString(100);
		System.out.println(td);
	}

	@Test
	public void testGenerateChineseName() {
		
			String name = StringUtils.generateChineseName();
			System.out.println(name);
		
		
	}
	//测试数字
	@Test
	public void testisNumber() {
		
		boolean b = StringUtils.isNumber("aa12.3");
		System.out.println(b);
		
		
	}
	//测试电话
	@Test
	public void testisPhone() {
		
		boolean b = StringUtils.isPhone("213222222222");
		System.out.println(b);
		
		
	}
	//测试邮箱
	@Test
	public void testisEmail() {
		
		boolean b = StringUtils.isEmail("123@qq.com");
		System.out.println(b);
		
		
	}

}
