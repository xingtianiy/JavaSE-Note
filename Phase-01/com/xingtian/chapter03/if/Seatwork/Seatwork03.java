import java.util.Scanner;

public class Seatwork03 {
	public static void main(String[] args) {
		// 实现一个任务，需要判断输入的数字是否在1到100之间
		// 如果数字在1到100之间，判断该数字是偶数还是奇数
		// 如果输入的数字不在1到100之间，提示“输入错误”
		// 如果输入的数字是偶数，提示“是偶数”
		// 如果输入的数字是奇数，提示“是奇数”

		// 1.提示用户输入一个数字
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int ticket = sc.nextInt();
		// if 判断
		if (ticket >= 0 && ticket <= 100) {
			// 2.判断数字是偶数还是奇数
			if (ticket % 2 == 0) {
				System.out.println("是偶数");
			} else {
				System.out.println("是奇数");
			}
		} else {
			System.out.println("输入错误");
		}
	}
}