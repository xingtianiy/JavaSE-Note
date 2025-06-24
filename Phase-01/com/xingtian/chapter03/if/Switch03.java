/*
 * case 穿透
 *
 * 1. 如果没有写 `break`，程序会继续执行后续的 case 分支。
 *    这种现象称为“穿透”（fall-through）。
 * 2. 如果没有写 `break`，程序会依次执行所有后续的 case 分支，直到遇到 `break` 或 switch 语句结束。
 * 3. 如果没有写 `break`，程序会依次执行所有后续的 case 分支，直到遇到 `break` 或 switch 语句结束。
 *
 * 使用场景：
 *      如果某些 case 分支的逻辑是相同的，可以利用穿透特性来简化代码。
 */
public class Switch03 {
	public static void main(String[] args) { // 修正了括号的错误
		int number = 1;
		switch (number) {
			case 1:
				System.out.println("number 的值为 1");
				// break; // 如果没有 break，程序会继续执行后续的 case 分支
			case 10:
				System.out.println("number 的值为 10");
				// break; // 如果没有 break，程序会继续执行后续的 case 分支
			case 20:
				System.out.println("number 的值为 20");
				// break; // 如果没有 break，程序会继续执行后续的 case 分支
			default:
				System.out.println("number 的值不是 1, 10 或 20");
				// break; // 如果没有 break，程序会继续执行后续的 case 分支
		}
	}
}