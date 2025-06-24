import java.util.Scanner;

public class Seatwork04 {
	public static void main(String[] args) {
		// 提示用户输入一个数字，根据数字显示对应的星期名称
		// 例如：
		// 输入1，输出“星期一”
		// 输入2，输出“星期二”
		// 输入3，输出“星期三”
		// 输入4，输出“星期四”
		// 输入5，输出“星期五”
		// 输入6，输出“星期六”
		// 输入7，输出“星期天”

		// 1.提示用户输入一个数字
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int week = sc.nextInt();
		// 2.使用switch语句进行匹配并输出
		switch (week) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期天");
				break;
			default:
				System.out.println("没有对应的星期");
				break;
		}
	}
}