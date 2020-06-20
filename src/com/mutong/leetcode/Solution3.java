package com.mutong.leetcode;
import java.util.HashMap;
import java.util.Map;
/**
 * @description:无重复字符字串
 * 滑动窗口
 * @Author: Mutong
 * @Date: 2020-05-02 17:43
 * @time_complexity: O()
 */
public class Solution3 {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        System.out.println(solution.lengthOfLongestSubstring("qwerasdzxcc"));
    }
    public int lengthOfLongestSubstring(String s) {

        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        //i表示滑动窗口的左边,j表示滑动窗口的右边
        //ij,都从0开始,i不动, j向右
        //判断j位置下边的元素是否在map集合里面, 在的话就让i为当前元素的位置下标
        for (int i = 0,j = 0; j < n; j++) {
            char c = s.charAt(j);
            //判断end位置处的元素是否在map里面
            if (map.containsKey(c)){
                //存在,就让start位置变为当前位置
                i = Math.max(map.get(c),i);
            }
            //最长的距离为 j-i+1
            ans = Math.max(ans,j-i+1);
            //把j的值put进map中,长度加一
            map.put(c,j+1);
        }
        return ans;
    }
}
