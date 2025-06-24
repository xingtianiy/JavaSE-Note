package com.xingtian.chapter01.this_;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/18 20:34
 * @Description: this 关键字
 */
public class This01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("大壮", 3);
        System.out.println("dog1的hashCode=" + dog1.hashCode());
        // dog1.info();
        Dog dog2 = new Dog("大黄", 2);
        dog1.info();
        System.out.println("dog2的hashCode=" + dog2.hashCode());
        // dog2.info();
    }
}