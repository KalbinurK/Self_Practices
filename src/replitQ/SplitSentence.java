package replitQ;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        /*
        Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun
         */
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] arr = sentence.split(" ");
        for(int i =0 ; i<=arr.length-1; i++){
                     String word =arr[i];

            System.out.println(word);


        }


    }
}
