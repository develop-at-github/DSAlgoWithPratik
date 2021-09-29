package Scaler.ProblemSolving;

import java.util.*;

public class DistinctNumbersInWindow {
    public static void main(String[] args) {
        int[]A = {1, 2, 1, 3, 4, 3};
        int B=3;
        System.out.println(Arrays.toString(distinctNumbersInEverySubarray(A,B)));

    }

    public static int[] distinctNumbersInEverySubarray(int[]A,int B){
        List<Integer> list=new ArrayList<>();

        Map<Integer,Integer> map=new HashMap<>();

        int res=0;
        for (int i=0;i<B;i++){
            map.put(A[i],map.get(A[i])==null? 1:map.get(A[i])+1);

            if (map.get(A[i])==1) //this means we have new entry of integer(means distinct integer)
                res++;
        }

        list.add(res); // added count of distinct numbers for 1st subArray

        for (int i=B,j=0;i<A.length;i++,j++){
            map.put(A[i], map.get(A[i])==null? 1:map.get(A[i])+1);

            if (map.get(A[i])==1) //this means we have new entry of integer(means distinct integer)
                res++;

            map.put(A[j],map.get(A[j])-1);

            if (map.get(A[j])==0)
                res--;

            list.add(res);
        }


        int[]arr=new int[list.size()];
        for (int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }


        return arr;
    }
}
