package com.xingtian.chapter02.poly.poly04;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 13:23
 * @Description: 测试类
 */
public class Poly04 {
    public static void main(String[] args) {
        Cat cat = new Cat(5, "白色");
        Dog dog = new Dog(3, "黄色");

        Person p = new Person("老王", 18);

        p.keepPet(dog, "骨头");
        p.keepPet(cat, "鱼");
    }
}
