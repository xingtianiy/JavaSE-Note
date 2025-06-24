package com.xingtian.chapter02.interface_.interface02;

import java.util.Scanner;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/22 10:55
 * @Description: 接口特点
 */
public class Interface02 {
    public static void main(String[] args) {
        // System.out.println(Inter.a);
        // Inter.a = 20;

        // 创建实现类对象并调用方法
        InterImpl i = new InterImpl();
        i.method();

        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}
