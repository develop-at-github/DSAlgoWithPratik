package Scaler.String;

public class Isalpha {
    public static void main(String[] args) {
        char[]a = {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
        System.out.println(Isalpha_check(a));
    }

    public static int Isalpha_check(char[] arr){
        for (char c:arr){
            if ((c>64 && c<91)||(c>96 && c<123)){}
            else
                return 0;
        }

        return 1;
    }
}
