package com.mutong.algs.sort;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/25 13:52
 * @time_complexity: O()
 */
public class QuickSort {
    public static void sort(int[] arr , int L , int R){
        int[] p = partition(arr, L ,R);
        sort(arr, L , p[0] - 1);
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
