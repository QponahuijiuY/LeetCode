package com.mutong.JUC.threadlocal;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-05-04 15:03
 * @time_complexity: O()
 */
public class ThreadLocalTest {
    public static void main(String[] args) {

        ThreadLocal tl = new ThreadLocal();
        tl.set(1);
        System.out.println(tl.get());
        tl.remove();


    }
}
