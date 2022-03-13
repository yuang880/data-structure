package com.jiangyan.algorithm.sort;

/**
 * 希尔排序
 * @author zhang
 */
public class MyShell {
    /**
     * 排序
     * @param a 传进来的要排序的数组
     */
    public static void sort(Comparable[] a){
        //1.根据a.length确定h的初始值
        int h = 1;
        while (h < a.length / 2){
            h = h * 2 +1;
        }
        //2.
        while (h >= 1) {
            // 找到待插入的元素
            for(int i = h; i <a.length; i++){
                // 插入排序
                for(int j = i; j >= h; j -=h){
                    if(greater(a[j - 1], a[j])){
                        exch(a, j-h, j);
                    }else {
                        break;
                    }
                }
            }
            h = h / 2;

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
