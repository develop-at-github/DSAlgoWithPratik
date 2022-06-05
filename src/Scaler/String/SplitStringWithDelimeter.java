package Scaler.String;

import java.util.Arrays;
import java.util.List;

public class SplitStringWithDelimeter {
    public static void main(String[] args) {
        String str = "redirect to the website|fill the details|pay the amount mentioned"; //a=2 , b=3, c=3 , d=1
        String delimiter="\\|";

       System.out.println(convertStringToStringList(str,delimiter));
    }

    public static List<String> convertStringToStringList(String string, String delimiter){
        String[] stringArray = string.split(delimiter);
        return Arrays.asList(stringArray);
    }
}
