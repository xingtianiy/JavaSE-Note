public class ComparisonOperator01 {
	public static void main(String[] args) {
        int a = 9;
        int b = 8;

        System.out.println(a > b); // True
        System.out.println(a >= b); // True
        System.out.println(a <= b); // False
        System.out.println(a < b); // Fales
        System.out.println(a == b); // False
        System.out.println(a != b); // True
        
        boolean flag = a > b;
        System.out.println("flag=" + flag); // True
	}
}