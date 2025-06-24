package com.xingtian.chapter02.modifier;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/19 17:46
 * @Description: c
 */
public class B {
    public void say() {
        A a = new A();
        // 在同一个包下 可以访问 public, protected, 默认 不能访问 private 属性和方法
        System.out.println("n1 = " + a.n1 + "; n2 = " + a.n2 + "; n3 = " + a.n3);

        a.m1();
        a.m2();
        a.m3();
        // a.m4(); // 错误的
    }
}

