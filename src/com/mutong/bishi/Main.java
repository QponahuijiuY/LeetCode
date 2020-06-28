package com.mutong.bishi;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-02-27 19:20
 * @time_complexity: O()
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(2 & 3);
        System.out.println(true && true);
        //integer的范围是-128~127之   间，如果是这个范围内的数，直接从缓存里面获取，不会去创建对象
        Integer a = 1;
        Integer b = 1;
        //Long也有一个缓存 范围也是-128~127
        Long g = 2L;
        Integer c = 2;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Integer m = new Integer(321);
        Integer n = new Integer(321);
        String aa = "123";
        String bb = "123";
        String cc = new String("123");
        System.out.println(aa == bb);
        System.out.println(aa.equals(bb));
        System.out.println(aa == cc);
        System.out.println(aa.equals(cc));
        System.out.println("--------------------");
        //当包装类之间进行比较的时候，
        //会先拆箱变成基本数据类型，
        //所以这里相当于
        // int a = 1； int b = 1
        // 他们的 == 和 equals都为true
        System.out.println(a == b); //true
        System.out.println(a.equals(b)); //true
        System.out.println("--------------------");


        //e 和 f已经超过了integer的范围，所以他们会new一个对象，所以他们的内存地址是不同的
        // equals 因为包装类重写了 equals方法，比较的就是他们的值。所以为false
        System.out.println(e == f); //false
        System.out.println(e.equals(f)); //true ,
        System.out.println(m == n);
        System.out.println(m.equals(n));
        System.out.println("--------------------");

        System.out.println(c == (a + b));
        System.out.println(c.equals(a+b));
        System.out.println("--------------------");
        //a+b = 2 这个2是int类型 拆箱了。 g的值也是 2 ，虽然他们的类型不同，但是==只比较的是数值 所以为true
        System.out.println(g == (a+b));
        System.out.println(g.equals(a+b));

        System.out.println("--------------------");
        int n1 = 2019;
        final int n2 = 2019;
        String s1 = "20190702";
        String s2 = n1 + "0702";
        String s3 = n2 + "0702";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
