package com.xingtian.chapter01.seatwork.seatwork01;

import java.util.Random;

/**
 * @Author 星恬
 * @Version 1.0
 * @Date 2025/06/19 11:44
 * @Description: 人物信息
 */
public class Role {
    private String name;
    private int blood;


    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    // 用于攻击
    public void attack(Role role) {
        Random r = new Random();

        int hurt = r.nextInt(20) + 1;

        int remainBoold = role.getBlood() - hurt;
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        role.setBlood(remainBoold);
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，造成了" + role.getBlood() + "点伤害，摩智还剩下了" + this.getBlood() + "点血");
    }

    public void showRoleInfo() {
        System.out.println("姓名为:" + this.getName());
        System.out.println("血量为:" + this.getBlood());
    }
}
