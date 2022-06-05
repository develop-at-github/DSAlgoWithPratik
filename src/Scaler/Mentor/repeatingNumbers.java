package Scaler.Mentor;

import java.util.Arrays;

public class repeatingNumbers {
    public static void main(String[] args) {
//        int[] arr={4,4,1,3,1,4};
//        int n=arr.length-1;
//        //diviser =frequency
//        // remid = original value at that position
//
//        for(int i=0;i<arr.length;i++){
//            arr[arr[i]%n]+=n;
//        }
//
//        for(int i=0;i<arr.length;i++){
//            int fre=arr[i]/n;
//            arr[i]=arr[i]%n;
//            if(fre > 1){
//                System.out.println("number: "+i);
//                System.out.println("frequency: "+fre);
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));

        int A=37;
        int B=133035191;
        System.out.println(solve(A,B));

//        String str=String.format("%s/%s/%s","logo","1234","one.svg");

    }

    public static int solve(int A, int B) {

        long length=(long)Math.pow(2, A+1)-1;
        System.out.println("length: "+length);

        long start=0,end=length-1;
        int value=0;

        while(start<=end){
            //int middle=(int)(((end-start)/2)+start) ;
            //int middle=((end-start)/2)+start ;
            long middle = start + (end-start)/2;

            if(B==middle) {
                return value;
            }
            else if(B<middle){
                end=middle-1;
            }
            else{
                value ^= 1;
                start=middle+1;
            }
        }
        return value;
    }

}
