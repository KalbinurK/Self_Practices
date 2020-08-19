package replitQ;

import java.util.ArrayList;
import java.util.Arrays;

public class search214 {
    public static void main(String[] args) {
        ArrayList<String> r = new ArrayList<>();
        r.addAll(Arrays.asList("hello","world"));
        String find = "four";
        String result="";


            for(String each : r) {
                if (each.contains(find)) {
                    result = each;

                } else {
                    result = "search failed";
                }
            }
        System.out.println(result);
    }

    }
