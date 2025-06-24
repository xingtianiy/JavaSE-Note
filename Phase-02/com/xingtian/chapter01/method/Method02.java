package com.xingtian.chapter01.method;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/17 15:23
 * @Description: 带参数的方法定义
 */
public class Method02 {
    public static void main(String[] args) {
        // 目标: 掌握最带参数的方法定义和调用的格式

        getSum(10, 20);
        // getSum(10.1, 20.2); // 需要根据个数和类型对应起来
    }
    public static void getSum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
}
