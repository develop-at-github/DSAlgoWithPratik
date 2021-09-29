package Scaler.Recursion;

public class FindFibonacci {
    public static void main(String[] args) {
        int a=9;
        System.out.println(findFibonacciNo(a));
    }

    public static int findFibonacciNo(int a){
        if(a <2){
            return a;
        }

        return findFibonacciNo(a-1)+findFibonacciNo(a-2);
    }
}
