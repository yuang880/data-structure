package com.jiangyan.algorithm.linear;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedListTest {
    public static void main(String[] args) {
         MyLinkedList<Integer> list = new MyLinkedList<>();
        // List<Integer> list = new LinkedList<>();
        list.insert(9);
        list.insert(4);
        list.insert(2);
        list.insert(6);
        list.reverse();
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
