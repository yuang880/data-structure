package com.jiangyan.algorithm.sortTest;

import com.jiangyan.algorithm.sort.MyQuick;

import java.util.Arrays;

/**
 * 快排的测试
 * @author zhang
 */
public class MyQuickTest {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 3, 1, 9, 7};
        MyQuick.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
