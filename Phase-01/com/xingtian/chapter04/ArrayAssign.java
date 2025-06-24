public class ArrayAssign {
    public static void main(String[] args) {
        // 基本数据类型赋值，赋值方式为值拷贝
        // n2 的变化不会影响 n1 的值
        int n1 = 10;
        int n2 = n1;
        n2 = 80;
        System.out.println("n1=" + n1); // 10
        System.out.println("n2=" + n2); // 80

        // 数组在默认情况下是引用类型，赋值的是地址
        // 赋值方式为引用赋值，arr2 的变化会影响 arr1 的值
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1; // 将 arr1 赋给 arr2
        arr2[0] = 10;

        // 查看 arr1 的值
        System.out.println("====arr1 的元素====");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]); // 10, 2, 3
        }

        System.out.println("====arr2 的元素====");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]); // 10, 2, 3
        }
    }
}