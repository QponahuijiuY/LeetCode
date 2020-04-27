package com.mutong.algs.sort;

import java.util.Arrays;

/**
 * @description: 选择排序
 * @Author: Mutong
 * @Date: 2020/2/24 22:20
 * @time_complexity: O(n^2)
 */
public class  SelectionSort {
    public static void sort(int[] nums) {
        int n = nums.length;
        if (nums == null || n < 2) return;
        for (int i = 0; i < n - 1; i++) {
            //假设i=0时是最小值,看i+1对应的值是否小于0对应的值,是交换,否i++
            int minIndex = i;
            for (int j = i + 1; j < n - 1; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
                swap(nums, i, minIndex);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int testTime=500000;
        int size = 10;
        int value=1000;
        boolean succeed = true;
        for(int i = 0 ;i<testTime;i++){
            int[] arr1 = generateRandomArray(size,value);
            int[] arr2 = copyArray(arr1);
            int[] arr3= copyArray(arr1);
            sort(arr1);
            rightMethod(arr2);
            if(!isEqual(arr1,arr2)){
                succeed=false;
                printArray(arr3);
                break;
            }
        }
        System.out.println(succeed ? "Nice" : "Fucking fucked");
    }
    //产生一个随机数组，数组的长度和值都是随机的，
    public static  int[] generateRandomArray(int size,int value){
        //在java中，Math.random() ->double(0,1)
        //(int)((size+1)*Math.random())--->产生的是[0,size]之间的整数
        //生成长度随机的数组，数组的最大长度是size的长度
        int[] arr = new int[(int)((size+1)*Math.random())];
        for(int i = 0 ;i<arr.length;i++){
            //针对数组中的每个值都可以随机一下，一个随机数减去另外一个随机数，可能产生正数，也可能产生负数
            arr[i]=(int)((value+1)*Math.random())-(int)(value*Math.random());//值也可以是随机的
        }
        return arr;
    }
    //复制数组
    public static int[] copyArray(int[] arr){
        if(arr==null){
            return null;
        }
        int[] res = new int[arr.length];
        for(int i = 0 ;i<arr.length;i++){
            res[i]=arr[i]  ;
        }
        return res;
    }
    //绝对正确的方法,这个方法可以时间复杂度很差，但是要保证其准确性
    public static void rightMethod(int[] arr){
        Arrays.sort(arr);
    }
    //
    public static boolean isEqual(int[] arr1,int[] arr2){
        if(arr1==null&&arr2!=null||arr1!=null&&arr2==null){
            return false;
        }
        if (arr1==null&&arr2==null){
            return true;
        }
        if (arr1.length!=arr2.length){
            return false;
        }
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    //打印出数组
    public static void printArray(int[] arr){
        if(arr==null){
            return;
        }
        for(int i = 0 ;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }


}



