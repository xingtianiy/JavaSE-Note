package com.xingtian.chapter02.extend_.extends03;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/19 23:44
 * @Description: 成员方法的特点
 */
public class Extends03 {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();

        System.out.println("===================");

        OverseasStudent o = new OverseasStudent();
        o.lunch();
    }
}

