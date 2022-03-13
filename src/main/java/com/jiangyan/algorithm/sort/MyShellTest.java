package com.jiangyan.algorithm.sort;

import java.util.Arrays;

/**
 * 希尔排序的测试。
 * @author zhang
 */
public class MyShellTest {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 3, 1, 9, 7};
        MyShell.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
