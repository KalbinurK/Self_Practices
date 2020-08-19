package replitQ;

import java.util.Scanner;

public class PrintVowelCh {
    /*
    Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("In:");
        String word = scan .nextLine();
          String vowel = "";

          for(int i=0; i<=word.length()-1;i++){
              char ch = word.charAt(i);

              if(ch=='a'|| ch=='u'||ch=='o'|| ch=='e'||ch=='i'){
                  vowel +=""+ch;

              }

              }
        System.out.println(vowel);

                   }

              }



