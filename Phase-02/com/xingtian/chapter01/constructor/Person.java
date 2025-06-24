package com.xingtian.chapter01.constructor;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/18 12:51
 * @Description: 人类
 */
public class Person {
    // 在创建人类的对象时，就直接指定这个对象的年龄和姓名
    String name;
    int age;

    // 构造器
    // 解读
    // 1.构造器没有返回值 也不能写 void
    // 2.构造器的名称和类 Person 一样
    // 3. (String pName, int pAge) 是构造器形参列表 规则和成员方法一样
    // 如果我们自己没有写任何的构造方法
    // 那么虚拟机给我们加一个空参构造方法
    public Person(String pName, int pAge) {
        System.out.println("构造器被调用~~ 完成对象的属性初始化");
        name = pName;
        age = pAge;
    }
}
