package Scaler.Sorting;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int []arr={0,1,2,0,1,2};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        int start=0,end=arr.length-1;

        while (start<end){
            if (arr[start]==2){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=arr[start];
                end--;
            }
            else if(arr[start]==0)
                start++;
        }

        return arr;
    }
}
