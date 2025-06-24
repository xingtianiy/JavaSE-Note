package com.xingtian.chapter02.encap;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/19 19:23
 * @Description: 封装案例
 */

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("星恬");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());
        System.out.println(person.getSalary());

        // 如果我们直接使用构造器指定属性
        Person smith = new Person("smith", 20, 50000);
        System.out.println("=====smith的信息======");
        System.out.println(smith.info());

    }
}

/*
    那么在java中如何实现这种类似的控制呢？
    不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，
    否则给默认年龄必须在1-120，年龄，工资不能直接查看，name的长度在2-6之间
 */

class Person {
    public String name; // 名字公开
    private int age; // 年龄私有化
    private double salary; // 工资私有化

    // 构造器
    public Person() {
    }

    // 有三个属性的构造器
    public Person(String name, int age, double salary) {
        // this.name = name;
        // this.age = age;
        // this.salary = salary;
        // 我们可以讲 set 方法写在构造器中 这样仍然可以验证
        setName(name); // 等价于 this
        setAge(age);
        setSalary(salary);
    }

    // 自己写 setXxx 和 getXxx 太慢 我们可以使用快捷键
    // alt + insert
    // 然后根据要求来完善我们的代码

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 加入对数据的校验
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对 给你一个默认名字");
            this.name = "无名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) { // 如果是合理范围
            this.age = age;
        } else {
            System.out.println("你设置的年龄不对 需要在（1-120）范围内 （给默认年龄18）");
            this.age = 18; // 给一个默认你年龄
        }
    }

    public double getSalary() {
        // 可以增加当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 写一个方法 返回属性信息
    public String info() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }
}