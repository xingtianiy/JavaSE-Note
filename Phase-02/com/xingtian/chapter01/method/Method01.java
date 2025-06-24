package com.xingtian.chapter01.method;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/17 14:28
 * @Description: 最简单的方法定义
 */
public class Method01 {
    public static void main(String[] args) {
        // 目标: 掌握最简单的方法定义和调用的格式
        // 调用方法
        playGame();
        playGame();
    }

    // 定义一个方法
    public static void playGame() {
        System.out.println("选人物");
        System.out.println("准备开局");
        System.out.println("对线");
        System.out.println("崩盘");
        System.out.println("骂队友");
        System.out.println("送人头");
        System.out.println("GG");
    }
}
