package com.yoyi.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @Author: gengchen.jing@yoyi.com.cn
 * @Date: 2020-05-15 12:47
 */
public class ListTests {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        String s = "";
        list.add(new User("0","jing"));
        list.add(new User("1","geng"));
        list.add(new User("2","chen"));
        for (int i = 0; i < list.size(); i++) {
            s += list.get(i).getId()+",";
        }
        System.out.println(s.substring(0,s.length()-1));
    }
}

class User{
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}