package com.xingtian.chapter02.poly.poly04;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 13:24
 * @Description: 狗
 */
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}
