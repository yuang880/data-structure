package com.jiangyan.algorithm.symbol;

/**
 * 在put时，按顺序插入
 * 顺序符号表
 */
public class OrderSymbolTable<K extends Comparable<K>, V> {
    /**
     * 头节点
     */
    private Node head;

    /**
     *链表的长度
     */
    private int N;

    /**
     * 匿名内部类，定义Node节点。
     */
    public class Node {
        public K key;
        public V value;
        public Node next;

        public Node(K key, V value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    /**
     * 无参构造，初始化表
     */
    public OrderSymbolTable(){
        this.head = new Node(null, null, null);
        this.N = 0;
    }

    public int size(){
        return N;
    }

    public void put(K key, V value){
        Node curr = head.next;
        Node pre = head;
        while (curr != null && key.compareTo(curr.key) > 0){
            pre = curr;
            curr = curr.next;
        }
        // 一样则替换
        if(curr != null && key.compareTo(curr.key) == 0){
            curr.value = value;
            return;
        }
        // 插入
        Node newNode = new Node(key, value, curr);
        pre.next = newNode;
        N++;
    }

    public void delete(K key){
        Node n = head;
        while (null != n.next){
            if(n.next.key.equals(key)){
                n.next = n.next.next;
                N--;
                return;
            }
            n = n.next;
        }
    }

    public V get(K key){
        Node n = head;
        while (n.next != null){
            n = n.next;
            if(n.key.equals(key)){
                return n.value;
            }
        }
        return null;
    }
}
