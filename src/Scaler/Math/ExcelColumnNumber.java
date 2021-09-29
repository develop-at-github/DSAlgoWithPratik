package Scaler.Math;

public class ExcelColumnNumber {
    public static void main(String[] args) {
        String str="ABCD";
        System.out.println(titleToNumber(str));
    }

    public static int titleToNumber(String str) {
        int result = 0;

        for (int i = 0,j=str.length()-1; i < str.length(); i++,j--)
        {
            result+= (str.charAt(j) - 'A' + 1)*Math.pow(26,i);

        }
        return result;
    }
}
