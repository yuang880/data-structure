package com.jiangyan.algorithm.linear;

/**
 * 链表的思想。
 */
public class NodeList<T> {
    // 添加进来的元素
    T item;
    // 下一个节点
    NodeList nextNode;
    // 全参构造

    public NodeList(T item, NodeList nextNode) {
        this.item = item;
        this.nextNode = nextNode;
    }

    public static void main(String[] args) {
        NodeList<Integer> first = new NodeList<>(1, null);
        NodeList<Integer> second = new NodeList<>(2, null);
        first.nextNode = second;
    }
}
