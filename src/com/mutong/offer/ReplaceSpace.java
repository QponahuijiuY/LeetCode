package com.mutong.offer;

/**
 * @description: 替换字符串
 * @Author: Mutong
 * @Date: 2020-03-28 10:40
 * @time_complexity: O()
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str.length(); i ++){
            //当时空格的时候,sb,append替换为%20
            if(str.charAt(i) == ' '){
                sb.append("%20");
            }else{//否则直接加入到sb,最后直接tostring
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
