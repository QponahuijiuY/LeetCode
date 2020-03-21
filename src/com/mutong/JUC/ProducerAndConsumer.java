package com.mutong.JUC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: 用synchronized实现生产者消费者问题,主要用到的是Object的wait和notify方法
 * @Author: Mutong
 * @Date: 2020-03-21 19:58
 * @time_complexity: O()
 */
public class ProducerAndConsumer {
    public static void main(String[] args) {
        Data3 data = new Data3();
        new Thread(()->{for (int i = 0;i < 10; i++) {data.printA();}}).start();
        new Thread(()->{for (int i = 0;i < 10; i++) {data.printB();}}).start();
        new Thread(()->{for (int i = 0;i < 10; i++) {data.printC();}}).start();
//        Data2 data = new Data2();
//        new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                data.increament();
//            }
//        },"A").start();
//        new Thread(()->{for (int i = 0; i < 10; i++) {
//            data.decreament();
//        }},"B").start();
//        new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                data.increament();
//            }
//        },"C").start();
//        new Thread(()->{
//            data.decreament();
//        },"D").start();
//        Data data = new Data();
//        new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                try {
//                    data.increament();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        },"A").start();
//        new Thread(()->{for (int i = 0; i < 10; i++) {
//            try {
//                data.decreament();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }},"B").start();
//        new Thread(()->{
//            for (int i = 0; i < 10; i++) {
//                try {
//                    data.increament();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        },"C").start();
//        new Thread(()->{for (int i = 0; i < 10; i++) {
//            try {
//                data.decreament();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }},"D").start();

    }
}

/**
 * 用synchronized实现生产者消费者问题,主要用到的是Object的wait和notify方法
 * wait()用于当前线程不满足条件就会处于等待状态
 * notify()用于唤醒其他的线程
 */
class Data{
    //共享的变量
    private int number = 0;

    synchronized void increament() throws InterruptedException {
        //如果n不等于0,则等待,否则n++
        while (number != 0){
            //等待
            this.wait();
        }
        number++;
        //通知其他线程获取该变量
        System.out.println(Thread.currentThread().getName() +  "->" + number );
        this.notify();
    }
    synchronized void decreament() throws InterruptedException {
        //如果n等于0则等待,否则n--
        while (number == 0){
            //等待
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName() + "->" + number );
        this.notify();

    }
}

/**
 * 使用Lock实现,Lock里面使用的是Condition的await方法和signalAll
 */
class Data2{
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private int number = 0;
    public void increament(){
        lock.lock();
        try {//业务代码
            //如果n不等于0,则等待,否则n++
            while (number != 0){
                //等待
                condition.await();
            }
            number++;
            //通知其他线程获取该变量
            System.out.println(Thread.currentThread().getName() +  "->" + number );
            condition.signalAll();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void decreament(){
        lock.lock();
        try {//业务代码
            //如果n等于0则等待,否则n--
            while (number == 0){
                //等待
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + "->" + number );
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}

/**
 * 使用Lock实现,精准的控制线程的唤醒
 */
class Data3{
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();
    private int number = 1;

    public void printA(){
        lock.lock();
        try {//业务代码
            //如果n不等于0,则等待,否则n++
            while (number != 1){
                //等待
                condition1.await();
            }
            //通知其他线程获取该变量
            number=2;
            System.out.println(Thread.currentThread().getName() +  "AAAAAAA->"  );
            condition2.signal();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void printB(){
        lock.lock();
        try {//业务代码
            //如果n不等于0,则等待,否则n++
            while (number != 2) {
                //等待
                condition1.await();
            }
            //通知其他线程获取该变量
            number=3;
            System.out.println(Thread.currentThread().getName() +  "BBBBBBB->"  );
            condition3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void printC(){
        lock.lock();
        try {//业务代码
            //如果n不等于0,则等待,否则n++
            while (number != 3){
                //等待
                condition1.await();
            }
            //通知其他线程获取该变量
            number=1;
            System.out.println(Thread.currentThread().getName() +  "CCCCCCC->"  );
            condition1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

