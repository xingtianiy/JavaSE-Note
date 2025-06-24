/*
 * default 的位置问题
 *
 * 1. default：default 是一个可选的分支，通常用于处理不匹配任何 case 的情况。
 *           如果写了 default 分支，它必须放在所有 case 分支的最后。
 * 2. default 的作用：default 分支的作用类似于“其他情况”，当没有匹配的 case 时执行。
 */
public class Switch02 {
	public static void main(String[] args) { // 修正了括号的错误
		int number = 1;
		switch (number) {
			case 1:
				System.out.println("number 的值为 1");
				break;
			case 10:
				System.out.println("number 的值为 10");
				break;
			case 20:
				System.out.println("number 的值为 20");
				break;
			default: // default 必须放在最后
				System.out.println("number 的值不是 1, 10 或 20");
				break;
		}
	}
}