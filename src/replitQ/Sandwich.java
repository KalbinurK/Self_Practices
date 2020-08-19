package replitQ;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        /*
        A sandwich is two pieces of bread with something in between. Print the string that is between the first
        and last appearance of "bread" in the given string, or return string "nothing" if there are not two
         pieces of bread.
         */

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int b = str.indexOf("bread");
        int d = str.lastIndexOf("bread");

        if(b<d){
            System.out.println(str.substring(b+5,d));

        } else{
            System.out.println("nothing");
        }










    }

}

