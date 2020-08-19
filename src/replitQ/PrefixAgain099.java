package replitQ;

import java.util.Scanner;

public class PrefixAgain099 {
    public static void main(String[] args) {
        /*
        Given a string, consider the prefix string made of the first n chars of the string. Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that n is in the range from 1 till str.length().

Example:
input: abXYabc
input: 1
output: true
a appears twice

         */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (n == 1 && n < str.length()) {


            }


        }
    }
}












