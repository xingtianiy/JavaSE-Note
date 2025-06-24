package com.xingtian.chapter02.extend_.teststudent03;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 10:15
 * @Description: 构造方法
 */
public class TestStudent03 {
    public static void main(String[] args) {
        Student s = new Student("张三", 23);

        System.out.println(s.name +  " " + s.age);
    }
}
