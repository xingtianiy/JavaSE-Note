package com.xingtian.chapter02.poly.poly01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 10:35
 * @Description: 人
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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


    public void show() {
        System.out.println(name + " " + age);
    }
}
