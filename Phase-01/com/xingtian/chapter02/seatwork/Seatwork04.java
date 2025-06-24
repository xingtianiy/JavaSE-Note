import java.util.Scanner;

public class Seatwork04 {
    public static void main(String[] args) {
        // 要求：键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台~

        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();

        // 2.获取个位、十位、百位
        // 方法：
        // 个位：数字 % 10
        // 十位：数字 / 10 % 10
        // 百位：数字 / 10 / 10 % 10

        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 10 / 10 % 10;
        System.out.println("个位是：" + ge);
        System.out.println("十位是：" + shi);
        System.out.println("百位是：" + bai);
    }
}