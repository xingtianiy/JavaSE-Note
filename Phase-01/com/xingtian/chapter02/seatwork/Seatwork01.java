public class Seatwork01 {
    public static void main(String[] args) {
        // 一辆公交车最初是空的，沿途经过5个站点，乘客上下车情况如下:
        int count = 0;
        // 第一站:上车 1 人
        // 在原有的基础上 + 1
        count = count + 1;
        // 第二站:上车 2 人,下车 1 人
        count = count + 2 - 1;
        // 第三站:上车 2 人,下车 1 人
        count = count + 2 - 1;
        // 第四站:下车 1 人
        count = count - 1;
        // 第五站:上车 1 人
        count = count + 1;
        // 问题:到达终点站时,车上共有多少位乘客？
        System.out.println(count);
    }
}
