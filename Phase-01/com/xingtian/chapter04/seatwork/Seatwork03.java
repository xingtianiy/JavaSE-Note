public class Seatwork03 {
	public static void main(String[] args) {
		// 功能描述
		// 定义一个数组存储1,2,3,4,5,6,7,8,9,10
		// 遍历数组中的每一个元素，要求：
		// 1. 偶数除以2
		// 2. 奇数乘以2

		// 实现步骤
		// 1.定义一个数组，存储1,2,3,4,5,6,7,8,9,10
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// 2.遍历数组中的每一个元素
		for (int i = 0; i < arr.length; i++) {
			// i表示数组中的每一个索引
			// arr[i]表示数组中的每一个元素
			// 3.对每一个元素进行判断
			if (arr[i] % 2 == 0) {
				// 偶数除以2
				arr[i] = arr[i] / 2;
			} else {
				// 奇数乘以2
				arr[i] = arr[i] * 2;
			}
		}
		// 4.打印结果
		// 一个循环打印所有元素
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}