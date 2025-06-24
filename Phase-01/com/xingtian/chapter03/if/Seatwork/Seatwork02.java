import java.util.Scanner;

public class Seatwork02 {
	public static void main(String[] args) {
		// 实现一个程序，需要根据不同的条件执行不同的操作，可以使用if的分支结构。
		// 功能：
		// 假设用户购买商品的金额为600元。
		// 提示用户输入一个金额表示用户实际支付的金额。
		// 根据输入的金额判断是否大于等于600，如果是则显示支付成功，否则显示支付失败。

		// 1.提示用户输入一个金额表示用户实际支付的金额。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个金额表示实际支付的金额");
		int money = sc.nextInt();
		// 2.判断
		if (money >= 600) {
			System.out.println("支付成功");
		} else {
			System.out.println("支付失败");
		}
	}
}