package replitQ;

import java.util.Scanner;

public class HasJava {
    /*
    Given a string word, print true if "java" appears starting at index 0 or 1 in the string, such as with
    "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = .
Example:
input: javapython
output: true
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exists = false;
        String word = scan.next();
        if(word.length()<4){
            System.out.println("false");
            System.exit(0);
        }

        if(word.substring(0,4).equals("java")){
            System.out.println("true");
        } else if(word.substring(1,5).equals("java")) {
            System.out.println("true");

        }else {
            System.out.println("false");
        }

    }
}
