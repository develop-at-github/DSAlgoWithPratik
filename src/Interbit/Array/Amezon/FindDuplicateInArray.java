package Interbit.Array.Amezon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateInArray {
    public static int repeatedNumber(final int[] A) {
        Set<Integer> set=new HashSet<>();
        for (int num:A){
            if(!set.contains(num)){
                set.add(num);
            }
            else {
                return num;
            }
        }
//        Map<Integer,Integer> map=new HashMap<>();
//
//        for (int num:A){
//            if(!map.containsKey(num)){
//                map.put(num,1);
//            }
//            else {
//                map.put(num,map.get(num)+1);
//            }
//        }
//
//
//        for (Map.Entry mapElement: map.entrySet()){
//            if((int)mapElement.getValue()>1)
//                return (int)mapElement.getKey();
//        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a={3,4,1,4,1};
        System.out.println(repeatedNumber(a));
    }
}
