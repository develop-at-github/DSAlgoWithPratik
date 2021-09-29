package Scaler.String;

public class CountOccurrences {
    public static void main(String[] args) {
        String str = "abobobc"; //a=2 , b=3, c=3 , d=1

        System.out.println(occ(str));
    }

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static int occ(String text){
        String str="bob";
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }

        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            if (index != -1)
            {
                count ++;
                index += str.length()-1;
            }
            else {
                break;
            }
        }

        return count;
    }

}
