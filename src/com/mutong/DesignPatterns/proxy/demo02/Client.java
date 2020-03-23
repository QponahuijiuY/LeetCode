package com.mutong.DesignPatterns.proxy.demo02;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-23 15:13
 * @time_complexity: O()
 */
public class Client {
    public static void main(String[] args) {
        
        //真实角色
        Rent rent = new Host();
        //代理类不存在,用代理类的处理调用程序来帮忙
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        //设置要代理的接口
        handler.setObject(rent);
        //创建代理类
        Rent proxy = (Rent) handler.getProxy();
        proxy.rent();

    }
}
