package com.xingtian.chapter02.abstract_.abstract01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/21 16:45
 * @Description: 子类
 */
public class Student extends Person {

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }


    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
