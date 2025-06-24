public class Seatwork04 {
	public static void main(String[] args) {
		// 题目
		// 实现一个任务，需要获取一个范围中的每一个数时，需要用到循环结构
		// 当范围较大时，手动获取会很麻烦，因此需要循环来自动获取
		// 当需要获取范围中的偶数时，循环结构中需要加入判断条件
		// 示例：计算 1 - 100 之间的所有偶数和


		// 实现
		// 1.获取1~100之间的每一个数
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// 2.判断是否为偶数，如果是偶数，则累加
			if (i % 2 == 0) {
				sum += i;
			}
		}
		// 打印 sum
		System.out.println(sum);
	}
}