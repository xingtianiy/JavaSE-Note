package com.xingtian.chapter02.poly.poly04;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 13:24
 * @Description: 猫
 */
public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫眯着眼睛侧着头吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
