package com.mutong.DesignPatterns.proxy.demo01;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-23 14:10
 * @time_complexity: O()
 */

/**
 * 代理
 */
public class Proxy implements Rent {
    Host host = new Host();
    public Proxy(){

    }
    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        seeHouse();
        contract();
    }
    //中介特有的功能
    //签合同
    public void contract(){
        System.out.println("中介签合同");
    }
    //看房子
    public void seeHouse(){
        System.out.println("中介带你看房子");
    }
}
