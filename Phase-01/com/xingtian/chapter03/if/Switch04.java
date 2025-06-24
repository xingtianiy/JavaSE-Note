/*
	switch新特性
		JDK12
*/
public class Switch04 {
    public static void main(String[] args) {
        // 示例
        // 1 2 3
/*		int number = 1;
		switch (number){
		case 1:
			System.out.println("一");
			break;
		case 2:
			System.out.println("二");
			break;
		case 3:
			System.out.println("三");
			break;
		default:
			System.out.println("没有匹配的选项");
			break;
		}*/

        int number = 1;
        switch (number) {
            case 1 -> System.out.println("一"); // 一行写法，更简洁
            case 2 -> System.out.println("二");
            case 3 -> {
                System.out.println("三");
            }
            default -> {
                System.out.println("没有匹配的选项");
            }
        }
    }
}