package com.destiny.net.chat.chat03;

import java.io.Closeable;

/**
 * 工具类
 * 
 *
 */
public class SxtUtils {
	/**
	 * 释放资源
	 */
	public static void close(Closeable... targets ) {
		for(Closeable target:targets) {
			try {
				if(null!=target) {
					target.close();
				}
			}catch(Exception e) {
				
			}
		}
	}
}
