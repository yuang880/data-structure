package com.jiangyan.algorithm.linear;

import java.util.Iterator;

/**
 * 实现单向链表api
 */
public class MyLinkedList<T> implements Iterable<T>{
    // 记录头节点，头节点中只记录下个节点的位置，data是null
    private Node head;
    // 链表长度
    private int N;

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }


    private class SIterator implements Iterator{
        private Node n;

        public SIterator() {
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.nextNode != null;
        }

        @Override
        public Object next() {
            n = n.nextNode;
            return n.data;
             //return n.nextNode.data;
        }
    }

    //内部类定义链表的结构
    private class Node{
        // 存储数据
        T data;
        // 下个节点
        Node nextNode;
        // 全参构造
        public Node(T data, Node nextNode) {
            this.data = data;
            this.nextNode = nextNode;
        }
    }

    public MyLinkedList() {
        this.head = new Node(null, null);
        this.N  = 0;
    }
    // 清空链表
    public void clear(){
        head.nextNode = null;
        this.N = 0;
    }
    // 获取链表的长度
    public int length(){
        return N;
    }
    // 判断其是否为空
    public boolean isEmpty(){
        return N == 0;
    }
    //获取指定位置的元素
    public T get(int i){
        Node n = head.nextNode;
        for (int j = 0; j < i; j++) {
            n = n.nextNode;
        }
        return n.data;
    }
    // 末尾添加元素
    public void insert(T t){
        //找最后节点
        Node n = head;
        while(n.nextNode != null){
            n = n.nextNode;
        }
        // 创建新节点，保存t
        Node last = new Node(t, null);
        // n.nextNode指向新节点
        n.nextNode = last;
        // N+1
        N++;

    }
    // 指定位置添加元素
    public void insert(int i, T t){
        // 找到i位置前一个
        Node pre = head;
        for (int index = 0; index <= i - 1; index++){
            pre = pre.nextNode;
        }
        // 找到i位置
        Node cuuNode = pre.nextNode;
        // 新节点 新指向
        pre.nextNode = new Node(t, cuuNode);
        // N+1
        N++;
    }
    // 删除指定位置的元素
    public T remove(int i){
        // 找到i位置前一个
        Node pre = head;
        for (int index = 0; index <= i - 1; index++){
            pre = pre.nextNode;
        }
        pre.nextNode = pre.nextNode.nextNode;
        N--;
        return pre.nextNode.data;
    }
    // 查找t第一次出现的索引位置
    public int indexOf(T t){
        Node pre = head;
        for(int i = 0; pre.nextNode != null; i++){
            pre = pre.nextNode;
            if(pre.data.equals(t)){
                return i;
            }
        }
        return -1;
    }
}
