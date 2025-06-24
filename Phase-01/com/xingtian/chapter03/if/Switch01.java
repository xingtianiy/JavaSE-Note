import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		// 点餐系统：根据输入的菜品名称，输出相应的菜品描述

		// 1.提示用户输入菜品名称
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入菜品名称");
		String noodles = sc.next();

		// 2.使用 switch 语句进行匹配
		switch (noodles) {
			case "兰州拉面":
				System.out.println("兰州拉面");
				break;
			case "重庆小面":
				System.out.println("重庆小面");
				break;
			case "四川担担面":
				System.out.println("四川担担面");
				break;
			case "北京炸酱面":
				System.out.println("北京炸酱面");
				break;
			default:
				System.out.println("没有找到对应的菜品");
				break;
		}
	}
}