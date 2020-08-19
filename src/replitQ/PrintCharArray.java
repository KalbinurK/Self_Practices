package replitQ;

import java.util.Arrays;
import java.util.Scanner;

public class PrintCharArray {
    /*
    Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};


        for (int i = 0; i<=words.length-1; i++) {

            String word = words[i];
            char ch1 = word.charAt(0);
            char ch2 = word.charAt(word.length() - 1);

            System.out.println(""+ch1+ch2);
        }
    }}