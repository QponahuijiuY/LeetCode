package com.mutong.JUC.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-22 9:42
 * @time_complexity: O()
 */
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread thread = new MyThread();
        FutureTask futureTask = new FutureTask(thread);
        new Thread(futureTask).start();
        new Thread(futureTask).start();//有缓存 ,提升效率
        String o = (String) futureTask.get();//get方法可能阻塞要去拿返回值

        System.out.println(o);
    }
}
class MyThread implements Callable {

    @Override
    public String call() throws Exception {
        System.out.println("hello");
        return "Hello";
    }
}
