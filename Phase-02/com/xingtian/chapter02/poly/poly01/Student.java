package com.xingtian.chapter02.poly.poly01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 10:35
 * @Description: 学生
 */
public class Student extends Person {
    @Override
    public void show() {
        System.out.println("学生信息为:" + getName() + " " + getAge());
    }
}
