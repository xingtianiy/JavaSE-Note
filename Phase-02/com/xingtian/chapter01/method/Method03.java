package com.xingtian.chapter01.method;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/17 15:39
 * @Description: 带返回值方法定义
 */
public class Method03 {
    public static void main(String[] args) {
        // 目标：掌握带返回值方法的定义和调用格式

        // 直接调用
        getSum(10, 20);

        // 赋值调用
        int sum = getSum(10, 20);
        System.out.println(sum);

        // 输出调用
        System.out.println(getSum(10, 20));
    }

    public static int getSum(int a, int b) {
        int result = a + b;
        return result; // 返回给方法的调用处
    }
}
