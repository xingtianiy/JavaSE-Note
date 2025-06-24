package com.xingtian.chapter01.method.Seatwork;

import java.util.Scanner;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/17 18:45
 * @Description: 课堂练习 卖飞机票
 */
public class Seatwork01 {
    public static void main(String[] args) {
        /*  卖飞机票
            机票价格按照淡季旺季、头等舱和经济舱收费、输机票原价月份和头等舱或经济舱。
            按照如下规则计算机票价格：
            旺季 5-10 月：头等舱 9 折，经济舱 8.5 折
            淡季 11 月到来年的 4 月：等舱 7 折，经济舱 6.5 折。 */

        // 分析：
        // 1.键盘录入机票原价、月份、头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double ticket = sc.nextInt();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱");
        int seat = sc.nextInt();
        // 2.先判断月份是旺季还是淡季
        if (month >= 5 && month <= 10) {
            // 旺季
            // 3.继续判断当前机票是经济舱还是头等舱
            // ctrl + alt + M 自动抽取方法
            // if (seat == 0) {
            //     // 头等舱
            //     // 4.根据实际情况计算出对应的价格
            //     ticket *= 0.9;
            // }else if (seat == 1) {
            //     // 经济舱
            //     ticket *= 0.85;
            // }else {
            //     System.out.println("没有这个舱位");
            // }
            ticket = getPrice(ticket, seat, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            // 淡季
            // if (seat == 0) {
            //     // 头等舱
            //     ticket *= 0.7;
            // } else if (seat == 1) {
            //     // 经济舱
            //     ticket *= 0.65;
            // } else {
            //     System.out.println("没有这个舱位");
            // }
            ticket = getPrice(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("输入不合法");
        }

        System.out.println(ticket);
    }

    public static double getPrice(double ticket, int seat, double v1, double v2) {
        if (seat == 0) {
            ticket *= v1;
        } else if (seat == 1) {
            ticket *= v2;
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}
