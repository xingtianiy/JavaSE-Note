package com.xingtian.chapter02.poly.poly04;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 13:24
 * @Description: 人
 */
public class Person {
    private String name;
    private int age;

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


    // 想要一个方法，能接收所有的动物，包括猫，包括狗
    // 方法的形参：可以写这些类的父类 Animal
    public void keepPet(Animal a, String something) {
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的动物");
        a.eat(something);
    }

    // public void keepPet(Dog dog, String something) {
    //     System.out.println("年龄为" + age + "岁的" + name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的动物");
    // }

    // public void keepPet(Cat cat, String something) {
    //     System.out.println("年龄为" + age + "岁的" + name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的动物");
    // }
}
