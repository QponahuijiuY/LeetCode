package com.mutong.offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-01 14:36
 * @time_complexity: O()
 */
public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || input.length == 0) return res;
        if (k > input.length) return res;
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;

    }
}
