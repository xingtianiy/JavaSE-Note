package com.xingtian.chapter01.seatwork.seatwork04;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/19 13:55
 * @Description: 测试
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone[] arr = new Phone[3];

        Phone p1 = new Phone("华为", 1999.9, "黑色");
        Phone p2 = new Phone("小米", 1666.5, "黑色");
        Phone p3 = new Phone("苹果", 5999.9, "黑色");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone p = arr[i];
            double price = p.getPrice();
            average += price / arr.length;
        }

        System.out.println(average);

    }
}
