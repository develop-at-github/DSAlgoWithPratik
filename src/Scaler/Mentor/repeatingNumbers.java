package Scaler.Mentor;

import java.util.Arrays;

public class repeatingNumbers {
    public static void main(String[] args) {
        int[] arr={4,4,1,3,1,4};
        int n=arr.length-1;
        //diviser =frequency
        // remid = original value at that position

        for(int i=0;i<arr.length;i++){
            arr[arr[i]%n]+=n;
        }

        for(int i=0;i<arr.length;i++){
            int fre=arr[i]/n;
            arr[i]=arr[i]%n;
            if(fre > 1){
                System.out.println("number: "+i);
                System.out.println("frequency: "+fre);
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
