package com.xingtian.chapter02.extend_.extends02;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/20 10:28
 * @Description:
 */
class Zi extends Fu {
    String name = "Zi";

    public void ziShow() {
        String name = "ziShow";
        System.out.println(name); // ziShow
        System.out.println(this.name); // Zi
        System.out.println(super.name); // Fu
    }
}
