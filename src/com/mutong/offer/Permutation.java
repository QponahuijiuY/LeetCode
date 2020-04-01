package com.mutong.offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description: 字符串的排列
 * @Author: Mutong
 * @Date: 2020-04-01 13:59
 * @time_complexity: O()
 */
public class Permutation {
    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        System.out.println(permutation.Permutation("abc"));
    }
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<String>() ;
        if(str==null || str.length()==0) { return result ; }
        //字符串的长度
        int n= str.length();
        helper(result,0,str.toCharArray());
        Collections.sort(result);
        return result;
    }

    private void helper(ArrayList<String> result, int index, char[] toCharArray) {
        //如果只有一个元素,直接返回toCharArray
        if (index == toCharArray.length - 1){
            result.add(new String(toCharArray));
        }
        //
        for (int i = index; i < toCharArray.length; i++) {
            if (i == index || toCharArray[index] != toCharArray[i]){
                swap(toCharArray,index,i);
                helper(result,index+1,toCharArray);
                swap(toCharArray, index,i);
            }
        }
    }

    private void swap(char[] toCharArray, int i, int j) {
        char c = toCharArray[i];
        toCharArray[i] = toCharArray[j];
        toCharArray[j] = c;
    }
}
