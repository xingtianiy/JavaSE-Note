import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		// 根据不同的分数范围，给出不同的评价。
		// 如果分数在95~100之间，打印“恭喜你获得一等奖”
		// 如果分数在90~94之间，打印“恭喜你获得二等奖”
		// 如果分数在80~89之间，打印“恭喜你获得三等奖”
		// 如果分数低于80，打印“你没有获奖”

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的分数");
		int score = sc.nextInt();
		if (score >= 0 && score <= 100) {
			if (score >= 95 && score <= 100) {
				System.out.println("恭喜你获得一等奖");
			} else if (score >= 90 && score <= 94) {
				System.out.println("恭喜你获得二等奖");
			} else if (score >= 80 && score <= 89) {
				System.out.println("恭喜你获得三等奖");
			} else {
				System.out.println("你没有获奖");
			}
		} else {
			System.out.println("分数不合法");
		}
	}
}