package com.destiny.io.p04;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * 大小
 * @author 裴新
 *
 */
public class CIOTest01 {

	public static void main(String[] args) {
		//文件大小
		long len =FileUtils.sizeOf(new File("src/com/sxt/commons/CIOTest01.java"));
		System.out.println(len);
		//目录大小
		len = FileUtils.sizeOf(new File("D:/java300/IO_study04"));
		System.out.println(len);
	}

}
