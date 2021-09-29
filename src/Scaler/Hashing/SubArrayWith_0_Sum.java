package Scaler.Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubArrayWith_0_Sum {
    public static void main(String[] args) {
        //        0  1  2   3   4   5  6
        int[]arr={1, 2, 3, -1, -2, -2, 5};
               // 1, 3, 6,  5,  3,  1, 6
        int[]arr1={ 1, 2, -3};
        subArrayWith0Sum(arr1);
    }

    public static int subArrayWith0Sum(int[] arr){
        Set<Long>set = new HashSet<>();
        long preFixSum_Arr[]=new long[arr.length];
        preFixSum_Arr[0]=arr[0];
        set.add(preFixSum_Arr[0]);
        for (int i = 1; i < arr.length; i++) {
            preFixSum_Arr[i] = preFixSum_Arr[i-1]+arr[i];
            if (preFixSum_Arr[i]==0 || set.contains(preFixSum_Arr[i])) {
                return 1;
            }
            set.add(preFixSum_Arr[i]);
        }
        return 0;
    }
}
