package com.mutong.algs.sort;

import java.util.Arrays;

/**
 * @description: 归并排序
 * @Author: Mutong
 * @Date: 2020/2/25 0:03
 * @time_complexity: O(nlgn)
 */
public class MergeSort {
    public static void sort(int[] nums) {
        if (nums == null || nums.length < 2){
            return;
        }
        sortProcess(nums, 0 , nums.length - 1);
    }

    private static void sortProcess(int[] nums, int L, int R) {
        if(L == R){
            return;
        }
        int mid = L + (R - L) >> 1;//即(L+R)/2
        sortProcess(nums, 0 , mid);//O(N/2)
        sortProcess(nums, mid + 1, R);//O(N/2)
        merge(nums, L , mid , R);//O(N)
        //T(N) = 2T(N/2) + T(N)
    }

    //合并
    private static void merge(int[] nums, int L, int mid, int R) {
        //创建一个新的数组
        int[] help = new int[R - L + 1];
        int i = 0;
        //p1指向左边第一个元素
        int p1 = L;
        //p2指向右边第一个元素
        int p2 = mid + 1;
        //如果左边值小于右边值,吧左边的值放进help数组里面,左边指针++,help指针++
        //防止越界
        while (p1 <= mid && p2 <= R){
            help[i++] = nums[p1] < nums[p2] ? nums[p1++] : nums[p2++];
        }
        //左边的都是最小的,判断特殊情况
        while (p1 <= mid){
            help[i++] = nums[p1++];
        }
        //右边的都是最小的.
        while (p2 <= R){
            help[i++] = nums[p2++];
        }
        for (i = 0 ; i < help.length; i ++){
            nums[L+i] = help[i];
        }
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
