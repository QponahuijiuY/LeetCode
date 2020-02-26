package com.mutong.algs.sort;

/**
 * @description: 快速排序:取数组的最后一个数为参照点,把小于它的都放在左边,比他大的都放在右边,最后把最后一个参照点交换到中间
 * @Author: Mutong
 * @Date: 2020/2/25 13:52
 * @time_complexity: O(nlgn)
 */
public class QuickSort {
    public static void sort(int[] arr , int L , int R){
        int[] p = partition(arr, L ,R);//返回的是中间相等的X
        //继续把L到p[0]-1继续排序
        sort(arr, L , p[0] - 1);
        //继续把p[1]+1 到R排序,中间的p[0]-p[1]是已经排好序而且相等的元素
        sort(arr, p[1] + 1, R);
    }

    private static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R;
        while (L < more ){
            if (arr[L] < arr[more]){
                swap(arr , ++less , L++);
            }else if (arr[L] > arr[R]){
                swap(arr, --more,L);
            }else{
                L++;
            }
        }
        swap(arr,more,R);
        return new int[]{less + 1, more };
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
