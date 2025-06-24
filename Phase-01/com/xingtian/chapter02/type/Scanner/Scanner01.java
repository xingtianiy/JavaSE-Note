import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // 提示用户输入信息
        // 创建 Scanner 对象
        // Scanner 类用于从控制台获取输入
        // 1.导入 Scanner 类
        // 2.创建 Scanner 对象 new Scanner(System.in)
        // 使用 Scanner 类
        // 3.获取用户输入 使用相应的方法
        // 注意：在执行 next 方法时，会等待用户输入~~~
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = myScanner.next(); // 获取用户输入的字符串
        System.out.println("请输入年龄");
        int age = myScanner.nextInt(); // 获取用户输入的 int
        System.out.println("请输入薪水");
        double sal = myScanner.nextDouble(); // 获取用户输入的 double
        System.out.println("用户信息如下:");
        System.out.println("name=" + name + " age=" + age + " sal=" + sal);
    }
