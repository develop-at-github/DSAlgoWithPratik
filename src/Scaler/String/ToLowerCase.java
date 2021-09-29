package Scaler.String;

import java.util.Arrays;

public class ToLowerCase {
    public static void main(String[] args) {
        char[]a = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
        System.out.println(Arrays.toString(toLowerCase(a)));
    }

    public static char[] toLowerCase(char[] arr){
        for (int i=0;i<arr.length;i++){
            if (arr[i]>64 && arr[i]<91){
                arr[i]+=32;
            }
        }

        return arr;
    }
}
