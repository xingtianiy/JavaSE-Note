package com.xingtian.chapter02.interface_.interface07;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/22 15:28
 * @Description: 接口 A
 */
public interface InterA {
    public default void show1() {
        System.out.println("show1方法开始执行了");
        // System.out.println("记录程序在运行过程中的各种细节");
        // show3();
    }

    public default void show2() {
        System.out.println("show2方法开始执行了");
        // System.out.println("记录程序在运行过程中的各种细节");
        // show3();
    }


    // 普通的私有方法 给默认方法服务的
    // private void show3() {
    //     System.out.println("记录程序在运行过程中的各种细节");
    // }

    // 静态的私有方法 给静态方法服务的
    // private static void show4() {
    //     System.out.println("记录程序在运行过程中的各种细节");
    // }
}
