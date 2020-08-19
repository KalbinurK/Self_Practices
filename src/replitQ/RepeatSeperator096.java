package replitQ;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class RepeatSeperator096 {
    public static void main(String[] args) {
        /*
        Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
         separated by the separator string.
         Example:
      input: Word
       input: X
       input: 3
       output: WordXWordXWord

         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        System.out.print(word);
        for(int i = 1; i<count; i++){
            System.out.print(separator+word);
        }




    }
}
