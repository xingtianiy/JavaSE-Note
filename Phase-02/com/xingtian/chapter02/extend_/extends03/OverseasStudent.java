package com.xingtian.chapter02.extend_.extends03;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 10:27
 * @Description:
 */ // 留学生
class OverseasStudent extends Person {
    public void lunch() {
        this.eat();
        this.drink();

        super.eat();
        super.drink();
    }

    public void eat() {
        System.out.println("吃意大利面"); // 3
    }

    public void drink() {
        System.out.println("喝凉水"); // 4
    }
}
