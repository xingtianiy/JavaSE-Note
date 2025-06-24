package com.xingtian.chapter02.codeblock;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/21 10:27
 * @Description: 代码块
 */
public class CodeBlock {
    static int staticVar; // 静态变量

    // 静态代码块
    // 1. 随着类加载而执行，只执行一次
    // 2. 用于初始化静态变量
    static {
        staticVar = 10;
    }

    int instanceVar; // 实例变量


    // 构造代码块：
    // 1.写在成员位置的代码块
    // 2.作用：可以把多个构造方法中重复的代码抽取出来
    // 3.执行时机：我们在创建本类对象的时候会先执行构造代码块再执行构造方法
    {
        instanceVar = 20;
    }

    public CodeBlock() {
        System.out.println("构造方法执行");
    }

    public static void main(String[] args) {
        // 局部代码块
        // 1. 写在方法内部的代码块
        // 2. 作用：限制变量的作用域，避免变量污染整个方法
        // 3. 执行时机：每次进入代码块时执行
        {
            int localVar = 30;
            System.out.println("局部变量：" + localVar);
        }
        CodeBlock obj = new CodeBlock();
        System.out.println("静态变量：" + staticVar);
        System.out.println("实例变量：" + obj.instanceVar);
    }
}