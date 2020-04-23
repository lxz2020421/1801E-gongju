package com.lxz.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testHasLength() {
		boolean b = StringUtils.hasLength("");
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		boolean b = StringUtils.hasText("a");
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

}
