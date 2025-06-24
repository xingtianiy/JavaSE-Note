package com.xingtian.chapter02.extend_.teststudent01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/19 22:54
 * @Description: 成愿变量继承内存分析
 */

public class TestStudent01 {
    public static void main(String[] args) {
        Zi z = new Zi();
        System.out.println(z);
        // z.name = "钢门吹雪";
        // z.age = 23;
        z.game = "王者农药";
        System.out.println(z.game);
    }
}

