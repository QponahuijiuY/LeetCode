package com.mutong.hot_interview;

/**
 * @description: 一条龙打印环矩阵
 * @Author: Mutong
 * @Date: 2020-02-28 10:42
 * @time_complexity: O()
 */
public class PrintMatrixSpiralOrder {
    public static void spiralOrderPrint(int[][] matrix){

        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR <= dR && tC <= dC){
            printEdge(matrix,tR++,tC++,dR--,dC--);
        }
    }
    //(tR,tC)为左上角的横纵坐标,(dR,dC)为右下角的横纵坐标
    public static void printEdge(int[][] m ,int tR,int tC,int dR,int dC){
        if (tR == dR){
            for (int i = tC ; i <= dC ; i ++){
                System.out.println(m[tR][i] + " ");
            }
        }else if (tC == dC){
            for (int i = tR ; i <=dR ; i++){
                System.out.println(m[i][tC] + " ");
            }
        }else{
            int curC = tC;
            int curR = tR;
            while (curC != dC){
                System.out.println(m[tR][curC] + " ");
                curC++;
            }
            while (curR != dR){
                System.out.println(m[curR][dC] + " ");
                curR++;
            }
            while (curC != tR){
                System.out.println(m[dR][curC] + " ");
                curC--;
            }
            while (curR != tR){
                System.out.println(m[curR][tC] + " ");
                curR--;
            }
        }

    }
}
