public class AssignOperator01 {
	public static void main(String[] args) {
		int n1 = 10;
		n1 += 4; // n1 = n1 + 4;
		System.out.println(n1); // 14
		n1 /= 3; // n1 = n1 / 3; // 4
		System.out.println(n1); // 4

		// 4. 测试值的类型自动转换
		byte b = 3;
		b += 2; // 隐式转换 b = (byte)(b + 2);
		b++; // 隐式转换 b = (byte)(b + 1);
		System.out.println(b); // 输出结果
	}
}