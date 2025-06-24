package com.xingtian.chapter02.abstract_.abstract01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/21 16:43
 * @Description: 抽象类
 */
public abstract class Person {

    private String name;
    private int age;

    // 3.可以有构造方法
    // 作用:当创建子类对象的时,给属性进行赋值的
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public abstract void work();

    // 2.抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
    public void sleep() {
        System.out.println("睡觉");
    }
}
