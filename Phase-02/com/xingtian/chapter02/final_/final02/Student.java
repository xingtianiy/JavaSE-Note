package com.xingtian.chapter02.final_.final02;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/21 09:58
 * @Description: 学生
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
