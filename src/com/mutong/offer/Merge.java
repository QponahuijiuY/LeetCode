package com.mutong.offer;

/**
 * @description: 给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 *
 * 初始化 A 和 B 的元素数量分别为 m 和 n。
 *
 * 示例:
 *
 * 输入:
 * A = [1,2,3,0,0,0], m = 3
 * B = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sorted-merge-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: Mutong
 * @Date: 2020-03-03 21:06
 * @time_complexity: O()
 */
public class Merge {
    public void merge(int[] A, int m, int[] B, int n) {
        //pa,pb分别指向0位置处
        int pa = 0, pb = 0;
        int[] sorted = new int[m + n];
        int cur ;
        while (pa < m || pb < n) {
            //如果A指针到头,说明A已经遍历完了,剩下就是把B数组里面的数全部放进cur数组里面即可,因为数组B是有序的,所以直接放
            if (pa == m)
                cur = B[pb++];
            //同理
            else if (pb == n)
                cur = A[pa++];
            //A当前位置上的数组小于B当前位置上的数,A的值赋给cur
            else if (A[pa] < B[pb])
                cur = A[pa++];
            //A当前位置上的数组大于B当前位置上的数,B的值赋给cur
            else
                cur = B[pb++];
            //把cur的值依次放进新的数组里面
            sorted[pa + pb - 1] = cur;
        }
        //新数组复制到A数组里面
        for (int i = 0; i != m + n; ++i)
            A[i] = sorted[i];

    }
}
