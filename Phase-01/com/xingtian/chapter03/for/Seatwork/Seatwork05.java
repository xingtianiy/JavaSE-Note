import java.util.Scanner;
public class Seatwork05 {
	public static void main(String[] args) {
		// 功能7：统计范围内能同时被3和5整除的数
		// 提示用户输入范围的起始值和结束值
		// 统计范围内满足条件的数
		// 注意：能被3整除且能被5整除的数，同时也能被15整除

		// 实现步骤
		// 1.提示用户输入范围的起始值和结束值
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始统计的范围");
		int start = sc.nextInt();
		System.out.println("请输入结束统计的范围");
		int end = sc.nextInt();
		// 统计数量
		int count = 0;
		// 2.使用循环遍历范围内的每一个整数
		// 开始循环次数为start
		// 结束循环次数为end
		for (int i = start; i <= end; i++) {
			// 3.对每一个整数进行判断，统计满足条件的数，需要同时满足能被3整除且能被5整除
			if (i % 3 == 0 && i % 5 == 0) {
				count++;
			}
		}

		System.out.println(count);
	}
}