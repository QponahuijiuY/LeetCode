package com.mutong.DesignPatterns.proxy.demo01;

/**
 * @description: 房东 他要出租房子
 * @Author: Mutong
 * @Date: 2020-03-23 14:08
 * @time_complexity: O()
 */

/**
 * 真实角色
 */
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
