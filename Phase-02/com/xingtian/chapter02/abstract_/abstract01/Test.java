package com.xingtian.chapter02.abstract_.abstract01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/21 16:43
 * @Description: 测试
 */
public class Test {
    public static void main(String[] args) {
        // 创建对象
        // 1.抽象类不能实例化（即：new）
        // Person p = new Person();

        Student s = new Student("张三", 23);
        System.out.println(s.getName() + " " + s.getAge());
    }
}
