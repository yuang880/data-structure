package com.jiangyan.algorithm.sort;

import java.util.concurrent.CompletableFuture;

/**
 * 快速排序
 * @author zhang
 */
public class MyQuick {
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    /**
     * 数组中索引i和j互换位置
     */
    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void sort(Comparable[] a){
        int lo = 0;
        int hi = a.length - 1;
        sort(a, lo, hi);
    }
    private static void sort(Comparable[] a, int lo, int hi){
        // 校验
        if(lo >= hi){
            return;
        }
        // 分组
        // i是位置变化后的索引
        int i = partition(a, lo, hi);
        // 排序
        sort(a, lo, i -1);
        sort(a, i+1, hi);

    }

    public static int partition(Comparable[] a, int lo, int hi){
        // 定义基准值
        Comparable key = a[lo];
        // 定义两个指针
        int left = lo;
        int right = hi + 1;
        //切片
        // 不确定循环次数，使用while，由内部控制循环结束
        while (true){
            // 从右往左，找到比key小的数即停止循环，拿到了对应的right.
            while (less(key, a[--right])){
                if(right == lo){
                    break;
                }
            }
            while (less(a[++left], key)){
                if(left == hi){
                    break;
                }
            }
            //
            if(left >= right){
                break;
            }else {
                exch(a, left, right);
            }
        }
        exch(a, lo, right);
        return  right;
    }

}
