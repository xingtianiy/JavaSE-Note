public class Seatwork08 {
	public static void main(String[] args) {
		// 模拟除法运算
		// 当被除数和除数都很大时，直接使用 int 的范围可能会超出范围
		// 因此需要使用取模运算 % 来模拟除法的过程

		// 实现
		// 被除数 / 除数 = 商，余数 = 被除数 % 除数
		// int a = 100;
		// int b = 10;
		// 100 - 10 = 90
		// 90 - 10 = 80
		// 80 - 10 = 70
		// 70 - 10 = 60
		// 10 - 10 = 0 (结束)

		// 1.定义被除数
		int dividend = 100;
		// 2.定义除数
		int divisor = 10;
		// 定义一个变量用于统计次数
		int count = 0;
		// 3.循环 while
		// 循环条件：只要被除数大于等于除数，就继续循环
		// 每次循环，被除数减去除数
		while (dividend >= divisor) {
			dividend = dividend - divisor;
			// 每次减一次，统计次数加一
			count++;
		}
		// 循环结束后，dividend 记录的是余数
		System.out.println("余数为：" + dividend);
		// 循环结束后，count 记录的是商
		System.out.println("商为：" + count);
	}
}