package Scaler.Hashing;

import java.util.*;

public class maxRightAngledTrianglesPossible {
    public static void main(String[] args) {
        ArrayList<Integer> xAxisPoints=new ArrayList<>(Arrays.asList( 1, 1, 2, 3, 3));
        ArrayList<Integer> yAxisPoints=new ArrayList<>(Arrays.asList(1, 2, 1, 2, 1));

        System.out.println("max triangles: "+countRightTriangles(xAxisPoints,yAxisPoints));
    }

    public static int countRightTriangles(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer,Integer> hashMapForXaxis=new HashMap<>();
        HashMap<Integer,Integer> hashMapForYaxis=new HashMap<>();

        int triangleCount=0;

        for (int i=0;i<A.size();i++){
            int val=A.get(i);
            if (hashMapForXaxis.containsKey(val)) {
                hashMapForXaxis.put(val,hashMapForXaxis.get(val)+1);
            }
            else
                hashMapForXaxis.put(val,1);
        }

        for (int i=0;i<B.size();i++){
            int val=B.get(i);
            if (hashMapForYaxis.containsKey(val)) {
                hashMapForYaxis.put(val,hashMapForYaxis.get(val)+1);
            }
            else
                hashMapForYaxis.put(val,1);
        }

        //count triangles
        for (int i=0;i<A.size();i++){
            int valA=A.get(i);
            int valB=B.get(i);
            triangleCount=triangleCount+((hashMapForXaxis.get(valA)-1)*(hashMapForYaxis.get(valB)-1));
        }

        return triangleCount;
    }
}
