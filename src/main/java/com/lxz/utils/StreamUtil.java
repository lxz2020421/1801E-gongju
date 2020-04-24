package com.lxz.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
	/*
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	public static void closeAll(AutoCloseable ...autoCloseables){
	if (autoCloseables==null||autoCloseables.length==0) {
		throw new RuntimeException("参数异常");
	}
	for (AutoCloseable autoCloseable : autoCloseables) {
		try {
			autoCloseable.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(InputStream src){
		BufferedReader reader = new BufferedReader(new InputStreamReader(src));
		String str=null;
		StringBuffer sb = new StringBuffer();
		try {
			while ((str=reader.readLine())!=null) {
				sb.append(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(reader);
		}
		
		return sb.toString();
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile){
		try {
			FileInputStream stream = new FileInputStream(txtFile);
			return readTextFile(stream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	//读取文件到集合
	public static List<String> readTextFile2List(File file){
		List<String> list=new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String str=null;
			while((str=reader.readLine())!=null) {
				list.add(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	

}
