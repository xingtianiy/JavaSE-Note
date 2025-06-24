public class Seatwork06 {
	public static void main(String[] args) {
		// 打印对折纸的次数
		// 假设珠穆朗玛峰的高度为8844.43米 = 8844430毫米
		// 假设一张纸的厚度为0.1毫米
		// 问题：对折多少次后，纸的厚度能够超过珠穆朗玛峰的高度？

		// 实现对折纸的过程，每一次对折纸的厚度都会翻倍
		// double a = 0.1;
		// a = a * 2;
		// a *= 2;
		// 1.定义一个变量记录珠穆朗玛峰的高度
		double height = 8844430;
		// 2.定义一个变量记录纸的初始厚度
		double paper = 0.1;
		// 3.定义一个变量记录对折的次数
		int count = 0;
		// 4.循环对折纸，只要纸的厚度小于珠穆朗玛峰的高度，就继续循环
		// 每对折一次，厚度翻倍，次数加一
		while (paper < height) {
			// 对折纸
			paper *= 2;
			// 对折一次，次数加一
			count++;
		}
		System.out.println(count);
	}
}