package com.expirement;

/**
 * @description:
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-06-24 18:07
 */
public class ParentClass {public void f() {
    System.out.println("I am ParentClass's f().");
}
}

class ChildClass extends ParentClass {
    public void f() {
        System.out.println("I am ChildClass's f().");
    }
}

class Dispatch {
    public void polymorphismFunction(ParentClass p) {
        p.f();
    }

    public void overloadFunction(ParentClass p) {
        System.out.println("I am overloadFunction(ParentClass p).");
    }

    public void overloadFunction(ChildClass c) {
        System.out.println("I am overloadFunction(ChildClass c).");
    }
}