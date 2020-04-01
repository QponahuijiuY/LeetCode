package com.mutong.offer;

import java.util.ArrayList;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-03-28 16:22
 * @time_complexity: O()
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 0 && col == 0) {return null;}
        ArrayList<Integer> array = new ArrayList();
        int left = 0, right = row - 1, top = 0, bottom = col - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i < right ; i++) {
                array.add(matrix[top][i]);
            }
            for (int i = top + 1; i < bottom ; i++) {
                array.add(matrix[i][right]);
            }
            for (int i = right - 1; i >= left ; i--) {
                array.add(matrix[bottom][i]);
            }
            for (int i = bottom - 1; i > top; i--) {
                array.add(matrix[i][left]);
            }
            left++;
            top ++;
            right--;
            bottom --;
        }
        return array;
    }
}
