package replitQ;

import java.util.ArrayList;
import java.util.Arrays;

public class extractNum_209 {
    public static void main(String[] args) {

        String s = "aa2aa3";

        String digit ="";

        for(int i =0; i<=s.length()-1; i++){

           char ch = s.charAt(i);

           if(Character.isDigit(ch)){

               digit += ""+ch;
           }


        }
        System.out.println(digit);















    }
}
