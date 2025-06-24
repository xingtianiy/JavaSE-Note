public class Seatwork04 {
	public static void main(String[] args) {
		// 找出最大值
		// 已知数组元素为{33,5,22,44,55}
		// 遍历数组找出最大值并打印到控制台

		// 1.定义一个数组存储5个值
		int[] arr = {33, 5, 22, 44, 55};
		// 2.定义一个变量max用于存储最大值
		// 初始化为数组的第一个元素
		int max = arr[0];
		// 3.循环遍历数组中的每一个元素
		// 如果某个元素大于max，则更新max
		for (int i = 0; i < arr.length; i++) {
			// i表示索引，arr[i]表示元素
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		// 4.循环结束后，max记录的是数组中的最大值
		System.out.println(max);

		// 找出最小值

		// 1.定义一个数组存储5个值
		// int[] arr = {33, 5, 22, 44, 55};
		// 2.定义一个变量min用于存储最小值
		// 初始化为数组的第一个元素
		int min = arr[0];
		// 3.循环遍历数组中的每一个元素
		// 如果某个元素小于min，则更新min
		for (int i = 0; i < arr.length; i++) {
			// i表示索引，arr[i]表示元素
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		// 4.循环结束后，min记录的是数组中的最小值
		System.out.println(min);
	}
}