package com.xingtian.chapter01.method.Seatwork;

import java.util.Scanner;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/18 09:35
 * @Description: 课堂练习 评委打分
 */
public class Seatwork04 {
    public static void main(String[] args) {
        /*  评委打分
            在唱歌比赛中，有6名评委给选手打分，分数范围是[0－100]之间的整数。
            选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。*/

        // 分析：
        // 1.定义一个数组，用来存储6名评委的打分（0~100）
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        // 2.求出数组中的最大值
        int max = getMax(scoreArr);
        System.out.println(max);
        // 3.求出数组中的最小值
        int min = getMin(scoreArr);
        System.out.println(min);
        // 4.求出数组中6个分数的总和
        int sum = getSum(scoreArr);
        System.out.println(sum);
        // 5.（总和－最大值－最小值）/ 4
        int avg = (sum - max - min) / (scoreArr.length - 2);
        System.out.println(avg);

    }

    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum += scoreArr[i];
        }
        return sum;
    }

    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (max < scoreArr[i]) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (min > scoreArr[i]) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                scores[i] = score;
                i++;
            }else {
                System.out.println("成绩超出范围 当前的 I 为" + i);
            }
        }
        return scores;
    }
}
