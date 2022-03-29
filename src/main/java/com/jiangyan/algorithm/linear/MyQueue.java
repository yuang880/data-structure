package com.jiangyan.algorithm.linear;

import java.util.Iterator;

/**
 * 链表实现队列
 */
public class MyQueue<T> implements Iterable<T>{
    @Override
    public Iterator iterator() {
        return new IQueue();
    }
    private class IQueue implements Iterator{
        private Node n;
        public IQueue(){
            this.n = head;
        }
        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.data;
        }
    }

    private class Node{
        public T data;
        public Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head;
    private Node last;
    private int N;

    /**
     * 初始化
     */
    public MyQueue() {
        this.head = new Node(null, null);
        this.last = null;
        this.N = 0;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    /**
     * 插入
     */
    public void enQueue(T t){
        Node newNode = new Node(t, null);
        // 判断尾结点是否为空
        if(null == last){
            last = newNode;
            head.next = last;
        }else {
            Node oldNode = last;
            last = newNode;
            oldNode.next = last;
        }
        N++;
    }

    public T deQueue(){
        if(isEmpty()){
            return null;
        }
        Node oldFirst = head.next;
        head.next = oldFirst.next;
        N--;
        // 判断N是否为0，为0时last为null
        if(isEmpty()){
            last = null;
        }
        return oldFirst.data;
    }
}
