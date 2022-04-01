package com.jiangyan.algorithm.symbol;

public class SymbolTable<K, V> {
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
    public SymbolTable(){
        this.head = new Node(null, null, null);
        this.N = 0;
    }

    public int size(){
        return N;
    }

    public void put(K key, V value){
        Node n = head;
        while (null != n.next){
            n = n.next;
            if(n.key.equals(key)){
                n.value = value;
                return;
            }
        }

        // 不存在key则在head后插入
        Node newNode = new Node(key, value, null);
        Node oldFirst = head.next;
        newNode.next = oldFirst;
        head.next = newNode;
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
