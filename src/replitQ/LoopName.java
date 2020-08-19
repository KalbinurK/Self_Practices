package replitQ;

import java.util.Scanner;

public class LoopName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        /*
        Write a for loop that will loop through every character of a word and print out each character, each on a separate line

 Sample inputs/outputs:
In: hello
h
e
l
l
o
         */

        for(int i =0; i <= word.length()-1;i++){
           String result =""+ word.charAt(i);
            System.out.println(result);
        }

    }
}
