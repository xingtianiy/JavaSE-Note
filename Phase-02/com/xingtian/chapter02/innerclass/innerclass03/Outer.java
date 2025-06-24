package com.xingtian.chapter02.innerclass.innerclass03;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/23 20:49
 * @Description: 静态内部类
 */
public class Outer {
    int a = 10;
    static int b = 20;

    // 静态内部类
    static class Inner {
        public void show1() {
            System.out.println("非静态的方法被调用了");
            // System.out.println(a);
            // 如需访问非静态成员，必须先创建外部类对象
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);
        }

        public static void show2() {
            System.out.println("静态的方法被调用了");
            // System.out.println(a);
            // 如需访问非静态成员，必须先创建外部类对象
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);
        }
    }
}
