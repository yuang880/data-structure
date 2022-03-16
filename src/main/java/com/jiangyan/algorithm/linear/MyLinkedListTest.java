package com.jiangyan.algorithm.linear;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedListTest {
    public static void main(String[] args) {
        // MyLinkedList<Integer> list = new MyLinkedList<>();
        List<Integer> list = new LinkedList<>();
        list.add(9);
        list.add(4);
        list.add(2);
        list.add(6);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
