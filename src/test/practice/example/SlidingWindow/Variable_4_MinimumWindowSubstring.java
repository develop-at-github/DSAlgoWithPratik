package test.practice.example.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Variable_4_MinimumWindowSubstring {

    public static String findMinimumWindowSubstring(String s,String t){
        if(t.length()>s.length()) return "";

        char[] charArr=s.toCharArray();
        char[] charArrayT=t.toCharArray();
        int tLength=charArrayT.length;
        int i=0,j=0;
        int size=s.length();
        int minLength=Integer.MAX_VALUE;
        int leftMin=0;
        int countT=0;
        Map<Character,Integer> tStringCharMap=new HashMap<>();
        for(char chr:charArrayT){
            if(tStringCharMap.containsKey(chr))
                tStringCharMap.put(chr,tStringCharMap.get(chr)+1);
            else
                tStringCharMap.put(chr,1);
        }

        while (j<size){    //ADOBECODEBANC

            if(tStringCharMap.containsKey(charArr[j])) {
                int n=tStringCharMap.get(charArr[j]) - 1;
                tStringCharMap.put(charArr[j], n);

                if(n>=0)
                    countT++;
            }

            while(countT==tLength){
                if(minLength>j-i+1) {
                    minLength = j - i + 1;
                    leftMin=i;
                    System.out.println("leftMin:: "+leftMin);
                }

                if(tStringCharMap.containsKey(charArr[i])) {
                    int n=tStringCharMap.get(charArr[i])+1;
                    tStringCharMap.put(charArr[i], tStringCharMap.get(charArr[i])+1);

                    if(n>0)
                        countT--;
                }

                i++;

            }

            j++;

        }

        return (leftMin+minLength>s.length())?"":s.substring(leftMin,leftMin+minLength);
    }


    public static void main(String[]args){
        String s = "bba", t = "ab";
        // String str=" ";

        System.out.println(findMinimumWindowSubstring(s,t));
    }
}
