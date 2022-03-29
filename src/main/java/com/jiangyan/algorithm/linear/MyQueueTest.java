package com.jiangyan.algorithm.linear;

/**
 * 测试队列
 */
public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        for(Integer i: queue){
            System.out.println(i);
        }
        Integer de = queue.deQueue();
        System.out.println(de);

    }
}
