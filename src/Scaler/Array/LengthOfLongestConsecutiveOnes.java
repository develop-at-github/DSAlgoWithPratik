package Scaler.Array;

public class LengthOfLongestConsecutiveOnes {
    public static void main(String[] args) {
        String str="111011101";
        System.out.println(getCountOf1(str));
    }

    public static int getCountOf1(String str){
        int count=0;
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
               count+= Integer.parseInt(String.valueOf(arr[i]));

        int start=0,end=0;
        while (start<arr.length){

        }

        return count;
    }
}
