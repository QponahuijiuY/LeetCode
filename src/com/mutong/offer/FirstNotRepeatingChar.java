package com.mutong.offer;

import java.util.HashMap;

/**
 * @description: 第一个只出现一次的字符
 * @Author: Mutong
 * @Date: 2020-04-01 15:55
 * @time_complexity: O()
 */
public class FirstNotRepeatingChar {
    public static void main(String[] args) {
        FirstNotRepeatingChar firstNotRepeatingChar = new FirstNotRepeatingChar();
        System.out.println(firstNotRepeatingChar.FirstNotRepeatingChar("googgle"));
    }
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
            if (str==null)return -1;
            int length = str.length();
            for(int i = 0;i<length;i++) {
                //看,map中是否包含key,包含,则让它对应的那个值的value值加1
                if(map.containsKey(str.charAt(i))){
                    int value = map.get(str.charAt(i));
                    map.remove(str.charAt(i));
                    map.put(str.charAt(i),value+1);
                }else{
                    //否则只是value是1
                    map.put(str.charAt(i),1);
                }
            }
            for(int i = 0;i<length;i++){
                if(map.get(str.charAt(i))==1)
                    return i;
            }
            return -1;
        }

}
