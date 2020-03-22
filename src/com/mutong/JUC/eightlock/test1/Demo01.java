package com.mutong.JUC.eightlock.test1;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * 第一问: new一个对象,两个线程先打印 发短信/打电话
 * @Author: Mutong
 * @Date: 2020-03-21 21:22
 * @time_complexity: O()
 */
public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();

        new Thread(()->{phone.send();}).start();
        //sleep两秒
        TimeUnit.SECONDS.sleep(2);

        new Thread(()->{phone.call();}).start();
    }
}
class Phone{
    public synchronized void send(){
        //sleep两秒
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");
    }
    public synchronized void call(){
        System.out.println("打电话");
    }
}

