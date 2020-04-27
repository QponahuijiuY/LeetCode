package com.mutong.bishi.test;

import java.util.ArrayList;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-02 16:45
 * @time_complexity: O()
 */
//-Xms1m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError 生成dump文件
// -XX:+PrintGCDetails 打印GC详情

public class test1 {
    byte[] arr = new byte[1*1024*1024];
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        int count = 0;
        try {
            while (true){
                arrayList.add(new test1());
                count = count + 1;
            }
        } catch (Exception e) {
            System.out.println(count);
            e.printStackTrace();
        }

    }

}
