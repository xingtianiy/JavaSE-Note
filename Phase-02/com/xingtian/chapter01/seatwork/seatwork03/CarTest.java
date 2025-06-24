package com.xingtian.chapter01.seatwork.seatwork03;

import java.util.Scanner;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/19 13:02
 * @Description: 测试
 */
public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("请输入品牌名称");
            String brand =   sc.next();
            c.setBrand(brand);
            System.out.println("请输入价格");
            int price = sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入颜色");
            String color = sc.next();
            c.setColor(color);

            arr[i] = c;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand() + "\t" + car.getPrice() + "\t" + car.getColor());
        }
    }
}
