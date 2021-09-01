package Scaler.Array;

public class LengthOfLongestConsecutiveOnes {
    public static void main(String[] args) {
        String str="111011101";
        System.out.println(getCountOf1(str));
    }

    public static int getCountOf1(String str){
        int count=0;

        for(int i=0;i<str.length();i++)
               count+= Integer.parseInt(String.valueOf(str.charAt(i)));

        return count;
    }
}
