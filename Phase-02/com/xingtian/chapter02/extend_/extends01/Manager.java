package com.xingtian.chapter02.extend_.extends01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/19 22:18
 * @Description: 经理
 */
public class Manager extends Employ {
    private double bonus;

    public Manager() {
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
