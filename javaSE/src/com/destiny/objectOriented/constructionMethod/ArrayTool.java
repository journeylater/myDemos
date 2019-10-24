package com.destiny.objectOriented.constructionMethod;

/**
 * 数组工具类
 */
public class ArrayTool {

    /**
     * 获取最大值
     * @param arr
     * @return
     */
    public static int getMax(int[] arr) {

        int max = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    /**
     * 遍历数组
     * @param arr
     */
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i+",");
        }
    }

    /**
     * 数组反转
     * @param arr
     */
    public static void revArray(int[] arr) {

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

    }

}
