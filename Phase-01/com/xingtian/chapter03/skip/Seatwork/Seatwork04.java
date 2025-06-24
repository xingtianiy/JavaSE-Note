import java.util.Random;

public class Seatwork04 {
	public static void main(String[] args) {
		// 猜数字游戏
		// 程序自动生成一个1-100之间的随机数，让用户进行猜测

		Random r = new Random();

		// 生成随机数
		// 随机数的范围是0-99
		int number = r.nextInt(100) + 1; // 1 - 100

		System.out.println(number);

		// 逻辑
		// 提示用户输入一个数字，直到猜中为止
		// 1.提示用户输入一个数字
		// 2.判断用户输入的数字是否在1-100之间
		// 3.判断用户输入的数字是否等于随机数
		// 4.如果猜中，提示用户猜中了
		// 5.如果猜小了，提示用户猜大一点
		// 6.如果猜大了，提示用户猜小一点
	}
}