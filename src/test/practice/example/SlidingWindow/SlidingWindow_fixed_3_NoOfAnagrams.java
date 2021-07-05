package test.practice.example.SlidingWindow;

import java.util.*;

public class SlidingWindow_fixed_3_NoOfAnagrams {

    public  static boolean isAnagram(int[] track,int[] wordCheck,char[] originalWord){

        for(char i:originalWord) {
         if(track[i-97]!=wordCheck[i-97])
             return false;
        }
        return true;
    }

    public static int findNumberOfAnagrams(char[] str,char[] word){
       // str = "forxxorfxdofr";
       // word ="for";

        int[] track=new int[26];

        int[] wordCheck=new int[26];
        for(char ch:word){
            wordCheck[ch-97]++;
        }
        int i=0,j=0;
        int size=str.length;
        int k=word.length;  // window size
        int noOfAnagrams=0;

        while (j<size){
            track[str[j]-97]++;

           if(j-i+1<k)
               j++;
           else if(j-i+1==k){
               if(isAnagram(track,wordCheck,word))
                   noOfAnagrams++;

               track[str[i]-97]--;
               j++;
               i++;
           }

        }

        return noOfAnagrams;
    }




    public static void main(String[]args){
        String txt = "forxxorfxdofr";
        String word="for";
        System.out.println(findNumberOfAnagrams(txt.toCharArray(),word.toCharArray()));
    }
}
