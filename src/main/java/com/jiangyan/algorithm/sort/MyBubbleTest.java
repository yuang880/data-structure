package com.jiangyan.algorithm.sort;

import java.util.Arrays;

/**
 * @author zhang
 */
public class MyBubbleTest{
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 3, 1, 9, 7};
        MyBubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
