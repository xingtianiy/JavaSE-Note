package com.xingtian.chapter01.scope;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/18 17:41
 * @Description: 作用域
 */
public class Scope01 {
    // 全局变量：也就是属性，作用域为整个类体Cat类：cryeat等方法使用属性
    // 属性在定义时 可以直接赋值
    int age = 10; // 指定的值是 10

    // 全局变量(属性)可以不赋值，直接使用，因为有默认值，

    double weight; // 默认值 0.0

    public void hi() {
        // 局部变量必须赋值后，才能使用，因为没有默认值。
        // int num; // 错误
        String address = "北京的猫"; // 正确
        // System.out.println("num=" + num); // 错误: 可能尚未初始化变量num
        System.out.println("address=" + address); // 正确
        System.out.println("weight=" + weight); // 正确
    }


    // 代码快后面再讲
    // {
    //     int num = 100;
    // }

    public void cry() {
        // 1. 局部变量一般是指在成员方法中定义的变量。
        // 2. n 和 name 就是局部变量
        // 3. n 和 name 的作用域在 cry 方法中
        int n = 10;
        String name = "jack";
        System.out.println("在cry中使用属性 age=" + age); // 正确
    }

    public void eat() {
        System.out.println("在eat中使用属性 age=" + age); // 正确
        // System.out.println("在eat中使用属性 num=" + num); // 错误
        // System.out.println("在eat中使用 cry 的变量 name=" + name); // 错误
    }
}