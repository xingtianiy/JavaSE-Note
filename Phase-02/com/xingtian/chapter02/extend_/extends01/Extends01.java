package com.xingtian.chapter02.extend_.extends01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/19 20:03
 * @Description: 继承
 */
public class Extends01 {
    public static void main(String[] args) {
        Manager m1 = new Manager("张三", 5000, 1000);
        Coder c1 = new Coder("李四", 5000);

        System.out.println(m1.getName() + " " + m1.getSalary() + " " + m1.getBonus());
        System.out.println(c1.getName() + " " + c1.getSalary());
    }
}
