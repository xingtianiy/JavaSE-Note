import java.util.Scanner;
public class Seatwork02 {
	public static void main(String[] args) {
		// 平方根
		// 提示用户输入一个正整数，程序将输出该数字的平方根（整数部分）
		// 只需要输出整数部分，不需要输出小数部分


		// 实现逻辑
		// 从1开始循环，逐步逼近平方根
		// 如果找到一个数的平方等于目标数字，则输出该数作为平方根
		// 如果找到一个数的平方大于目标数字，则输出前一个数作为平方根的整数部分

		// 1.提示用户输入一个正整数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int number = sc.nextInt();

		// 2.从1开始循环判断
		// 初始化从1开始，直到number
		for (int i = 1; i <= number; i++) {
			// 如果i的平方等于number，则输出i作为平方根
			if (i * i == number) {
				System.out.println(i + " 是 " + number + " 的平方根");
				// 一旦找到，循环结束，不需要继续寻找，直接退出循环
				break;
			} else if (i * i > number) {
				System.out.println((i - 1) + " 是 " + number + " 的平方根的整数部分");
				break;
			}
		}
	}
}