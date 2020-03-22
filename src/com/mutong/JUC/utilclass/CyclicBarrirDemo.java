package com.mutong.JUC.utilclass;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-22 10:25
 * @time_complexity: O()
 */
public class CyclicBarrirDemo {
    /**
     * 集齐7颗龙珠召唤神龙
     */
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{
            System.out.println("召唤神龙成功");
        });
        for (int i = 0; i < 7; i++) {
            int temp = i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+ "获取第"+ temp + "龙珠");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }




}
