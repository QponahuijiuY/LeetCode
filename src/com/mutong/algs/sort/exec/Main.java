package com.mutong.algs.sort.exec;

import java.util.Scanner;

public class Main {

    static String char_count(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        int i = 0, j = 0;
        String res = "";
        while (i<chars.length || j < chars.length){
            while (chars[i] == chars[j] && j < chars.length){
                j++;
                if (j == chars.length){
                    count++;
                    break;
                }
                count++;

            }
            res += count+""+chars[i];
            i = j;
            count = 0;
        }

        return res;

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }
        res = char_count(_str);
        System.out.println(res);
    }
}
