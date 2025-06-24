package com.xingtian.chapter02.abstract_.abstract02;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/21 16:55
 * @Description: 测试
 */
public class Test {
    public static void main(String[] args) {
        // 创建对象
        Frog f = new Frog("小红", 18);
        System.out.println(f.getName() + " " + f.getAge());
        f.eat();
        f.drink();
    }
}
