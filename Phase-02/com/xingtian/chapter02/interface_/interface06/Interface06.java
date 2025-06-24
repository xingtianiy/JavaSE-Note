package com.xingtian.chapter02.interface_.interface06;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/22 14:14
 * @Description: 测试
 */
public class Interface06 {
    public static void main(String[] args) {
        /*
            JDK8 新增特性
            1. default作用：解决接口升级兼容性问题，避免子类强制修改。
              1.1. public 可省略，default 不可省略。
              1.2. 不是抽象方法，可不重写；如果要重写就需要去掉 default。
              1.3. 实现了多个接口：多个接口中存在相同名字的默认方法，子类就必须重写。
            2. 静态方法：直接通过接口名调用，不能被实现类继承或重写。
         */

        // 调用接口中的静态方法
        Inter.show();

        // 调研实现类中的静态方法
        InterImpl.show();

        //子类把从父类继承下来的虚方法表里面的方法进行覆盖了，这才叫重写。
    }
}
