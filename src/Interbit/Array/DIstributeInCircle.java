package Interbit.Array;

public class DIstributeInCircle {
    // n ==> Size of circle  //B
    // m ==> Number of items  //A
    // k ==> Initial position  //C
    public static int solve(int A, int B, int C) {
        // B - C + 1 is number of positions
        // before we reach beginning of circle
        // If A is less than this value, then
        // we can simply return (A-1)th position
        if (A <= B - C + 1)
            return A + C - 1;

        // Let us compute remaining items before
        // we reach beginning.
        A = A - (B - C + 1);

        // We compute A % B to skip all complete
        // rounds. If we reach end, we return n
        // else we return A % B
        return (A % B == 0) ? B : (A % B);
    }
    public static void main(String[] args) {
//        int A=2,B=5,C=1;
        int A=8,B=5,C=2;

        System.out.println(solve(A,B,C));
    }
}
