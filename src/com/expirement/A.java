package com.expirement;

/**
 * @description:
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-06-24 17:51
 */
public class A {

    private A(){
    }
    private static volatile A a;
    public static A getInstance(){
        if (a == null){
            synchronized (A.class){
                if (a == null){
                    a = new A();
                }
            }
        }
        return a;
    }
}
