public class Seatwork02 {
	public static void main(String[] args) {
		// 统计功能
		// 创建一个数组，存储1,2,3,4,5,6,7,8,9,10
		// 遍历数组中的每一个元素，统计能够被3整除的元素个数

		// 实现
		// 1.创建一个数组存储1,2,3,4,5,6,7,8,9,10
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// 定义一个变量用于统计符合条件的元素个数
		int count = 0;
		// 2.遍历数组中的每一个元素
		for (int i = 0; i < arr.length; i++) {
			// i表示数组中的每一个索引
			// arr[i]表示数组中的每一个元素
			// 3.判断当前元素是否为3的倍数，如果是，则统计变量加一
			if (arr[i] % 3 == 0) {
				// System.out.println(arr[i]);
				count++;
			}
		}
		// 循环结束后，打印统计结果
		System.out.println("数组中能被3整除的元素共有" + count + "个");
	}
}