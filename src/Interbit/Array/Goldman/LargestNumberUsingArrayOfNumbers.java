package Interbit.Array.Goldman;

import java.util.*;

public class LargestNumberUsingArrayOfNumbers {

    public static String largestNumber(final int[] A) {
        String[] arr = new String[A.length];
        for(int i=0;i<A.length;i++)
            arr[i]=String.valueOf(A[i]);


//        Arrays.sort(arr,new Comparator<Long>(){
//            @Override
//            public int compare(Long X,Long Y){
//                 String str1=String.valueOf(X);
//                 String str2=String.valueOf(Y);
//
//                // return Integer.valueOf(x+y)>Integer.valueOf(y+x)?0:1;
//                return Long.valueOf(str1+str2).compareTo(Long.valueOf(str2+str1))>0?-1:1;
//            }
//        });

            Arrays.sort(arr,(str1,str2)->(str2+str1).compareTo(str1+str2));


        StringBuilder res=new StringBuilder();
        for(String i:arr){
            res.append(i);
        }

        if(res.charAt(0)==0)
            return String.valueOf(0);

        return res.toString();
    }


    public static void main(String[] args) {
       int[] a={3, 30, 34, 5, 9};
      //  int[]a={ 472, 663, 964, 722, 485, 852, 635, 4, 368, 676, 319, 412 };
        System.out.println(largestNumber(a));
    }
}
