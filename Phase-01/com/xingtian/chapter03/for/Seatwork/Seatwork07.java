public class Seatwork07 {
	public static void main(String[] args) {
		// 功能描述
		// 输入一个整数
		// 判断该整数是否是回文数，如果是打印 `true`，否则打印 `false`
		// 注意：回文数是指正着读和倒着读都一样的数，例如 121 是回文数，而 123 不是

		// 1.定义一个整数
		int x = 12345;
		// 定义一个临时变量用于存储原始值
		int temp = x;
		int num = 0;
		// 2.使用循环开始反转
		while (x != 0) {
			// 每次取最低位数字
			int ge = x % 10;
			// 更新 x 的值，去掉最低位
			x = x / 10;
			// 构造反转后的数字
			num = num * 10 + ge;
		}
		// 3.打印反转后的数字（可选）
		System.out.println(num);
		// 4.判断
		System.out.println(num == temp);
	}
}