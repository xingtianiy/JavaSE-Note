package com.xingtian.chapter02.poly.poly01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 10:35
 * @Description: 多态案例
 */
public class Poly01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("王建国");
        t.setAge(30);

        Administrator a = new Administrator();
        a.setName("管理员");
        a.setAge(35);

        register(s);
        register(t);
        register(a);
    }

    // 这个方法既能接收老师，又能接收学生，还能接收管理员
    // 只能把参数写成这三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}
