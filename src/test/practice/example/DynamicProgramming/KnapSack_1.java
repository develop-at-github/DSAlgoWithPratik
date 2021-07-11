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


    public static int maxPriceByTopDownApproach(int[]price, int[] weight,int allowedWeight ,int n){

        int[][] t=new int[allowedWeight+1][n+1];

        for(int i=0;i<allowedWeight+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0)
                    t[i][j]=0;
            }
        }

        for (int i=1;i<allowedWeight+1;i++){
            for (int j=1;j<n+1;j++){
                if(weight[j-1]<=allowedWeight)
                    t[i][j]=Math.max(price[j-1]+t[allowedWeight-weight[j-1]][j-1] ,t[i][j-1]);
                else
                    t[i][j]=t[i][j-1];
            }
        }

        return t[allowedWeight][n];
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
        System.out.println("-------------------");
        System.out.println(maxPriceByTopDownApproach(price,weight,allowedWeight,n));
    }
}
