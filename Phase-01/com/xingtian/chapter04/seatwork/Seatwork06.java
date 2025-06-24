import java.util.Random;
public class Seatwork06 {
	public static void main(String[] args) {
		// 随机打乱
		// 提示：给定一个数组，存储1~5，需要使用随机数将数组中的元素打乱顺序

		// 1.定义数组存储1~5
		int[] arr = {1, 2, 3, 4, 5};
		// 2.循环遍历数组，从0开始到数组长度结束
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			// 生成一个随机索引
			int randomIndex = r.nextInt(arr.length);
			// 交换当前索引i指向的元素与随机索引randomIndex指向的元素
			int temp = arr[i];
			arr[i] = arr[randomIndex];
			arr[randomIndex] = temp;
		}

		// 循环结束后，数组中的元素已经被随机打乱顺序
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}