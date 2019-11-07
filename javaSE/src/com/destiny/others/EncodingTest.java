package com.destiny.others;

import java.io.UnsupportedEncodingException;

public class EncodingTest {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String srcString = "测试";
        String utf2GbkString = new String(srcString.getBytes("UTF-8"),"GBK");
        System.out.println("UTF-8转换成GBK："+utf2GbkString);
        String utf2Gbk2UtfString = new String(utf2GbkString.getBytes("GBK"),"UTF-8");
        System.out.println("UTF-8转换成GBK再转成UTF-8："+utf2Gbk2UtfString);
    }

}
