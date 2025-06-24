import java.util.Scanner; // 导入类
public class If01 {
    public static void main(String[] args) {
        // 定义一个 Scanner 对象
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("请输入你女婿的酒量：");
        // 把酒量保存到一个变量 int wine 中
        int wine = MyScanner.nextInt();
        // 使用 if 判断,输出对于信息
        if (wine > 2) {
            System.out.println("小伙子，不错呦！");
        }
    }
}