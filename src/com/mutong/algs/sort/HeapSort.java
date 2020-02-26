package com.mutong.algs.sort;

/**
 * @description: 堆排序  1.让一个数组变成大根堆 2. 让堆顶位置和数组最后一个位置交换,此时最大的值已经被换到了最后一位.
 * 3. 除去最后一个数,前面的数字做heapify操作,重新形成一个大根堆, 4.吧堆顶和现在大根堆中最后一个数字交换,重复 每次搞定一个末尾
 * @Author: Mutong
 * @Date: 2020-02-26 20:03
 * @time_complexity: O()
 */
public class HeapSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2){
            return;
        }
        //0~i的位置建立大根堆
        for (int i = 0; i < arr.length ; i++){
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        swap(arr,0 , --heapSize);
        while (heapSize > 0){
            heapify(arr, 0, heapSize);
            swap(arr,0,--heapSize);
        }
    }

    //加入一个新节点,并且往上调整的过程
    private static void heapInsert(int[] arr, int index) {
        //如果当前位置节点的数比我的父节点大,交换,然后当前节点变成父节点
        while (arr[index] > arr[(index - 1) / 2]){
            swap(arr,index,(index-1) / 2);
            index = (index - 1) / 2;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //节点突然变化,继续调整成最大堆的过程
    private static void heapify(int[] arr, int index, int heapSize){
        int left = index * 2 + 1;
        while(left < heapSize){
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left]
                    ? left + 1
                    : left;
            largest = arr[largest] > arr[index]
                    ? arr[largest]
                    : arr[index];
            if (largest == index){
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }
}
