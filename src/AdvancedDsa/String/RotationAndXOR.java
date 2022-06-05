package AdvancedDsa.String;

public class RotationAndXOR {
    public static void main(String[] args) {
        String A = "1001";
        String B = "0011";
        System.out.println(findCountOfXORs(A, B));
        A = "111";
        B = "111";
        System.out.println(findCountOfXORs(A, B));
    }

    public static int findCountOfXORs(String A, String B) {
        // By Simulation
        int m = A.length();
        int n = B.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String bRot = rotate(B, i);
//            int xor = findXOR(A, bRot);
            boolean zeroXOR = isZeroXOR(A, bRot);
//            if (xor == 0) {
            if (zeroXOR) {
                ans++;
            }
        }
        return ans;
    }

    private static boolean isZeroXOR(String a, String bRot) {
        return a.equals(bRot);
    }

    private static int findXOR(String a, String b) {
        int l = a.length(); // or bRot.length(), as both are same length strings by constraint.
        for (int i = 0; i < l; i++) {
            int ia = a.charAt(i) - '0';
            int ib = b.charAt(i) - '0';
            if (ia != ib) {
                return 1;
            }
        }
        return 0;
    }

    private static String rotate(String b, int i) {
        return b.substring(i) + b.substring(0, i);
    }

}
