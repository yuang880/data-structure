package com.jiangyan.algorithm.linear;

import java.util.Iterator;

/**
 * 双向链表
 *      首节点、尾结点。
 */
public class TwoWayLinkList<T> implements Iterable<T>{
    // 首尾节点
    private Node head;
    private Node last;

    // 链表的长度
    private int N;

    // Node类
    private class Node{
        // 数据
        public T data;
        public Node pre;
        public Node next;

        public Node(T data, Node pre, Node next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }
    }

    // 无参构造
    public TwoWayLinkList() {
        // 初始化头尾结点
        this.head = new Node(null, null, null);
        this.last = null;
        this.N = 0;
    }

    // 清空
    public void clear(){
        head.next = null;
        head.pre = null;
        head.data = null;
        last = null;
        N = 0;
    }

    // 长度
    public int length(){
        return N;
    }

    // 判断是否为空
    public boolean isEmpty(){
        return N == 0;
    }

    // 获取第一个元素
    public T getFirst(){
        if(isEmpty()){
            return null;
        }
        return head.next.data;
    }

    // 获取最后一个元素
    public T getLast(){
        if(isEmpty()){
            return null;
        }
        return last.data;
    }

    //插入
    public void insert(T t){
        if(isEmpty()){
            last = new Node(t, head, null);
            head.next = last;
        }else {
            Node oldLast = last;
            last = new Node(t, oldLast, null);
            oldLast.next = last;
        }
        N++;
    }

    public void insert(int i, T t){
        // 这里对实现就行简化，直接从前往后找，也没有判断i与N的关系。
        // 可以先判断i在N之内，然后判断i与N/2之间的关系，再确定是往前往后找，还是从后往前找
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        Node curr = pre.next;
        Node newNode = new Node(t, pre, curr);
        pre.next = newNode;
        curr.pre = newNode;
    }

    public T get(int i){
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return n.data;
    }

    public int indexOf(T t){
        Node n = head;
        for(int index = 0; n.next != null; index++){
            if(n.next.data.equals(t)){
                return index;
            }
        }
        return -1;
    }

    public T remove(int i){
        // 默认i在N-1中间，
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        Node curr = pre.next;
        Node nextNode = curr.next;
        pre.next = nextNode;
        nextNode.pre = pre;
        N--;
        return curr.data;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator<T>{
        private Node n;

        public SIterator() {
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
}
