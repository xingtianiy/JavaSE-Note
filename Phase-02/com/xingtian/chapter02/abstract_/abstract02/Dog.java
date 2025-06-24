package com.xingtian.chapter02.abstract_.abstract02;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/21 16:56
 * @Description: 狗
 */
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

}
