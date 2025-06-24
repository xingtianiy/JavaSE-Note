package com.xingtian.chapter02.interface_.interface01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/22 10:48
 * @Description: 兔子
 */
public class Rabbit extends Animal {
    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }



    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");
    }
}
