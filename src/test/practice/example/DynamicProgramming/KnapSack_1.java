package test.practice.example.DynamicProgramming;

import java.util.Arrays;

public class KnapSack_1 {
    public static int[][] matrixArray=new int[102][1002];   // n<=100
                                                            // w<=1000
    public static int maxPrice(int[]price, int[] weight,int allowedWeight ,int n){
        if (n==0 || allowedWeight==0)
            return 0;
        if (matrixArray[n][allowedWeight]!=-1)
            return matrixArray[n][allowedWeight];
        if (weight[n-1]<=allowedWeight)
            return matrixArray[n][allowedWeight]=Math.max((price[n-1]+maxPrice(price,weight,allowedWeight-weight[n-1],n-1)),
                    maxPrice(price,weight,allowedWeight,n-1));
        else
            return matrixArray[n][allowedWeight]=maxPrice(price,weight,allowedWeight,n-1);
    }
    public static void main(String[] args) {
        int[] price={60,100,120};
        int[] weight={10,20,30};
        int n=price.length;
        int allowedWeight=50;
//        int[][] matrixArray=new int[102][1002];

        for (int[]row:matrixArray)
            Arrays.fill(row,-1);

        System.out.println(maxPrice(price,weight,allowedWeight,n));
    }
}
