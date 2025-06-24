package com.xingtian.chapter02.interface_.interface01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/22 10:49
 * @Description: 青蛙
 */
public class Frog extends Animal implements Swim {

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在游泳");
    }
}
