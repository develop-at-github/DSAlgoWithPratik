package Scaler.Math;

public class PalindromeInteger {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(isPalindrome(n));
    }
    public static int isPalindrome(int num) {
        if(num < 0) return  0;
        int reversed = 0, remainder, original = num;

        while(num != 0) {
            remainder = num % 10; // reversed integer is stored in variable
            System.out.println("remainder: "+remainder);
            reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
            System.out.println("reversed: "+reversed);
            num  /= 10;  //the last digit is removed from num after division by 10.
            System.out.println("num: "+num);
            System.out.println("--------------------------");
        }
        System.out.println("==============================");

        // palindrome if original and reversed are equal
        System.out.println("original: "+original);
        System.out.println("reversed: "+reversed);
        return original == reversed ? 1:0;
    }
}
