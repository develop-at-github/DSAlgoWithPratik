package test.practice.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateAndRepeating {
    public static void swap(int i,int j,int[]arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void findDuplicateAndMissingFun(int[] arr){  //{3,1,2,5,3};
                                                                //  2,1,3,5,3
        int i=0;                                                        //  1,2,3,5,3
        while(i<arr.length){
            if (arr[i]!=arr[arr[i]-1]){
                swap(i,arr[i]-1,arr);
            }
            else
                i++;
        }
        System.out.println(Arrays.toString(arr));

        List<Integer> repeated=new ArrayList<>();
        List<Integer> missing=new ArrayList<>();

        for (i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                repeated.add(arr[i]);
                missing.add(i+1);
            }
        }
        System.out.println("repeated:: ");
        for (int j:repeated)
        System.out.println(j);


        System.out.println("missing:: ");
        for (int j:missing)
            System.out.println(j);
    }

    public static void main(String[]args){
        int [] arr={3,1,1,5,3};
        findDuplicateAndMissingFun(arr);
    }
}
