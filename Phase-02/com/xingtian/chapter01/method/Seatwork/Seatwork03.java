package com.xingtian.chapter01.method.Seatwork;

import java.util.Random;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/17 19:14
 * @Description: 课堂练习 开发验证码
 */
public class Seatwork03 {
    public static void main(String[] args) {
       /* 开发验证码
            定义方法实现随机产生一个 5 位的验证码
            验证码格式：
            长度为 5
            前四位是大写字母或者小写字母
            最后一位是数字 */

        // 方法：
        // 在以后如果我们要在一堆没有什么规律的数据中随机抽取
        // 可以先把这些数据放到数组当中
        // 再随机抽取一个索引

        // 分析：
        // 1.共写字母和小写字母都放到数组当中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                // 添加小写字母
                chs[i] = (char)(97 + i);
            } else {
                // 添加大写字母
                chs[i] = (char)(65 + i - 26);
            }
        }
        String result = "";
        // 2.随机抽取 4 次
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            // System.out.println(chs[randomIndex]);
            result = result + chs[randomIndex];
        }

        // 3.随机抽取一个数字 0 - 9
        int number = r.nextInt(10);
        result += number;

        System.out.println(result);
    }
}
