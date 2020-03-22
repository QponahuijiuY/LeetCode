package com.mutong.JUC.utilclass;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-22 10:44
 * @time_complexity: O()
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        /**
         * 抢车位
         */
        //只有三个停车位 限流
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i <10 ; i++) {
            new Thread(()->{
                try {
                    //得到
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "获取停车位");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(Thread.currentThread().getName() + "离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //释放车位
                    semaphore.release();
                }
            }).start();
        }
    }
}
