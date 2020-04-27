package com.mutong.offer;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-04 17:58
 * @time_complexity: O()
 */
public class StrToInt {
    public static void main(String[] args) {
        System.out.println(StrToInt("-23647"));
    }
    public static int StrToInt(String str)
    {
        if (str.equals("") || str.length() == 0)
            return 0;
        char[] a = str.toCharArray();
        int fuhao = 0;
        if (a[0] == '-')
            fuhao = 1;
        int sum = 0;
        for (int i = fuhao; i < a.length; i++)
        {
            if (a[i] == '+')
                continue;
            if (a[i] < 48 || a[i] > 57)
                return 0;
            sum = sum * 10 + a[i] - 48;
        }
        return fuhao == 0 ? sum : sum * -1;
    }
}
