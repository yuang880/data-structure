package com.jiangyan.algorithm.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 测试类
 * @author zhang
 */
public class StudentTest {

    public static Comparable<Student> studentComparable(Comparable<Student> c1,
                                                Comparable<Student> c2){
        int result = c1.compareTo((Student) c2);
        // 如果result为正，c1大
        if(result >= 0){
            return c1;
        }
        return c2;
    }

    @Test
    public void getMaxAge(){
        Student t1 = new Student("zhangsan", 40);
        Student t2 = new Student("lisi", 30);
        Comparable<Student> studentComparable = studentComparable(t1, t2);
        System.out.println(studentComparable);
    }
}
