package com.lxz.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileUtilsTest {

	@Test
	public void testGetExtendName() {
		String str="aa.jsp";
		String name = FileUtils.getExtendName(str);
		System.out.println(name);
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtils.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		File file = FileUtils.getUserDirectory();
		System.out.println(file);
	}

}
