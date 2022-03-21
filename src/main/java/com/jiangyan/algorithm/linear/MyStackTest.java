package com.jiangyan.algorithm.linear;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        for(Integer i : stack){
            System.out.println(i + " ");
        }
        System.out.println("第一次弹出：" + stack.pop());
        System.out.println("剩余个数：" + stack.size());
        System.out.println("第二次弹出：" + stack.pop());
        System.out.println("剩余个数：" + stack.size());
    }
}
