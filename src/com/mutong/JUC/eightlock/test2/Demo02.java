package com.mutong.JUC.eightlock.test2;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 *
 * @Author: Mutong
 * @Date: 2020-03-21 21:40
 * @time_complexity: O()
 */
public class Demo02  {
    public static void main(String[] args)  {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();

        new Thread(()->{phone1.send();}).start();
        //sleep两秒
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{phone2.call();}).start();
    }
}
class Phone{
    synchronized void send(){
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

