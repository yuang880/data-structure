package com.jiangyan.algorithm.sort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * 需求：
 *      定义学生类Student，有name和age两个属性，通过Comparable接口比较
 *      定义测试类，在测试方法中Comparable getMax(Comparable c1, Comparable c2)完成测试
 * @author zhang
 */
@Data
@AllArgsConstructor
@ToString
public class Student implements Comparable<Student>{
    private String userName;
    private int age;

    /**
     * 重写比较规则。
     * @param o 要比较的对象
     * @return 大小，正为大于
     */
    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}
