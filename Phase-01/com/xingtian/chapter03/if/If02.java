import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		// 提示用户输入一个金额，并根据输入显示相应的信息
		// 如果输入金额大于或等于100，提示“消费金额较大”
		// 如果输入金额小于100，提示“消费金额较小”

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入消费金额");
		int money = sc.nextInt();
		if (money >= 100) {
			System.out.println("消费金额较大");
		} else {
			System.out.println("消费金额较小");
		}
	}
}