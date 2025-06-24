package com.xingtian.chapter02.extend_.extends01;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/19 22:19
 * @Description: 打工
 */
public class Employ {
    private String name;
    private double salary;

    public Employ() {
    }

    public Employ(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
