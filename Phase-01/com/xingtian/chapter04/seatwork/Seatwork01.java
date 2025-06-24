public class Seatwork01 {
	public static void main(String[] args) {
		// 功能：数组累加
		// 定义一个数组，存储1,2,3,4,5
		// 遍历数组中的每一个元素，计算总和


		// 实现步骤
		// 1.定义一个数组，初始化为1,2,3,4,5
		int[] arr = {1, 2, 3, 4, 5};
		// 初始化总和
		int sum = 0;
		// 2.遍历数组中的每一个元素，进行累加
		for (int i = 0; i < arr.length; i++) {
			// i表示数组中的每一个索引
			// arr[i]表示数组中的每一个元素
			sum += arr[i];
		}
		// 循环结束后，sum的值即为数组的总和
		System.out.println(sum);
	}
}