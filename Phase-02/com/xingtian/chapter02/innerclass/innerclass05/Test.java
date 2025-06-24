package com.xingtian.chapter02.innerclass.innerclass05;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/23 21:27
 * @Description: 额外小点
 */
public class Test {

    // 是一个没有名字的成员内部类
    Swim s = new Swim() {

        @Override
        public void swim() {
            System.out.println("重写之后游泳方法");
        }
    };

    public static void main(String[] args) {


        // 整体我们可以理解为Swim接口的实现类对象
        // 接口多态
        Swim s = new Swim() {

            @Override
            public void swim() {
                System.out.println("重写之后游泳方法");
            }
        };

        // 编译看左边,运行看右边
        s.swim();


        new Swim() {

            @Override
            public void swim() {
                System.out.println("重写之后游泳方法");
            }
        }.swim(); // 调用方法?
    }
}
