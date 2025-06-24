package com.xingtian.chapter02.poly.poly01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 10:37
 * @Description: 管理员
 */
public class Administrator extends Person {
    @Override
    public void show() {
        System.out.println("管理员信息为:" + getName() + " " + getAge());
    }
}
