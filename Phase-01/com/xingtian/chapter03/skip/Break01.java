public class Break01 {
	public static void main(String[] args) {
		lable1:
			for (int j = 0;j < 4;j++ ) { // 外层for
		lable2:
			for (int i = 0;i < 10;i++ ) { // 内层for
				if (i == 2) {
						break lable1; // 等价 break1 break2
				}
				System.out.println("i=" + i);
			}
		}
	}
}