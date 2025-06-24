public class ArrayAdd {
    public static void main(String[] args) {
        // 实现动态的给数组添加元素效果，实现对数组扩容。

        // 思路分析
        // 1.定义初始数组 int[] arr = {1,2,3};
        // 2.定义一个新的数组 int[] arrNew = new int[arr.length + 1];
        // 3.遍历 arr 数组 依次将 arr 的元素拷贝到 arrNew 数组
        // 4.将 4 赋给 arrMew[arrNew.length - 1] = 4; 把 4 赋给 arrNew 最后一个元素
        // 5.让 arr 指向 arrNew; arr = arrNew; 那么 arr 数组就会被销毁
        int[] arr = {1,2,3};
        int[] arrNew = new int[arr.length + 1];
        // 遍历 arr 数组 依次将 arr 的元素拷贝到 arrNew 数组
        for (int i = 0;i < arr.length;i++) {
            arrNew[i] = arr[i];
        }
        // 把 4 赋给 arrNew 最后一个元素
        arrNew[arrNew.length - 1] = 4;
        //让 arr 指向 arrNew;
        arr = arrNew;
        System.out.println("====arr扩容后元素情况=====");
        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}