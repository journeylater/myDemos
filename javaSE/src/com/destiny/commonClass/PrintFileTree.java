package com.destiny.commonClass;

import java.io.File;
/**
 * 使用递归算法打印目录树
 */
public class PrintFileTree {

    public static void main(String[] args) {
        File file = new File("D:\\document\\工作");
        printFile(file,0);
    }
    static void printFile(File file, int level) {

        //输出层数
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File temp : files) {
                printFile(temp,level+1);
            }
        }

    }

}
