public class ArithmeticOperator02 {
	public static void main(String[] args) {
		// 算术运算
		// 1.整数除法，只会得到整数结果
		// 2.浮点数除法，结果会更精确
		//   整数除法要得到精确结果，需要将其中一个数转为浮点数
		// 示例
		System.out.println(10 / 2); // 5
		System.out.println(10 / 3); // 3
		System.out.println(10.0 / 3); // 3.3333333333333335

		// 取模运算，取余数 实际上也可以用来判断是否能被整除
		System.out.println(10 % 2); // 0
		System.out.println(10 % 3); // 1

		// 应用
		// 1.利用取模运算判断 A 是否能被 B 整除
		// A % B 例如 10 % 3
		// 2.利用取模运算判断 A 是否为偶数
		// A % 2 如果结果为 0 则证明 A 是一个偶数
		// 如果结果为 1 则证明 A 是一个奇数
	}
}