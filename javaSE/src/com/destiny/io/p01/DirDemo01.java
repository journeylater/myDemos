package com.destiny.io.p01;

import java.io.File;

/**
 * 创建目录
 * 1、mkdir() : 确保上级目录存在，不存在创建失败
 * 2、mkdirs(): 上级目录可以不存在，不存在一同来创建
 * @author 裴新
 *
 */
public class DirDemo01 {
	public static void main(String[] args) {
		File dir = new File("D:\\temp\\test\\t1\\t1");
		//创建目录 mkdirs()
		boolean flag = dir.mkdirs();
		System.out.println(flag);
		//创建目录 mkdir()
		dir = new File("D:/temp/test/t1/t2");
		flag = dir.mkdirs();
		System.out.println(flag);
	}
}
