import java.util.Arrays;

public class SquareAndSortInSingleLoop {
    public static int[] solve(int[] A) {
        int n=A.length;
        int left=0,right=n-1;
        int[] res=new int[n];

        for(int index=n-1;index>=0;index--){
            if(Math.abs(A[left])>Math.abs(A[right])){
                res[index]=A[left]*A[left];
                left++;
            }
            else{
                res[index]=A[right]*A[right];
                right--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a={ -855, -847, -747, -708, -701, -667, -666, -618, -609, -536, -533, -509, -500, -396, -336, -297, -284, -229, -173, -173, -132, -38, -5, 35, 141, 169, 281, 322, 358, 421, 436, 447, 478, 538, 547, 644, 667, 673, 705, 711, 718, 724, 726, 811, 869, 894, 895, 902, 912, 942, 961};
        System.out.println(Arrays.toString(solve(a)));

    }
}
