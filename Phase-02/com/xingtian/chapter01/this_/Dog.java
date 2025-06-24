package com.xingtian.chapter01.this_;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/18 20:36
 * @Description: dog 类
 */
public class Dog {

    String name;
    int age;

    // public Dog(String dName, int dAge) { // 构造器
    //     name = dName;
    //     age = dAge;
    // }

    // 如果我们构造器的形参 能够直接写成属性 就更好了
    // 当时出现了一个问题 根据变量的作用域原则
    // 构造器的 name 就是局部变量,而不是属性
    // 构造器的 age 就是局部变量,而不是属性
    // ==> 引出 this 关键字来解决
    public Dog(String name, int age) { // 构造器
        // this.name 就是当前对象的属性 name
        this.name = name;
        // this.age 就是当前对象的属性 age
        this.age = age;
        System.out.println("this.hashCode= " + this.hashCode());
    }

    public void info() { // 成员方法 输出属性信息
        System.out.println(name + "\t" + age + "\t");
    }
}
