package com.xingtian.chapter02.extend_.teststudent03;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 10:17
 * @Description: 学生
 */
public class Student extends  Person {

    public Student() {
        super();
        System.out.println("子类的无参构造");
    }
    public Student(String name, int age) {
        super(name, age);
    }
}
