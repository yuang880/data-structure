package com.jiangyan.algorithm.linear;

import java.util.Iterator;

/**
 * 使用链表来实现栈
 */
public class MyStack<T> implements Iterable<T>{
    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }
    private class SIterator implements Iterator<T>{
        // 遍历时拿到的当前节点
        private Node n;
        public SIterator(){
            this.n = head;
        }
        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public T next() {
            n = n.next;
            return n.data;
        }
    }

    private class Node{
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head;
    private int N;

    public MyStack() {
        this.head = new Node(null, null);
        this.N = 0;
    }

    // 判断当前栈中元素个数是否为0
    public boolean isEmpty(){
        return N == 0;
    }

    // 获取栈中元素的个数
    public int size(){
        return N;
    }

    // 压栈
    public void push(T t){
        // 找到首节点指向的第一个节点
        Node oldFirst = head.next;
        // 创建新节点
        Node newNode = new Node(t, null);
        // 首节点指向新节点
        head.next = newNode;
        newNode.next = oldFirst;
        N++;

    }

    // 弹栈
    public T pop(){
        Node oldFirst = head.next;
        if(oldFirst == null){
            return null;
        }
        head.next = oldFirst.next;
        N--;
        return oldFirst.data;
    }
}
