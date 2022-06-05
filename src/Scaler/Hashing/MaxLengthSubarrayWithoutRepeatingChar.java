package Scaler.Hashing;

import java.util.HashSet;
import java.util.Set;

public class MaxLengthSubarrayWithoutRepeatingChar {
    public static void main(String[] args) {
        String str="abcdadefgh";
        System.out.println("max length: "+lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String A) {
        int maxLength=Integer.MIN_VALUE;
        int p1=0;
        int p2=0;

        HashSet<Character> hashset=new HashSet<>();
        while(p2<A.length()){
            if(!hashset.contains(A.charAt(p2))){
                hashset.add(A.charAt(p2));
                maxLength=Integer.max(maxLength,p2-p1+1);
                p2++;
            }
            else {
                hashset.remove(A.charAt(p1));
                p1++;
            }
        }

        return maxLength;
    }
}
