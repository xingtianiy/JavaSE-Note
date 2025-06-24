public class Seatwork05 {
	public static void main(String[] args) {
		// 功能：实现数组的反转
		// 提示：定义一个数组，存储1,2,3,4,5，然后将其反转为5,2,3,4,1

		// 初始化数组
		int[] arr = {1, 2, 3, 4, 5};

		// 使用双指针法反转数组
		// i从数组的起始位置开始，j从数组的末尾位置开始
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			// 交换arr[i]和arr[j]的值
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		// 打印反转后的数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}