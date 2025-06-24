package com.xingtian.chapter02.extend_.teststudent03;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 10:17
 * @Description: 人
 */
public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类的无参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
