package com.destiny.io.p01;

import java.io.IOException;

/**
 * 编码: 字符串-->字节
 * @author 裴新
 *
 */
public class ContentEncode {

	public static void main(String[] args) throws IOException {
		String msg ="性命生命使命a";
		//编码: 字节数组
		byte[] datas = msg.getBytes();  //默认使用工程的字符集

		System.out.println(datas.length);
		
		//编码: 其他字符集
		datas = msg.getBytes("UTF-16LE");
		System.out.println(datas.length);
		
		datas = msg.getBytes("GBK");
		System.out.println(datas.length);		
		
	}

}
