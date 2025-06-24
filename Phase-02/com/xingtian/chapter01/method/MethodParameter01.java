package com.xingtian.chapter01.method;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/17 17:47
 * @Description: 基础数据类型案例
 */
public class MethodParameter01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b); // 调用 swap
        System.out.println("a=" + a + "b=" + b); // 10 20
    }

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a和b交换后的值a=" + a + "\tb=" + b); // 20 10
    }
}

