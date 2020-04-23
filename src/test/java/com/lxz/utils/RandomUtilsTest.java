package com.lxz.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilsTest {

	@Test
	public void testRandom() {
		int random = RandomUtils.random(1, 3);
		System.out.println(random);
	}

	@Test
	public void testSubRandom() {
		int[] i = RandomUtils.subRandom(1, 10, 3);
		for (int j : i) {
			System.out.println(j);
		}
	}

	@Test
	public void testRandomCharacter() {
		char rt = RandomUtils.randomCharacter();
		System.out.println(rt);
	}

	@Test
	public void testRandomString() {
		String rt = RandomUtils.randomString(3);
		System.out.println(rt);
	}

}
