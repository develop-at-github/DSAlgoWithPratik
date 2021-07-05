package test.practice.example.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow_Variable_2 {
    // longest substring with k unique characters

    public static int findMaxLengthSubstring(String str,int k){
        char[] charArr=str.toCharArray();
        int i=0,j=0;
        int size=str.length();
        int maxCount=-1;

        Map<Character,Integer> map=new HashMap<>();

        while (j<size){                                  //aabacbebebe
            if(map.containsKey(charArr[j]))
                map.put(charArr[j],map.get(charArr[j])+1);
            else
                map.put(charArr[j],1);


            if(map.size()<k){
                j++;
            }
            else if(map.size()==k){
                maxCount=Math.max(maxCount,(j-i+1));
                j++;
            }

            while (map.size()>k && i<j){
                if(map.containsKey(charArr[i]))
                    map.put(charArr[i],map.get(charArr[i])-1);

                if(map.get(charArr[i])==0)
                    map.remove(charArr[i]);

                i++;
                j++;
            }
        }

        return maxCount;
    }

    public static void main(String[]args){
       // String str="aabacbebebe";
        String str="aaaa";
        int k=2;

        System.out.println(findMaxLengthSubstring(str,k));
    }
}
