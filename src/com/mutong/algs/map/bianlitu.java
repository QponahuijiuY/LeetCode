package com.mutong.algs.map;

/**
 * @description:
 * @Author: Mutong
 * @Date: 2020-04-28 22:17
 * @time_complexity: O()
 */
public class bianlitu {
//    public void bfs(int s, int t) {
//        if (s == t) return;
//        boolean[] visited = new boolean[v];
//        visited[s]=true;
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(s);
//        int[] prev = new int[v];
//        for (int i = 0; i < v; ++i) {
//            prev[i] = -1;
//        }
//        while (queue.size() != 0) {
//            int w = queue.poll();
//            for (int i = 0; i < adj[w].size(); ++i) {
//                int q = adj[w].get(i);
//                if (!visited[q]) {
//                    prev[q] = w;
//                    if (q == t) {
//                        print(prev, s, t);
//                        return;
//                    }
//                    visited[q] = true;
//                    queue.add(q);
//                }
//            }
//        }
//    }

    private void print(int[] prev, int s, int t) { // 递归打印 s->t 的路径
        if (prev[t] != -1 && t != s) {
            print(prev, s, prev[t]);
        }
        System.out.print(t + " ");
    }
}
