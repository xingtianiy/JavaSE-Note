public class TernaryOperator01 {
	public static void main(String[] args) {
		// 实现三元运算符的嵌套使用
		int n1 = 55;
		int n2 = 33;
		int n3 = 123;

		// 逐步比较
		// 1.先比较 n1 和 n2 的大小，将较大的值赋给 max1
		// 2.然后比较 max1 和 n3 的大小，将较大的值赋给 max2
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = max1 > n3 ? max1 : n3;
		System.out.println("最大值=" + max2);

		// 使用一行代码实现
		// int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
		// System.out.println(max);
	}
}