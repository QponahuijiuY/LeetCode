package com.mutong.JUC.utilclass;

import java.util.concurrent.CountDownLatch;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-22 10:09
 * @time_complexity: O()
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "Go out");
                countDownLatch.countDown();//-1
            }).start();
        }
        //等待计数器归零,才会向下继续执行
        countDownLatch.await();
        System.out.println("关门了");
    }
}
