package com.xingtian.chapter02.interface_.interface01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/22 10:49
 * @Description: 狗
 */
public class Dog extends Animal implements Swim {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗在游泳");
    }
}
