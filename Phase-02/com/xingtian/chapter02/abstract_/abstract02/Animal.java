package com.xingtian.chapter02.abstract_.abstract02;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/21 16:55
 * @Description: 动物
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
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

    public abstract void eat();

    public void drink() {
        System.out.println("动物在喝水");
    }
}
