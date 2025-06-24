import java.util.Scanner;

public class Seatwork01 {
	public static void main(String[] args) {
		// 交通信号灯模拟：根据信号灯的状态判断车辆的行驶情况
		// 绿灯：行驶
		// 黄灯：减速
		// 红灯：停车

		// 1.定义信号灯的状态
		// true表示亮，false表示灭
		boolean isLightGreen = false;
		boolean isLightYellow = false;
		boolean isLightRed = true;
		// 判断
		// 绿灯：行驶
		// 黄灯：减速
		// 红灯：停车

		if (isLightGreen) {
			System.out.println("gogogo!");
		}

		if (isLightYellow) {
			System.out.println("slow!");
		}

		if (isLightRed) {
			System.out.println("stop!");
		}
	}
}