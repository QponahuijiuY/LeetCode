package com.mutong.algs.sort;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020/2/25 13:34
 * @time_complexity: O()
 */
public class NetherlandsFlag {
    public static int[] partition(int[] arr, int L, int R,int num){
        int less = L - 1;
        int more = R + 1;
        int cur = L;
        while (cur < more ){
            if (arr[cur] < num){
                swap(arr, ++ less, cur++);
            }else if (arr[cur] > num){
                swap(arr, --more, cur);
            }else{
                cur++;
            }
        }
        return new int[]{less + 1, more - 1};
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
