package test.practice.example.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Variable_3_LargestSubStringWithNoRepeatingChar {

    public static int findMaxLengthSubstringWithoutRepeatingChar(String str){
        int i=0,j=0;
        int size=str.length();
        int maxLength=0;
        char[] charArr=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();



        while (j<size){
            if(map.containsKey(charArr[j]))
                map.put(charArr[j],map.get(charArr[j])+1);
            else
                map.put(charArr[j],1);

            if(map.size()==(j-i+1)){
                maxLength=Math.max(maxLength,map.size());
            }

            while (map.size()<(j-i+1)){
                if(map.containsKey(charArr[i]))
                    map.put(charArr[i],map.get(charArr[i])-1);

                if(map.get(charArr[i])==0)
                    map.remove(charArr[i]);

                i++;
            }

            j++;
        }
        return maxLength;
    }
    
    
    public static void main(String[]args){
         String str="aabacbebebe";
       // String str=" ";

        System.out.println(findMaxLengthSubstringWithoutRepeatingChar(str));
    }
}
