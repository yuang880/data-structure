package com.jiangyan.algorithm.sort;

/**
 * 插入排序
 * @author zhang
 */
public class MyInsertion {
    /**
     * 排序
     * @param a 传进来的要排序的数组
     */
    public static void sort(Comparable[] a){
        for(int i = 1; i < a.length; i++){
            // a[i]与之前的元素比较大小，找到小于a[i]的元素，交换
            for(int j = i; j > 0; j--){
                if(greater(a[j - 1], a[j])){
                    exch(a, j - 1, j);
                }else {
                    break;
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
