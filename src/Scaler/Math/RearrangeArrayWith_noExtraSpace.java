package Scaler.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayWith_noExtraSpace {
    public static void main(String[] args) {
        int[] arr={1,3,2,0};
        //         4,12,8,0
        //
        System.out.println(Arrays.toString(rearrange(arr)));
    }

    public static int[] rearrange(int[]arr){
        int n=arr.length;
        for (int i=0;i<arr.length;i++){
            arr[i]=arr[i]*n;
        }

        for (int i=0;i<arr.length;i++){
            arr[i]+=arr[arr[i]/n]/n;
        }

        for (int i=0;i<arr.length;i++){
            arr[i]=arr[i]%n;
        }


        return arr;
    }
}
