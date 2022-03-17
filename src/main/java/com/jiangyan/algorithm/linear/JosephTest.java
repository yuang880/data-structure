package com.jiangyan.algorithm.linear;

/**
 * 循环链表解决约瑟夫问题
 */
public class JosephTest {
    public static void main(String[] args) {
        // 1.构建循环链表
        Node<Integer> first = null;
        Node<Integer> pre = null;
        for (int i = 1; i <= 41; i++) {
            if(i == 1){
                first = new Node<>(i, null);
                pre = first;
                continue;
            }
            // 不是第一个节点
            Node<Integer> newNode = new Node<>(i, null);
            pre.next = newNode;
            pre = newNode;
            // 最后一个节点
            if(i == 41){
                pre.next = first;
            }
        }
        // 2.计数器
        int count = 0;
        // 遍历
        Node<Integer> n = first;
        Node<Integer> before = null;
        while (n != n.next){
            count++;
            if(count ==3){
                before.next = n.next;
                System.out.print(n.data + ",");
                count = 0;
                n = n.next;
            }else {
                before = n;
                n = n.next;
            }
        }
        System.out.print(n.data);
    }

    // 节点内部类
    private static class Node<Integer>{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
