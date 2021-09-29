package Scaler.String;

import java.util.HashMap;
import java.util.Map;

public class ChangeCharacter {
    public static void main(String[] args) {
        String str = "abcabbccd"; //a=2 , b=3, c=3 , d=1
        int B = 3;

       // System.out.println(minDistinct(str,B));
    }

//    public static int minDistinct(String str,int b){
//        char[] arr=str.toCharArray();
////        int res=0;
//        Map<Character,Integer> map=new HashMap<>();
//        for (char c:arr){
//            if (map.containsKey(c))
//                map.put(c,map.get(c)+1);
//            else
//                map.put(c,1);
//        }
//
//        for (char c:map.keySet()){
//
//        }
//
//        return map.size();
//    }

    public static int getCount(String str){
        char[]arr=str.toCharArray();

        int i=0;
        while (i< arr.length-1){
            if (arr[i]=='b')
                break;
        }

return 0;

    }
}
