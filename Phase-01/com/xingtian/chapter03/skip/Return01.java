public class Return01 {
	public static void main(String[] args) {
		for (int i = 1;i <= 5;i++) {
			if (i == 3) {
				System.out.println("星恬" + i);
				// break;
				// continue;
				return; 
				// return 用在方法时，表示跳出方法，
				// 如果使用在main，表示退出程序...
			}
			System.out.println("Hello World!");
		}
		System.out.println("go on!");

		/**
		break 输出:
		Hello World!
		Hello World!
		星恬 3
		go on!
		*/
		/**
		continue 输出:
		Hello World!
		Hello World!
		星恬 3
		Hello World!
		Hello World!
		go on!
		*/
		/**
		return 输出:
		Hello World!
		Hello World!
		星恬 3
		*/
	}
}