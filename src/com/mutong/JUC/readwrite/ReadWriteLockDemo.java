package com.mutong.JUC.readwrite;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-22 11:09
 * @time_complexity: O()
 */
public class ReadWriteLockDemo {
    public static void main(String[] args) {
//        MyCache cache = new MyCache();
        MyCacheLock cache = new MyCacheLock();

        for (int i = 1; i <= 3; i++) {
            int temp = i;
            new Thread(()->{
                cache.put(temp+"",temp+"");
            }).start();
        }
        for (int i = 1; i <= 3; i++) {
            int temp = i;
            new Thread(()->{
                cache.get(temp+"");
            }).start();
        }
    }
}

/**
 * 加入了读写锁
 */
class MyCacheLock{
    private Map<String,String> map = new HashMap<>();
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    //写入,只能由一个线程来写入
    public void put(String key,String value){
        readWriteLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+ "正在写入"+key);
            map.put(key,value);
            System.out.println(Thread.currentThread().getName()+ "写入"+key+"完成");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
    //读取,可以同时读
    public void get(String key){
        readWriteLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+ "正在读取"+key);
            map.get(key);
            System.out.println(Thread.currentThread().getName()+ "读取完成");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readWriteLock.readLock().unlock();
        }
    }
}
/**
 * 普通读写操作,没有加读写锁,会出现两个人同时写的操作
 */
class MyCache{
    private Map<String,String> map = new HashMap<>();
    public void put(String key,String value){
        System.out.println(Thread.currentThread().getName()+ "正在写入"+key);
        map.put(key,value);
        System.out.println(Thread.currentThread().getName()+ "写入"+key+"完成");
    }
    public void get(String key){
        System.out.println(Thread.currentThread().getName()+ "正在读取"+key);
        map.get(key);
        System.out.println(Thread.currentThread().getName()+ "读取完成");
    }
}
