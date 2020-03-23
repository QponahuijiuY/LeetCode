package com.mutong.DesignPatterns.proxy.demo02;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-23 14:56
 * @time_complexity: O()
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Proxy是代理实例
 * ProxyInvocationHandler是代理实例的调用处理程序,他会动态的生成Proxy代理实例
 * ProxyInvocationHandler 要去实现 InvocationHandler接口
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object object;
    public void setObject(Object object) {
        this.object = object;
    }

    //得到代理实例
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(object, args);

        return invoke;
    }

}
