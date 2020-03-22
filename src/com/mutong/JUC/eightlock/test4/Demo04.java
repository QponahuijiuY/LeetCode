package com.mutong.JUC.eightlock.test4;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-21 22:28
 * @time_complexity: O()
 */
public class Demo04 {
    public static void main(String[] args)  {
        Phone phone = new Phone();

        new Thread(()->{
            Phone.send();}).start();
        //sleep两秒
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{
            phone.call();}).start();
    }
}
class Phone{
    synchronized static void send(){
        //sleep两秒
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发短信");
    }
    synchronized void call(){
        System.out.println("打电话");
    }
}
