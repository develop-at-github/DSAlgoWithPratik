package Scaler.Hashing;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
//        int []a = {1, 2, 2, 1};
//        int[] b ={2, 3, 1, 2};

        int[]a={2, 1, 4, 10 };
        int[]b={3, 6, 2, 10, 10 };
        System.out.println(Arrays.toString(solve(a,b)));
    }
    public static int[] solve(int[] a, int[] b) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer>list=new ArrayList<>();

        for (int i=0;i<a.length;i++) {
            if (map.containsKey(a[i]))
                map.put(a[i], map.get(a[i])+1);
            else
                map.put(a[i],1);
        }

        for (int i=0;i<b.length;i++) {
            if (map.containsKey(b[i]) && map.get(b[i])>0) {
                map.put(b[i], map.get(b[i])-1);
                list.add(b[i]);
            }
        }

        int[] res=new int[list.size()];
        for (int i=0;i<list.size();i++)
            res[i]=list.get(i);

        return res;
    }
}
