package Scaler.Hashing;

import java.util.HashSet;
import java.util.Set;

public class FindPairsInArrayWhoseSumIsAlreadyPresent {
    public static void main(String[] args) {
        int[]a={3, 4, 2, 6 ,7};
        System.out.println(getNumOfPairs(a));
    }

    public static int getNumOfPairs(int[] a){
        int count=0;
        Set<Integer>set=new HashSet<>();

        for (int i:a){
            set.add(i);
        }

        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (set.contains(a[i]+a[j]))
                    count++;
            }
        }

     //   for ()
        return count;
    }
}
