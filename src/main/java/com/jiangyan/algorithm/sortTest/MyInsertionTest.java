package com.jiangyan.algorithm.sortTest;

import com.jiangyan.algorithm.sort.MyInsertion;

import java.util.Arrays;

/**
 * 插入排序的测试
 * @author zhang
 */
public class MyInsertionTest {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 3, 1, 9, 7};
        MyInsertion.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
