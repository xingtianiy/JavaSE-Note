package com.xingtian.chapter02.final_.final02;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/21 09:56
 * @Description: 常量
 */
public class Final02 {
    public static void main(String[] args) {
            /*
                final修改基本数据类型：记录的值不能发生改变
                final修饰引用数据类型：记录的地址值不能发生改变，内部的属性值还是可以改变的

                核心：
                    常量记录的数据是不能发生改变的，
            */

        final double PI = 3.14;

        // 创建对象
        Student S = new Student("zhangsan", 23);

        // 记录的地址值不能发生改变，内部的属性值还是可以改变的
        // S = new Student();
        S.setName("李四");
        S.setAge(19);
        System.out.println(S.getName() + " " + S.getAge());

        // 数组
        int[] ARR = {1,2,3,4,5};
        // ARR = new int[10];
        ARR[0] = 10;
        ARR[1] = 20;

        // 遍历数组
        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }

    }
}
