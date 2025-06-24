public class Seatwork01 {
	public static void main(String[] args) {
		// 功能7：在1到100之间，遇到7的倍数、个位数为7、十位数为7时，打印“过”，其他数字正常打印
		// 规则：
		// 1. 个位数为7
		// 2. 十位数为7
		// 3. 7的倍数

		// 实现步骤
		// 1. 遍历1到100之间的每一个数字
		// 2. 判断每一个数字是否符合规则，如果符合则打印“过”，否则打印数字本身
		for (int i = 1; i <= 100; i++) {
			// 判断是否符合规则
			if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
				System.out.println("过");
				continue;
			}
			System.out.println(i);
		}
	}
}