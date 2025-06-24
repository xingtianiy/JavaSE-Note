import java.util.Scanner;
public class Seatwork03 {
	public static void main(String[] args) {
		// 功能描述
		// 提示用户输入一个整数，判断该整数是否为一个素数


		// 算法思路
		// 定义一个整数只能被1和自身整除的数才是素数
		// 例如：
		// 7 = 1 * 7 是素数
		// 8 = 1 * 8  2 * 4 不是素数


		// 实现步骤
		// 1.提示用户输入一个整数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		// number
		int number = sc.nextInt();


		// 定义一个布尔变量用于标记
		// 判断number是否为一个素数
		// true表示是素数
		// false表示不是素数
		boolean flag = true;

		// 2.判断
		// 循环从2开始判断，一直到number-1为止
		// 如果在范围内找到一个能整除number的数，则number不是素数
		for (int i = 2; i < number; i++) {
			// i表示循环范围内的每一个整数
			// 判断number是否能被i整除，如果能整除，则不是素数
			if (number % i == 0) {
				flag = false;
				System.out.println(number + " 不是素数");
				break;
			}
		}

		// 只有循环结束后，才表示在范围内没有找到能整除number的数
		// 此时number是一个素数
		if (flag) {
			System.out.println(number + " 是素数");
		} else {
			System.out.println(number + " 不是素数");
		}
	}
}