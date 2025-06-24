public class LogicOperator02 {
	public static void main(String[] args) {
		// && 逻辑与
		// 只有两边都为真，结果才为真
		System.out.println(true && true); // true
		System.out.println(false && false); // false
		System.out.println(true && false); // false
		System.out.println(false && true); // false

		// || 逻辑或
		// 只要有一边为真，结果就为真
		System.out.println(true || true); // true
		System.out.println(false || false); // false
		System.out.println(true || false); // true
		System.out.println(false || true); // true

		// 短路逻辑的演示
		// 说明：短路逻辑是指在逻辑表达式中，一旦能够确定整个表达式的结果，就不再继续计算后续部分
		int a = 10;
		int b = 10;
		boolean result = ++a < 5 && ++b < 5;
		System.out.println(result); // false
		System.out.println(a); // 11
		System.out.println(b); // 10
	}
}