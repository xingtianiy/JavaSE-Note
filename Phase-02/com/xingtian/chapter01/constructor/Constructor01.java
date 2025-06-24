package com.xingtian.chapter01.constructor;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/18 12:46
 * @Description: 构造器
 */
public class Constructor01 {
    public static void main(String[] args) {
        // 当我们 new 一个对象时 自己通过构造器指定名字和年龄
        Person p1 = new Person("smith", 80);
        System.out.println("p1的信息如下");
        System.out.println("p1对象name= " + p1.name); // smith
        System.out.println("p1对象age= " + p1.age); // 80
    }
}
