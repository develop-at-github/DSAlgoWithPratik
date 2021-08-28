package Interbit.Math.Amazon;

import java.util.Arrays;

public class NextSimilerNumber {
    public static String solve(String A) {
        char[] arr=A.toCharArray();
        int n=arr.length;
        if (n==1) return "-1";

        int d1=-1;
        for(int i=n-2;i>=0;i--){ //"218765"
            System.out.println("i: "+i);
            System.out.println(arr[i]);
            if(Integer.valueOf(arr[i]) < Integer.valueOf(arr[i+1])){
                d1=i;
                break;
            }
        }
        System.out.println("d1: "+d1);

        if (d1==-1) return "-1";
        int d2=-1;
        int min=Integer.MAX_VALUE;
        for(int i=d1+1;i<n;i++){
            if(Integer.valueOf(arr[i]) > Integer.valueOf(arr[d1])){
                if(arr[i]<min){
                    min=arr[i];
                    d2=i;
                }
            }
        }

        char temp=arr[d1];
        arr[d1]=arr[d2];
        arr[d2]=temp;
        System.out.println("----------------------------");
        System.out.println("d1+1: "+(d1+1));
        System.out.println("n-1 : "+(n-1));
        System.out.println(arr);
        Arrays.sort(arr,d1+1,n);
        System.out.println("after---------------------------");
        System.out.println(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        String str="551";
        System.out.println(solve(str));
    }
}
