package replitQ;

import java.util.ArrayList;

public class Combine2arratArraylisttoString {


    public static void main(String[] args) {

        String [] r1 = {"f","o","o"};
        String [] r2 ={" b","a","r"};

        ArrayList<String> combineRs= new ArrayList<>();

        String result = "";
        for( String each:r1){
           combineRs.add(each);
        }
        for(String each :r2){
            combineRs.add(each);
        }
        for( String each: combineRs){
            result += each;
        }

        System.out.println(result);
        }
    }
