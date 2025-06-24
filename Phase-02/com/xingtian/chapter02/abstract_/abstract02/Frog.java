package com.xingtian.chapter02.abstract_.abstract02;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/21 16:58
 * @Description: 青蛙
 */
public class Frog extends Animal {

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

}
