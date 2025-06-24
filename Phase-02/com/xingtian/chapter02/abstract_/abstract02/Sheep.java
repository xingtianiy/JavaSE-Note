package com.xingtian.chapter02.abstract_.abstract02;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/21 16:58
 * @Description: 山羊
 */
public class Sheep extends  Animal {
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("山羊吃草");
    }

}
