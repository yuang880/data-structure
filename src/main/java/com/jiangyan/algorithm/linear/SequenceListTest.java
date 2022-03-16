package com.jiangyan.algorithm.linear;


/**
 * 这里做的比较粗糙，没有考虑扩容
 */
public class SequenceListTest {
    public static void main(String[] args) {
        //创建顺序表对象
        SequenceList<Integer> list = new SequenceList<>(10);
        list.insert(9);
        list.insert(5);
        list.insert(4);
        list.insert(6);
        list.insert(8);
        list.insert(4, 5);
        for (int i = 0; i < list.length(); i++) {
            System.out.println(list.get(i));
        }
    }
}
