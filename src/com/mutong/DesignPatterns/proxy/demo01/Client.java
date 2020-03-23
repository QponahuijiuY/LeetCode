package com.mutong.DesignPatterns.proxy.demo01;

/**
 * @description: 代理模式
 * @Author: Mutong
 * @Date: 2020-03-23 14:12
 * @time_complexity: O()
 */

/**
 * 客户
 */
public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //中介帮房东租房子
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
