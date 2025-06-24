package com.xingtian.chapter02.static_.static01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 15:08
 * @Description: 测试
 */
public class Static01 {
    public static void main(String[] args) {

        Student.teacherName = "阿伟老师";
        // 1.创建第一个学生对象
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        // s1.teacherName = "阿伟老师";

        s1.study();
        s1.show();

        // 2.创建第二个学生对象
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(24);
        s2.setGender("女");

        s2.study();
        s2.show();
        // s2.teacherName = "阿伟老师";
    }
}
