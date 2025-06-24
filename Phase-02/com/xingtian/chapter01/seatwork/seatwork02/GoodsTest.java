package com.xingtian.chapter01.seatwork.seatwork02;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/19 13:02
 * @Description: 测试
 */
public class GoodsTest {
    public static void main(String[] args) {

        // 1.创建一个数组
        Goods[] arr = new Goods[3];

        // 2.创建三个商品对象
        Goods g1 = new Goods("1", "华为p40", 5900.0, 100);
        Goods g2 = new Goods("2", "保温杯", 227.0, 50);
        Goods g3 = new Goods("3", "枸杞", 12.7, 70);

        // 3.把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        // 4.遍历
        for (int i = 0; i < arr.length; i++) {
            Goods googs = arr[i];
            System.out.println(googs.getId() + " " + googs.getName() + " " + googs.getPrice() + " " + googs.getCount());
        }
    }
}
