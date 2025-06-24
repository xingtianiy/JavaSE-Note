package com.xingtian.chapter01.method;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/18 13:55
 * @Description: 可变参数
 */
public class VarParameter01 {
    public static void main(String[] args) {

        int[] sum = sum(10, 20, 30, 40, 50);

        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }

    // 可以计算2个数的和，3个数的和，4... 5...
    // 可以使用方法重载
    public int sum(int n1, int n2) { // 2个数的和
        return n2 + n2;
    }

    public int sum(int n1, int n2, int n3) { // 3个数的和
        return n2 + n2 + n3;
    }

    public int sum(int n1, int n2, int n3, int n4) { // 4个数的和
        return n2 + n2 + n3 + n4;
    }

    // 上面的三个方法名称相同 功能相同 参数个数不同 -> 使用可变参数优化
    public static int[] sum(int... n) {
        return n;
    }
}
