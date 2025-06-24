public class LogicOperator01 {
	public static void main(String[] args) {
		// & 逻辑与
		// 只有两边都为真，结果才为真
		System.out.println(true & true); // true
		System.out.println(false & false); // false
		System.out.println(true & false); // false
		System.out.println(false & true); // false

		// | 逻辑或
		// 只要有一边为真，结果就为真
		System.out.println(true | true); // true
		System.out.println(false | false); // false
		System.out.println(true | false); // true
		System.out.println(false | true); // true

		// ^ 逻辑异或
		// 不同为 true，相同为 false
		System.out.println(true ^ true); // false
		System.out.println(false ^ false); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true

		// ! 逻辑非
		// 取反操作，将布尔值反转
		System.out.println(!true); // false
		System.out.println(!false); // true
	}
}