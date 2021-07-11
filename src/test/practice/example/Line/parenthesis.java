package test.practice.example.Line;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class parenthesis {

    public static String[] generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c)
                for (String left: generateParenthesis(c))
                    for (String right: generateParenthesis(n-1-c))
                        ans.add("(" + left + ")" + right);
        }
        String[] str = new String[ans.size()];

        for(int i=0;i<ans.size();i++){
            str[i]=ans.get(i);
        }

        Arrays.sort(str);
        System.out.println(str.length);
        return str;
    }

    public static void main(String[] args) {
        int n = 9;

        System.out.println(Arrays.toString(generateParenthesis(n)));
    }
}
