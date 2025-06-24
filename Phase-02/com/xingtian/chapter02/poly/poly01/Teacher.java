package com.xingtian.chapter02.poly.poly01;


/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 10:37
 * @Description: 老师
 */
public class Teacher extends Person {
    @Override
    public void show() {
        System.out.println("老师信息为:" + getName() + " " + getAge());
    }
}
