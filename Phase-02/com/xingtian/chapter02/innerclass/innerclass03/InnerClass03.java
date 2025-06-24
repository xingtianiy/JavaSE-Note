package com.xingtian.chapter02.innerclass.innerclass03;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/23 20:48
 * @Description: 测试静态内部类
 */
public class InnerClass03 {
    public static void main(String[] args) {
        /*
            静态内部类要点
                访问外部类成员的限制
                只能访问外部类中的静态变量和静态方法
                如需访问非静态成员，必须先创建外部类对象
            创建静态内部类对象
                格式：外部类名.内部类名 对象名 = new 外部类名.内部类名；
                范例：Outer.Inner oi = new Outer.Inner();
            方法调用方式
                调用非静态方法：先创建对象，用对象调用
                调用静态方法：外部类名.内部类名.方法名();
        */

        // 创建静态内部类的对象
        // 只要是静态的东西，都可以用类名点直接获取
        Outer.Inner oi = new Outer.Inner();
        oi.show1();

        // 静态方法
        Outer.Inner.show2();
    }
}
