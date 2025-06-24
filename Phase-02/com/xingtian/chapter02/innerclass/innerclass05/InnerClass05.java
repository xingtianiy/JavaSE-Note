package com.xingtian.chapter02.innerclass.innerclass05;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/23 21:11
 * @Description: 匿名内部类
 */
public class InnerClass05 {
    public static void main(String[] args) {
        /*
            匿名内部类本质上就是隐藏了名字的内部类
            本质与特点
                本质是没有显式类名的内部类（编译后自动生成外部类$数字.class的格式）
                同时完成类的定义和对象的创建
                适合一次性使用的场景
         */

        // 编写匿名内部类的代码
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };

        new Animal() {
            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };

        // 在测试类中调用下面的method方法？
        // 以前的方式如何调用？
        // 要自己写一个子类继承Anima1类
        // 再创建子类的对象，传递给method方法

        // Dog d = new Dog();
        // method(d);
        // 如果Dog类我只要用一次，那么还需要单独定义一个类太麻烦了。

        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }
        );

    }

    public static void method(Animal a) { // Animal a = 子类对象 多态
        a.eat(); // 编译看左边,运行看右边
    }
}
