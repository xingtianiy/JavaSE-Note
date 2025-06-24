package com.xingtian.chapter02.interface_.interface05;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/22 14:15
 * @Description: 实现类
 */
public class InterAImpl implements InterA,InterB {
    @Override
    public void method() {
        System.out.println("实现类重写的抽象方法");
    }

    // 1.3. 实现了多个接口：多个接口中存在相同名字的默认方法，子类就必须重写。
    @Override
    public void show() {
        System.out.println("重写接口中的默认方法");
    }


}
