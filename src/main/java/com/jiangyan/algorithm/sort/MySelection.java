package com.jiangyan.algorithm.sort;

/**
 * 手写代码实现选择排序。
 *  1.默认第一个是最小的，然后遍历对比找出最小值的索引
 *  2.将两个位置交换
 * @author zhang
 */
public class MySelection {
    /**
     * 排序
     * @param a 传进来的要排序的数组
     */
    public static void sort(Comparable[] a){
        for(int i = 0; i <= a.length - 2; i++){
            int minIndex = i;
            for(int j = i + 1; j < a.length; j++){
                if(greater(a[minIndex], a[j])){
                    minIndex = j;
                }
            }
            exch(a, i, minIndex);
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
