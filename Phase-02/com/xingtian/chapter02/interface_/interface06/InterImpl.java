package com.xingtian.chapter02.interface_.interface06;


/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/22 14:22
 * @Description: 实现类
 */
public class InterImpl implements Inter {

    @Override
    public void method() {
        System.out.println("Inter 接口中的方法");
    }

    public static void show() {
        System.out.println("Inter 接口中的静态方法");
    }
}
