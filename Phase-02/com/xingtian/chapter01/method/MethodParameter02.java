package com.xingtian.chapter01.method;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/17 17:48
 * @Description: 引用数据类型案例
 */
public class MethodParameter02 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("调用change方法前：" + arr[1]); // 20
        change(arr);
        System.out.println("调用change方法后:" + arr[1]); // 200
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}