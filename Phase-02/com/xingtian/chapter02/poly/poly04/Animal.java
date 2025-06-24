package com.xingtian.chapter02.poly.poly04;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 13:24
 * @Description: 动物
 */
public class Animal {
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void eat(String something) {
        System.out.println("动物吃" + something);
    }
}
