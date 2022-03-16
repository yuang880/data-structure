package com.jiangyan.algorithm.linear;

import java.util.Iterator;

/**
 * 顺序表
 * @author zhang
 */
public class SequenceList<T> implements Iterable<T> {
    // 存储元素的数组
    private T[] eles;

    // 记录当前顺序表中的元素个数
    private int N;

    // 构造方法
    public SequenceList(int capacity) {
        // 初始化数组
        this.eles = (T[]) new Object[capacity];
        this.N = 0;

    }

    // 清空
    public void clear(){
        this.N = 0;
    }
    // 判断是否为空
    public boolean isEmpty(){
        return N == 0;
    }
    // 获取长度
    public int length(){
        return N;
    }
    // 指定位置的元素
    public T get(int i){
        return eles[i];
    }
    // 指定位置添加元素
    public void insert(int i, T t){
        // 索引i到index - 1处的先后移，
        for (int index = N; index > i; index--) {
            eles[index] = eles[index - 1];
        }
        // i处赋值
        eles[i] = t;
        // 长度加1；
        N++;

    }
    // 尾部添加元素
    public void insert(T t){
        eles[N++] = t;
    }
    // 删除指定位置元素，并返回该元素
    public T remove(int i){
        T cullent = eles[i];
        // 逐个前移
        for(int index = i; index < N - 1; index++){
            eles[index] =  eles[index + 1];
        }
        N--;
        return cullent;
    }
    // 查找t元素第一次出现的位置，没有则返回-1
    public int indexOf(T t){
        for(int i = 0; i < N; i++){
            if(eles[i].equals(t)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }


    private class SIterator implements Iterator{
        private int cusor;

        public SIterator() {
            this.cusor = 0;
        }

        @Override
        public boolean hasNext() {
            return cusor < N;
        }

        @Override
        public Object next() {
            return eles[cusor++];
        }
    }
}
