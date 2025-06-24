package com.xingtian.chapter02.final_.final01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 16:41
 * @Description: 测试
 */
public class Final01 {
    public static void main(String[] args) {
       /* final修饰方法：
        表明该方法是最终方法，不能被重写
        final修饰类：
        表明该类是最终类，不能被继承
        final修饰变量：
        叫做常量，只能被赋值一次*/

        final int a = 10;
        System.out.println(a); // 10
        // 只能被赋值一次
        // a = 20;
    }
}

final class Fu{
    public final void show(){
        System.out.println("父类的show方法");
    }
}


// class Zi extends  Fu{
//
//     @Override
//     public void show() {
//         System.out.println("子类的show方法");
//     }
// }