package com.mutong.offer;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-28 11:34
 * @time_complexity: O()
 */
public class MinNumberInRotateArray {
    public int minNumberInRotateArray1(int [] array) {
        int slow = 0, high = array.length  - 1;
        while(slow < high){
            int mid = slow + (slow + high) / 2;
            if (array[mid] > array[high]){
                slow = mid + 1;
            }else if (array[mid] == array[high]){
                high = high - 1;
            }else {
                high = mid;
            }
        }
        return array[slow];
    }

    public int minNumberInRotateArray(int [] array) {
        int low = 0 ; int high = array.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return array[low];
    }
}
