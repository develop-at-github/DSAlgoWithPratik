package Scaler.Hashing;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class ReplicatingSubstring {
    public static void main(String[] args) {
        int a=2;
        String b="bbaabb";
        System.out.println(solve(a,b));
    }

    public static int solve(int a, String b) {
        char[]arr=b.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<b.length();i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }

        for(char k:map.keySet()){
            if (map.get(k)%a!=0)
                return -1;
        }

        return 1;
    }
}
