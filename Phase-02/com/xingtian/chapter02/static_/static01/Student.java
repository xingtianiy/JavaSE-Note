package com.xingtian.chapter02.static_.static01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 15:07
 * @Description: 学生
 */
public class Student {
    // 属性：姓名年龄性别
    // 新增：老师的姓名
    private String name;
    private int age;
    private String gender;
    public static String teacherName;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // 行为
    public void study() {
        System.out.println(name + "正在学习");
    }

    public void show() {
        System.out.println(name + " " + age + " " + gender + " " + teacherName);
    }
}
