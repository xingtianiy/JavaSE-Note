package com.xingtian.chapter01.method.Seatwork;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/17 19:07
 * @Description: 课堂练习 找质数
 */
public class Seatwork02 {
    public static void main(String[] args) {
        /* 找质数
           判断101-200之间有多少个素数，并输出所有素数。 */

        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                // j 表示 2 到 99 之间的每一个数字
                if (i % j == 0) {
                    flag = false;
                    // 跳出单层循环 内循环
                    break;
                }
            }
            if (flag) {
                System.out.println("当前数字" + i + "是质数");
                count++;
            }
        }
        System.out.println("一共有 " + count + "个质数");

        // int i = 7;
        // boolean flag = true;
        // for (int j = 2; j < i; j++) {
        //     // j 表示 2 到 99 之间的每一个数字
        //     if (i % j == 0) {
        //         flag = false;
        //         break;
        //     }
        // }
        // if (flag) {
        //     System.out.println("当前数字是质数");
        // } else {
        //     System.out.println("当前数字不是一个质数");
        // }
    }
}
