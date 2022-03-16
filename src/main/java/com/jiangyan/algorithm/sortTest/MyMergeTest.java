package com.jiangyan.algorithm.sortTest;

import com.jiangyan.algorithm.sort.MyMerge;

import java.util.Arrays;

/**
 * 归并排序的测试
 * @author zhang
 */
public class MyMergeTest {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 3, 1, 9, 7};
        MyMerge.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
