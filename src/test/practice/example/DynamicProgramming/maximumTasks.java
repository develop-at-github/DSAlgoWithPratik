package test.practice.example.DynamicProgramming;

public class maximumTasks {
    public static int maxPrice(int[]price, int[] weight,int allowedWeight ,int n){
        if (n==0 || allowedWeight==0)
            return 0;
//        if (matrixArray[n][allowedWeight]!=-1)
//            return matrixArray[n][allowedWeight];
        if (weight[n-1]<=allowedWeight)
            return Math.max((price[n-1]+maxPrice(price,weight,allowedWeight-weight[n-1],n-1)),
                    maxPrice(price,weight,allowedWeight,n-1));
        else
            return maxPrice(price,weight,allowedWeight,n-1);
    }

    public static int findTheMaxTask(int n,int t,int[][] arr){
        if(n==0 || t==0)
            return 0;
        int timeForTask=arr[n-1][0]+arr[n-1][1];
        if(arr[n-1][0]+arr[n-1][1] <= t)
            return Math.max(1+findTheMaxTask(n-1,t-timeForTask,arr),findTheMaxTask(n-1,t,arr));
        else
            return findTheMaxTask(n-1,t,arr);

    }

    public static void main(String[] args) {
        int n=3,t=16;
        int[][] arr={{2,8},{4,5},{5,1}};
        System.out.println(findTheMaxTask(n,t,arr));
    }
}
