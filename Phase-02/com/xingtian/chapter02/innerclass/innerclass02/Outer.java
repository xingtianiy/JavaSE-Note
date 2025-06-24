package com.xingtian.chapter02.innerclass.innerclass02;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/23 14:16
 * @Description: 成愿内部类
 */
public class Outer {
    String name;
    private int a = 10;

    class Inner{
        // 成员内部类-面试题
        private int a = 20;
        public void show(){
            int a = 30;
            System.out.println(Outer.this.a); // 10
            System.out.println(this.a); // 20
            System.out.println(a); // 30
        }
    }

    // 外部类编写方法，对外提供内部类对象
    public Inner getInstance() {
        return new Inner();
    }
}
