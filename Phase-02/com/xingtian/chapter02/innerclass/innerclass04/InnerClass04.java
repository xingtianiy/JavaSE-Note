package com.xingtian.chapter02.innerclass.innerclass04;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/23 20:56
 * @Description: 局部内部类
 */
public class InnerClass04 {
    public static void main(String[] args) {
        /*
            局部内部类
            1. 将内部类定义在方法里面就叫做局部内部类，类似于方法里面的局部变量。
            2. 外界是无法直接使用，需要在方法内部创建对象并使用。
            3. 该类可以直接访问外部类的成员，也可以访问方法内的局部变量。
        */

        // 无法直接使用show方法里面的局部变量a
        Outer o = new Outer();
        // o.a;

        // 调用show方法,让代码执行
        Outer o1 = new Outer();
        o1.show();
    }
}
