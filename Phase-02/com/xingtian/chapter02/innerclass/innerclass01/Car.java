package com.xingtian.chapter02.innerclass.innerclass01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/22 23:13
 * @Description: 汽车
 */
public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show() {
        // 是打印调用者车的名字:宾利
        System.out.println(this.carName);
        // ??? 在代码中有没有发动机的对象? 没有
        // 外部类要访问内部类的成员，必须创建对象
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    class Engine {
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(engineName);
            // 内部类可以直接访问外部类的成员，包括私有
            System.out.println(carName);
        }
    }
}
