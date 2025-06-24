package com.xingtian.chapter02.modifier;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/19 17:47
 * @Description: 测试
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        B b = new B();
        b.say();
    }
}


// 只有 默认, public 才能修饰类！并且遵循上述访问权限的特点。
class Tiger{

}