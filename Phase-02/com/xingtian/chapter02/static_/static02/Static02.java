package com.xingtian.chapter02.static_.static02;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 15:36
 * @Description: 加入游戏
 */
public class Static02 {
    public static void main(String[] args) {

        // 定义一个变量 count 统计有多少小孩加入了游戏
        // int count = 0;

        Child child1 = new Child("tom");
        child1.join();
        // 通过类名调用
        Child.count++;

        Child child2 = new Child("jack");
        child2.join();
        // 通过对象名调用
        child2.count++;

    }
}

class Child{ // 类
    private String name;
    // 定义一个变量 count 是一个静态变量 static 静态
    // 该变量最大的特点就是会被 Child 类的所有的对象实例共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏");
    }
}