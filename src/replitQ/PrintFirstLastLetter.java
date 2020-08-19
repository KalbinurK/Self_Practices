package replitQ;

import java.util.Scanner;

public class PrintFirstLastLetter {
    public static void main(String[] args) {
        /*
        Write a program that will print out first and last letters together.

adobe
ae
         */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(""+ word.charAt(0)+ word.charAt(word.length()-1));









    }
}
