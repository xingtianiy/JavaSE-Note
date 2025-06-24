package com.xingtian.chapter02.extend_.extends03;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 10:27
 * @Description:
 */
class Student extends Person {
    public void lunch() {
        // 先在本类中查看eat和drink方法，就会调用子类的，
        // 果没有，就会调用从父类中继承下来的eat和drink方法
        this.eat();
        this.drink();

        // 直接调用父类中的eat和drink方法
        super.eat();
        super.drink();
    }
}
