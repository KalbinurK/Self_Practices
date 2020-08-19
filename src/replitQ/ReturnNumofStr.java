package replitQ;

import java.util.Scanner;

public class ReturnNumofStr {
    /*
    Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int lengthOfword = word.length();

        System.out.println(lengthOfword); // javaxjavaapplepearjavaegg  length =25
       String r = word.replace("java","");
        System.out.println((lengthOfword-r.length())/4);   // 25-13 =12/4 =3





    }
}