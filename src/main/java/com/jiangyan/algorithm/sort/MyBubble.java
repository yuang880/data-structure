package com.jiangyan.algorithm.sort;

/**
 * 手写冒泡排序
 *  里边提供了三个方法
 * @author zhang
 */
public class MyBubble {
    /**
     * 排序
     * @param a 传进来的要排序的数组
     */
    public static void sort(Comparable[] a){
        for(int i = a.length - 1; i >0; i--){
            for(int j = 0; j < i; j++){
                // 比较索引j与j+1处的值
                if(greater(a[j], a[j+1])){
                    exch(a, j, j+1);
                }
            }
        }
    }

    /**
     * 比较v元素是否大于w元素
     * @return 正就说明v大
     */
    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w) > 0;
    }

    /**
     * 数组中索引i和j互换位置
     */
    private static void exch(Comparable[] arr, int i, int j){
        Comparable temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
