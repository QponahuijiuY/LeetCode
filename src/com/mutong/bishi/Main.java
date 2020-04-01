package com.mutong.bishi;

import java.util.Scanner;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-02-27 19:20
 * @time_complexity: O()
 */
public class Main {
    public static void main(String[] args) {

        //预先不知道输入数据的组数-读到文件末尾-一直处理循环
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextInt()){
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println(a + b);
//        }

        //预先知道数据的组数 - 读数据组数然后循环
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();//输入一个n表示后面有n组数据
//        for (int i = 0; i < n; i++) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println("Case" + (i + 1) + " " + (a + b) + "\n");
//        }




//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();//输入一个n表示后面有n组数据
//        for (int i = 0; i < n; i++) {
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            if (i > 0){
//                System.out.println();
//            }
//            System.out.println("Case" + (i + 1) + " " + (a + b) + "\n");
//        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//输入一个n表示后面有n组数据
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String s1 = scanner.nextLine();
            System.out.println("Case" + (i + 1) + " " + (s + s1) + "\n");
        }
    }
}
