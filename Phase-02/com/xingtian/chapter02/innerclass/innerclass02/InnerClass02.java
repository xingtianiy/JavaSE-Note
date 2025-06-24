package com.xingtian.chapter02.innerclass.innerclass02;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/23 14:15
 * @Description: 测试
 */
public class InnerClass02 {
    public static void main(String[] args) {
        /*
            编写成员内部类的注意点：
                1. 成员内部类可以被一些修饰符所修饰，比如：private，默认，protected，public，static等
                2. 在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量。
            获取成员内部类对象的两种方式：
                方式一：外部类编写方法，对外提供内部类对象
                方式二：直接创建
                格式：外部类名.内部类名对象名 = 外部类对象.内部类对象；
                范例：Outer.Inner oi = new Outer().new Inner();
        */

        // 创建对象的方式：
        // 类名 对象名 = new 类名();
        // Student s = new Student();

        // 我要创建的是谁的对象？
        // 内部类的对象
        // Outer.Inner o1 = new Outer().new Inner();

        Outer o = new Outer();
        System.out.println(o.getInstance());

        // 创建内部类的对象，并调用show方法
        Outer.Inner o1 = new Outer().new Inner();
        o1.show();
        // 因为name是一个成员变量，想要调用只能通过对象去调用
        // System.out.println(new Outer().name);
    }
}
