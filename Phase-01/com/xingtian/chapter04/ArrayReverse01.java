public class ArrayReverse01 {
    public static void main(String[] args) {
        // 要求：将数组的元素内容反转。

        // 定义数组
        int[] arr = {11, 22, 33, 44, 55, 66};
        // 思路：
        // 规律：
        // 1. 将 arr[0] 和 arr[5] 进行交换 {66, 22, 33, 44, 55, 11}
        // 2. 将 arr[1] 和 arr[4] 进行交换 {66, 55, 33, 44, 22, 11}
        // 3. 将 arr[2] 和 arr[3] 进行交换 {66, 55, 44, 33, 22, 11}
        // 4. 一共需要交换 3 次 = arr.length / 2
        // 5. 每次交换时对应的下标是 arr[i] 和 arr[arr.length - 1 - i]

        // 优化
        int temp = 0;
        int len = arr.length; // 计算数组的长度
        for (int i = 0; i < len / 2; i++) {
            temp = arr[len - 1 - i]; // 保存
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println("====反转后的数组");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t"); // 66 55 44 33 22 11
        }
    }
}