package com.xingtian.chapter02.interface_.interface05;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/22 14:17
 * @Description: 接口 B
 */
public interface InterB {
    public default void show() {
        System.out.println("InterB 接口中的默认方法 --- show");
    }
}
