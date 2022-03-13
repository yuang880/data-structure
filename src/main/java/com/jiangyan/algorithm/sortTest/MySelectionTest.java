package com.jiangyan.algorithm.sortTest;

import com.jiangyan.algorithm.sort.MySelection;

import java.util.Arrays;

/**
 * 对选择排序的测试。
 * @author zhang
 */
public class MySelectionTest {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 3, 1, 9, 7};
        MySelection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
