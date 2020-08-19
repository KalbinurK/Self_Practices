package replitQ;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFront2L {
    public static void main(String[] args) {
/*
Given a String array words, iterate through each word and print first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]

 */

        Scanner input = new Scanner(System.in);

        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        String result = "";

        for(String each : words){
            result += each.substring(0,1)+each.substring(each.length()-1)+",";
        }
          String [] arr = {result};
        System.out.println(Arrays.toString(arr));

    }

}